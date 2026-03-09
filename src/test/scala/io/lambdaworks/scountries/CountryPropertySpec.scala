package io.lambdaworks.scountries

import org.scalacheck.Gen
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

final class CountryPropertySpec extends AnyWordSpec with Matchers with ScalaCheckPropertyChecks {

  private val countryGen: Gen[Country] = Gen.oneOf(Country.values)

  private val allSubdivisions: IndexedSeq[Subdivision] = Country.values.flatMap(_.subdivisions)

  "Country enumeration" should {

    "have unique alpha2 codes" in {
      val alpha2Codes = Country.values.map(_.alpha2)
      alpha2Codes.distinct.size shouldBe alpha2Codes.size
    }

    "have unique alpha3 codes" in {
      val alpha3Codes = Country.values.map(_.alpha3)
      alpha3Codes.distinct.size shouldBe alpha3Codes.size
    }

    "have alpha2 codes that are exactly 2 characters" in {
      forAll(countryGen) { country =>
        country.alpha2 should have length 2
      }
    }

    "have alpha3 codes that are exactly 3 characters" in {
      forAll(countryGen) { country =>
        country.alpha3 should have length 3
      }
    }

    "be found by its own alpha2 code" in {
      forAll(countryGen) { country =>
        Country.getByAlpha2(country.alpha2) shouldBe Some(country)
      }
    }

    "be found by its own alpha3 code" in {
      forAll(countryGen) { country =>
        Country.getByAlpha3(country.alpha3) shouldBe Some(country)
      }
    }

    "be found by its own name" in {
      forAll(countryGen) { country =>
        Country.getByCountryName(country.name) shouldBe Some(country)
      }
    }
  }

  "Subdivision" should {

    "have non-empty names" in {
      whenever(allSubdivisions.nonEmpty) {
        forAll(Gen.oneOf(allSubdivisions)) { subdivision =>
          subdivision.name should not be empty
        }
      }
    }

    "have non-empty codes" in {
      whenever(allSubdivisions.nonEmpty) {
        forAll(Gen.oneOf(allSubdivisions)) { subdivision =>
          subdivision.code should not be empty
        }
      }
    }

    "have non-empty categories" in {
      whenever(allSubdivisions.nonEmpty) {
        forAll(Gen.oneOf(allSubdivisions)) { subdivision =>
          subdivision.category should not be empty
        }
      }
    }
  }

}
