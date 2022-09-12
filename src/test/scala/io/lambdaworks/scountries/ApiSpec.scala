package io.lambdaworks.scountries

import org.scalatest.wordspec._

final class ApiSpec extends AnyWordSpec {

  "getByCountryName" should {
    "return Some of Country when a valid country name is specified" in {
      assert(Country.getByCountryName("Serbia").contains(Country.RS))
    }

    "return None when an invalid country name is specified" in {
      assert(Country.getByCountryName("Europe").isEmpty)
    }
  }

  "getByAlpha2" should {
    "return Some of Country when a valid alpha2 is specified" in {
      assert(Country.getByAlpha2("RS").contains(Country.RS))
    }

    "return None when an invalid alpha2 is specified" in {
      assert(Country.getByCountryName("EU").isEmpty)
    }
  }

  "getByAlpha3" should {
    "return Some of Country when a valid alpha3 is specified" in {
      assert(Country.getByAlpha3("SRB").contains(Country.RS))
    }

    "return None when an invalid alpha3 is specified" in {
      assert(Country.getByCountryName("EUR").isEmpty)
    }
  }

}
