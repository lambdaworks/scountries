package io.lambdaworks.scountries

private[scountries] trait Api {

  def getByCountryName(name: String): Option[Country] =
    Country.values.find(_.name == name)

  def getByAlpha2(alpha2: String): Option[Country] =
    Country.withNameOption(alpha2)

  def getByAlpha3(alpha3: String): Option[Country] =
    Country.values.find(_.alpha3 == alpha3)

}
