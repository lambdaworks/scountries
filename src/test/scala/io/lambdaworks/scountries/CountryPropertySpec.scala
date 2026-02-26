package io.lambdaworks.scountries

import org.scalacheck.Arbitrary
import org.scalacheck.Gen
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

final class CountryPropertySpec extends AnyWordSpec with Matchers with ScalaCheckPropertyChecks {

  implicit val arbitraryCountry: Arbitrary[Country] = Arbitrary(Gen.oneOf(Country.values))
  implicit val arbitrarySubdivision: Arbitrary[Subdivision] = {
    val allSubdivisions = Country.values.flatMap(_.subdivisions)
    Arbitrary(Gen.oneOf(allSubdivisions))
  }

  "Country enumeration" should {
    "have unique alpha2 codes" in {
      val alpha2Codes = Country.values.map(_.alpha2)
      alpha2Codes.distinct.size shouldBe alpha2Codes.size
    }

    "have unique alpha3 codes" in {
      val alpha3Codes = Country.values.map(_.alpha3)
      alpha3Codes.distinct.size shouldBe alpha3Codes.size
    }

    "have alpha2 codes with exactly 2 characters" in {
      forAll { (country: Country) =>
        country.alpha2.length shouldBe 2
      }
    }

    "have alpha3 codes with exactly 3 characters" in {
      forAll { (country: Country) =>
        country.alpha3.length shouldBe 3
      }
    }

    "always find a country by its own alpha2 code" in {
      forAll { (country: Country) =>
        Country.getByAlpha2(country.alpha2) shouldBe Some(country)
      }
    }

    "always find a country by its own alpha3 code" in {
      forAll { (country: Country) =>
        Country.getByAlpha3(country.alpha3) shouldBe Some(country)
      }
    }

    "always find a country by its own name" in {
      forAll { (country: Country) =>
        Country.getByCountryName(country.name) shouldBe Some(country)
      }
    }
  }

  "Subdivisions" should {
    "have non-empty names" in {
      forAll { (subdivision: Subdivision) =>
        subdivision.name should not be empty
      }
    }

    "have non-empty codes" in {
      forAll { (subdivision: Subdivision) =>
        subdivision.code should not be empty
      }
    }

    "have non-empty categories" in {
      forAll { (subdivision: Subdivision) =>
        subdivision.category should not be empty
      }
    }
  }
}
