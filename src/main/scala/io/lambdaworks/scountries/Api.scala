package io.lambdaworks.scountries

private[scountries] trait Api {

  /**
   * Optionally returns a [[Country]] with the given name, disregarding case
   *
   * @param name
   *   the name of the country
   * @return
   *   an option value containing the country with the specified name
   */
  def getByCountryName(name: String): Option[Country] =
    Country.values.find(_.name.equalsIgnoreCase(name))

  /**
   * Optionally returns a [[Country]] with the given ISO 3166-1 alpha-2 code, disregarding case
   *
   * @param alpha2
   *   the ISO 3166-1 alpha-2 code of the country
   * @return
   *   an option value containing the country with the specified ISO 3166-1 alpha-2 code
   */
  def getByAlpha2(alpha2: String): Option[Country] =
    Country.withNameInsensitiveOption(alpha2)

  /**
   * Optionally returns a [[Country]] with the given ISO 3166-1 alpha-3 code, disregarding case
   *
   * @param alpha3
   *   the ISO 3166-1 alpha-3 code of the country
   * @return
   *   an option value containing the country with the specified ISO 3166-1 alpha-3 code
   */
  def getByAlpha3(alpha3: String): Option[Country] =
    Country.values.find(_.alpha3.equalsIgnoreCase(alpha3))

}
