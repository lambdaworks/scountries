package io.lambdaworks.scountries

import org.scalacheck.Gen
import org.scalatest.Inspectors.forEvery
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec._
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

final class CountryPropertySpec extends AnyWordSpec with Matchers with ScalaCheckPropertyChecks {

  implicit override val generatorDrivenConfig: PropertyCheckConfiguration =
    PropertyCheckConfiguration(minSuccessful = 500)

  private val countryGen: Gen[Country] = Gen.oneOf(Country.values)

  /**
   * Mostly short alphabetic strings (so that a good share of them are real codes in some letter case), mixed with
   * arbitrary printable ASCII strings.
   */
  private val lookupKeyGen: Gen[String] = Gen.frequency(
    4 -> Gen.choose(0, 4).flatMap(Gen.listOfN(_, Gen.alphaChar)).map(_.mkString),
    1 -> Gen.asciiPrintableStr
  )

  private val countriesByAlpha2: Map[String, Country] = Country.values.map(c => c.alpha2 -> c).toMap
  private val countriesByAlpha3: Map[String, Country] = Country.values.map(c => c.alpha3 -> c).toMap

  /** Upper-cases the characters of `s` whose position is set in `mask` and lower-cases the rest. */
  private def withCaseMask(s: String, mask: Long): String =
    s.zipWithIndex.map { case (char, index) =>
      if (((mask >>> (index % 64)) & 1L) == 1L) char.toUpper else char.toLower
    }.mkString

  private def duplicates(values: Seq[String]): List[String] =
    values.groupBy(identity).collect { case (value, occurrences) if occurrences.size > 1 => value }.toList.sorted

  "Country enumeration" should {
    "have unique alpha2 codes" in {
      duplicates(Country.values.map(_.alpha2)) shouldBe empty
    }

    "have unique alpha3 codes" in {
      duplicates(Country.values.map(_.alpha3)) shouldBe empty
    }

    "have names that are unique regardless of case" in {
      duplicates(Country.values.map(_.name.toLowerCase)) shouldBe empty
    }

    "have alpha2 codes consisting of exactly 2 uppercase letters" in {
      forEvery(Country.values) { country =>
        country.alpha2 should fullyMatch regex "[A-Z]{2}"
      }
    }

    "have alpha3 codes consisting of exactly 3 uppercase letters" in {
      forEvery(Country.values) { country =>
        country.alpha3 should fullyMatch regex "[A-Z]{3}"
      }
    }

    "always find a country by its own alpha2 code" in {
      forEvery(Country.values) { country =>
        Country.getByAlpha2(country.alpha2) shouldBe Some(country)
      }
    }

    "always find a country by its own alpha3 code" in {
      forEvery(Country.values) { country =>
        Country.getByAlpha3(country.alpha3) shouldBe Some(country)
      }
    }

    "always find a country by its own name" in {
      forEvery(Country.values) { country =>
        Country.getByCountryName(country.name) shouldBe Some(country)
      }
    }
  }

  "Country lookups" should {
    "find a country by its alpha2 code in any letter case" in {
      forAll(countryGen, Gen.long) { (country, mask) =>
        Country.getByAlpha2(withCaseMask(country.alpha2, mask)) shouldBe Some(country)
      }
    }

    "find a country by its alpha3 code in any letter case" in {
      forAll(countryGen, Gen.long) { (country, mask) =>
        Country.getByAlpha3(withCaseMask(country.alpha3, mask)) shouldBe Some(country)
      }
    }

    "find a country by its name in any letter case" in {
      forAll(countryGen, Gen.long) { (country, mask) =>
        Country.getByCountryName(withCaseMask(country.name, mask)) shouldBe Some(country)
      }
    }

    "return a country by alpha2 if and only if the input matches its code ignoring case" in {
      forAll(lookupKeyGen) { input =>
        Country.getByAlpha2(input) shouldBe countriesByAlpha2.get(input.toUpperCase)
      }
    }

    "return a country by alpha3 if and only if the input matches its code ignoring case" in {
      forAll(lookupKeyGen) { input =>
        Country.getByAlpha3(input) shouldBe countriesByAlpha3.get(input.toUpperCase)
      }
    }
  }

  "Subdivisions" should {
    "have non-empty names without surrounding whitespace" in {
      forEvery(Country.values) { country =>
        forEvery(country.subdivisions) { subdivision =>
          subdivision.name should not be empty
          subdivision.name.trim shouldBe subdivision.name
        }
      }
    }

    "have codes consisting of 1 to 3 uppercase letters or digits" in {
      forEvery(Country.values) { country =>
        forEvery(country.subdivisions) { subdivision =>
          subdivision.code should fullyMatch regex "[A-Z0-9]{1,3}"
        }
      }
    }

    "have codes that are unique within their country" in {
      forEvery(Country.values) { country =>
        duplicates(country.subdivisions.map(_.code)) shouldBe empty
      }
    }

    "have non-empty categories without surrounding whitespace" in {
      forEvery(Country.values) { country =>
        forEvery(country.subdivisions) { subdivision =>
          subdivision.category should not be empty
          subdivision.category.trim shouldBe subdivision.category
        }
      }
    }
  }

}
