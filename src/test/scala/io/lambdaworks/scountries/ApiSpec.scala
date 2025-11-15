package io.lambdaworks.scountries

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec._

final class ApiSpec extends AnyWordSpec with Matchers {

  "getByCountryName" should {
    "return Some of Country" when {
      "a valid country name with proper case is specified" in {
        Country.getByCountryName("Serbia") shouldBe Some(Country.RS)
      }

      "a valid country name with a different case is specified" in {
        Country.getByCountryName("sErBiA") shouldBe Some(Country.RS)
      }
    }

    "return None when an invalid country name is specified" in {
      Country.getByCountryName("Europe") shouldBe None
    }

    "return None when an empty string is specified" in {
      Country.getByCountryName("") shouldBe None
    }
  }

  "getByAlpha2" should {
    "return Some of Country" when {
      "a valid alpha2 with upper case is specified" in {
        Country.getByAlpha2("RS") shouldBe Some(Country.RS)
      }

      "a valid alpha2 with a different case is specified" in {
        Country.getByAlpha2("rS") shouldBe Some(Country.RS)
      }
    }

    "return None when an invalid alpha2 is specified" in {
      Country.getByAlpha2("EU") shouldBe None
    }

    "return None when an empty string is specified" in {
      Country.getByAlpha2("") shouldBe None
    }
  }

  "getByAlpha3" should {
    "return Some of Country" when {
      "a valid alpha3 with upper case is specified" in {
        Country.getByAlpha3("SRB") shouldBe Some(Country.RS)
      }

      "a valid alpha3 with a different case is specified" in {
        Country.getByAlpha3("sRb") shouldBe Some(Country.RS)
      }
    }

    "return None when an invalid alpha3 is specified" in {
      Country.getByAlpha3("EUR") shouldBe None
    }

    "return None when an empty string is specified" in {
      Country.getByAlpha3("") shouldBe None
    }
  }

}
