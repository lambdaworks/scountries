package io.lambdaworks.scountries

import enumeratum._

import scala.collection.immutable.IndexedSeq

final case class Subdivision(name: String, code: String, category: String)

sealed abstract class Country(val name: String, val alpha2: String, val alpha3: String) extends EnumEntry {
  override val entryName: String      = alpha2
  val subdivisions: List[Subdivision] = Nil
}

object Country extends Enum[Country] with Api {

  val values: IndexedSeq[Country] = findValues

  case object AD extends Country("Andorra", "AD", "AND") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andorra la Vella", "AD-07", "parish"),
      Subdivision("Canillo", "AD-02", "parish"),
      Subdivision("Encamp", "AD-03", "parish"),
      Subdivision("Escaldes-Engordany", "AD-08", "parish"),
      Subdivision("La Massana", "AD-04", "parish"),
      Subdivision("Ordino", "AD-05", "parish"),
      Subdivision("Sant Julià de Lòria", "AD-06", "parish")
    )
  }

  case object AE extends Country("United Arab Emirates (the)", "AE", "ARE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abū Z̧aby", "AE-AZ", "emirate"),
      Subdivision("Al Fujayrah", "AE-FU", "emirate"),
      Subdivision("Ash Shāriqah", "AE-SH", "emirate"),
      Subdivision("Dubayy", "AE-DU", "emirate"),
      Subdivision("Ra’s al Khaymah", "AE-RK", "emirate"),
      Subdivision("Umm al Qaywayn", "AE-UQ", "emirate"),
      Subdivision("‘Ajmān", "AE-AJ", "emirate")
    )
  }

  case object AF extends Country("Afghanistan", "AF", "AFG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Badakhshān", "AF-BDS", "province"),
      Subdivision("Baghlān", "AF-BGL", "province"),
      Subdivision("Balkh", "AF-BAL", "province"),
      Subdivision("Bādghīs", "AF-BDG", "province"),
      Subdivision("Bāmyān", "AF-BAM", "province"),
      Subdivision("Dāykundī", "AF-DAY", "province"),
      Subdivision("Farāh", "AF-FRA", "province"),
      Subdivision("Fāryāb", "AF-FYB", "province"),
      Subdivision("Ghaznī", "AF-GHA", "province"),
      Subdivision("Ghōr", "AF-GHO", "province"),
      Subdivision("Helmand", "AF-HEL", "province"),
      Subdivision("Herāt", "AF-HER", "province"),
      Subdivision("Jowzjān", "AF-JOW", "province"),
      Subdivision("Kandahār", "AF-KAN", "province"),
      Subdivision("Khōst", "AF-KHO", "province"),
      Subdivision("Kunaṟ", "AF-KNR", "province"),
      Subdivision("Kunduz", "AF-KDZ", "province"),
      Subdivision("Kābul", "AF-KAB", "province"),
      Subdivision("Kāpīsā", "AF-KAP", "province"),
      Subdivision("Laghmān", "AF-LAG", "province"),
      Subdivision("Lōgar", "AF-LOG", "province"),
      Subdivision("Nangarhār", "AF-NAN", "province"),
      Subdivision("Nīmrōz", "AF-NIM", "province"),
      Subdivision("Nūristān", "AF-NUR", "province"),
      Subdivision("Paktiyā", "AF-PIA", "province"),
      Subdivision("Paktīkā", "AF-PKA", "province"),
      Subdivision("Panjshayr", "AF-PAN", "province"),
      Subdivision("Parwān", "AF-PAR", "province"),
      Subdivision("Samangān", "AF-SAM", "province"),
      Subdivision("Sar-e Pul", "AF-SAR", "province"),
      Subdivision("Takhār", "AF-TAK", "province"),
      Subdivision("Uruzgān", "AF-URU", "province"),
      Subdivision("Wardak", "AF-WAR", "province"),
      Subdivision("Zābul", "AF-ZAB", "province")
    )
  }

  case object AG extends Country("Antigua and Barbuda", "AG", "ATG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Barbuda", "AG-10", "dependency"),
      Subdivision("Redonda", "AG-11", "dependency"),
      Subdivision("Saint George", "AG-03", "parish"),
      Subdivision("Saint John", "AG-04", "parish"),
      Subdivision("Saint Mary", "AG-05", "parish"),
      Subdivision("Saint Paul", "AG-06", "parish"),
      Subdivision("Saint Peter", "AG-07", "parish"),
      Subdivision("Saint Philip", "AG-08", "parish")
    )
  }

  case object AI extends Country("Anguilla", "AI", "AIA")

  case object AL extends Country("Albania", "AL", "ALB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Berat", "AL-01", "county"),
      Subdivision("Dibër", "AL-09", "county"),
      Subdivision("Durrës", "AL-02", "county"),
      Subdivision("Elbasan", "AL-03", "county"),
      Subdivision("Fier", "AL-04", "county"),
      Subdivision("Gjirokastër", "AL-05", "county"),
      Subdivision("Korçë", "AL-06", "county"),
      Subdivision("Kukës", "AL-07", "county"),
      Subdivision("Lezhë", "AL-08", "county"),
      Subdivision("Shkodër", "AL-10", "county"),
      Subdivision("Tiranë", "AL-11", "county"),
      Subdivision("Vlorë", "AL-12", "county")
    )
  }

  case object AM extends Country("Armenia", "AM", "ARM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aragac̣otn", "AM-AG", "region"),
      Subdivision("Ararat", "AM-AR", "region"),
      Subdivision("Armavir", "AM-AV", "region"),
      Subdivision("Erevan", "AM-ER", "city"),
      Subdivision("Geġark'unik'", "AM-GR", "region"),
      Subdivision("Kotayk'", "AM-KT", "region"),
      Subdivision("Loṙi", "AM-LO", "region"),
      Subdivision("Syunik'", "AM-SU", "region"),
      Subdivision("Tavuš", "AM-TV", "region"),
      Subdivision("Vayoć Jor", "AM-VD", "region"),
      Subdivision("Širak", "AM-SH", "region")
    )
  }

  case object AO extends Country("Angola", "AO", "AGO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bengo", "AO-BGO", "province"),
      Subdivision("Benguela", "AO-BGU", "province"),
      Subdivision("Bié", "AO-BIE", "province"),
      Subdivision("Cabinda", "AO-CAB", "province"),
      Subdivision("Cuando Cubango", "AO-CCU", "province"),
      Subdivision("Cuanza-Norte", "AO-CNO", "province"),
      Subdivision("Cuanza-Sul", "AO-CUS", "province"),
      Subdivision("Cunene", "AO-CNN", "province"),
      Subdivision("Huambo", "AO-HUA", "province"),
      Subdivision("Huíla", "AO-HUI", "province"),
      Subdivision("Luanda", "AO-LUA", "province"),
      Subdivision("Lunda-Norte", "AO-LNO", "province"),
      Subdivision("Lunda-Sul", "AO-LSU", "province"),
      Subdivision("Malange", "AO-MAL", "province"),
      Subdivision("Moxico", "AO-MOX", "province"),
      Subdivision("Namibe", "AO-NAM", "province"),
      Subdivision("Uíge", "AO-UIG", "province"),
      Subdivision("Zaire", "AO-ZAI", "province")
    )
  }

  case object AQ extends Country("Antarctica", "AQ", "ATA")

  case object AR extends Country("Argentina", "AR", "ARG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Buenos Aires", "AR-B", "province"),
      Subdivision("Catamarca", "AR-K", "province"),
      Subdivision("Chaco", "AR-H", "province"),
      Subdivision("Chubut", "AR-U", "province"),
      Subdivision("Ciudad Autónoma de Buenos Aires", "AR-C", "city"),
      Subdivision("Corrientes", "AR-W", "province"),
      Subdivision("Córdoba", "AR-X", "province"),
      Subdivision("Entre Ríos", "AR-E", "province"),
      Subdivision("Formosa", "AR-P", "province"),
      Subdivision("Jujuy", "AR-Y", "province"),
      Subdivision("La Pampa", "AR-L", "province"),
      Subdivision("La Rioja", "AR-F", "province"),
      Subdivision("Mendoza", "AR-M", "province"),
      Subdivision("Misiones", "AR-N", "province"),
      Subdivision("Neuquén", "AR-Q", "province"),
      Subdivision("Río Negro", "AR-R", "province"),
      Subdivision("Salta", "AR-A", "province"),
      Subdivision("San Juan", "AR-J", "province"),
      Subdivision("San Luis", "AR-D", "province"),
      Subdivision("Santa Cruz", "AR-Z", "province"),
      Subdivision("Santa Fe", "AR-S", "province"),
      Subdivision("Santiago del Estero", "AR-G", "province"),
      Subdivision("Tierra del Fuego", "AR-V", "province"),
      Subdivision("Tucumán", "AR-T", "province")
    )
  }

  case object AS extends Country("American Samoa", "AS", "ASM")

  case object AT extends Country("Austria", "AT", "AUT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Burgenland", "AT-1", "state"),
      Subdivision("Kärnten", "AT-2", "state"),
      Subdivision("Niederösterreich", "AT-3", "state"),
      Subdivision("Oberösterreich", "AT-4", "state"),
      Subdivision("Salzburg", "AT-5", "state"),
      Subdivision("Steiermark", "AT-6", "state"),
      Subdivision("Tirol", "AT-7", "state"),
      Subdivision("Vorarlberg", "AT-8", "state"),
      Subdivision("Wien", "AT-9", "state")
    )
  }

  case object AU extends Country("Australia", "AU", "AUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Australian Capital Territory", "AU-ACT", "territory"),
      Subdivision("New South Wales", "AU-NSW", "state"),
      Subdivision("Northern Territory", "AU-NT", "territory"),
      Subdivision("Queensland", "AU-QLD", "state"),
      Subdivision("South Australia", "AU-SA", "state"),
      Subdivision("Tasmania", "AU-TAS", "state"),
      Subdivision("Victoria", "AU-VIC", "state"),
      Subdivision("Western Australia", "AU-WA", "state")
    )
  }

  case object AW extends Country("Aruba", "AW", "ABW")

  case object AX extends Country("Åland Islands", "AX", "ALA")

  case object AZ extends Country("Azerbaijan", "AZ", "AZE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abşeron", "AZ-ABS", "rayon"),
      Subdivision("Astara", "AZ-AST", "rayon"),
      Subdivision("Ağcabədi", "AZ-AGC", "rayon"),
      Subdivision("Ağdam", "AZ-AGM", "rayon"),
      Subdivision("Ağdaş", "AZ-AGS", "rayon"),
      Subdivision("Ağstafa", "AZ-AGA", "rayon"),
      Subdivision("Ağsu", "AZ-AGU", "rayon"),
      Subdivision("Babək", "AZ-BAB", "rayon"),
      Subdivision("Bakı", "AZ-BA", "municipality"),
      Subdivision("Balakən", "AZ-BAL", "rayon"),
      Subdivision("Beyləqan", "AZ-BEY", "rayon"),
      Subdivision("Biləsuvar", "AZ-BIL", "rayon"),
      Subdivision("Bərdə", "AZ-BAR", "rayon"),
      Subdivision("Culfa", "AZ-CUL", "rayon"),
      Subdivision("Cəbrayıl", "AZ-CAB", "rayon"),
      Subdivision("Cəlilabad", "AZ-CAL", "rayon"),
      Subdivision("Daşkəsən", "AZ-DAS", "rayon"),
      Subdivision("Füzuli", "AZ-FUZ", "rayon"),
      Subdivision("Goranboy", "AZ-GOR", "rayon"),
      Subdivision("Göygöl", "AZ-GYG", "rayon"),
      Subdivision("Göyçay", "AZ-GOY", "rayon"),
      Subdivision("Gədəbəy", "AZ-GAD", "rayon"),
      Subdivision("Gəncə", "AZ-GA", "municipality"),
      Subdivision("Hacıqabul", "AZ-HAC", "rayon"),
      Subdivision("Kürdəmir", "AZ-KUR", "rayon"),
      Subdivision("Kǝngǝrli", "AZ-KAN", "rayon"),
      Subdivision("Kəlbəcər", "AZ-KAL", "rayon"),
      Subdivision("Laçın", "AZ-LAC", "rayon"),
      Subdivision("Lerik", "AZ-LER", "rayon"),
      Subdivision("Lənkəran", "AZ-LA", "municipality"),
      Subdivision("Lənkəran", "AZ-LAN", "rayon"),
      Subdivision("Masallı", "AZ-MAS", "rayon"),
      Subdivision("Mingəçevir", "AZ-MI", "municipality"),
      Subdivision("Naftalan", "AZ-NA", "municipality"),
      Subdivision("Naxçıvan", "AZ-NX", "autonomous republic"),
      Subdivision("Naxçıvan", "AZ-NV", "municipality"),
      Subdivision("Neftçala", "AZ-NEF", "rayon"),
      Subdivision("Ordubad", "AZ-ORD", "rayon"),
      Subdivision("Oğuz", "AZ-OGU", "rayon"),
      Subdivision("Qax", "AZ-QAX", "rayon"),
      Subdivision("Qazax", "AZ-QAZ", "rayon"),
      Subdivision("Qobustan", "AZ-QOB", "rayon"),
      Subdivision("Quba", "AZ-QBA", "rayon"),
      Subdivision("Qubadlı", "AZ-QBI", "rayon"),
      Subdivision("Qusar", "AZ-QUS", "rayon"),
      Subdivision("Qəbələ", "AZ-QAB", "rayon"),
      Subdivision("Saatlı", "AZ-SAT", "rayon"),
      Subdivision("Sabirabad", "AZ-SAB", "rayon"),
      Subdivision("Salyan", "AZ-SAL", "rayon"),
      Subdivision("Samux", "AZ-SMX", "rayon"),
      Subdivision("Siyəzən", "AZ-SIY", "rayon"),
      Subdivision("Sumqayıt", "AZ-SM", "municipality"),
      Subdivision("Sədərək", "AZ-SAD", "rayon"),
      Subdivision("Tovuz", "AZ-TOV", "rayon"),
      Subdivision("Tərtər", "AZ-TAR", "rayon"),
      Subdivision("Ucar", "AZ-UCA", "rayon"),
      Subdivision("Xankəndi", "AZ-XA", "municipality"),
      Subdivision("Xaçmaz", "AZ-XAC", "rayon"),
      Subdivision("Xocalı", "AZ-XCI", "rayon"),
      Subdivision("Xocavənd", "AZ-XVD", "rayon"),
      Subdivision("Xızı", "AZ-XIZ", "rayon"),
      Subdivision("Yardımlı", "AZ-YAR", "rayon"),
      Subdivision("Yevlax", "AZ-YE", "municipality"),
      Subdivision("Yevlax", "AZ-YEV", "rayon"),
      Subdivision("Zaqatala", "AZ-ZAQ", "rayon"),
      Subdivision("Zəngilan", "AZ-ZAN", "rayon"),
      Subdivision("Zərdab", "AZ-ZAR", "rayon"),
      Subdivision("İmişli", "AZ-IMI", "rayon"),
      Subdivision("İsmayıllı", "AZ-ISM", "rayon"),
      Subdivision("Şabran", "AZ-SBN", "rayon"),
      Subdivision("Şahbuz", "AZ-SAH", "rayon"),
      Subdivision("Şamaxı", "AZ-SMI", "rayon"),
      Subdivision("Şirvan", "AZ-SR", "municipality"),
      Subdivision("Şuşa", "AZ-SUS", "rayon"),
      Subdivision("Şəki", "AZ-SA", "municipality"),
      Subdivision("Şəki", "AZ-SAK", "rayon"),
      Subdivision("Şəmkir", "AZ-SKR", "rayon"),
      Subdivision("Şərur", "AZ-SAR", "rayon")
    )
  }

  case object BA extends Country("Bosnia and Herzegovina", "BA", "BIH") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Brčko distrikt", "BA-BRC", "district with special status"),
      Subdivision("Federacija Bosne i Hercegovine", "BA-BIH", "entity"),
      Subdivision("Republika Srpska", "BA-SRP", "entity")
    )
  }

  case object BB extends Country("Barbados", "BB", "BRB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Christ Church", "BB-01", "parish"),
      Subdivision("Saint Andrew", "BB-02", "parish"),
      Subdivision("Saint George", "BB-03", "parish"),
      Subdivision("Saint James", "BB-04", "parish"),
      Subdivision("Saint John", "BB-05", "parish"),
      Subdivision("Saint Joseph", "BB-06", "parish"),
      Subdivision("Saint Lucy", "BB-07", "parish"),
      Subdivision("Saint Michael", "BB-08", "parish"),
      Subdivision("Saint Peter", "BB-09", "parish"),
      Subdivision("Saint Philip", "BB-10", "parish"),
      Subdivision("Saint Thomas", "BB-11", "parish")
    )
  }

  case object BD extends Country("Bangladesh", "BD", "BGD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bagerhat", "BD-05", "district"),
      Subdivision("Bandarban", "BD-01", "district"),
      Subdivision("Barguna", "BD-02", "district"),
      Subdivision("Barishal", "BD-A", "division"),
      Subdivision("Barishal", "BD-06", "district"),
      Subdivision("Bhola", "BD-07", "district"),
      Subdivision("Bogura", "BD-03", "district"),
      Subdivision("Brahmanbaria", "BD-04", "district"),
      Subdivision("Chandpur", "BD-09", "district"),
      Subdivision("Chapai Nawabganj", "BD-45", "district"),
      Subdivision("Chattogram", "BD-B", "division"),
      Subdivision("Chattogram", "BD-10", "district"),
      Subdivision("Chuadanga", "BD-12", "district"),
      Subdivision("Cox's Bazar", "BD-11", "district"),
      Subdivision("Cumilla", "BD-08", "district"),
      Subdivision("Dhaka", "BD-C", "division"),
      Subdivision("Dhaka", "BD-13", "district"),
      Subdivision("Dinajpur", "BD-14", "district"),
      Subdivision("Faridpur", "BD-15", "district"),
      Subdivision("Feni", "BD-16", "district"),
      Subdivision("Gaibandha", "BD-19", "district"),
      Subdivision("Gazipur", "BD-18", "district"),
      Subdivision("Gopalganj", "BD-17", "district"),
      Subdivision("Habiganj", "BD-20", "district"),
      Subdivision("Jamalpur", "BD-21", "district"),
      Subdivision("Jashore", "BD-22", "district"),
      Subdivision("Jhalakathi", "BD-25", "district"),
      Subdivision("Jhenaidah", "BD-23", "district"),
      Subdivision("Joypurhat", "BD-24", "district"),
      Subdivision("Khagrachhari", "BD-29", "district"),
      Subdivision("Khulna", "BD-D", "division"),
      Subdivision("Khulna", "BD-27", "district"),
      Subdivision("Kishoreganj", "BD-26", "district"),
      Subdivision("Kurigram", "BD-28", "district"),
      Subdivision("Kushtia", "BD-30", "district"),
      Subdivision("Lakshmipur", "BD-31", "district"),
      Subdivision("Lalmonirhat", "BD-32", "district"),
      Subdivision("Madaripur", "BD-36", "district"),
      Subdivision("Magura", "BD-37", "district"),
      Subdivision("Manikganj", "BD-33", "district"),
      Subdivision("Meherpur", "BD-39", "district"),
      Subdivision("Moulvibazar", "BD-38", "district"),
      Subdivision("Munshiganj", "BD-35", "district"),
      Subdivision("Mymensingh", "BD-H", "division"),
      Subdivision("Mymensingh", "BD-34", "district"),
      Subdivision("Naogaon", "BD-48", "district"),
      Subdivision("Narail", "BD-43", "district"),
      Subdivision("Narayanganj", "BD-40", "district"),
      Subdivision("Narsingdi", "BD-42", "district"),
      Subdivision("Natore", "BD-44", "district"),
      Subdivision("Netrakona", "BD-41", "district"),
      Subdivision("Nilphamari", "BD-46", "district"),
      Subdivision("Noakhali", "BD-47", "district"),
      Subdivision("Pabna", "BD-49", "district"),
      Subdivision("Panchagarh", "BD-52", "district"),
      Subdivision("Patuakhali", "BD-51", "district"),
      Subdivision("Pirojpur", "BD-50", "district"),
      Subdivision("Rajbari", "BD-53", "district"),
      Subdivision("Rajshahi", "BD-E", "division"),
      Subdivision("Rajshahi", "BD-54", "district"),
      Subdivision("Rangamati", "BD-56", "district"),
      Subdivision("Rangpur", "BD-F", "division"),
      Subdivision("Rangpur", "BD-55", "district"),
      Subdivision("Satkhira", "BD-58", "district"),
      Subdivision("Shariatpur", "BD-62", "district"),
      Subdivision("Sherpur", "BD-57", "district"),
      Subdivision("Sirajganj", "BD-59", "district"),
      Subdivision("Sunamganj", "BD-61", "district"),
      Subdivision("Sylhet", "BD-G", "division"),
      Subdivision("Sylhet", "BD-60", "district"),
      Subdivision("Tangail", "BD-63", "district"),
      Subdivision("Thakurgaon", "BD-64", "district")
    )
  }

  case object BE extends Country("Belgium", "BE", "BEL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Antwerpen", "BE-VAN", "province"),
      Subdivision("Brabant wallon", "BE-WBR", "province"),
      Subdivision("Brussels Hoofdstedelijk Gewest", "BE-BRU", "region"),
      Subdivision("Hainaut", "BE-WHT", "province"),
      Subdivision("Limburg", "BE-VLI", "province"),
      Subdivision("Liège", "BE-WLG", "province"),
      Subdivision("Luxembourg", "BE-WLX", "province"),
      Subdivision("Namur", "BE-WNA", "province"),
      Subdivision("Oost-Vlaanderen", "BE-VOV", "province"),
      Subdivision("Vlaams Gewest", "BE-VLG", "region"),
      Subdivision("Vlaams-Brabant", "BE-VBR", "province"),
      Subdivision("West-Vlaanderen", "BE-VWV", "province"),
      Subdivision("wallonne, Région", "BE-WAL", "region")
    )
  }

  case object BF extends Country("Burkina Faso", "BF", "BFA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balé", "BF-BAL", "province"),
      Subdivision("Bam", "BF-BAM", "province"),
      Subdivision("Banwa", "BF-BAN", "province"),
      Subdivision("Bazèga", "BF-BAZ", "province"),
      Subdivision("Boucle du Mouhoun", "BF-01", "region"),
      Subdivision("Bougouriba", "BF-BGR", "province"),
      Subdivision("Boulgou", "BF-BLG", "province"),
      Subdivision("Boulkiemdé", "BF-BLK", "province"),
      Subdivision("Cascades", "BF-02", "region"),
      Subdivision("Centre", "BF-03", "region"),
      Subdivision("Centre-Est", "BF-04", "region"),
      Subdivision("Centre-Nord", "BF-05", "region"),
      Subdivision("Centre-Ouest", "BF-06", "region"),
      Subdivision("Centre-Sud", "BF-07", "region"),
      Subdivision("Comoé", "BF-COM", "province"),
      Subdivision("Est", "BF-08", "region"),
      Subdivision("Ganzourgou", "BF-GAN", "province"),
      Subdivision("Gnagna", "BF-GNA", "province"),
      Subdivision("Gourma", "BF-GOU", "province"),
      Subdivision("Hauts-Bassins", "BF-09", "region"),
      Subdivision("Houet", "BF-HOU", "province"),
      Subdivision("Ioba", "BF-IOB", "province"),
      Subdivision("Kadiogo", "BF-KAD", "province"),
      Subdivision("Komondjari", "BF-KMD", "province"),
      Subdivision("Kompienga", "BF-KMP", "province"),
      Subdivision("Kossi", "BF-KOS", "province"),
      Subdivision("Koulpélogo", "BF-KOP", "province"),
      Subdivision("Kouritenga", "BF-KOT", "province"),
      Subdivision("Kourwéogo", "BF-KOW", "province"),
      Subdivision("Kénédougou", "BF-KEN", "province"),
      Subdivision("Loroum", "BF-LOR", "province"),
      Subdivision("Léraba", "BF-LER", "province"),
      Subdivision("Mouhoun", "BF-MOU", "province"),
      Subdivision("Nahouri", "BF-NAO", "province"),
      Subdivision("Namentenga", "BF-NAM", "province"),
      Subdivision("Nayala", "BF-NAY", "province"),
      Subdivision("Nord", "BF-10", "region"),
      Subdivision("Noumbiel", "BF-NOU", "province"),
      Subdivision("Oubritenga", "BF-OUB", "province"),
      Subdivision("Oudalan", "BF-OUD", "province"),
      Subdivision("Passoré", "BF-PAS", "province"),
      Subdivision("Plateau-Central", "BF-11", "region"),
      Subdivision("Poni", "BF-PON", "province"),
      Subdivision("Sahel", "BF-12", "region"),
      Subdivision("Sanguié", "BF-SNG", "province"),
      Subdivision("Sanmatenga", "BF-SMT", "province"),
      Subdivision("Sissili", "BF-SIS", "province"),
      Subdivision("Soum", "BF-SOM", "province"),
      Subdivision("Sourou", "BF-SOR", "province"),
      Subdivision("Sud-Ouest", "BF-13", "region"),
      Subdivision("Séno", "BF-SEN", "province"),
      Subdivision("Tapoa", "BF-TAP", "province"),
      Subdivision("Tuy", "BF-TUI", "province"),
      Subdivision("Yagha", "BF-YAG", "province"),
      Subdivision("Yatenga", "BF-YAT", "province"),
      Subdivision("Ziro", "BF-ZIR", "province"),
      Subdivision("Zondoma", "BF-ZON", "province"),
      Subdivision("Zoundwéogo", "BF-ZOU", "province")
    )
  }

  case object BG extends Country("Bulgaria", "BG", "BGR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Blagoevgrad", "BG-01", "district"),
      Subdivision("Burgas", "BG-02", "district"),
      Subdivision("Dobrich", "BG-08", "district"),
      Subdivision("Gabrovo", "BG-07", "district"),
      Subdivision("Haskovo", "BG-26", "district"),
      Subdivision("Kardzhali", "BG-09", "district"),
      Subdivision("Kyustendil", "BG-10", "district"),
      Subdivision("Lovech", "BG-11", "district"),
      Subdivision("Montana", "BG-12", "district"),
      Subdivision("Pazardzhik", "BG-13", "district"),
      Subdivision("Pernik", "BG-14", "district"),
      Subdivision("Pleven", "BG-15", "district"),
      Subdivision("Plovdiv", "BG-16", "district"),
      Subdivision("Razgrad", "BG-17", "district"),
      Subdivision("Ruse", "BG-18", "district"),
      Subdivision("Shumen", "BG-27", "district"),
      Subdivision("Silistra", "BG-19", "district"),
      Subdivision("Sliven", "BG-20", "district"),
      Subdivision("Smolyan", "BG-21", "district"),
      Subdivision("Sofia", "BG-23", "district"),
      Subdivision("Sofia", "BG-22", "district"),
      Subdivision("Stara Zagora", "BG-24", "district"),
      Subdivision("Targovishte", "BG-25", "district"),
      Subdivision("Varna", "BG-03", "district"),
      Subdivision("Veliko Tarnovo", "BG-04", "district"),
      Subdivision("Vidin", "BG-05", "district"),
      Subdivision("Vratsa", "BG-06", "district"),
      Subdivision("Yambol", "BG-28", "district")
    )
  }

  case object BH extends Country("Bahrain", "BH", "BHR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Janūbīyah", "BH-14", "governorate"),
      Subdivision("Al Muḩarraq", "BH-15", "governorate"),
      Subdivision("Al ‘Āşimah", "BH-13", "governorate"),
      Subdivision("Ash Shamālīyah", "BH-17", "governorate")
    )
  }

  case object BI extends Country("Burundi", "BI", "BDI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bubanza", "BI-BB", "province"),
      Subdivision("Bujumbura Mairie", "BI-BM", "province"),
      Subdivision("Bujumbura Rural", "BI-BL", "province"),
      Subdivision("Bururi", "BI-BR", "province"),
      Subdivision("Cankuzo", "BI-CA", "province"),
      Subdivision("Cibitoke", "BI-CI", "province"),
      Subdivision("Gitega", "BI-GI", "province"),
      Subdivision("Karuzi", "BI-KR", "province"),
      Subdivision("Kayanza", "BI-KY", "province"),
      Subdivision("Kirundo", "BI-KI", "province"),
      Subdivision("Makamba", "BI-MA", "province"),
      Subdivision("Muramvya", "BI-MU", "province"),
      Subdivision("Muyinga", "BI-MY", "province"),
      Subdivision("Mwaro", "BI-MW", "province"),
      Subdivision("Ngozi", "BI-NG", "province"),
      Subdivision("Rumonge", "BI-RM", "province"),
      Subdivision("Rutana", "BI-RT", "province"),
      Subdivision("Ruyigi", "BI-RY", "province")
    )
  }

  case object BJ extends Country("Benin", "BJ", "BEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alibori", "BJ-AL", "department"),
      Subdivision("Atacora", "BJ-AK", "department"),
      Subdivision("Atlantique", "BJ-AQ", "department"),
      Subdivision("Borgou", "BJ-BO", "department"),
      Subdivision("Collines", "BJ-CO", "department"),
      Subdivision("Couffo", "BJ-KO", "department"),
      Subdivision("Donga", "BJ-DO", "department"),
      Subdivision("Littoral", "BJ-LI", "department"),
      Subdivision("Mono", "BJ-MO", "department"),
      Subdivision("Ouémé", "BJ-OU", "department"),
      Subdivision("Plateau", "BJ-PL", "department"),
      Subdivision("Zou", "BJ-ZO", "department")
    )
  }

  case object BL extends Country("Saint Barthélemy", "BL", "BLM")

  case object BM extends Country("Bermuda", "BM", "BMU")

  case object BN extends Country("Brunei Darussalam", "BN", "BRN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Belait", "BN-BE", "district"),
      Subdivision("Brunei dan Muara", "BN-BM", "district"),
      Subdivision("Temburong", "BN-TE", "district"),
      Subdivision("Tutong", "BN-TU", "district")
    )
  }

  case object BO extends Country("Bolivia (Plurinational State of)", "BO", "BOL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chuquisaca", "BO-H", "department"),
      Subdivision("Cochabamba", "BO-C", "department"),
      Subdivision("El Beni", "BO-B", "department"),
      Subdivision("La Paz", "BO-L", "department"),
      Subdivision("Oruro", "BO-O", "department"),
      Subdivision("Pando", "BO-N", "department"),
      Subdivision("Potosí", "BO-P", "department"),
      Subdivision("Santa Cruz", "BO-S", "department"),
      Subdivision("Tarija", "BO-T", "department")
    )
  }

  case object BQ extends Country("Bonaire, Sint Eustatius and Saba", "BQ", "BES") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bonaire", "BQ-BO", "special municipality"),
      Subdivision("Saba", "BQ-SA", "special municipality"),
      Subdivision("Sint Eustatius", "BQ-SE", "special municipality")
    )
  }

  case object BR extends Country("Brazil", "BR", "BRA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acre", "BR-AC", "state"),
      Subdivision("Alagoas", "BR-AL", "state"),
      Subdivision("Amapá", "BR-AP", "state"),
      Subdivision("Amazonas", "BR-AM", "state"),
      Subdivision("Bahia", "BR-BA", "state"),
      Subdivision("Ceará", "BR-CE", "state"),
      Subdivision("Distrito Federal", "BR-DF", "federal district"),
      Subdivision("Espírito Santo", "BR-ES", "state"),
      Subdivision("Goiás", "BR-GO", "state"),
      Subdivision("Maranhão", "BR-MA", "state"),
      Subdivision("Mato Grosso", "BR-MT", "state"),
      Subdivision("Mato Grosso do Sul", "BR-MS", "state"),
      Subdivision("Minas Gerais", "BR-MG", "state"),
      Subdivision("Paraná", "BR-PR", "state"),
      Subdivision("Paraíba", "BR-PB", "state"),
      Subdivision("Pará", "BR-PA", "state"),
      Subdivision("Pernambuco", "BR-PE", "state"),
      Subdivision("Piauí", "BR-PI", "state"),
      Subdivision("Rio Grande do Norte", "BR-RN", "state"),
      Subdivision("Rio Grande do Sul", "BR-RS", "state"),
      Subdivision("Rio de Janeiro", "BR-RJ", "state"),
      Subdivision("Rondônia", "BR-RO", "state"),
      Subdivision("Roraima", "BR-RR", "state"),
      Subdivision("Santa Catarina", "BR-SC", "state"),
      Subdivision("Sergipe", "BR-SE", "state"),
      Subdivision("São Paulo", "BR-SP", "state"),
      Subdivision("Tocantins", "BR-TO", "state")
    )
  }

  case object BS extends Country("Bahamas (the)", "BS", "BHS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acklins", "BS-AK", "district"),
      Subdivision("Berry Islands", "BS-BY", "district"),
      Subdivision("Bimini", "BS-BI", "district"),
      Subdivision("Black Point", "BS-BP", "district"),
      Subdivision("Cat Island", "BS-CI", "district"),
      Subdivision("Central Abaco", "BS-CO", "district"),
      Subdivision("Central Andros", "BS-CS", "district"),
      Subdivision("Central Eleuthera", "BS-CE", "district"),
      Subdivision("City of Freeport", "BS-FP", "district"),
      Subdivision("Crooked Island and Long Cay", "BS-CK", "district"),
      Subdivision("East Grand Bahama", "BS-EG", "district"),
      Subdivision("Exuma", "BS-EX", "district"),
      Subdivision("Grand Cay", "BS-GC", "district"),
      Subdivision("Harbour Island", "BS-HI", "district"),
      Subdivision("Hope Town", "BS-HT", "district"),
      Subdivision("Inagua", "BS-IN", "district"),
      Subdivision("Long Island", "BS-LI", "district"),
      Subdivision("Mangrove Cay", "BS-MC", "district"),
      Subdivision("Mayaguana", "BS-MG", "district"),
      Subdivision("Moore's Island", "BS-MI", "district"),
      Subdivision("New Providence", "BS-NP", "island"),
      Subdivision("North Abaco", "BS-NO", "district"),
      Subdivision("North Andros", "BS-NS", "district"),
      Subdivision("North Eleuthera", "BS-NE", "district"),
      Subdivision("Ragged Island", "BS-RI", "district"),
      Subdivision("Rum Cay", "BS-RC", "district"),
      Subdivision("San Salvador", "BS-SS", "district"),
      Subdivision("South Abaco", "BS-SO", "district"),
      Subdivision("South Andros", "BS-SA", "district"),
      Subdivision("South Eleuthera", "BS-SE", "district"),
      Subdivision("Spanish Wells", "BS-SW", "district"),
      Subdivision("West Grand Bahama", "BS-WG", "district")
    )
  }

  case object BT extends Country("Bhutan", "BT", "BTN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bumthang", "BT-33", "district"),
      Subdivision("Chhukha", "BT-12", "district"),
      Subdivision("Dagana", "BT-22", "district"),
      Subdivision("Gasa", "BT-GA", "district"),
      Subdivision("Haa", "BT-13", "district"),
      Subdivision("Lhuentse", "BT-44", "district"),
      Subdivision("Monggar", "BT-42", "district"),
      Subdivision("Paro", "BT-11", "district"),
      Subdivision("Pema Gatshel", "BT-43", "district"),
      Subdivision("Punakha", "BT-23", "district"),
      Subdivision("Samdrup Jongkhar", "BT-45", "district"),
      Subdivision("Samtse", "BT-14", "district"),
      Subdivision("Sarpang", "BT-31", "district"),
      Subdivision("Thimphu", "BT-15", "district"),
      Subdivision("Trashi Yangtse", "BT-TY", "district"),
      Subdivision("Trashigang", "BT-41", "district"),
      Subdivision("Trongsa", "BT-32", "district"),
      Subdivision("Tsirang", "BT-21", "district"),
      Subdivision("Wangdue Phodrang", "BT-24", "district"),
      Subdivision("Zhemgang", "BT-34", "district")
    )
  }

  case object BV extends Country("Bouvet Island", "BV", "BVT")

  case object BW extends Country("Botswana", "BW", "BWA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central", "BW-CE", "district"),
      Subdivision("Chobe", "BW-CH", "district"),
      Subdivision("Francistown", "BW-FR", "city"),
      Subdivision("Gaborone", "BW-GA", "city"),
      Subdivision("Ghanzi", "BW-GH", "district"),
      Subdivision("Jwaneng", "BW-JW", "town"),
      Subdivision("Kgalagadi", "BW-KG", "district"),
      Subdivision("Kgatleng", "BW-KL", "district"),
      Subdivision("Kweneng", "BW-KW", "district"),
      Subdivision("Lobatse", "BW-LO", "town"),
      Subdivision("North East", "BW-NE", "district"),
      Subdivision("North West", "BW-NW", "district"),
      Subdivision("Selibe Phikwe", "BW-SP", "town"),
      Subdivision("South East", "BW-SE", "district"),
      Subdivision("Southern", "BW-SO", "district"),
      Subdivision("Sowa Town", "BW-ST", "town")
    )
  }

  case object BY extends Country("Belarus", "BY", "BLR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bresckaja voblasć", "BY-BR", "oblast"),
      Subdivision("Gomel'skaja oblast'", "BY-HO", "oblast"),
      Subdivision("Gorod Minsk", "BY-HM", "city"),
      Subdivision("Grodnenskaja oblast'", "BY-HR", "oblast"),
      Subdivision("Mahilioŭskaja voblasć", "BY-MA", "oblast"),
      Subdivision("Minskaja oblast'", "BY-MI", "oblast"),
      Subdivision("Viciebskaja voblasć", "BY-VI", "oblast")
    )
  }

  case object BZ extends Country("Belize", "BZ", "BLZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Belize", "BZ-BZ", "district"),
      Subdivision("Cayo", "BZ-CY", "district"),
      Subdivision("Corozal", "BZ-CZL", "district"),
      Subdivision("Orange Walk", "BZ-OW", "district"),
      Subdivision("Stann Creek", "BZ-SC", "district"),
      Subdivision("Toledo", "BZ-TOL", "district")
    )
  }

  case object CA extends Country("Canada", "CA", "CAN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alberta", "CA-AB", "province"),
      Subdivision("British Columbia", "CA-BC", "province"),
      Subdivision("Manitoba", "CA-MB", "province"),
      Subdivision("New Brunswick", "CA-NB", "province"),
      Subdivision("Newfoundland and Labrador", "CA-NL", "province"),
      Subdivision("Northwest Territories", "CA-NT", "territory"),
      Subdivision("Nouvelle-Écosse", "CA-NS", "province"),
      Subdivision("Nunavut", "CA-NU", "territory"),
      Subdivision("Ontario", "CA-ON", "province"),
      Subdivision("Prince Edward Island", "CA-PE", "province"),
      Subdivision("Quebec", "CA-QC", "province"),
      Subdivision("Saskatchewan", "CA-SK", "province"),
      Subdivision("Yukon", "CA-YT", "territory")
    )
  }

  case object CC extends Country("Cocos (Keeling) Islands (the)", "CC", "CCK")

  case object CD extends Country("Congo (the Democratic Republic of the)", "CD", "COD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bas-Uélé", "CD-BU", "province"),
      Subdivision("Haut-Katanga", "CD-HK", "province"),
      Subdivision("Haut-Lomami", "CD-HL", "province"),
      Subdivision("Haut-Uélé", "CD-HU", "province"),
      Subdivision("Ituri", "CD-IT", "province"),
      Subdivision("Kasaï", "CD-KS", "province"),
      Subdivision("Kasaï Central", "CD-KC", "province"),
      Subdivision("Kasaï Oriental", "CD-KE", "province"),
      Subdivision("Kinshasa", "CD-KN", "city"),
      Subdivision("Kongo Central", "CD-BC", "province"),
      Subdivision("Kwango", "CD-KG", "province"),
      Subdivision("Kwilu", "CD-KL", "province"),
      Subdivision("Lomami", "CD-LO", "province"),
      Subdivision("Lualaba", "CD-LU", "province"),
      Subdivision("Mai-Ndombe", "CD-MN", "province"),
      Subdivision("Maniema", "CD-MA", "province"),
      Subdivision("Mongala", "CD-MO", "province"),
      Subdivision("Nord-Kivu", "CD-NK", "province"),
      Subdivision("Nord-Ubangi", "CD-NU", "province"),
      Subdivision("Sankuru", "CD-SA", "province"),
      Subdivision("Sud-Kivu", "CD-SK", "province"),
      Subdivision("Sud-Ubangi", "CD-SU", "province"),
      Subdivision("Tanganyika", "CD-TA", "province"),
      Subdivision("Tshopo", "CD-TO", "province"),
      Subdivision("Tshuapa", "CD-TU", "province"),
      Subdivision("Équateur", "CD-EQ", "province")
    )
  }

  case object CF extends Country("Central African Republic (the)", "CF", "CAF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bamingui-Bangoran", "CF-BB", "prefecture"),
      Subdivision("Bangui", "CF-BGF", "commune"),
      Subdivision("Basse-Kotto", "CF-BK", "prefecture"),
      Subdivision("Gribingui", "CF-KB", "economic prefecture"),
      Subdivision("Haut-Mbomou", "CF-HM", "prefecture"),
      Subdivision("Haute-Kotto", "CF-HK", "prefecture"),
      Subdivision("Haute-Sangha / Mambéré-Kadéï", "CF-HS", "prefecture"),
      Subdivision("Kemö-Gïrïbïngï", "CF-KG", "prefecture"),
      Subdivision("Lobaye", "CF-LB", "prefecture"),
      Subdivision("Mbomou", "CF-MB", "prefecture"),
      Subdivision("Nana-Mambéré", "CF-NM", "prefecture"),
      Subdivision("Ombella-Mpoko", "CF-MP", "prefecture"),
      Subdivision("Ouaka", "CF-UK", "prefecture"),
      Subdivision("Ouham", "CF-AC", "prefecture"),
      Subdivision("Ouham-Pendé", "CF-OP", "prefecture"),
      Subdivision("Sangha", "CF-SE", "economic prefecture"),
      Subdivision("Vakaga", "CF-VK", "prefecture")
    )
  }

  case object CG extends Country("Congo (the)", "CG", "COG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bouenza", "CG-11", "department"),
      Subdivision("Brazzaville", "CG-BZV", "department"),
      Subdivision("Cuvette", "CG-8", "department"),
      Subdivision("Cuvette-Ouest", "CG-15", "department"),
      Subdivision("Kouilou", "CG-5", "department"),
      Subdivision("Likouala", "CG-7", "department"),
      Subdivision("Lékoumou", "CG-2", "department"),
      Subdivision("Niari", "CG-9", "department"),
      Subdivision("Plateaux", "CG-14", "department"),
      Subdivision("Pointe-Noire", "CG-16", "department"),
      Subdivision("Pool", "CG-12", "department"),
      Subdivision("Sangha", "CG-13", "department")
    )
  }

  case object CH extends Country("Switzerland", "CH", "CHE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aargau", "CH-AG", "canton"),
      Subdivision("Appenzell Ausserrhoden", "CH-AR", "canton"),
      Subdivision("Appenzell Innerrhoden", "CH-AI", "canton"),
      Subdivision("Basel-Landschaft", "CH-BL", "canton"),
      Subdivision("Basel-Stadt", "CH-BS", "canton"),
      Subdivision("Bern", "CH-BE", "canton"),
      Subdivision("Freiburg", "CH-FR", "canton"),
      Subdivision("Genève", "CH-GE", "canton"),
      Subdivision("Glarus", "CH-GL", "canton"),
      Subdivision("Graubünden", "CH-GR", "canton"),
      Subdivision("Jura", "CH-JU", "canton"),
      Subdivision("Luzern", "CH-LU", "canton"),
      Subdivision("Neuchâtel", "CH-NE", "canton"),
      Subdivision("Nidwalden", "CH-NW", "canton"),
      Subdivision("Obwalden", "CH-OW", "canton"),
      Subdivision("Sankt Gallen", "CH-SG", "canton"),
      Subdivision("Schaffhausen", "CH-SH", "canton"),
      Subdivision("Schwyz", "CH-SZ", "canton"),
      Subdivision("Solothurn", "CH-SO", "canton"),
      Subdivision("Thurgau", "CH-TG", "canton"),
      Subdivision("Ticino", "CH-TI", "canton"),
      Subdivision("Uri", "CH-UR", "canton"),
      Subdivision("Valais", "CH-VS", "canton"),
      Subdivision("Vaud", "CH-VD", "canton"),
      Subdivision("Zug", "CH-ZG", "canton"),
      Subdivision("Zürich", "CH-ZH", "canton")
    )
  }

  case object CI extends Country("Côte d'Ivoire", "CI", "CIV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abidjan", "CI-AB", "autonomous district"),
      Subdivision("Bas-Sassandra", "CI-BS", "district"),
      Subdivision("Comoé", "CI-CM", "district"),
      Subdivision("Denguélé", "CI-DN", "district"),
      Subdivision("Gôh-Djiboua", "CI-GD", "district"),
      Subdivision("Lacs", "CI-LC", "district"),
      Subdivision("Lagunes", "CI-LG", "district"),
      Subdivision("Montagnes", "CI-MG", "district"),
      Subdivision("Sassandra-Marahoué", "CI-SM", "district"),
      Subdivision("Savanes", "CI-SV", "district"),
      Subdivision("Vallée du Bandama", "CI-VB", "district"),
      Subdivision("Woroba", "CI-WR", "district"),
      Subdivision("Yamoussoukro", "CI-YM", "autonomous district"),
      Subdivision("Zanzan", "CI-ZZ", "district")
    )
  }

  case object CK extends Country("Cook Islands (the)", "CK", "COK")

  case object CL extends Country("Chile", "CL", "CHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aisén del General Carlos Ibañez del Campo", "CL-AI", "region"),
      Subdivision("Antofagasta", "CL-AN", "region"),
      Subdivision("Arica y Parinacota", "CL-AP", "region"),
      Subdivision("Atacama", "CL-AT", "region"),
      Subdivision("Biobío", "CL-BI", "region"),
      Subdivision("Coquimbo", "CL-CO", "region"),
      Subdivision("La Araucanía", "CL-AR", "region"),
      Subdivision("Libertador General Bernardo O'Higgins", "CL-LI", "region"),
      Subdivision("Los Lagos", "CL-LL", "region"),
      Subdivision("Los Ríos", "CL-LR", "region"),
      Subdivision("Magallanes", "CL-MA", "region"),
      Subdivision("Maule", "CL-ML", "region"),
      Subdivision("Región Metropolitana de Santiago", "CL-RM", "region"),
      Subdivision("Tarapacá", "CL-TA", "region"),
      Subdivision("Valparaíso", "CL-VS", "region"),
      Subdivision("Ñuble", "CL-NB", "region")
    )
  }

  case object CM extends Country("Cameroon", "CM", "CMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adamaoua", "CM-AD", "region"),
      Subdivision("Centre", "CM-CE", "region"),
      Subdivision("East", "CM-ES", "region"),
      Subdivision("Extrême-Nord", "CM-EN", "region"),
      Subdivision("Littoral", "CM-LT", "region"),
      Subdivision("Nord", "CM-NO", "region"),
      Subdivision("Nord-Ouest", "CM-NW", "region"),
      Subdivision("Ouest", "CM-OU", "region"),
      Subdivision("South", "CM-SU", "region"),
      Subdivision("South-West", "CM-SW", "region")
    )
  }

  case object CN extends Country("China", "CN", "CHN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anhui Sheng", "CN-AH", "province"),
      Subdivision("Aomen Tebiexingzhengqu", "CN-MO", "special administrative region"),
      Subdivision("Beijing Shi", "CN-BJ", "municipality"),
      Subdivision("Chongqing Shi", "CN-CQ", "municipality"),
      Subdivision("Fujian Sheng", "CN-FJ", "province"),
      Subdivision("Gansu Sheng", "CN-GS", "province"),
      Subdivision("Guangdong Sheng", "CN-GD", "province"),
      Subdivision("Guangxi Zhuangzu Zizhiqu", "CN-GX", "autonomous region"),
      Subdivision("Guizhou Sheng", "CN-GZ", "province"),
      Subdivision("Hainan Sheng", "CN-HI", "province"),
      Subdivision("Hebei Sheng", "CN-HE", "province"),
      Subdivision("Heilongjiang Sheng", "CN-HL", "province"),
      Subdivision("Henan Sheng", "CN-HA", "province"),
      Subdivision("Hong Kong SAR", "CN-HK", "special administrative region"),
      Subdivision("Hubei Sheng", "CN-HB", "province"),
      Subdivision("Hunan Sheng", "CN-HN", "province"),
      Subdivision("Jiangsu Sheng", "CN-JS", "province"),
      Subdivision("Jiangxi Sheng", "CN-JX", "province"),
      Subdivision("Jilin Sheng", "CN-JL", "province"),
      Subdivision("Liaoning Sheng", "CN-LN", "province"),
      Subdivision("Nei Mongol Zizhiqu", "CN-NM", "autonomous region"),
      Subdivision("Ningxia Huizu Zizhiqu", "CN-NX", "autonomous region"),
      Subdivision("Qinghai Sheng", "CN-QH", "province"),
      Subdivision("Shaanxi Sheng", "CN-SN", "province"),
      Subdivision("Shandong Sheng", "CN-SD", "province"),
      Subdivision("Shanghai Shi", "CN-SH", "municipality"),
      Subdivision("Shanxi Sheng", "CN-SX", "province"),
      Subdivision("Sichuan Sheng", "CN-SC", "province"),
      Subdivision("Taiwan Sheng", "CN-TW", "province"),
      Subdivision("Tianjin Shi", "CN-TJ", "municipality"),
      Subdivision("Xinjiang Uygur Zizhiqu", "CN-XJ", "autonomous region"),
      Subdivision("Xizang Zizhiqu", "CN-XZ", "autonomous region"),
      Subdivision("Yunnan Sheng", "CN-YN", "province"),
      Subdivision("Zhejiang Sheng", "CN-ZJ", "province")
    )
  }

  case object CO extends Country("Colombia", "CO", "COL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amazonas", "CO-AMA", "department"),
      Subdivision("Antioquia", "CO-ANT", "department"),
      Subdivision("Arauca", "CO-ARA", "department"),
      Subdivision("Atlántico", "CO-ATL", "department"),
      Subdivision("Bolívar", "CO-BOL", "department"),
      Subdivision("Boyacá", "CO-BOY", "department"),
      Subdivision("Caldas", "CO-CAL", "department"),
      Subdivision("Caquetá", "CO-CAQ", "department"),
      Subdivision("Casanare", "CO-CAS", "department"),
      Subdivision("Cauca", "CO-CAU", "department"),
      Subdivision("Cesar", "CO-CES", "department"),
      Subdivision("Chocó", "CO-CHO", "department"),
      Subdivision("Cundinamarca", "CO-CUN", "department"),
      Subdivision("Córdoba", "CO-COR", "department"),
      Subdivision("Distrito Capital de Bogotá", "CO-DC", "capital district"),
      Subdivision("Guainía", "CO-GUA", "department"),
      Subdivision("Guaviare", "CO-GUV", "department"),
      Subdivision("Huila", "CO-HUI", "department"),
      Subdivision("La Guajira", "CO-LAG", "department"),
      Subdivision("Magdalena", "CO-MAG", "department"),
      Subdivision("Meta", "CO-MET", "department"),
      Subdivision("Nariño", "CO-NAR", "department"),
      Subdivision("Norte de Santander", "CO-NSA", "department"),
      Subdivision("Putumayo", "CO-PUT", "department"),
      Subdivision("Quindío", "CO-QUI", "department"),
      Subdivision("Risaralda", "CO-RIS", "department"),
      Subdivision("San Andrés, Providencia y Santa Catalina", "CO-SAP", "department"),
      Subdivision("Santander", "CO-SAN", "department"),
      Subdivision("Sucre", "CO-SUC", "department"),
      Subdivision("Tolima", "CO-TOL", "department"),
      Subdivision("Valle del Cauca", "CO-VAC", "department"),
      Subdivision("Vaupés", "CO-VAU", "department"),
      Subdivision("Vichada", "CO-VID", "department")
    )
  }

  case object CR extends Country("Costa Rica", "CR", "CRI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alajuela", "CR-A", "province"),
      Subdivision("Cartago", "CR-C", "province"),
      Subdivision("Guanacaste", "CR-G", "province"),
      Subdivision("Heredia", "CR-H", "province"),
      Subdivision("Limón", "CR-L", "province"),
      Subdivision("Puntarenas", "CR-P", "province"),
      Subdivision("San José", "CR-SJ", "province")
    )
  }

  case object CU extends Country("Cuba", "CU", "CUB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artemisa", "CU-15", "province"),
      Subdivision("Camagüey", "CU-09", "province"),
      Subdivision("Ciego de Ávila", "CU-08", "province"),
      Subdivision("Cienfuegos", "CU-06", "province"),
      Subdivision("Granma", "CU-12", "province"),
      Subdivision("Guantánamo", "CU-14", "province"),
      Subdivision("Holguín", "CU-11", "province"),
      Subdivision("Isla de la Juventud", "CU-99", "special municipality"),
      Subdivision("La Habana", "CU-03", "province"),
      Subdivision("Las Tunas", "CU-10", "province"),
      Subdivision("Matanzas", "CU-04", "province"),
      Subdivision("Mayabeque", "CU-16", "province"),
      Subdivision("Pinar del Río", "CU-01", "province"),
      Subdivision("Sancti Spíritus", "CU-07", "province"),
      Subdivision("Santiago de Cuba", "CU-13", "province"),
      Subdivision("Villa Clara", "CU-05", "province")
    )
  }

  case object CV extends Country("Cabo Verde", "CV", "CPV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Boa Vista", "CV-BV", "municipality"),
      Subdivision("Brava", "CV-BR", "municipality"),
      Subdivision("Ilhas de Barlavento", "CV-B", "geographical region"),
      Subdivision("Ilhas de Sotavento", "CV-S", "geographical region"),
      Subdivision("Maio", "CV-MA", "municipality"),
      Subdivision("Mosteiros", "CV-MO", "municipality"),
      Subdivision("Paul", "CV-PA", "municipality"),
      Subdivision("Porto Novo", "CV-PN", "municipality"),
      Subdivision("Praia", "CV-PR", "municipality"),
      Subdivision("Ribeira Brava", "CV-RB", "municipality"),
      Subdivision("Ribeira Grande", "CV-RG", "municipality"),
      Subdivision("Ribeira Grande de Santiago", "CV-RS", "municipality"),
      Subdivision("Sal", "CV-SL", "municipality"),
      Subdivision("Santa Catarina", "CV-CA", "municipality"),
      Subdivision("Santa Catarina do Fogo", "CV-CF", "municipality"),
      Subdivision("Santa Cruz", "CV-CR", "municipality"),
      Subdivision("São Domingos", "CV-SD", "municipality"),
      Subdivision("São Filipe", "CV-SF", "municipality"),
      Subdivision("São Lourenço dos Órgãos", "CV-SO", "municipality"),
      Subdivision("São Miguel", "CV-SM", "municipality"),
      Subdivision("São Salvador do Mundo", "CV-SS", "municipality"),
      Subdivision("São Vicente", "CV-SV", "municipality"),
      Subdivision("Tarrafal", "CV-TA", "municipality"),
      Subdivision("Tarrafal de São Nicolau", "CV-TS", "municipality")
    )
  }

  case object CW extends Country("Curaçao", "CW", "CUW")

  case object CX extends Country("Christmas Island", "CX", "CXR")

  case object CY extends Country("Cyprus", "CY", "CYP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ammochostos", "CY-04", "district"),
      Subdivision("Baf", "CY-05", "district"),
      Subdivision("Girne", "CY-06", "district"),
      Subdivision("Larnaka", "CY-03", "district"),
      Subdivision("Lefkosia", "CY-01", "district"),
      Subdivision("Lemesos", "CY-02", "district")
    )
  }

  case object CZ extends Country("Czechia", "CZ", "CZE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Benešov", "CZ-201", "district"),
      Subdivision("Beroun", "CZ-202", "district"),
      Subdivision("Blansko", "CZ-641", "district"),
      Subdivision("Brno-město", "CZ-642", "district"),
      Subdivision("Brno-venkov", "CZ-643", "district"),
      Subdivision("Bruntál", "CZ-801", "district"),
      Subdivision("Břeclav", "CZ-644", "district"),
      Subdivision("Cheb", "CZ-411", "district"),
      Subdivision("Chomutov", "CZ-422", "district"),
      Subdivision("Chrudim", "CZ-531", "district"),
      Subdivision("Domažlice", "CZ-321", "district"),
      Subdivision("Děčín", "CZ-421", "district"),
      Subdivision("Frýdek-Místek", "CZ-802", "district"),
      Subdivision("Havlíčkův Brod", "CZ-631", "district"),
      Subdivision("Hodonín", "CZ-645", "district"),
      Subdivision("Hradec Králové", "CZ-521", "district"),
      Subdivision("Jablonec nad Nisou", "CZ-512", "district"),
      Subdivision("Jeseník", "CZ-711", "district"),
      Subdivision("Jihlava", "CZ-632", "district"),
      Subdivision("Jihomoravský kraj", "CZ-64", "region"),
      Subdivision("Jihočeský kraj", "CZ-31", "region"),
      Subdivision("Jindřichův Hradec", "CZ-313", "district"),
      Subdivision("Jičín", "CZ-522", "district"),
      Subdivision("Karlovarský kraj", "CZ-41", "region"),
      Subdivision("Karlovy Vary", "CZ-412", "district"),
      Subdivision("Karviná", "CZ-803", "district"),
      Subdivision("Kladno", "CZ-203", "district"),
      Subdivision("Klatovy", "CZ-322", "district"),
      Subdivision("Kolín", "CZ-204", "district"),
      Subdivision("Kraj Vysočina", "CZ-63", "region"),
      Subdivision("Kroměříž", "CZ-721", "district"),
      Subdivision("Královéhradecký kraj", "CZ-52", "region"),
      Subdivision("Kutná Hora", "CZ-205", "district"),
      Subdivision("Liberec", "CZ-513", "district"),
      Subdivision("Liberecký kraj", "CZ-51", "region"),
      Subdivision("Litoměřice", "CZ-423", "district"),
      Subdivision("Louny", "CZ-424", "district"),
      Subdivision("Mladá Boleslav", "CZ-207", "district"),
      Subdivision("Moravskoslezský kraj", "CZ-80", "region"),
      Subdivision("Most", "CZ-425", "district"),
      Subdivision("Mělník", "CZ-206", "district"),
      Subdivision("Nový Jičín", "CZ-804", "district"),
      Subdivision("Nymburk", "CZ-208", "district"),
      Subdivision("Náchod", "CZ-523", "district"),
      Subdivision("Olomouc", "CZ-712", "district"),
      Subdivision("Olomoucký kraj", "CZ-71", "region"),
      Subdivision("Opava", "CZ-805", "district"),
      Subdivision("Ostrava-město", "CZ-806", "district"),
      Subdivision("Pardubice", "CZ-532", "district"),
      Subdivision("Pardubický kraj", "CZ-53", "region"),
      Subdivision("Pelhřimov", "CZ-633", "district"),
      Subdivision("Plzeň-jih", "CZ-324", "district"),
      Subdivision("Plzeň-město", "CZ-323", "district"),
      Subdivision("Plzeň-sever", "CZ-325", "district"),
      Subdivision("Plzeňský kraj", "CZ-32", "region"),
      Subdivision("Prachatice", "CZ-315", "district"),
      Subdivision("Praha, Hlavní město", "CZ-10", "capital city"),
      Subdivision("Praha-východ", "CZ-209", "district"),
      Subdivision("Praha-západ", "CZ-20A", "district"),
      Subdivision("Prostějov", "CZ-713", "district"),
      Subdivision("Písek", "CZ-314", "district"),
      Subdivision("Přerov", "CZ-714", "district"),
      Subdivision("Příbram", "CZ-20B", "district"),
      Subdivision("Rakovník", "CZ-20C", "district"),
      Subdivision("Rokycany", "CZ-326", "district"),
      Subdivision("Rychnov nad Kněžnou", "CZ-524", "district"),
      Subdivision("Semily", "CZ-514", "district"),
      Subdivision("Sokolov", "CZ-413", "district"),
      Subdivision("Strakonice", "CZ-316", "district"),
      Subdivision("Středočeský kraj", "CZ-20", "region"),
      Subdivision("Svitavy", "CZ-533", "district"),
      Subdivision("Tachov", "CZ-327", "district"),
      Subdivision("Teplice", "CZ-426", "district"),
      Subdivision("Trutnov", "CZ-525", "district"),
      Subdivision("Tábor", "CZ-317", "district"),
      Subdivision("Třebíč", "CZ-634", "district"),
      Subdivision("Uherské Hradiště", "CZ-722", "district"),
      Subdivision("Vsetín", "CZ-723", "district"),
      Subdivision("Vyškov", "CZ-646", "district"),
      Subdivision("Zlín", "CZ-724", "district"),
      Subdivision("Zlínský kraj", "CZ-72", "region"),
      Subdivision("Znojmo", "CZ-647", "district"),
      Subdivision("Ústecký kraj", "CZ-42", "region"),
      Subdivision("Ústí nad Labem", "CZ-427", "district"),
      Subdivision("Ústí nad Orlicí", "CZ-534", "district"),
      Subdivision("Česká Lípa", "CZ-511", "district"),
      Subdivision("České Budějovice", "CZ-311", "district"),
      Subdivision("Český Krumlov", "CZ-312", "district"),
      Subdivision("Šumperk", "CZ-715", "district"),
      Subdivision("Žďár nad Sázavou", "CZ-635", "district")
    )
  }

  case object DE extends Country("Germany", "DE", "DEU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baden-Württemberg", "DE-BW", "Land"),
      Subdivision("Bayern", "DE-BY", "Land"),
      Subdivision("Berlin", "DE-BE", "Land"),
      Subdivision("Brandenburg", "DE-BB", "Land"),
      Subdivision("Bremen", "DE-HB", "Land"),
      Subdivision("Hamburg", "DE-HH", "Land"),
      Subdivision("Hessen", "DE-HE", "Land"),
      Subdivision("Mecklenburg-Vorpommern", "DE-MV", "Land"),
      Subdivision("Niedersachsen", "DE-NI", "Land"),
      Subdivision("Nordrhein-Westfalen", "DE-NW", "Land"),
      Subdivision("Rheinland-Pfalz", "DE-RP", "Land"),
      Subdivision("Saarland", "DE-SL", "Land"),
      Subdivision("Sachsen", "DE-SN", "Land"),
      Subdivision("Sachsen-Anhalt", "DE-ST", "Land"),
      Subdivision("Schleswig-Holstein", "DE-SH", "Land"),
      Subdivision("Thüringen", "DE-TH", "Land")
    )
  }

  case object DJ extends Country("Djibouti", "DJ", "DJI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ali Sabieh", "DJ-AS", "region"),
      Subdivision("Arta", "DJ-AR", "region"),
      Subdivision("Awbūk", "DJ-OB", "region"),
      Subdivision("Dikhil", "DJ-DI", "region"),
      Subdivision("Djibouti", "DJ-DJ", "city"),
      Subdivision("Tadjourah", "DJ-TA", "region")
    )
  }

  case object DK extends Country("Denmark", "DK", "DNK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Hovedstaden", "DK-84", "region"),
      Subdivision("Midtjylland", "DK-82", "region"),
      Subdivision("Nordjylland", "DK-81", "region"),
      Subdivision("Sjælland", "DK-85", "region"),
      Subdivision("Syddanmark", "DK-83", "region")
    )
  }

  case object DM extends Country("Dominica", "DM", "DMA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Saint Andrew", "DM-02", "parish"),
      Subdivision("Saint David", "DM-03", "parish"),
      Subdivision("Saint George", "DM-04", "parish"),
      Subdivision("Saint John", "DM-05", "parish"),
      Subdivision("Saint Joseph", "DM-06", "parish"),
      Subdivision("Saint Luke", "DM-07", "parish"),
      Subdivision("Saint Mark", "DM-08", "parish"),
      Subdivision("Saint Patrick", "DM-09", "parish"),
      Subdivision("Saint Paul", "DM-10", "parish"),
      Subdivision("Saint Peter", "DM-11", "parish")
    )
  }

  case object DO extends Country("Dominican Republic (the)", "DO", "DOM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azua", "DO-02", "province"),
      Subdivision("Baoruco", "DO-03", "province"),
      Subdivision("Barahona", "DO-04", "province"),
      Subdivision("Cibao Nordeste", "DO-33", "region"),
      Subdivision("Cibao Noroeste", "DO-34", "region"),
      Subdivision("Cibao Norte", "DO-35", "region"),
      Subdivision("Cibao Sur", "DO-36", "region"),
      Subdivision("Dajabón", "DO-05", "province"),
      Subdivision("Distrito Nacional", "DO-01", "district"),
      Subdivision("Duarte", "DO-06", "province"),
      Subdivision("El Seibo", "DO-08", "province"),
      Subdivision("El Valle", "DO-37", "region"),
      Subdivision("Elías Piña", "DO-07", "province"),
      Subdivision("Enriquillo", "DO-38", "region"),
      Subdivision("Espaillat", "DO-09", "province"),
      Subdivision("Hato Mayor", "DO-30", "province"),
      Subdivision("Hermanas Mirabal", "DO-19", "province"),
      Subdivision("Higuamo", "DO-39", "region"),
      Subdivision("Independencia", "DO-10", "province"),
      Subdivision("La Altagracia", "DO-11", "province"),
      Subdivision("La Romana", "DO-12", "province"),
      Subdivision("La Vega", "DO-13", "province"),
      Subdivision("María Trinidad Sánchez", "DO-14", "province"),
      Subdivision("Monseñor Nouel", "DO-28", "province"),
      Subdivision("Monte Cristi", "DO-15", "province"),
      Subdivision("Monte Plata", "DO-29", "province"),
      Subdivision("Ozama", "DO-40", "region"),
      Subdivision("Pedernales", "DO-16", "province"),
      Subdivision("Peravia", "DO-17", "province"),
      Subdivision("Puerto Plata", "DO-18", "province"),
      Subdivision("Samaná", "DO-20", "province"),
      Subdivision("San Cristóbal", "DO-21", "province"),
      Subdivision("San José de Ocoa", "DO-31", "province"),
      Subdivision("San Juan", "DO-22", "province"),
      Subdivision("San Pedro de Macorís", "DO-23", "province"),
      Subdivision("Santiago", "DO-25", "province"),
      Subdivision("Santiago Rodríguez", "DO-26", "province"),
      Subdivision("Santo Domingo", "DO-32", "province"),
      Subdivision("Sánchez Ramírez", "DO-24", "province"),
      Subdivision("Valdesia", "DO-41", "region"),
      Subdivision("Valverde", "DO-27", "province"),
      Subdivision("Yuma", "DO-42", "region")
    )
  }

  case object DZ extends Country("Algeria", "DZ", "DZA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adrar", "DZ-01", "province"),
      Subdivision("Alger", "DZ-16", "province"),
      Subdivision("Annaba", "DZ-23", "province"),
      Subdivision("Aïn Defla", "DZ-44", "province"),
      Subdivision("Aïn Témouchent", "DZ-46", "province"),
      Subdivision("Batna", "DZ-05", "province"),
      Subdivision("Biskra", "DZ-07", "province"),
      Subdivision("Blida", "DZ-09", "province"),
      Subdivision("Bordj Bou Arréridj", "DZ-34", "province"),
      Subdivision("Bouira", "DZ-10", "province"),
      Subdivision("Boumerdès", "DZ-35", "province"),
      Subdivision("Béchar", "DZ-08", "province"),
      Subdivision("Béjaïa", "DZ-06", "province"),
      Subdivision("Chlef", "DZ-02", "province"),
      Subdivision("Constantine", "DZ-25", "province"),
      Subdivision("Djelfa", "DZ-17", "province"),
      Subdivision("El Bayadh", "DZ-32", "province"),
      Subdivision("El Oued", "DZ-39", "province"),
      Subdivision("El Tarf", "DZ-36", "province"),
      Subdivision("Ghardaïa", "DZ-47", "province"),
      Subdivision("Guelma", "DZ-24", "province"),
      Subdivision("Illizi", "DZ-33", "province"),
      Subdivision("Jijel", "DZ-18", "province"),
      Subdivision("Khenchela", "DZ-40", "province"),
      Subdivision("Laghouat", "DZ-03", "province"),
      Subdivision("M'sila", "DZ-28", "province"),
      Subdivision("Mascara", "DZ-29", "province"),
      Subdivision("Mila", "DZ-43", "province"),
      Subdivision("Mostaganem", "DZ-27", "province"),
      Subdivision("Médéa", "DZ-26", "province"),
      Subdivision("Naama", "DZ-45", "province"),
      Subdivision("Oran", "DZ-31", "province"),
      Subdivision("Ouargla", "DZ-30", "province"),
      Subdivision("Oum el Bouaghi", "DZ-04", "province"),
      Subdivision("Relizane", "DZ-48", "province"),
      Subdivision("Saïda", "DZ-20", "province"),
      Subdivision("Sidi Bel Abbès", "DZ-22", "province"),
      Subdivision("Skikda", "DZ-21", "province"),
      Subdivision("Souk Ahras", "DZ-41", "province"),
      Subdivision("Sétif", "DZ-19", "province"),
      Subdivision("Tamanrasset", "DZ-11", "province"),
      Subdivision("Tiaret", "DZ-14", "province"),
      Subdivision("Tindouf", "DZ-37", "province"),
      Subdivision("Tipaza", "DZ-42", "province"),
      Subdivision("Tissemsilt", "DZ-38", "province"),
      Subdivision("Tizi Ouzou", "DZ-15", "province"),
      Subdivision("Tlemcen", "DZ-13", "province"),
      Subdivision("Tébessa", "DZ-12", "province")
    )
  }

  case object EC extends Country("Ecuador", "EC", "ECU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azuay", "EC-A", "province"),
      Subdivision("Bolívar", "EC-B", "province"),
      Subdivision("Carchi", "EC-C", "province"),
      Subdivision("Cañar", "EC-F", "province"),
      Subdivision("Chimborazo", "EC-H", "province"),
      Subdivision("Cotopaxi", "EC-X", "province"),
      Subdivision("El Oro", "EC-O", "province"),
      Subdivision("Esmeraldas", "EC-E", "province"),
      Subdivision("Galápagos", "EC-W", "province"),
      Subdivision("Guayas", "EC-G", "province"),
      Subdivision("Imbabura", "EC-I", "province"),
      Subdivision("Loja", "EC-L", "province"),
      Subdivision("Los Ríos", "EC-R", "province"),
      Subdivision("Manabí", "EC-M", "province"),
      Subdivision("Morona Santiago", "EC-S", "province"),
      Subdivision("Napo", "EC-N", "province"),
      Subdivision("Orellana", "EC-D", "province"),
      Subdivision("Pastaza", "EC-Y", "province"),
      Subdivision("Pichincha", "EC-P", "province"),
      Subdivision("Santa Elena", "EC-SE", "province"),
      Subdivision("Santo Domingo de los Tsáchilas", "EC-SD", "province"),
      Subdivision("Sucumbíos", "EC-U", "province"),
      Subdivision("Tungurahua", "EC-T", "province"),
      Subdivision("Zamora Chinchipe", "EC-Z", "province")
    )
  }

  case object EE extends Country("Estonia", "EE", "EST") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alutaguse", "EE-130", "rural municipality"),
      Subdivision("Anija", "EE-141", "rural municipality"),
      Subdivision("Antsla", "EE-142", "rural municipality"),
      Subdivision("Elva", "EE-171", "rural municipality"),
      Subdivision("Haapsalu", "EE-184", "urban municipality"),
      Subdivision("Haljala", "EE-191", "rural municipality"),
      Subdivision("Harjumaa", "EE-37", "county"),
      Subdivision("Harku", "EE-198", "rural municipality"),
      Subdivision("Hiiumaa", "EE-39", "county"),
      Subdivision("Hiiumaa", "EE-205", "rural municipality"),
      Subdivision("Häädemeeste", "EE-214", "rural municipality"),
      Subdivision("Ida-Virumaa", "EE-45", "county"),
      Subdivision("Järva", "EE-255", "rural municipality"),
      Subdivision("Järvamaa", "EE-52", "county"),
      Subdivision("Jõelähtme", "EE-245", "rural municipality"),
      Subdivision("Jõgeva", "EE-247", "rural municipality"),
      Subdivision("Jõgevamaa", "EE-50", "county"),
      Subdivision("Jõhvi", "EE-251", "rural municipality"),
      Subdivision("Kadrina", "EE-272", "rural municipality"),
      Subdivision("Kambja", "EE-283", "rural municipality"),
      Subdivision("Kanepi", "EE-284", "rural municipality"),
      Subdivision("Kastre", "EE-291", "rural municipality"),
      Subdivision("Kehtna", "EE-293", "rural municipality"),
      Subdivision("Keila", "EE-296", "urban municipality"),
      Subdivision("Kihnu", "EE-303", "rural municipality"),
      Subdivision("Kiili", "EE-305", "rural municipality"),
      Subdivision("Kohila", "EE-317", "rural municipality"),
      Subdivision("Kohtla-Järve", "EE-321", "urban municipality"),
      Subdivision("Kose", "EE-338", "rural municipality"),
      Subdivision("Kuusalu", "EE-353", "rural municipality"),
      Subdivision("Loksa", "EE-424", "urban municipality"),
      Subdivision("Luunja", "EE-432", "rural municipality"),
      Subdivision("Lääne-Harju", "EE-431", "rural municipality"),
      Subdivision("Lääne-Nigula", "EE-441", "rural municipality"),
      Subdivision("Lääne-Virumaa", "EE-60", "county"),
      Subdivision("Läänemaa", "EE-56", "county"),
      Subdivision("Lääneranna", "EE-430", "rural municipality"),
      Subdivision("Lüganuse", "EE-442", "rural municipality"),
      Subdivision("Maardu", "EE-446", "urban municipality"),
      Subdivision("Muhu", "EE-478", "rural municipality"),
      Subdivision("Mulgi", "EE-480", "rural municipality"),
      Subdivision("Mustvee", "EE-486", "rural municipality"),
      Subdivision("Märjamaa", "EE-503", "rural municipality"),
      Subdivision("Narva", "EE-511", "urban municipality"),
      Subdivision("Narva-Jõesuu", "EE-514", "urban municipality"),
      Subdivision("Nõo", "EE-528", "rural municipality"),
      Subdivision("Otepää", "EE-557", "rural municipality"),
      Subdivision("Paide", "EE-567", "urban municipality"),
      Subdivision("Peipsiääre", "EE-586", "rural municipality"),
      Subdivision("Pärnu", "EE-624", "urban municipality"),
      Subdivision("Pärnumaa", "EE-68", "county"),
      Subdivision("Põhja-Pärnumaa", "EE-638", "rural municipality"),
      Subdivision("Põhja-Sakala", "EE-615", "rural municipality"),
      Subdivision("Põltsamaa", "EE-618", "rural municipality"),
      Subdivision("Põlva", "EE-622", "rural municipality"),
      Subdivision("Põlvamaa", "EE-64", "county"),
      Subdivision("Raasiku", "EE-651", "rural municipality"),
      Subdivision("Rae", "EE-653", "rural municipality"),
      Subdivision("Rakvere", "EE-663", "urban municipality"),
      Subdivision("Rakvere", "EE-661", "rural municipality"),
      Subdivision("Rapla", "EE-668", "rural municipality"),
      Subdivision("Raplamaa", "EE-71", "county"),
      Subdivision("Ruhnu", "EE-689", "rural municipality"),
      Subdivision("Räpina", "EE-708", "rural municipality"),
      Subdivision("Rõuge", "EE-698", "rural municipality"),
      Subdivision("Saarde", "EE-712", "rural municipality"),
      Subdivision("Saaremaa", "EE-74", "county"),
      Subdivision("Saaremaa", "EE-714", "rural municipality"),
      Subdivision("Saku", "EE-719", "rural municipality"),
      Subdivision("Saue", "EE-726", "rural municipality"),
      Subdivision("Setomaa", "EE-732", "rural municipality"),
      Subdivision("Sillamäe", "EE-735", "urban municipality"),
      Subdivision("Tallinn", "EE-784", "urban municipality"),
      Subdivision("Tapa", "EE-792", "rural municipality"),
      Subdivision("Tartu", "EE-793", "urban municipality"),
      Subdivision("Tartu", "EE-796", "rural municipality"),
      Subdivision("Tartumaa", "EE-79", "county"),
      Subdivision("Toila", "EE-803", "rural municipality"),
      Subdivision("Tori", "EE-809", "rural municipality"),
      Subdivision("Tõrva", "EE-824", "rural municipality"),
      Subdivision("Türi", "EE-834", "rural municipality"),
      Subdivision("Valga", "EE-855", "rural municipality"),
      Subdivision("Valgamaa", "EE-81", "county"),
      Subdivision("Viimsi", "EE-890", "rural municipality"),
      Subdivision("Viljandi", "EE-897", "urban municipality"),
      Subdivision("Viljandi", "EE-899", "rural municipality"),
      Subdivision("Viljandimaa", "EE-84", "county"),
      Subdivision("Vinni", "EE-901", "rural municipality"),
      Subdivision("Viru-Nigula", "EE-903", "rural municipality"),
      Subdivision("Vormsi", "EE-907", "rural municipality"),
      Subdivision("Väike-Maarja", "EE-928", "rural municipality"),
      Subdivision("Võru", "EE-919", "urban municipality"),
      Subdivision("Võru", "EE-917", "rural municipality"),
      Subdivision("Võrumaa", "EE-87", "county")
    )
  }

  case object EG extends Country("Egypt", "EG", "EGY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Daqahlīyah", "EG-DK", "governorate"),
      Subdivision("Al Baḩr al Aḩmar", "EG-BA", "governorate"),
      Subdivision("Al Buḩayrah", "EG-BH", "governorate"),
      Subdivision("Al Fayyūm", "EG-FYM", "governorate"),
      Subdivision("Al Gharbīyah", "EG-GH", "governorate"),
      Subdivision("Al Iskandarīyah", "EG-ALX", "governorate"),
      Subdivision("Al Ismā'īlīyah", "EG-IS", "governorate"),
      Subdivision("Al Jīzah", "EG-GZ", "governorate"),
      Subdivision("Al Minyā", "EG-MN", "governorate"),
      Subdivision("Al Minūfīyah", "EG-MNF", "governorate"),
      Subdivision("Al Qalyūbīyah", "EG-KB", "governorate"),
      Subdivision("Al Qāhirah", "EG-C", "governorate"),
      Subdivision("Al Uqşur", "EG-LX", "governorate"),
      Subdivision("Al Wādī al Jadīd", "EG-WAD", "governorate"),
      Subdivision("As Suways", "EG-SUZ", "governorate"),
      Subdivision("Ash Sharqīyah", "EG-SHR", "governorate"),
      Subdivision("Aswān", "EG-ASN", "governorate"),
      Subdivision("Asyūţ", "EG-AST", "governorate"),
      Subdivision("Banī Suwayf", "EG-BNS", "governorate"),
      Subdivision("Būr Sa‘īd", "EG-PTS", "governorate"),
      Subdivision("Dumyāţ", "EG-DT", "governorate"),
      Subdivision("Janūb Sīnā'", "EG-JS", "governorate"),
      Subdivision("Kafr ash Shaykh", "EG-KFS", "governorate"),
      Subdivision("Maţrūḩ", "EG-MT", "governorate"),
      Subdivision("Qinā", "EG-KN", "governorate"),
      Subdivision("Shamāl Sīnā'", "EG-SIN", "governorate"),
      Subdivision("Sūhāj", "EG-SHG", "governorate")
    )
  }

  case object EH extends Country("Western Sahara", "EH", "ESH")

  case object ER extends Country("Eritrea", "ER", "ERI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Awsaţ", "ER-MA", "region"),
      Subdivision("Al Janūbī", "ER-DU", "region"),
      Subdivision("Ansabā", "ER-AN", "region"),
      Subdivision("Debubawi K’eyyĭḥ Baḥri", "ER-DK", "region"),
      Subdivision("Gash-Barka", "ER-GB", "region"),
      Subdivision("Semienawi K’eyyĭḥ Baḥri", "ER-SK", "region")
    )
  }

  case object ES extends Country("Spain", "ES", "ESP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("A Coruña", "ES-C", "province"),
      Subdivision("Alacant", "ES-A", "province"),
      Subdivision("Albacete", "ES-AB", "province"),
      Subdivision("Almería", "ES-AL", "province"),
      Subdivision("Andalucía", "ES-AN", "autonomous community"),
      Subdivision("Araba", "ES-VI", "province"),
      Subdivision("Aragón", "ES-AR", "autonomous community"),
      Subdivision("Asturias", "ES-O", "province"),
      Subdivision("Asturias, Principado de", "ES-AS", "autonomous community"),
      Subdivision("Badajoz", "ES-BA", "province"),
      Subdivision("Barcelona", "ES-B", "province"),
      Subdivision("Bizkaia", "ES-BI", "province"),
      Subdivision("Burgos", "ES-BU", "province"),
      Subdivision("Canarias", "ES-CN", "autonomous community"),
      Subdivision("Cantabria", "ES-CB", "autonomous community"),
      Subdivision("Cantabria", "ES-S", "province"),
      Subdivision("Castelló", "ES-CS", "province"),
      Subdivision("Castilla y León", "ES-CL", "autonomous community"),
      Subdivision("Castilla-La Mancha", "ES-CM", "autonomous community"),
      Subdivision("Catalunya", "ES-CT", "autonomous community"),
      Subdivision("Ceuta", "ES-CE", "autonomous city in North Africa"),
      Subdivision("Ciudad Real", "ES-CR", "province"),
      Subdivision("Cuenca", "ES-CU", "province"),
      Subdivision("Cáceres", "ES-CC", "province"),
      Subdivision("Cádiz", "ES-CA", "province"),
      Subdivision("Córdoba", "ES-CO", "province"),
      Subdivision("Euskal Herria", "ES-PV", "autonomous community"),
      Subdivision("Extremadura", "ES-EX", "autonomous community"),
      Subdivision("Galicia", "ES-GA", "autonomous community"),
      Subdivision("Gipuzkoa", "ES-SS", "province"),
      Subdivision("Girona", "ES-GI", "province"),
      Subdivision("Granada", "ES-GR", "province"),
      Subdivision("Guadalajara", "ES-GU", "province"),
      Subdivision("Huelva", "ES-H", "province"),
      Subdivision("Huesca", "ES-HU", "province"),
      Subdivision("Illes Balears", "ES-IB", "autonomous community"),
      Subdivision("Illes Balears", "ES-PM", "province"),
      Subdivision("Jaén", "ES-J", "province"),
      Subdivision("La Rioja", "ES-RI", "autonomous community"),
      Subdivision("La Rioja", "ES-LO", "province"),
      Subdivision("Las Palmas", "ES-GC", "province"),
      Subdivision("León", "ES-LE", "province"),
      Subdivision("Lleida", "ES-L", "province"),
      Subdivision("Lugo", "ES-LU", "province"),
      Subdivision("Madrid", "ES-M", "province"),
      Subdivision("Madrid, Comunidad de", "ES-MD", "autonomous community"),
      Subdivision("Melilla", "ES-ML", "autonomous city in North Africa"),
      Subdivision("Murcia", "ES-MU", "province"),
      Subdivision("Murcia, Región de", "ES-MC", "autonomous community"),
      Subdivision("Málaga", "ES-MA", "province"),
      Subdivision("Nafarroa", "ES-NA", "province"),
      Subdivision("Nafarroako Foru Komunitatea", "ES-NC", "autonomous community"),
      Subdivision("Ourense", "ES-OR", "province"),
      Subdivision("Palencia", "ES-P", "province"),
      Subdivision("Pontevedra", "ES-PO", "province"),
      Subdivision("Salamanca", "ES-SA", "province"),
      Subdivision("Santa Cruz de Tenerife", "ES-TF", "province"),
      Subdivision("Segovia", "ES-SG", "province"),
      Subdivision("Sevilla", "ES-SE", "province"),
      Subdivision("Soria", "ES-SO", "province"),
      Subdivision("Tarragona", "ES-T", "province"),
      Subdivision("Teruel", "ES-TE", "province"),
      Subdivision("Toledo", "ES-TO", "province"),
      Subdivision("Valencia", "ES-V", "province"),
      Subdivision("Valenciana, Comunidad", "ES-VC", "autonomous community"),
      Subdivision("Valladolid", "ES-VA", "province"),
      Subdivision("Zamora", "ES-ZA", "province"),
      Subdivision("Zaragoza", "ES-Z", "province"),
      Subdivision("Ávila", "ES-AV", "province")
    )
  }

  case object ET extends Country("Ethiopia", "ET", "ETH") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Addis Ababa", "ET-AA", "administration"),
      Subdivision("Afar", "ET-AF", "regional state"),
      Subdivision("Amara", "ET-AM", "regional state"),
      Subdivision("Benshangul-Gumaz", "ET-BE", "regional state"),
      Subdivision("Dire Dawa", "ET-DD", "administration"),
      Subdivision("Gambela Peoples", "ET-GA", "regional state"),
      Subdivision("Harari People", "ET-HA", "regional state"),
      Subdivision("Oromia", "ET-OR", "regional state"),
      Subdivision("Sidama", "ET-SI", "regional state"),
      Subdivision("Somali", "ET-SO", "regional state"),
      Subdivision("Southern Nations, Nationalities and Peoples", "ET-SN", "regional state"),
      Subdivision("Tigrai", "ET-TI", "regional state")
    )
  }

  case object FI extends Country("Finland", "FI", "FIN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahvenanmaan maakunta", "FI-01", "region"),
      Subdivision("Birkaland", "FI-11", "region"),
      Subdivision("Egentliga Finland", "FI-19", "region"),
      Subdivision("Egentliga Tavastland", "FI-06", "region"),
      Subdivision("Etelä-Karjala", "FI-02", "region"),
      Subdivision("Etelä-Pohjanmaa", "FI-03", "region"),
      Subdivision("Etelä-Savo", "FI-04", "region"),
      Subdivision("Kainuu", "FI-05", "region"),
      Subdivision("Keski-Pohjanmaa", "FI-07", "region"),
      Subdivision("Keski-Suomi", "FI-08", "region"),
      Subdivision("Kymenlaakso", "FI-09", "region"),
      Subdivision("Lappi", "FI-10", "region"),
      Subdivision("Norra Karelen", "FI-13", "region"),
      Subdivision("Norra Savolax", "FI-15", "region"),
      Subdivision("Norra Österbotten", "FI-14", "region"),
      Subdivision("Nyland", "FI-18", "region"),
      Subdivision("Pohjanmaa", "FI-12", "region"),
      Subdivision("Päijänne-Tavastland", "FI-16", "region"),
      Subdivision("Satakunda", "FI-17", "region")
    )
  }

  case object FJ extends Country("Fiji", "FJ", "FJI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ba", "FJ-01", "province"),
      Subdivision("Bua", "FJ-02", "province"),
      Subdivision("Cakaudrove", "FJ-03", "province"),
      Subdivision("Central", "FJ-C", "division"),
      Subdivision("Eastern", "FJ-E", "division"),
      Subdivision("Kadavu", "FJ-04", "province"),
      Subdivision("Lau", "FJ-05", "province"),
      Subdivision("Lomaiviti", "FJ-06", "province"),
      Subdivision("Macuata", "FJ-07", "province"),
      Subdivision("Nadroga and Navosa", "FJ-08", "province"),
      Subdivision("Naitasiri", "FJ-09", "province"),
      Subdivision("Namosi", "FJ-10", "province"),
      Subdivision("Northern", "FJ-N", "division"),
      Subdivision("Ra", "FJ-11", "province"),
      Subdivision("Rewa", "FJ-12", "province"),
      Subdivision("Rotuma", "FJ-R", "dependency"),
      Subdivision("Serua", "FJ-13", "province"),
      Subdivision("Tailevu", "FJ-14", "province"),
      Subdivision("Western", "FJ-W", "division")
    )
  }

  case object FK extends Country("Falkland Islands (the)", "FK", "FLK")

  case object FM extends Country("Micronesia (Federated States of)", "FM", "FSM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chuuk", "FM-TRK", "state"),
      Subdivision("Kosrae", "FM-KSA", "state"),
      Subdivision("Pohnpei", "FM-PNI", "state"),
      Subdivision("Yap", "FM-YAP", "state")
    )
  }

  case object FO extends Country("Faroe Islands (the)", "FO", "FRO")

  case object FR extends Country("France", "FR", "FRA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ain", "FR-01", "metropolitan department"),
      Subdivision("Aisne", "FR-02", "metropolitan department"),
      Subdivision("Allier", "FR-03", "metropolitan department"),
      Subdivision("Alpes-Maritimes", "FR-06", "metropolitan department"),
      Subdivision("Alpes-de-Haute-Provence", "FR-04", "metropolitan department"),
      Subdivision("Alsace", "FR-6AE", "European collectivity"),
      Subdivision("Ardennes", "FR-08", "metropolitan department"),
      Subdivision("Ardèche", "FR-07", "metropolitan department"),
      Subdivision("Ariège", "FR-09", "metropolitan department"),
      Subdivision("Aube", "FR-10", "metropolitan department"),
      Subdivision("Aude", "FR-11", "metropolitan department"),
      Subdivision("Auvergne-Rhône-Alpes", "FR-ARA", "metropolitan region"),
      Subdivision("Aveyron", "FR-12", "metropolitan department"),
      Subdivision("Bas-Rhin", "FR-67", "metropolitan department"),
      Subdivision("Bouches-du-Rhône", "FR-13", "metropolitan department"),
      Subdivision("Bourgogne-Franche-Comté", "FR-BFC", "metropolitan region"),
      Subdivision("Bretagne", "FR-BRE", "metropolitan region"),
      Subdivision("Calvados", "FR-14", "metropolitan department"),
      Subdivision("Cantal", "FR-15", "metropolitan department"),
      Subdivision("Centre-Val de Loire", "FR-CVL", "metropolitan region"),
      Subdivision("Charente", "FR-16", "metropolitan department"),
      Subdivision("Charente-Maritime", "FR-17", "metropolitan department"),
      Subdivision("Cher", "FR-18", "metropolitan department"),
      Subdivision("Clipperton", "FR-CP", "dependency"),
      Subdivision("Corrèze", "FR-19", "metropolitan department"),
      Subdivision("Corse", "FR-20R", "metropolitan collectivity with special status"),
      Subdivision("Corse-du-Sud", "FR-2A", "metropolitan department"),
      Subdivision("Creuse", "FR-23", "metropolitan department"),
      Subdivision("Côte-d'Or", "FR-21", "metropolitan department"),
      Subdivision("Côtes-d'Armor", "FR-22", "metropolitan department"),
      Subdivision("Deux-Sèvres", "FR-79", "metropolitan department"),
      Subdivision("Dordogne", "FR-24", "metropolitan department"),
      Subdivision("Doubs", "FR-25", "metropolitan department"),
      Subdivision("Drôme", "FR-26", "metropolitan department"),
      Subdivision("Essonne", "FR-91", "metropolitan department"),
      Subdivision("Eure", "FR-27", "metropolitan department"),
      Subdivision("Eure-et-Loir", "FR-28", "metropolitan department"),
      Subdivision("Finistère", "FR-29", "metropolitan department"),
      Subdivision("Gard", "FR-30", "metropolitan department"),
      Subdivision("Gers", "FR-32", "metropolitan department"),
      Subdivision("Gironde", "FR-33", "metropolitan department"),
      Subdivision("Grand-Est", "FR-GES", "metropolitan region"),
      Subdivision("Guadeloupe", "FR-971", "overseas departmental collectivity"),
      Subdivision("Guyane", "FR-973", "overseas unique territorial collectivity"),
      Subdivision("Haut-Rhin", "FR-68", "metropolitan department"),
      Subdivision("Haute-Corse", "FR-2B", "metropolitan department"),
      Subdivision("Haute-Garonne", "FR-31", "metropolitan department"),
      Subdivision("Haute-Loire", "FR-43", "metropolitan department"),
      Subdivision("Haute-Marne", "FR-52", "metropolitan department"),
      Subdivision("Haute-Savoie", "FR-74", "metropolitan department"),
      Subdivision("Haute-Saône", "FR-70", "metropolitan department"),
      Subdivision("Haute-Vienne", "FR-87", "metropolitan department"),
      Subdivision("Hautes-Alpes", "FR-05", "metropolitan department"),
      Subdivision("Hautes-Pyrénées", "FR-65", "metropolitan department"),
      Subdivision("Hauts-de-France", "FR-HDF", "metropolitan region"),
      Subdivision("Hauts-de-Seine", "FR-92", "metropolitan department"),
      Subdivision("Hérault", "FR-34", "metropolitan department"),
      Subdivision("Ille-et-Vilaine", "FR-35", "metropolitan department"),
      Subdivision("Indre", "FR-36", "metropolitan department"),
      Subdivision("Indre-et-Loire", "FR-37", "metropolitan department"),
      Subdivision("Isère", "FR-38", "metropolitan department"),
      Subdivision("Jura", "FR-39", "metropolitan department"),
      Subdivision("La Réunion", "FR-974", "overseas departmental collectivity"),
      Subdivision("Landes", "FR-40", "metropolitan department"),
      Subdivision("Loir-et-Cher", "FR-41", "metropolitan department"),
      Subdivision("Loire", "FR-42", "metropolitan department"),
      Subdivision("Loire-Atlantique", "FR-44", "metropolitan department"),
      Subdivision("Loiret", "FR-45", "metropolitan department"),
      Subdivision("Lot", "FR-46", "metropolitan department"),
      Subdivision("Lot-et-Garonne", "FR-47", "metropolitan department"),
      Subdivision("Lozère", "FR-48", "metropolitan department"),
      Subdivision("Maine-et-Loire", "FR-49", "metropolitan department"),
      Subdivision("Manche", "FR-50", "metropolitan department"),
      Subdivision("Marne", "FR-51", "metropolitan department"),
      Subdivision("Martinique", "FR-972", "overseas unique territorial collectivity"),
      Subdivision("Mayenne", "FR-53", "metropolitan department"),
      Subdivision("Mayotte", "FR-976", "overseas departmental collectivity"),
      Subdivision("Meurthe-et-Moselle", "FR-54", "metropolitan department"),
      Subdivision("Meuse", "FR-55", "metropolitan department"),
      Subdivision("Morbihan", "FR-56", "metropolitan department"),
      Subdivision("Moselle", "FR-57", "metropolitan department"),
      Subdivision("Métropole de Lyon", "FR-69M", "metropolitan collectivity with special status"),
      Subdivision("Nièvre", "FR-58", "metropolitan department"),
      Subdivision("Nord", "FR-59", "metropolitan department"),
      Subdivision("Normandie", "FR-NOR", "metropolitan region"),
      Subdivision("Nouvelle-Aquitaine", "FR-NAQ", "metropolitan region"),
      Subdivision("Nouvelle-Calédonie", "FR-NC", "overseas collectivity with special status"),
      Subdivision("Occitanie", "FR-OCC", "metropolitan region"),
      Subdivision("Oise", "FR-60", "metropolitan department"),
      Subdivision("Orne", "FR-61", "metropolitan department"),
      Subdivision("Paris", "FR-75C", "metropolitan collectivity with special status"),
      Subdivision("Pas-de-Calais", "FR-62", "metropolitan department"),
      Subdivision("Pays-de-la-Loire", "FR-PDL", "metropolitan region"),
      Subdivision("Polynésie française", "FR-PF", "overseas collectivity"),
      Subdivision("Provence-Alpes-Côte-d’Azur", "FR-PAC", "metropolitan region"),
      Subdivision("Puy-de-Dôme", "FR-63", "metropolitan department"),
      Subdivision("Pyrénées-Atlantiques", "FR-64", "metropolitan department"),
      Subdivision("Pyrénées-Orientales", "FR-66", "metropolitan department"),
      Subdivision("Rhône", "FR-69", "metropolitan department"),
      Subdivision("Saint-Barthélemy", "FR-BL", "overseas collectivity"),
      Subdivision("Saint-Martin", "FR-MF", "overseas collectivity"),
      Subdivision("Saint-Pierre-et-Miquelon", "FR-PM", "overseas collectivity"),
      Subdivision("Sarthe", "FR-72", "metropolitan department"),
      Subdivision("Savoie", "FR-73", "metropolitan department"),
      Subdivision("Saône-et-Loire", "FR-71", "metropolitan department"),
      Subdivision("Seine-Maritime", "FR-76", "metropolitan department"),
      Subdivision("Seine-Saint-Denis", "FR-93", "metropolitan department"),
      Subdivision("Seine-et-Marne", "FR-77", "metropolitan department"),
      Subdivision("Somme", "FR-80", "metropolitan department"),
      Subdivision("Tarn", "FR-81", "metropolitan department"),
      Subdivision("Tarn-et-Garonne", "FR-82", "metropolitan department"),
      Subdivision("Terres australes françaises", "FR-TF", "overseas territory"),
      Subdivision("Territoire de Belfort", "FR-90", "metropolitan department"),
      Subdivision("Val-d'Oise", "FR-95", "metropolitan department"),
      Subdivision("Val-de-Marne", "FR-94", "metropolitan department"),
      Subdivision("Var", "FR-83", "metropolitan department"),
      Subdivision("Vaucluse", "FR-84", "metropolitan department"),
      Subdivision("Vendée", "FR-85", "metropolitan department"),
      Subdivision("Vienne", "FR-86", "metropolitan department"),
      Subdivision("Vosges", "FR-88", "metropolitan department"),
      Subdivision("Wallis-et-Futuna", "FR-WF", "overseas collectivity"),
      Subdivision("Yonne", "FR-89", "metropolitan department"),
      Subdivision("Yvelines", "FR-78", "metropolitan department"),
      Subdivision("Île-de-France", "FR-IDF", "metropolitan region")
    )
  }

  case object GA extends Country("Gabon", "GA", "GAB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Estuaire", "GA-1", "province"),
      Subdivision("Haut-Ogooué", "GA-2", "province"),
      Subdivision("Moyen-Ogooué", "GA-3", "province"),
      Subdivision("Ngounié", "GA-4", "province"),
      Subdivision("Nyanga", "GA-5", "province"),
      Subdivision("Ogooué-Ivindo", "GA-6", "province"),
      Subdivision("Ogooué-Lolo", "GA-7", "province"),
      Subdivision("Ogooué-Maritime", "GA-8", "province"),
      Subdivision("Woleu-Ntem", "GA-9", "province")
    )
  }

  case object GB extends Country("United Kingdom of Great Britain and Northern Ireland (the)", "GB", "GBR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aberdeen City", "GB-ABE", "council area"),
      Subdivision("Aberdeenshire", "GB-ABD", "council area"),
      Subdivision("Angus", "GB-ANS", "council area"),
      Subdivision("Antrim and Newtownabbey", "GB-ANN", "district"),
      Subdivision("Ards and North Down", "GB-AND", "district"),
      Subdivision("Argyll and Bute", "GB-AGB", "council area"),
      Subdivision("Armagh City, Banbridge and Craigavon", "GB-ABC", "district"),
      Subdivision("Barking and Dagenham", "GB-BDG", "London borough"),
      Subdivision("Barnet", "GB-BNE", "London borough"),
      Subdivision("Barnsley", "GB-BNS", "metropolitan district"),
      Subdivision("Bath and North East Somerset", "GB-BAS", "unitary authority"),
      Subdivision("Bedford", "GB-BDF", "unitary authority"),
      Subdivision("Belfast City", "GB-BFS", "district"),
      Subdivision("Bexley", "GB-BEX", "London borough"),
      Subdivision("Birmingham", "GB-BIR", "metropolitan district"),
      Subdivision("Blackburn with Darwen", "GB-BBD", "unitary authority"),
      Subdivision("Blackpool", "GB-BPL", "unitary authority"),
      Subdivision("Blaenau Gwent", "GB-BGW", "unitary authority"),
      Subdivision("Bolton", "GB-BOL", "metropolitan district"),
      Subdivision("Bournemouth, Christchurch and Poole", "GB-BCP", "unitary authority"),
      Subdivision("Bracknell Forest", "GB-BRC", "unitary authority"),
      Subdivision("Bradford", "GB-BRD", "metropolitan district"),
      Subdivision("Brent", "GB-BEN", "London borough"),
      Subdivision("Bridgend", "GB-BGE", "unitary authority"),
      Subdivision("Brighton and Hove", "GB-BNH", "unitary authority"),
      Subdivision("Bristol, City of", "GB-BST", "unitary authority"),
      Subdivision("Bromley", "GB-BRY", "London borough"),
      Subdivision("Buckinghamshire", "GB-BKM", "two-tier county"),
      Subdivision("Bury", "GB-BUR", "metropolitan district"),
      Subdivision("Caerphilly", "GB-CAY", "unitary authority"),
      Subdivision("Calderdale", "GB-CLD", "metropolitan district"),
      Subdivision("Cambridgeshire", "GB-CAM", "two-tier county"),
      Subdivision("Camden", "GB-CMD", "London borough"),
      Subdivision("Cardiff", "GB-CRF", "unitary authority"),
      Subdivision("Carmarthenshire", "GB-CMN", "unitary authority"),
      Subdivision("Causeway Coast and Glens", "GB-CCG", "district"),
      Subdivision("Central Bedfordshire", "GB-CBF", "unitary authority"),
      Subdivision("Ceredigion", "GB-CGN", "unitary authority"),
      Subdivision("Cheshire East", "GB-CHE", "unitary authority"),
      Subdivision("Cheshire West and Chester", "GB-CHW", "unitary authority"),
      Subdivision("Clackmannanshire", "GB-CLK", "council area"),
      Subdivision("Conwy", "GB-CWY", "unitary authority"),
      Subdivision("Cornwall", "GB-CON", "unitary authority"),
      Subdivision("Coventry", "GB-COV", "metropolitan district"),
      Subdivision("Croydon", "GB-CRY", "London borough"),
      Subdivision("Cumbria", "GB-CMA", "two-tier county"),
      Subdivision("Darlington", "GB-DAL", "unitary authority"),
      Subdivision("Denbighshire", "GB-DEN", "unitary authority"),
      Subdivision("Derby", "GB-DER", "unitary authority"),
      Subdivision("Derbyshire", "GB-DBY", "two-tier county"),
      Subdivision("Derry and Strabane", "GB-DRS", "district"),
      Subdivision("Devon", "GB-DEV", "two-tier county"),
      Subdivision("Doncaster", "GB-DNC", "metropolitan district"),
      Subdivision("Dorset", "GB-DOR", "two-tier county"),
      Subdivision("Dudley", "GB-DUD", "metropolitan district"),
      Subdivision("Dumfries and Galloway", "GB-DGY", "council area"),
      Subdivision("Dundee City", "GB-DND", "council area"),
      Subdivision("Durham, County", "GB-DUR", "unitary authority"),
      Subdivision("Ealing", "GB-EAL", "London borough"),
      Subdivision("East Ayrshire", "GB-EAY", "council area"),
      Subdivision("East Dunbartonshire", "GB-EDU", "council area"),
      Subdivision("East Lothian", "GB-ELN", "council area"),
      Subdivision("East Renfrewshire", "GB-ERW", "council area"),
      Subdivision("East Riding of Yorkshire", "GB-ERY", "unitary authority"),
      Subdivision("East Sussex", "GB-ESX", "two-tier county"),
      Subdivision("Edinburgh, City of", "GB-EDH", "council area"),
      Subdivision("Eilean Siar", "GB-ELS", "council area"),
      Subdivision("Enfield", "GB-ENF", "London borough"),
      Subdivision("England", "GB-ENG", "country"),
      Subdivision("Essex", "GB-ESS", "two-tier county"),
      Subdivision("Falkirk", "GB-FAL", "council area"),
      Subdivision("Fermanagh and Omagh", "GB-FMO", "district"),
      Subdivision("Fife", "GB-FIF", "council area"),
      Subdivision("Flintshire", "GB-FLN", "unitary authority"),
      Subdivision("Gateshead", "GB-GAT", "metropolitan district"),
      Subdivision("Glasgow City", "GB-GLG", "council area"),
      Subdivision("Gloucestershire", "GB-GLS", "two-tier county"),
      Subdivision("Greenwich", "GB-GRE", "London borough"),
      Subdivision("Gwynedd", "GB-GWN", "unitary authority"),
      Subdivision("Hackney", "GB-HCK", "London borough"),
      Subdivision("Halton", "GB-HAL", "unitary authority"),
      Subdivision("Hammersmith and Fulham", "GB-HMF", "London borough"),
      Subdivision("Hampshire", "GB-HAM", "two-tier county"),
      Subdivision("Haringey", "GB-HRY", "London borough"),
      Subdivision("Harrow", "GB-HRW", "London borough"),
      Subdivision("Hartlepool", "GB-HPL", "unitary authority"),
      Subdivision("Havering", "GB-HAV", "London borough"),
      Subdivision("Herefordshire", "GB-HEF", "unitary authority"),
      Subdivision("Hertfordshire", "GB-HRT", "two-tier county"),
      Subdivision("Highland", "GB-HLD", "council area"),
      Subdivision("Hillingdon", "GB-HIL", "London borough"),
      Subdivision("Hounslow", "GB-HNS", "London borough"),
      Subdivision("Inverclyde", "GB-IVC", "council area"),
      Subdivision("Isle of Anglesey", "GB-AGY", "unitary authority"),
      Subdivision("Isle of Wight", "GB-IOW", "unitary authority"),
      Subdivision("Isles of Scilly", "GB-IOS", "unitary authority"),
      Subdivision("Islington", "GB-ISL", "London borough"),
      Subdivision("Kensington and Chelsea", "GB-KEC", "London borough"),
      Subdivision("Kent", "GB-KEN", "two-tier county"),
      Subdivision("Kingston upon Hull", "GB-KHL", "unitary authority"),
      Subdivision("Kingston upon Thames", "GB-KTT", "London borough"),
      Subdivision("Kirklees", "GB-KIR", "metropolitan district"),
      Subdivision("Knowsley", "GB-KWL", "metropolitan district"),
      Subdivision("Lambeth", "GB-LBH", "London borough"),
      Subdivision("Lancashire", "GB-LAN", "two-tier county"),
      Subdivision("Leeds", "GB-LDS", "metropolitan district"),
      Subdivision("Leicester", "GB-LCE", "unitary authority"),
      Subdivision("Leicestershire", "GB-LEC", "two-tier county"),
      Subdivision("Lewisham", "GB-LEW", "London borough"),
      Subdivision("Lincolnshire", "GB-LIN", "two-tier county"),
      Subdivision("Lisburn and Castlereagh", "GB-LBC", "district"),
      Subdivision("Liverpool", "GB-LIV", "metropolitan district"),
      Subdivision("London, City of", "GB-LND", "city corporation"),
      Subdivision("Luton", "GB-LUT", "unitary authority"),
      Subdivision("Manchester", "GB-MAN", "metropolitan district"),
      Subdivision("Medway", "GB-MDW", "unitary authority"),
      Subdivision("Merthyr Tydfil", "GB-MTY", "unitary authority"),
      Subdivision("Merton", "GB-MRT", "London borough"),
      Subdivision("Mid and East Antrim", "GB-MEA", "district"),
      Subdivision("Mid-Ulster", "GB-MUL", "district"),
      Subdivision("Middlesbrough", "GB-MDB", "unitary authority"),
      Subdivision("Midlothian", "GB-MLN", "council area"),
      Subdivision("Milton Keynes", "GB-MIK", "unitary authority"),
      Subdivision("Monmouthshire", "GB-MON", "unitary authority"),
      Subdivision("Moray", "GB-MRY", "council area"),
      Subdivision("Neath Port Talbot", "GB-NTL", "unitary authority"),
      Subdivision("Newcastle upon Tyne", "GB-NET", "metropolitan district"),
      Subdivision("Newham", "GB-NWM", "London borough"),
      Subdivision("Newport", "GB-NWP", "unitary authority"),
      Subdivision("Newry, Mourne and Down", "GB-NMD", "district"),
      Subdivision("Norfolk", "GB-NFK", "two-tier county"),
      Subdivision("North Ayrshire", "GB-NAY", "council area"),
      Subdivision("North East Lincolnshire", "GB-NEL", "unitary authority"),
      Subdivision("North Lanarkshire", "GB-NLK", "council area"),
      Subdivision("North Lincolnshire", "GB-NLN", "unitary authority"),
      Subdivision("North Somerset", "GB-NSM", "unitary authority"),
      Subdivision("North Tyneside", "GB-NTY", "metropolitan district"),
      Subdivision("North Yorkshire", "GB-NYK", "two-tier county"),
      Subdivision("Northamptonshire", "GB-NTH", "two-tier county"),
      Subdivision("Northern Ireland", "GB-NIR", "province"),
      Subdivision("Northumberland", "GB-NBL", "unitary authority"),
      Subdivision("Nottingham", "GB-NGM", "unitary authority"),
      Subdivision("Nottinghamshire", "GB-NTT", "two-tier county"),
      Subdivision("Oldham", "GB-OLD", "metropolitan district"),
      Subdivision("Orkney Islands", "GB-ORK", "council area"),
      Subdivision("Oxfordshire", "GB-OXF", "two-tier county"),
      Subdivision("Pembrokeshire", "GB-PEM", "unitary authority"),
      Subdivision("Perth and Kinross", "GB-PKN", "council area"),
      Subdivision("Peterborough", "GB-PTE", "unitary authority"),
      Subdivision("Plymouth", "GB-PLY", "unitary authority"),
      Subdivision("Portsmouth", "GB-POR", "unitary authority"),
      Subdivision("Powys", "GB-POW", "unitary authority"),
      Subdivision("Reading", "GB-RDG", "unitary authority"),
      Subdivision("Redbridge", "GB-RDB", "London borough"),
      Subdivision("Redcar and Cleveland", "GB-RCC", "unitary authority"),
      Subdivision("Renfrewshire", "GB-RFW", "council area"),
      Subdivision("Rhondda Cynon Taff", "GB-RCT", "unitary authority"),
      Subdivision("Richmond upon Thames", "GB-RIC", "London borough"),
      Subdivision("Rochdale", "GB-RCH", "metropolitan district"),
      Subdivision("Rotherham", "GB-ROT", "metropolitan district"),
      Subdivision("Rutland", "GB-RUT", "unitary authority"),
      Subdivision("Salford", "GB-SLF", "metropolitan district"),
      Subdivision("Sandwell", "GB-SAW", "metropolitan district"),
      Subdivision("Scotland", "GB-SCT", "country"),
      Subdivision("Scottish Borders", "GB-SCB", "council area"),
      Subdivision("Sefton", "GB-SFT", "metropolitan district"),
      Subdivision("Sheffield", "GB-SHF", "metropolitan district"),
      Subdivision("Shetland Islands", "GB-ZET", "council area"),
      Subdivision("Shropshire", "GB-SHR", "unitary authority"),
      Subdivision("Slough", "GB-SLG", "unitary authority"),
      Subdivision("Solihull", "GB-SOL", "metropolitan district"),
      Subdivision("Somerset", "GB-SOM", "two-tier county"),
      Subdivision("South Ayrshire", "GB-SAY", "council area"),
      Subdivision("South Gloucestershire", "GB-SGC", "unitary authority"),
      Subdivision("South Lanarkshire", "GB-SLK", "council area"),
      Subdivision("South Tyneside", "GB-STY", "metropolitan district"),
      Subdivision("Southampton", "GB-STH", "unitary authority"),
      Subdivision("Southend-on-Sea", "GB-SOS", "unitary authority"),
      Subdivision("Southwark", "GB-SWK", "London borough"),
      Subdivision("St. Helens", "GB-SHN", "metropolitan district"),
      Subdivision("Staffordshire", "GB-STS", "two-tier county"),
      Subdivision("Stirling", "GB-STG", "council area"),
      Subdivision("Stockport", "GB-SKP", "metropolitan district"),
      Subdivision("Stockton-on-Tees", "GB-STT", "unitary authority"),
      Subdivision("Stoke-on-Trent", "GB-STE", "unitary authority"),
      Subdivision("Suffolk", "GB-SFK", "two-tier county"),
      Subdivision("Sunderland", "GB-SND", "metropolitan district"),
      Subdivision("Surrey", "GB-SRY", "two-tier county"),
      Subdivision("Sutton", "GB-STN", "London borough"),
      Subdivision("Swansea", "GB-SWA", "unitary authority"),
      Subdivision("Swindon", "GB-SWD", "unitary authority"),
      Subdivision("Tameside", "GB-TAM", "metropolitan district"),
      Subdivision("Telford and Wrekin", "GB-TFW", "unitary authority"),
      Subdivision("Thurrock", "GB-THR", "unitary authority"),
      Subdivision("Torbay", "GB-TOB", "unitary authority"),
      Subdivision("Torfaen", "GB-TOF", "unitary authority"),
      Subdivision("Tower Hamlets", "GB-TWH", "London borough"),
      Subdivision("Trafford", "GB-TRF", "metropolitan district"),
      Subdivision("Vale of Glamorgan, The", "GB-VGL", "unitary authority"),
      Subdivision("Wakefield", "GB-WKF", "metropolitan district"),
      Subdivision("Wales", "GB-WLS", "country"),
      Subdivision("Walsall", "GB-WLL", "metropolitan district"),
      Subdivision("Waltham Forest", "GB-WFT", "London borough"),
      Subdivision("Wandsworth", "GB-WND", "London borough"),
      Subdivision("Warrington", "GB-WRT", "unitary authority"),
      Subdivision("Warwickshire", "GB-WAR", "two-tier county"),
      Subdivision("West Berkshire", "GB-WBK", "unitary authority"),
      Subdivision("West Dunbartonshire", "GB-WDU", "council area"),
      Subdivision("West Lothian", "GB-WLN", "council area"),
      Subdivision("West Sussex", "GB-WSX", "two-tier county"),
      Subdivision("Westminster", "GB-WSM", "London borough"),
      Subdivision("Wigan", "GB-WGN", "metropolitan district"),
      Subdivision("Wiltshire", "GB-WIL", "unitary authority"),
      Subdivision("Windsor and Maidenhead", "GB-WNM", "unitary authority"),
      Subdivision("Wirral", "GB-WRL", "metropolitan district"),
      Subdivision("Wokingham", "GB-WOK", "unitary authority"),
      Subdivision("Wolverhampton", "GB-WLV", "metropolitan district"),
      Subdivision("Worcestershire", "GB-WOR", "two-tier county"),
      Subdivision("Wrexham", "GB-WRX", "unitary authority"),
      Subdivision("York", "GB-YOR", "unitary authority")
    )
  }

  case object GD extends Country("Grenada", "GD", "GRD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Saint Andrew", "GD-01", "parish"),
      Subdivision("Saint David", "GD-02", "parish"),
      Subdivision("Saint George", "GD-03", "parish"),
      Subdivision("Saint John", "GD-04", "parish"),
      Subdivision("Saint Mark", "GD-05", "parish"),
      Subdivision("Saint Patrick", "GD-06", "parish"),
      Subdivision("Southern Grenadine Islands", "GD-10", "dependency")
    )
  }

  case object GE extends Country("Georgia", "GE", "GEO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abkhazia", "GE-AB", "autonomous republic"),
      Subdivision("Ajaria", "GE-AJ", "autonomous republic"),
      Subdivision("Guria", "GE-GU", "region"),
      Subdivision("Imereti", "GE-IM", "region"),
      Subdivision("K'akheti", "GE-KA", "region"),
      Subdivision("Kvemo Kartli", "GE-KK", "region"),
      Subdivision("Mtskheta-Mtianeti", "GE-MM", "region"),
      Subdivision("Rach'a-Lechkhumi-Kvemo Svaneti", "GE-RL", "region"),
      Subdivision("Samegrelo-Zemo Svaneti", "GE-SZ", "region"),
      Subdivision("Samtskhe-Javakheti", "GE-SJ", "region"),
      Subdivision("Shida Kartli", "GE-SK", "region"),
      Subdivision("Tbilisi", "GE-TB", "city")
    )
  }

  case object GF extends Country("French Guiana", "GF", "GUF")

  case object GG extends Country("Guernsey", "GG", "GGY")

  case object GH extends Country("Ghana", "GH", "GHA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahafo", "GH-AF", "region"),
      Subdivision("Ashanti", "GH-AH", "region"),
      Subdivision("Bono", "GH-BO", "region"),
      Subdivision("Bono East", "GH-BE", "region"),
      Subdivision("Central", "GH-CP", "region"),
      Subdivision("Eastern", "GH-EP", "region"),
      Subdivision("Greater Accra", "GH-AA", "region"),
      Subdivision("North East", "GH-NE", "region"),
      Subdivision("Northern", "GH-NP", "region"),
      Subdivision("Oti", "GH-OT", "region"),
      Subdivision("Savannah", "GH-SV", "region"),
      Subdivision("Upper East", "GH-UE", "region"),
      Subdivision("Upper West", "GH-UW", "region"),
      Subdivision("Volta", "GH-TV", "region"),
      Subdivision("Western", "GH-WP", "region"),
      Subdivision("Western North", "GH-WN", "region")
    )
  }

  case object GI extends Country("Gibraltar", "GI", "GIB")

  case object GL extends Country("Greenland", "GL", "GRL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Avannaata Kommunia", "GL-AV", "municipality"),
      Subdivision("Kommune Kujalleq", "GL-KU", "municipality"),
      Subdivision("Kommune Qeqertalik", "GL-QT", "municipality"),
      Subdivision("Kommuneqarfik Sermersooq", "GL-SM", "municipality"),
      Subdivision("Qeqqata Kommunia", "GL-QE", "municipality")
    )
  }

  case object GM extends Country("Gambia (the)", "GM", "GMB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Banjul", "GM-B", "city"),
      Subdivision("Central River", "GM-M", "division"),
      Subdivision("Lower River", "GM-L", "division"),
      Subdivision("North Bank", "GM-N", "division"),
      Subdivision("Upper River", "GM-U", "division"),
      Subdivision("Western", "GM-W", "division")
    )
  }

  case object GN extends Country("Guinea", "GN", "GIN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Beyla", "GN-BE", "prefecture"),
      Subdivision("Boffa", "GN-BF", "prefecture"),
      Subdivision("Boké", "GN-B", "administrative region"),
      Subdivision("Boké", "GN-BK", "prefecture"),
      Subdivision("Conakry", "GN-C", "governorate"),
      Subdivision("Coyah", "GN-CO", "prefecture"),
      Subdivision("Dabola", "GN-DB", "prefecture"),
      Subdivision("Dalaba", "GN-DL", "prefecture"),
      Subdivision("Dinguiraye", "GN-DI", "prefecture"),
      Subdivision("Dubréka", "GN-DU", "prefecture"),
      Subdivision("Faranah", "GN-F", "administrative region"),
      Subdivision("Faranah", "GN-FA", "prefecture"),
      Subdivision("Forécariah", "GN-FO", "prefecture"),
      Subdivision("Fria", "GN-FR", "prefecture"),
      Subdivision("Gaoual", "GN-GA", "prefecture"),
      Subdivision("Guékédou", "GN-GU", "prefecture"),
      Subdivision("Kankan", "GN-K", "administrative region"),
      Subdivision("Kankan", "GN-KA", "prefecture"),
      Subdivision("Kindia", "GN-D", "administrative region"),
      Subdivision("Kindia", "GN-KD", "prefecture"),
      Subdivision("Kissidougou", "GN-KS", "prefecture"),
      Subdivision("Koubia", "GN-KB", "prefecture"),
      Subdivision("Koundara", "GN-KN", "prefecture"),
      Subdivision("Kouroussa", "GN-KO", "prefecture"),
      Subdivision("Kérouané", "GN-KE", "prefecture"),
      Subdivision("Labé", "GN-L", "administrative region"),
      Subdivision("Labé", "GN-LA", "prefecture"),
      Subdivision("Lola", "GN-LO", "prefecture"),
      Subdivision("Lélouma", "GN-LE", "prefecture"),
      Subdivision("Macenta", "GN-MC", "prefecture"),
      Subdivision("Mali", "GN-ML", "prefecture"),
      Subdivision("Mamou", "GN-M", "administrative region"),
      Subdivision("Mamou", "GN-MM", "prefecture"),
      Subdivision("Mandiana", "GN-MD", "prefecture"),
      Subdivision("Nzérékoré", "GN-N", "administrative region"),
      Subdivision("Nzérékoré", "GN-NZ", "prefecture"),
      Subdivision("Pita", "GN-PI", "prefecture"),
      Subdivision("Siguiri", "GN-SI", "prefecture"),
      Subdivision("Tougué", "GN-TO", "prefecture"),
      Subdivision("Télimélé", "GN-TE", "prefecture"),
      Subdivision("Yomou", "GN-YO", "prefecture")
    )
  }

  case object GP extends Country("Guadeloupe", "GP", "GLP")

  case object GQ extends Country("Equatorial Guinea", "GQ", "GNQ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Annobon", "GQ-AN", "province"),
      Subdivision("Bioko Nord", "GQ-BN", "province"),
      Subdivision("Bioko Sud", "GQ-BS", "province"),
      Subdivision("Centro Sud", "GQ-CS", "province"),
      Subdivision("Djibloho", "GQ-DJ", "province"),
      Subdivision("Kié-Ntem", "GQ-KN", "province"),
      Subdivision("Litoral", "GQ-LI", "province"),
      Subdivision("Região Continental", "GQ-C", "region"),
      Subdivision("Região Insular", "GQ-I", "region"),
      Subdivision("Wele-Nzas", "GQ-WN", "province")
    )
  }

  case object GR extends Country("Greece", "GR", "GRC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anatolikí Makedonía kai Thráki", "GR-A", "administrative region"),
      Subdivision("Attikí", "GR-I", "administrative region"),
      Subdivision("Dytikí Elláda", "GR-G", "administrative region"),
      Subdivision("Dytikí Makedonía", "GR-C", "administrative region"),
      Subdivision("Ionía Nísia", "GR-F", "administrative region"),
      Subdivision("Kentrikí Makedonía", "GR-B", "administrative region"),
      Subdivision("Kríti", "GR-M", "administrative region"),
      Subdivision("Nótio Aigaío", "GR-L", "administrative region"),
      Subdivision("Pelopónnisos", "GR-J", "administrative region"),
      Subdivision("Stereá Elláda", "GR-H", "administrative region"),
      Subdivision("Thessalía", "GR-E", "administrative region"),
      Subdivision("Vóreio Aigaío", "GR-K", "administrative region"),
      Subdivision("Ágion Óros", "GR-69", "self-governed part"),
      Subdivision("Ípeiros", "GR-D", "administrative region")
    )
  }

  case object GS extends Country("South Georgia and the South Sandwich Islands", "GS", "SGS")

  case object GT extends Country("Guatemala", "GT", "GTM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alta Verapaz", "GT-16", "department"),
      Subdivision("Baja Verapaz", "GT-15", "department"),
      Subdivision("Chimaltenango", "GT-04", "department"),
      Subdivision("Chiquimula", "GT-20", "department"),
      Subdivision("El Progreso", "GT-02", "department"),
      Subdivision("Escuintla", "GT-05", "department"),
      Subdivision("Guatemala", "GT-01", "department"),
      Subdivision("Huehuetenango", "GT-13", "department"),
      Subdivision("Izabal", "GT-18", "department"),
      Subdivision("Jalapa", "GT-21", "department"),
      Subdivision("Jutiapa", "GT-22", "department"),
      Subdivision("Petén", "GT-17", "department"),
      Subdivision("Quetzaltenango", "GT-09", "department"),
      Subdivision("Quiché", "GT-14", "department"),
      Subdivision("Retalhuleu", "GT-11", "department"),
      Subdivision("Sacatepéquez", "GT-03", "department"),
      Subdivision("San Marcos", "GT-12", "department"),
      Subdivision("Santa Rosa", "GT-06", "department"),
      Subdivision("Sololá", "GT-07", "department"),
      Subdivision("Suchitepéquez", "GT-10", "department"),
      Subdivision("Totonicapán", "GT-08", "department"),
      Subdivision("Zacapa", "GT-19", "department")
    )
  }

  case object GU extends Country("Guam", "GU", "GUM")

  case object GW extends Country("Guinea-Bissau", "GW", "GNB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bafatá", "GW-BA", "region"),
      Subdivision("Biombo", "GW-BM", "region"),
      Subdivision("Bissau", "GW-BS", "autonomous sector"),
      Subdivision("Bolama / Bijagós", "GW-BL", "region"),
      Subdivision("Cacheu", "GW-CA", "region"),
      Subdivision("Gabú", "GW-GA", "region"),
      Subdivision("Leste", "GW-L", "province"),
      Subdivision("Norte", "GW-N", "province"),
      Subdivision("Oio", "GW-OI", "region"),
      Subdivision("Quinara", "GW-QU", "region"),
      Subdivision("Sul", "GW-S", "province"),
      Subdivision("Tombali", "GW-TO", "region")
    )
  }

  case object GY extends Country("Guyana", "GY", "GUY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Barima-Waini", "GY-BA", "region"),
      Subdivision("Cuyuni-Mazaruni", "GY-CU", "region"),
      Subdivision("Demerara-Mahaica", "GY-DE", "region"),
      Subdivision("East Berbice-Corentyne", "GY-EB", "region"),
      Subdivision("Essequibo Islands-West Demerara", "GY-ES", "region"),
      Subdivision("Mahaica-Berbice", "GY-MA", "region"),
      Subdivision("Pomeroon-Supenaam", "GY-PM", "region"),
      Subdivision("Potaro-Siparuni", "GY-PT", "region"),
      Subdivision("Upper Demerara-Berbice", "GY-UD", "region"),
      Subdivision("Upper Takutu-Upper Essequibo", "GY-UT", "region")
    )
  }

  case object HK extends Country("Hong Kong", "HK", "HKG")

  case object HM extends Country("Heard Island and McDonald Islands", "HM", "HMD")

  case object HN extends Country("Honduras", "HN", "HND") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Atlántida", "HN-AT", "department"),
      Subdivision("Choluteca", "HN-CH", "department"),
      Subdivision("Colón", "HN-CL", "department"),
      Subdivision("Comayagua", "HN-CM", "department"),
      Subdivision("Copán", "HN-CP", "department"),
      Subdivision("Cortés", "HN-CR", "department"),
      Subdivision("El Paraíso", "HN-EP", "department"),
      Subdivision("Francisco Morazán", "HN-FM", "department"),
      Subdivision("Gracias a Dios", "HN-GD", "department"),
      Subdivision("Intibucá", "HN-IN", "department"),
      Subdivision("Islas de la Bahía", "HN-IB", "department"),
      Subdivision("La Paz", "HN-LP", "department"),
      Subdivision("Lempira", "HN-LE", "department"),
      Subdivision("Ocotepeque", "HN-OC", "department"),
      Subdivision("Olancho", "HN-OL", "department"),
      Subdivision("Santa Bárbara", "HN-SB", "department"),
      Subdivision("Valle", "HN-VA", "department"),
      Subdivision("Yoro", "HN-YO", "department")
    )
  }

  case object HR extends Country("Croatia", "HR", "HRV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bjelovarsko-bilogorska županija", "HR-07", "county"),
      Subdivision("Brodsko-posavska županija", "HR-12", "county"),
      Subdivision("Dubrovačko-neretvanska županija", "HR-19", "county"),
      Subdivision("Grad Zagreb", "HR-21", "city"),
      Subdivision("Istarska županija", "HR-18", "county"),
      Subdivision("Karlovačka županija", "HR-04", "county"),
      Subdivision("Koprivničko-križevačka županija", "HR-06", "county"),
      Subdivision("Krapinsko-zagorska županija", "HR-02", "county"),
      Subdivision("Ličko-senjska županija", "HR-09", "county"),
      Subdivision("Međimurska županija", "HR-20", "county"),
      Subdivision("Osječko-baranjska županija", "HR-14", "county"),
      Subdivision("Požeško-slavonska županija", "HR-11", "county"),
      Subdivision("Primorsko-goranska županija", "HR-08", "county"),
      Subdivision("Sisačko-moslavačka županija", "HR-03", "county"),
      Subdivision("Splitsko-dalmatinska županija", "HR-17", "county"),
      Subdivision("Varaždinska županija", "HR-05", "county"),
      Subdivision("Virovitičko-podravska županija", "HR-10", "county"),
      Subdivision("Vukovarsko-srijemska županija", "HR-16", "county"),
      Subdivision("Zadarska županija", "HR-13", "county"),
      Subdivision("Zagrebačka županija", "HR-01", "county"),
      Subdivision("Šibensko-kninska županija", "HR-15", "county")
    )
  }

  case object HT extends Country("Haiti", "HT", "HTI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artibonite", "HT-AR", "department"),
      Subdivision("Centre", "HT-CE", "department"),
      Subdivision("Grandans", "HT-GA", "department"),
      Subdivision("Lwès", "HT-OU", "department"),
      Subdivision("Nip", "HT-NI", "department"),
      Subdivision("Nord", "HT-ND", "department"),
      Subdivision("Nord-Est", "HT-NE", "department"),
      Subdivision("Nord-Ouest", "HT-NO", "department"),
      Subdivision("Sid", "HT-SD", "department"),
      Subdivision("Sidès", "HT-SE", "department")
    )
  }

  case object HU extends Country("Hungary", "HU", "HUN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baranya", "HU-BA", "county"),
      Subdivision("Borsod-Abaúj-Zemplén", "HU-BZ", "county"),
      Subdivision("Budapest", "HU-BU", "capital city"),
      Subdivision("Bács-Kiskun", "HU-BK", "county"),
      Subdivision("Békés", "HU-BE", "county"),
      Subdivision("Békéscsaba", "HU-BC", "city with county rights"),
      Subdivision("Csongrád-Csanád", "HU-CS", "county"),
      Subdivision("Debrecen", "HU-DE", "city with county rights"),
      Subdivision("Dunaújváros", "HU-DU", "city with county rights"),
      Subdivision("Eger", "HU-EG", "city with county rights"),
      Subdivision("Fejér", "HU-FE", "county"),
      Subdivision("Győr", "HU-GY", "city with county rights"),
      Subdivision("Győr-Moson-Sopron", "HU-GS", "county"),
      Subdivision("Hajdú-Bihar", "HU-HB", "county"),
      Subdivision("Heves", "HU-HE", "county"),
      Subdivision("Hódmezővásárhely", "HU-HV", "city with county rights"),
      Subdivision("Jász-Nagykun-Szolnok", "HU-JN", "county"),
      Subdivision("Kaposvár", "HU-KV", "city with county rights"),
      Subdivision("Kecskemét", "HU-KM", "city with county rights"),
      Subdivision("Komárom-Esztergom", "HU-KE", "county"),
      Subdivision("Miskolc", "HU-MI", "city with county rights"),
      Subdivision("Nagykanizsa", "HU-NK", "city with county rights"),
      Subdivision("Nyíregyháza", "HU-NY", "city with county rights"),
      Subdivision("Nógrád", "HU-NO", "county"),
      Subdivision("Pest", "HU-PE", "county"),
      Subdivision("Pécs", "HU-PS", "city with county rights"),
      Subdivision("Salgótarján", "HU-ST", "city with county rights"),
      Subdivision("Somogy", "HU-SO", "county"),
      Subdivision("Sopron", "HU-SN", "city with county rights"),
      Subdivision("Szabolcs-Szatmár-Bereg", "HU-SZ", "county"),
      Subdivision("Szeged", "HU-SD", "city with county rights"),
      Subdivision("Szekszárd", "HU-SS", "city with county rights"),
      Subdivision("Szolnok", "HU-SK", "city with county rights"),
      Subdivision("Szombathely", "HU-SH", "city with county rights"),
      Subdivision("Székesfehérvár", "HU-SF", "city with county rights"),
      Subdivision("Tatabánya", "HU-TB", "city with county rights"),
      Subdivision("Tolna", "HU-TO", "county"),
      Subdivision("Vas", "HU-VA", "county"),
      Subdivision("Veszprém", "HU-VE", "county"),
      Subdivision("Veszprém", "HU-VM", "city with county rights"),
      Subdivision("Zala", "HU-ZA", "county"),
      Subdivision("Zalaegerszeg", "HU-ZE", "city with county rights"),
      Subdivision("Érd", "HU-ER", "city with county rights")
    )
  }

  case object ID extends Country("Indonesia", "ID", "IDN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aceh", "ID-AC", "province"),
      Subdivision("Bali", "ID-BA", "province"),
      Subdivision("Banten", "ID-BT", "province"),
      Subdivision("Bengkulu", "ID-BE", "province"),
      Subdivision("Gorontalo", "ID-GO", "province"),
      Subdivision("Jakarta Raya", "ID-JK", "capital district"),
      Subdivision("Jambi", "ID-JA", "province"),
      Subdivision("Jawa", "ID-JW", "geographical unit"),
      Subdivision("Jawa Barat", "ID-JB", "province"),
      Subdivision("Jawa Tengah", "ID-JT", "province"),
      Subdivision("Jawa Timur", "ID-JI", "province"),
      Subdivision("Kalimantan", "ID-KA", "geographical unit"),
      Subdivision("Kalimantan Barat", "ID-KB", "province"),
      Subdivision("Kalimantan Selatan", "ID-KS", "province"),
      Subdivision("Kalimantan Tengah", "ID-KT", "province"),
      Subdivision("Kalimantan Timur", "ID-KI", "province"),
      Subdivision("Kalimantan Utara", "ID-KU", "province"),
      Subdivision("Kepulauan Bangka Belitung", "ID-BB", "province"),
      Subdivision("Kepulauan Riau", "ID-KR", "province"),
      Subdivision("Lampung", "ID-LA", "province"),
      Subdivision("Maluku", "ID-ML", "geographical unit"),
      Subdivision("Maluku", "ID-MA", "province"),
      Subdivision("Maluku Utara", "ID-MU", "province"),
      Subdivision("Nusa Tenggara", "ID-NU", "geographical unit"),
      Subdivision("Nusa Tenggara Barat", "ID-NB", "province"),
      Subdivision("Nusa Tenggara Timur", "ID-NT", "province"),
      Subdivision("Papua", "ID-PP", "geographical unit"),
      Subdivision("Papua", "ID-PA", "province"),
      Subdivision("Papua Barat", "ID-PB", "province"),
      Subdivision("Riau", "ID-RI", "province"),
      Subdivision("Sulawesi", "ID-SL", "geographical unit"),
      Subdivision("Sulawesi Barat", "ID-SR", "province"),
      Subdivision("Sulawesi Selatan", "ID-SN", "province"),
      Subdivision("Sulawesi Tengah", "ID-ST", "province"),
      Subdivision("Sulawesi Tenggara", "ID-SG", "province"),
      Subdivision("Sulawesi Utara", "ID-SA", "province"),
      Subdivision("Sumatera", "ID-SM", "geographical unit"),
      Subdivision("Sumatera Barat", "ID-SB", "province"),
      Subdivision("Sumatera Selatan", "ID-SS", "province"),
      Subdivision("Sumatera Utara", "ID-SU", "province"),
      Subdivision("Yogyakarta", "ID-YO", "special region")
    )
  }

  case object IE extends Country("Ireland", "IE", "IRL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("An Cabhán", "IE-CN", "county"),
      Subdivision("An Clár", "IE-CE", "county"),
      Subdivision("An Iarmhí", "IE-WH", "county"),
      Subdivision("An Longfort", "IE-LD", "county"),
      Subdivision("An Mhumhain", "IE-M", "province"),
      Subdivision("An Mhí", "IE-MH", "county"),
      Subdivision("Baile Átha Cliath", "IE-D", "county"),
      Subdivision("Carlow", "IE-CW", "county"),
      Subdivision("Ciarraí", "IE-KY", "county"),
      Subdivision("Cill Chainnigh", "IE-KK", "county"),
      Subdivision("Cill Dara", "IE-KE", "county"),
      Subdivision("Cill Mhantáin", "IE-WW", "county"),
      Subdivision("Connacht", "IE-C", "province"),
      Subdivision("Corcaigh", "IE-CO", "county"),
      Subdivision("Donegal", "IE-DL", "county"),
      Subdivision("Gaillimh", "IE-G", "county"),
      Subdivision("Laighin", "IE-L", "province"),
      Subdivision("Laois", "IE-LS", "county"),
      Subdivision("Leitrim", "IE-LM", "county"),
      Subdivision("Limerick", "IE-LK", "county"),
      Subdivision("Loch Garman", "IE-WX", "county"),
      Subdivision("Louth", "IE-LH", "county"),
      Subdivision("Maigh Eo", "IE-MO", "county"),
      Subdivision("Monaghan", "IE-MN", "county"),
      Subdivision("Offaly", "IE-OY", "county"),
      Subdivision("Port Láirge", "IE-WD", "county"),
      Subdivision("Ros Comáin", "IE-RN", "county"),
      Subdivision("Sligeach", "IE-SO", "county"),
      Subdivision("Tiobraid Árann", "IE-TA", "county"),
      Subdivision("Ulaidh", "IE-U", "province")
    )
  }

  case object IL extends Country("Israel", "IL", "ISR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Awsaţ", "IL-M", "district"),
      Subdivision("Al Janūbī", "IL-D", "district"),
      Subdivision("Al Quds", "IL-JM", "district"),
      Subdivision("Ash Shamālī", "IL-Z", "district"),
      Subdivision("H̱efa", "IL-HA", "district"),
      Subdivision("Tall Abīb", "IL-TA", "district")
    )
  }

  case object IM extends Country("Isle of Man", "IM", "IMN")

  case object IN extends Country("India", "IN", "IND") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andaman and Nicobar Islands", "IN-AN", "Union territory"),
      Subdivision("Andhra Pradesh", "IN-AP", "state"),
      Subdivision("Arunāchal Pradesh", "IN-AR", "state"),
      Subdivision("Assam", "IN-AS", "state"),
      Subdivision("Bihār", "IN-BR", "state"),
      Subdivision("Chandīgarh", "IN-CH", "Union territory"),
      Subdivision("Chhattīsgarh", "IN-CT", "state"),
      Subdivision("Delhi", "IN-DL", "Union territory"),
      Subdivision("Dādra and Nagar Haveli and Damān and Diu", "IN-DH", "Union territory"),
      Subdivision("Goa", "IN-GA", "state"),
      Subdivision("Gujarāt", "IN-GJ", "state"),
      Subdivision("Haryāna", "IN-HR", "state"),
      Subdivision("Himāchal Pradesh", "IN-HP", "state"),
      Subdivision("Jammu and Kashmīr", "IN-JK", "Union territory"),
      Subdivision("Jhārkhand", "IN-JH", "state"),
      Subdivision("Karnātaka", "IN-KA", "state"),
      Subdivision("Kerala", "IN-KL", "state"),
      Subdivision("Ladākh", "IN-LA", "Union territory"),
      Subdivision("Lakshadweep", "IN-LD", "Union territory"),
      Subdivision("Madhya Pradesh", "IN-MP", "state"),
      Subdivision("Mahārāshtra", "IN-MH", "state"),
      Subdivision("Manipur", "IN-MN", "state"),
      Subdivision("Meghālaya", "IN-ML", "state"),
      Subdivision("Mizoram", "IN-MZ", "state"),
      Subdivision("Nāgāland", "IN-NL", "state"),
      Subdivision("Odisha", "IN-OR", "state"),
      Subdivision("Puducherry", "IN-PY", "Union territory"),
      Subdivision("Punjab", "IN-PB", "state"),
      Subdivision("Rājasthān", "IN-RJ", "state"),
      Subdivision("Sikkim", "IN-SK", "state"),
      Subdivision("Tamil Nādu", "IN-TN", "state"),
      Subdivision("Telangāna", "IN-TG", "state"),
      Subdivision("Tripura", "IN-TR", "state"),
      Subdivision("Uttar Pradesh", "IN-UP", "state"),
      Subdivision("Uttarākhand", "IN-UT", "state"),
      Subdivision("West Bengal", "IN-WB", "state")
    )
  }

  case object IO extends Country("British Indian Ocean Territory (the)", "IO", "IOT")

  case object IQ extends Country("Iraq", "IQ", "IRQ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Anbār", "IQ-AN", "governorate"),
      Subdivision("Al Başrah", "IQ-BA", "governorate"),
      Subdivision("Al Muthanná", "IQ-MU", "governorate"),
      Subdivision("Al Qādisīyah", "IQ-QA", "governorate"),
      Subdivision("An Najaf", "IQ-NA", "governorate"),
      Subdivision("Arbīl", "IQ-AR", "governorate"),
      Subdivision("As Sulaymānīyah", "IQ-SU", "governorate"),
      Subdivision("Baghdād", "IQ-BG", "governorate"),
      Subdivision("Bābil", "IQ-BB", "governorate"),
      Subdivision("Dahūk", "IQ-DA", "governorate"),
      Subdivision("Dhī Qār", "IQ-DQ", "governorate"),
      Subdivision("Diyālá", "IQ-DI", "governorate"),
      Subdivision("Herêm-î Kurdistan", "IQ-KR", "region"),
      Subdivision("Karbalā’", "IQ-KA", "governorate"),
      Subdivision("Kirkūk", "IQ-KI", "governorate"),
      Subdivision("Maysān", "IQ-MA", "governorate"),
      Subdivision("Nīnawá", "IQ-NI", "governorate"),
      Subdivision("Wāsiţ", "IQ-WA", "governorate"),
      Subdivision("Şalāḩ ad Dīn", "IQ-SD", "governorate")
    )
  }

  case object IR extends Country("Iran (Islamic Republic of)", "IR", "IRN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alborz", "IR-30", "province"),
      Subdivision("Ardabīl", "IR-24", "province"),
      Subdivision("Būshehr", "IR-18", "province"),
      Subdivision("Chahār Maḩāl va Bakhtīārī", "IR-14", "province"),
      Subdivision("Eşfahān", "IR-10", "province"),
      Subdivision("Fārs", "IR-07", "province"),
      Subdivision("Golestān", "IR-27", "province"),
      Subdivision("Gīlān", "IR-01", "province"),
      Subdivision("Hamadān", "IR-13", "province"),
      Subdivision("Hormozgān", "IR-22", "province"),
      Subdivision("Kermān", "IR-08", "province"),
      Subdivision("Kermānshāh", "IR-05", "province"),
      Subdivision("Khorāsān-e Jonūbī", "IR-29", "province"),
      Subdivision("Khorāsān-e Raẕavī", "IR-09", "province"),
      Subdivision("Khorāsān-e Shomālī", "IR-28", "province"),
      Subdivision("Khūzestān", "IR-06", "province"),
      Subdivision("Kohgīlūyeh va Bowyer Aḩmad", "IR-17", "province"),
      Subdivision("Kordestān", "IR-12", "province"),
      Subdivision("Lorestān", "IR-15", "province"),
      Subdivision("Markazī", "IR-00", "province"),
      Subdivision("Māzandarān", "IR-02", "province"),
      Subdivision("Qazvīn", "IR-26", "province"),
      Subdivision("Qom", "IR-25", "province"),
      Subdivision("Semnān", "IR-20", "province"),
      Subdivision("Sīstān va Balūchestān", "IR-11", "province"),
      Subdivision("Tehrān", "IR-23", "province"),
      Subdivision("Yazd", "IR-21", "province"),
      Subdivision("Zanjān", "IR-19", "province"),
      Subdivision("Āz̄ārbāyjān-e Ghārbī", "IR-04", "province"),
      Subdivision("Āz̄ārbāyjān-e Shārqī", "IR-03", "province"),
      Subdivision("Īlām", "IR-16", "province")
    )
  }

  case object IS extends Country("Iceland", "IS", "ISL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akrahreppur", "IS-AKH", "municipality"),
      Subdivision("Akraneskaupstaður", "IS-AKN", "municipality"),
      Subdivision("Akureyrarbær", "IS-AKU", "municipality"),
      Subdivision("Austurland", "IS-7", "region"),
      Subdivision("Bláskógabyggð", "IS-BLA", "municipality"),
      Subdivision("Blönduósbær", "IS-BLO", "municipality"),
      Subdivision("Bolungarvíkurkaupstaður", "IS-BOL", "municipality"),
      Subdivision("Borgarbyggð", "IS-BOG", "municipality"),
      Subdivision("Dalabyggð", "IS-DAB", "municipality"),
      Subdivision("Dalvíkurbyggð", "IS-DAV", "municipality"),
      Subdivision("Eyja- og Miklaholtshreppur", "IS-EOM", "municipality"),
      Subdivision("Eyjafjarðarsveit", "IS-EYF", "municipality"),
      Subdivision("Fjallabyggð", "IS-FJL", "municipality"),
      Subdivision("Fjarðabyggð", "IS-FJD", "municipality"),
      Subdivision("Fljótsdalshreppur", "IS-FLR", "municipality"),
      Subdivision("Flóahreppur", "IS-FLA", "municipality"),
      Subdivision("Garðabær", "IS-GAR", "municipality"),
      Subdivision("Grindavíkurbær", "IS-GRN", "municipality"),
      Subdivision("Grundarfjarðarbær", "IS-GRU", "municipality"),
      Subdivision("Grímsnes- og Grafningshreppur", "IS-GOG", "municipality"),
      Subdivision("Grýtubakkahreppur", "IS-GRY", "municipality"),
      Subdivision("Hafnarfjarðarkaupstaður", "IS-HAF", "municipality"),
      Subdivision("Helgafellssveit", "IS-HEL", "municipality"),
      Subdivision("Hrunamannahreppur", "IS-HRU", "municipality"),
      Subdivision("Hvalfjarðarsveit", "IS-HVA", "municipality"),
      Subdivision("Hveragerðisbær", "IS-HVE", "municipality"),
      Subdivision("Höfuðborgarsvæði", "IS-1", "region"),
      Subdivision("Hörgársveit", "IS-HRG", "municipality"),
      Subdivision("Húnavatnshreppur", "IS-HUT", "municipality"),
      Subdivision("Húnaþing vestra", "IS-HUV", "municipality"),
      Subdivision("Kaldrananeshreppur", "IS-KAL", "municipality"),
      Subdivision("Kjósarhreppur", "IS-KJO", "municipality"),
      Subdivision("Kópavogsbær", "IS-KOP", "municipality"),
      Subdivision("Langanesbyggð", "IS-LAN", "municipality"),
      Subdivision("Mosfellsbær", "IS-MOS", "municipality"),
      Subdivision("Múlaþing", "IS-MUL", "municipality"),
      Subdivision("Mýrdalshreppur", "IS-MYR", "municipality"),
      Subdivision("Norðurland eystra", "IS-6", "region"),
      Subdivision("Norðurland vestra", "IS-5", "region"),
      Subdivision("Norðurþing", "IS-NOR", "municipality"),
      Subdivision("Rangárþing eystra", "IS-RGE", "municipality"),
      Subdivision("Rangárþing ytra", "IS-RGY", "municipality"),
      Subdivision("Reykhólahreppur", "IS-RHH", "municipality"),
      Subdivision("Reykjanesbær", "IS-RKN", "municipality"),
      Subdivision("Reykjavíkurborg", "IS-RKV", "municipality"),
      Subdivision("Seltjarnarnesbær", "IS-SEL", "municipality"),
      Subdivision("Skaftárhreppur", "IS-SKF", "municipality"),
      Subdivision("Skagabyggð", "IS-SKG", "municipality"),
      Subdivision("Skeiða- og Gnúpverjahreppur", "IS-SOG", "municipality"),
      Subdivision("Skorradalshreppur", "IS-SKO", "municipality"),
      Subdivision("Skútustaðahreppur", "IS-SKU", "municipality"),
      Subdivision("Snæfellsbær", "IS-SNF", "municipality"),
      Subdivision("Strandabyggð", "IS-STR", "municipality"),
      Subdivision("Stykkishólmsbær", "IS-STY", "municipality"),
      Subdivision("Suðurland", "IS-8", "region"),
      Subdivision("Suðurnes", "IS-2", "region"),
      Subdivision("Suðurnesjabær", "IS-SDN", "municipality"),
      Subdivision("Svalbarðshreppur", "IS-SBH", "municipality"),
      Subdivision("Svalbarðsstrandarhreppur", "IS-SBT", "municipality"),
      Subdivision("Sveitarfélagið Hornafjörður", "IS-SHF", "municipality"),
      Subdivision("Sveitarfélagið Skagafjörður", "IS-SSF", "municipality"),
      Subdivision("Sveitarfélagið Skagaströnd", "IS-SSS", "municipality"),
      Subdivision("Sveitarfélagið Vogar", "IS-SVG", "municipality"),
      Subdivision("Sveitarfélagið Árborg", "IS-SFA", "municipality"),
      Subdivision("Sveitarfélagið Ölfus", "IS-SOL", "municipality"),
      Subdivision("Súðavíkurhreppur", "IS-SDV", "municipality"),
      Subdivision("Tjörneshreppur", "IS-TJO", "municipality"),
      Subdivision("Tálknafjarðarhreppur", "IS-TAL", "municipality"),
      Subdivision("Vestfirðir", "IS-4", "region"),
      Subdivision("Vestmannaeyjabær", "IS-VEM", "municipality"),
      Subdivision("Vesturbyggð", "IS-VER", "municipality"),
      Subdivision("Vesturland", "IS-3", "region"),
      Subdivision("Vopnafjarðarhreppur", "IS-VOP", "municipality"),
      Subdivision("Árneshreppur", "IS-ARN", "municipality"),
      Subdivision("Ásahreppur", "IS-ASA", "municipality"),
      Subdivision("Ísafjarðarbær", "IS-ISA", "municipality"),
      Subdivision("Þingeyjarsveit", "IS-THG", "municipality")
    )
  }

  case object IT extends Country("Italy", "IT", "ITA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abruzzo", "IT-65", "region"),
      Subdivision("Agrigento", "IT-AG", "free municipal consortium"),
      Subdivision("Alessandria", "IT-AL", "province"),
      Subdivision("Ancona", "IT-AN", "province"),
      Subdivision("Arezzo", "IT-AR", "province"),
      Subdivision("Ascoli Piceno", "IT-AP", "province"),
      Subdivision("Asti", "IT-AT", "province"),
      Subdivision("Avellino", "IT-AV", "province"),
      Subdivision("Bari", "IT-BA", "metropolitan city"),
      Subdivision("Barletta-Andria-Trani", "IT-BT", "province"),
      Subdivision("Basilicata", "IT-77", "region"),
      Subdivision("Belluno", "IT-BL", "province"),
      Subdivision("Benevento", "IT-BN", "province"),
      Subdivision("Bergamo", "IT-BG", "province"),
      Subdivision("Biella", "IT-BI", "province"),
      Subdivision("Bologna", "IT-BO", "metropolitan city"),
      Subdivision("Bolzano", "IT-BZ", "autonomous province"),
      Subdivision("Brescia", "IT-BS", "province"),
      Subdivision("Brindisi", "IT-BR", "province"),
      Subdivision("Cagliari", "IT-CA", "metropolitan city"),
      Subdivision("Calabria", "IT-78", "region"),
      Subdivision("Caltanissetta", "IT-CL", "free municipal consortium"),
      Subdivision("Campania", "IT-72", "region"),
      Subdivision("Campobasso", "IT-CB", "province"),
      Subdivision("Caserta", "IT-CE", "province"),
      Subdivision("Catania", "IT-CT", "metropolitan city"),
      Subdivision("Catanzaro", "IT-CZ", "province"),
      Subdivision("Chieti", "IT-CH", "province"),
      Subdivision("Como", "IT-CO", "province"),
      Subdivision("Cosenza", "IT-CS", "province"),
      Subdivision("Cremona", "IT-CR", "province"),
      Subdivision("Crotone", "IT-KR", "province"),
      Subdivision("Cuneo", "IT-CN", "province"),
      Subdivision("Emilia-Romagna", "IT-45", "region"),
      Subdivision("Enna", "IT-EN", "free municipal consortium"),
      Subdivision("Fermo", "IT-FM", "province"),
      Subdivision("Ferrara", "IT-FE", "province"),
      Subdivision("Firenze", "IT-FI", "metropolitan city"),
      Subdivision("Foggia", "IT-FG", "province"),
      Subdivision("Forlì-Cesena", "IT-FC", "province"),
      Subdivision("Friuli Venezia Giulia", "IT-36", "autonomous region"),
      Subdivision("Frosinone", "IT-FR", "province"),
      Subdivision("Genova", "IT-GE", "metropolitan city"),
      Subdivision("Gorizia", "IT-GO", "decentralized regional entity"),
      Subdivision("Grosseto", "IT-GR", "province"),
      Subdivision("Imperia", "IT-IM", "province"),
      Subdivision("Isernia", "IT-IS", "province"),
      Subdivision("L'Aquila", "IT-AQ", "province"),
      Subdivision("La Spezia", "IT-SP", "province"),
      Subdivision("Latina", "IT-LT", "province"),
      Subdivision("Lazio", "IT-62", "region"),
      Subdivision("Lecce", "IT-LE", "province"),
      Subdivision("Lecco", "IT-LC", "province"),
      Subdivision("Liguria", "IT-42", "region"),
      Subdivision("Livorno", "IT-LI", "province"),
      Subdivision("Lodi", "IT-LO", "province"),
      Subdivision("Lombardia", "IT-25", "region"),
      Subdivision("Lucca", "IT-LU", "province"),
      Subdivision("Macerata", "IT-MC", "province"),
      Subdivision("Mantova", "IT-MN", "province"),
      Subdivision("Marche", "IT-57", "region"),
      Subdivision("Massa-Carrara", "IT-MS", "province"),
      Subdivision("Matera", "IT-MT", "province"),
      Subdivision("Messina", "IT-ME", "metropolitan city"),
      Subdivision("Milano", "IT-MI", "metropolitan city"),
      Subdivision("Modena", "IT-MO", "province"),
      Subdivision("Molise", "IT-67", "region"),
      Subdivision("Monza e Brianza", "IT-MB", "province"),
      Subdivision("Napoli", "IT-NA", "metropolitan city"),
      Subdivision("Novara", "IT-NO", "province"),
      Subdivision("Nuoro", "IT-NU", "province"),
      Subdivision("Oristano", "IT-OR", "province"),
      Subdivision("Padova", "IT-PD", "province"),
      Subdivision("Palermo", "IT-PA", "metropolitan city"),
      Subdivision("Parma", "IT-PR", "province"),
      Subdivision("Pavia", "IT-PV", "province"),
      Subdivision("Perugia", "IT-PG", "province"),
      Subdivision("Pesaro e Urbino", "IT-PU", "province"),
      Subdivision("Pescara", "IT-PE", "province"),
      Subdivision("Piacenza", "IT-PC", "province"),
      Subdivision("Piemonte", "IT-21", "region"),
      Subdivision("Pisa", "IT-PI", "province"),
      Subdivision("Pistoia", "IT-PT", "province"),
      Subdivision("Pordenone", "IT-PN", "decentralized regional entity"),
      Subdivision("Potenza", "IT-PZ", "province"),
      Subdivision("Prato", "IT-PO", "province"),
      Subdivision("Puglia", "IT-75", "region"),
      Subdivision("Ragusa", "IT-RG", "free municipal consortium"),
      Subdivision("Ravenna", "IT-RA", "province"),
      Subdivision("Reggio Calabria", "IT-RC", "metropolitan city"),
      Subdivision("Reggio Emilia", "IT-RE", "province"),
      Subdivision("Rieti", "IT-RI", "province"),
      Subdivision("Rimini", "IT-RN", "province"),
      Subdivision("Roma", "IT-RM", "metropolitan city"),
      Subdivision("Rovigo", "IT-RO", "province"),
      Subdivision("Salerno", "IT-SA", "province"),
      Subdivision("Sardegna", "IT-88", "autonomous region"),
      Subdivision("Sassari", "IT-SS", "province"),
      Subdivision("Savona", "IT-SV", "province"),
      Subdivision("Sicilia", "IT-82", "autonomous region"),
      Subdivision("Siena", "IT-SI", "province"),
      Subdivision("Siracusa", "IT-SR", "free municipal consortium"),
      Subdivision("Sondrio", "IT-SO", "province"),
      Subdivision("Sud Sardegna", "IT-SU", "province"),
      Subdivision("Taranto", "IT-TA", "province"),
      Subdivision("Teramo", "IT-TE", "province"),
      Subdivision("Terni", "IT-TR", "province"),
      Subdivision("Torino", "IT-TO", "metropolitan city"),
      Subdivision("Toscana", "IT-52", "region"),
      Subdivision("Trapani", "IT-TP", "free municipal consortium"),
      Subdivision("Trentino-Alto Adige", "IT-32", "autonomous region"),
      Subdivision("Trento", "IT-TN", "autonomous province"),
      Subdivision("Treviso", "IT-TV", "province"),
      Subdivision("Trieste", "IT-TS", "decentralized regional entity"),
      Subdivision("Udine", "IT-UD", "decentralized regional entity"),
      Subdivision("Umbria", "IT-55", "region"),
      Subdivision("Val d'Aoste", "IT-23", "autonomous region"),
      Subdivision("Varese", "IT-VA", "province"),
      Subdivision("Veneto", "IT-34", "region"),
      Subdivision("Venezia", "IT-VE", "metropolitan city"),
      Subdivision("Verbano-Cusio-Ossola", "IT-VB", "province"),
      Subdivision("Vercelli", "IT-VC", "province"),
      Subdivision("Verona", "IT-VR", "province"),
      Subdivision("Vibo Valentia", "IT-VV", "province"),
      Subdivision("Vicenza", "IT-VI", "province"),
      Subdivision("Viterbo", "IT-VT", "province")
    )
  }

  case object JE extends Country("Jersey", "JE", "JEY")

  case object JM extends Country("Jamaica", "JM", "JAM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Clarendon", "JM-13", "parish"),
      Subdivision("Hanover", "JM-09", "parish"),
      Subdivision("Kingston", "JM-01", "parish"),
      Subdivision("Manchester", "JM-12", "parish"),
      Subdivision("Portland", "JM-04", "parish"),
      Subdivision("Saint Andrew", "JM-02", "parish"),
      Subdivision("Saint Ann", "JM-06", "parish"),
      Subdivision("Saint Catherine", "JM-14", "parish"),
      Subdivision("Saint Elizabeth", "JM-11", "parish"),
      Subdivision("Saint James", "JM-08", "parish"),
      Subdivision("Saint Mary", "JM-05", "parish"),
      Subdivision("Saint Thomas", "JM-03", "parish"),
      Subdivision("Trelawny", "JM-07", "parish"),
      Subdivision("Westmoreland", "JM-10", "parish")
    )
  }

  case object JO extends Country("Jordan", "JO", "JOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Balqā’", "JO-BA", "governorate"),
      Subdivision("Al Karak", "JO-KA", "governorate"),
      Subdivision("Al Mafraq", "JO-MA", "governorate"),
      Subdivision("Al ‘Aqabah", "JO-AQ", "governorate"),
      Subdivision("Al ‘A̅şimah", "JO-AM", "governorate"),
      Subdivision("Az Zarqā’", "JO-AZ", "governorate"),
      Subdivision("Aţ Ţafīlah", "JO-AT", "governorate"),
      Subdivision("Irbid", "JO-IR", "governorate"),
      Subdivision("Jarash", "JO-JA", "governorate"),
      Subdivision("Ma‘ān", "JO-MN", "governorate"),
      Subdivision("Mādabā", "JO-MD", "governorate"),
      Subdivision("‘Ajlūn", "JO-AJ", "governorate")
    )
  }

  case object JP extends Country("Japan", "JP", "JPN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aichi", "JP-23", "prefecture"),
      Subdivision("Akita", "JP-05", "prefecture"),
      Subdivision("Aomori", "JP-02", "prefecture"),
      Subdivision("Chiba", "JP-12", "prefecture"),
      Subdivision("Ehime", "JP-38", "prefecture"),
      Subdivision("Fukui", "JP-18", "prefecture"),
      Subdivision("Fukuoka", "JP-40", "prefecture"),
      Subdivision("Fukushima", "JP-07", "prefecture"),
      Subdivision("Gifu", "JP-21", "prefecture"),
      Subdivision("Gunma", "JP-10", "prefecture"),
      Subdivision("Hiroshima", "JP-34", "prefecture"),
      Subdivision("Hokkaido", "JP-01", "prefecture"),
      Subdivision("Hyogo", "JP-28", "prefecture"),
      Subdivision("Ibaraki", "JP-08", "prefecture"),
      Subdivision("Ishikawa", "JP-17", "prefecture"),
      Subdivision("Iwate", "JP-03", "prefecture"),
      Subdivision("Kagawa", "JP-37", "prefecture"),
      Subdivision("Kagoshima", "JP-46", "prefecture"),
      Subdivision("Kanagawa", "JP-14", "prefecture"),
      Subdivision("Kochi", "JP-39", "prefecture"),
      Subdivision("Kumamoto", "JP-43", "prefecture"),
      Subdivision("Kyoto", "JP-26", "prefecture"),
      Subdivision("Mie", "JP-24", "prefecture"),
      Subdivision("Miyagi", "JP-04", "prefecture"),
      Subdivision("Miyazaki", "JP-45", "prefecture"),
      Subdivision("Nagano", "JP-20", "prefecture"),
      Subdivision("Nagasaki", "JP-42", "prefecture"),
      Subdivision("Nara", "JP-29", "prefecture"),
      Subdivision("Niigata", "JP-15", "prefecture"),
      Subdivision("Oita", "JP-44", "prefecture"),
      Subdivision("Okayama", "JP-33", "prefecture"),
      Subdivision("Okinawa", "JP-47", "prefecture"),
      Subdivision("Osaka", "JP-27", "prefecture"),
      Subdivision("Saga", "JP-41", "prefecture"),
      Subdivision("Saitama", "JP-11", "prefecture"),
      Subdivision("Shiga", "JP-25", "prefecture"),
      Subdivision("Shimane", "JP-32", "prefecture"),
      Subdivision("Shizuoka", "JP-22", "prefecture"),
      Subdivision("Tochigi", "JP-09", "prefecture"),
      Subdivision("Tokushima", "JP-36", "prefecture"),
      Subdivision("Tokyo", "JP-13", "prefecture"),
      Subdivision("Tottori", "JP-31", "prefecture"),
      Subdivision("Toyama", "JP-16", "prefecture"),
      Subdivision("Wakayama", "JP-30", "prefecture"),
      Subdivision("Yamagata", "JP-06", "prefecture"),
      Subdivision("Yamaguchi", "JP-35", "prefecture"),
      Subdivision("Yamanashi", "JP-19", "prefecture")
    )
  }

  case object KE extends Country("Kenya", "KE", "KEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baringo", "KE-01", "county"),
      Subdivision("Bomet", "KE-02", "county"),
      Subdivision("Bungoma", "KE-03", "county"),
      Subdivision("Busia", "KE-04", "county"),
      Subdivision("Elgeyo/Marakwet", "KE-05", "county"),
      Subdivision("Embu", "KE-06", "county"),
      Subdivision("Garissa", "KE-07", "county"),
      Subdivision("Homa Bay", "KE-08", "county"),
      Subdivision("Isiolo", "KE-09", "county"),
      Subdivision("Kajiado", "KE-10", "county"),
      Subdivision("Kakamega", "KE-11", "county"),
      Subdivision("Kericho", "KE-12", "county"),
      Subdivision("Kiambu", "KE-13", "county"),
      Subdivision("Kilifi", "KE-14", "county"),
      Subdivision("Kirinyaga", "KE-15", "county"),
      Subdivision("Kisii", "KE-16", "county"),
      Subdivision("Kisumu", "KE-17", "county"),
      Subdivision("Kitui", "KE-18", "county"),
      Subdivision("Kwale", "KE-19", "county"),
      Subdivision("Laikipia", "KE-20", "county"),
      Subdivision("Lamu", "KE-21", "county"),
      Subdivision("Machakos", "KE-22", "county"),
      Subdivision("Makueni", "KE-23", "county"),
      Subdivision("Mandera", "KE-24", "county"),
      Subdivision("Marsabit", "KE-25", "county"),
      Subdivision("Meru", "KE-26", "county"),
      Subdivision("Migori", "KE-27", "county"),
      Subdivision("Mombasa", "KE-28", "county"),
      Subdivision("Murang'a", "KE-29", "county"),
      Subdivision("Nairobi City", "KE-30", "county"),
      Subdivision("Nakuru", "KE-31", "county"),
      Subdivision("Nandi", "KE-32", "county"),
      Subdivision("Narok", "KE-33", "county"),
      Subdivision("Nyamira", "KE-34", "county"),
      Subdivision("Nyandarua", "KE-35", "county"),
      Subdivision("Nyeri", "KE-36", "county"),
      Subdivision("Samburu", "KE-37", "county"),
      Subdivision("Siaya", "KE-38", "county"),
      Subdivision("Taita/Taveta", "KE-39", "county"),
      Subdivision("Tana River", "KE-40", "county"),
      Subdivision("Tharaka-Nithi", "KE-41", "county"),
      Subdivision("Trans Nzoia", "KE-42", "county"),
      Subdivision("Turkana", "KE-43", "county"),
      Subdivision("Uasin Gishu", "KE-44", "county"),
      Subdivision("Vihiga", "KE-45", "county"),
      Subdivision("Wajir", "KE-46", "county"),
      Subdivision("West Pokot", "KE-47", "county")
    )
  }

  case object KG extends Country("Kyrgyzstan", "KG", "KGZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Batken", "KG-B", "region"),
      Subdivision("Bishkek Shaary", "KG-GB", "city"),
      Subdivision("Chuyskaya oblast'", "KG-C", "region"),
      Subdivision("Dzhalal-Abadskaya oblast'", "KG-J", "region"),
      Subdivision("Gorod Osh", "KG-GO", "city"),
      Subdivision("Issyk-Kul'skaja oblast'", "KG-Y", "region"),
      Subdivision("Naryn", "KG-N", "region"),
      Subdivision("Osh", "KG-O", "region"),
      Subdivision("Talas", "KG-T", "region")
    )
  }

  case object KH extends Country("Cambodia", "KH", "KHM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baat Dambang", "KH-2", "province"),
      Subdivision("Banteay Mean Choăy", "KH-1", "province"),
      Subdivision("Kaeb", "KH-23", "province"),
      Subdivision("Kampong Chaam", "KH-3", "province"),
      Subdivision("Kampong Chhnang", "KH-4", "province"),
      Subdivision("Kampong Spueu", "KH-5", "province"),
      Subdivision("Kampong Thum", "KH-6", "province"),
      Subdivision("Kampot", "KH-7", "province"),
      Subdivision("Kandaal", "KH-8", "province"),
      Subdivision("Kaoh Kong", "KH-9", "province"),
      Subdivision("Kracheh", "KH-10", "province"),
      Subdivision("Mondol Kiri", "KH-11", "province"),
      Subdivision("Otdar Mean Chey", "KH-22", "province"),
      Subdivision("Pailin", "KH-24", "province"),
      Subdivision("Phnom Penh", "KH-12", "autonomous municipality"),
      Subdivision("Pousaat", "KH-15", "province"),
      Subdivision("Preah Sihanouk", "KH-18", "province"),
      Subdivision("Preah Vihear", "KH-13", "province"),
      Subdivision("Prey Veaeng", "KH-14", "province"),
      Subdivision("Rotanak Kiri", "KH-16", "province"),
      Subdivision("Siem Reab", "KH-17", "province"),
      Subdivision("Stoĕng Trêng", "KH-19", "province"),
      Subdivision("Svaay Rieng", "KH-20", "province"),
      Subdivision("Taakaev", "KH-21", "province"),
      Subdivision("Tbong Khmum", "KH-25", "province")
    )
  }

  case object KI extends Country("Kiribati", "KI", "KIR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Gilbert Islands", "KI-G", "group of islands (20 inhabited islands)"),
      Subdivision("Line Islands", "KI-L", "group of islands (20 inhabited islands)"),
      Subdivision("Phoenix Islands", "KI-P", "group of islands (20 inhabited islands)")
    )
  }

  case object KM extends Country("Comoros (the)", "KM", "COM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andjazîdja", "KM-G", "island"),
      Subdivision("Andjouân", "KM-A", "island"),
      Subdivision("Mohéli", "KM-M", "island")
    )
  }

  case object KN extends Country("Saint Kitts and Nevis", "KN", "KNA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Christ Church Nichola Town", "KN-01", "parish"),
      Subdivision("Nevis", "KN-N", "state"),
      Subdivision("Saint Anne Sandy Point", "KN-02", "parish"),
      Subdivision("Saint George Basseterre", "KN-03", "parish"),
      Subdivision("Saint George Gingerland", "KN-04", "parish"),
      Subdivision("Saint James Windward", "KN-05", "parish"),
      Subdivision("Saint John Capisterre", "KN-06", "parish"),
      Subdivision("Saint John Figtree", "KN-07", "parish"),
      Subdivision("Saint Kitts", "KN-K", "state"),
      Subdivision("Saint Mary Cayon", "KN-08", "parish"),
      Subdivision("Saint Paul Capisterre", "KN-09", "parish"),
      Subdivision("Saint Paul Charlestown", "KN-10", "parish"),
      Subdivision("Saint Peter Basseterre", "KN-11", "parish"),
      Subdivision("Saint Thomas Lowland", "KN-12", "parish"),
      Subdivision("Saint Thomas Middle Island", "KN-13", "parish"),
      Subdivision("Trinity Palmetto Point", "KN-15", "parish")
    )
  }

  case object KP extends Country("Korea (the Democratic People's Republic of)", "KP", "PRK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chagang-do", "KP-04", "province"),
      Subdivision("Hamgyǒng-bukto", "KP-09", "province"),
      Subdivision("Hamgyǒng-namdo", "KP-08", "province"),
      Subdivision("Hwanghae-bukto", "KP-06", "province"),
      Subdivision("Hwanghae-namdo", "KP-05", "province"),
      Subdivision("Kangweonto", "KP-07", "province"),
      Subdivision("Nampho", "KP-14", "metropolitan city"),
      Subdivision("P'yǒngan-bukto", "KP-03", "province"),
      Subdivision("P'yǒngan-namdo", "KP-02", "province"),
      Subdivision("P'yǒngyang", "KP-01", "capital city"),
      Subdivision("Raseon", "KP-13", "special city"),
      Subdivision("Ryanggang-do", "KP-10", "province")
    )
  }

  case object KR extends Country("Korea (the Republic of)", "KR", "KOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Busan-gwangyeoksi", "KR-26", "metropolitan city"),
      Subdivision("Chungcheongbuk-do", "KR-43", "province"),
      Subdivision("Chungcheongnam-do", "KR-44", "province"),
      Subdivision("Daegu-gwangyeoksi", "KR-27", "metropolitan city"),
      Subdivision("Daejeon-gwangyeoksi", "KR-30", "metropolitan city"),
      Subdivision("Gangwon-do", "KR-42", "province"),
      Subdivision("Gwangju-gwangyeoksi", "KR-29", "metropolitan city"),
      Subdivision("Gyeonggi-do", "KR-41", "province"),
      Subdivision("Gyeongsangbuk-do", "KR-47", "province"),
      Subdivision("Gyeongsangnam-do", "KR-48", "province"),
      Subdivision("Incheon-gwangyeoksi", "KR-28", "metropolitan city"),
      Subdivision("Jeju-teukbyeoljachido", "KR-49", "special self-governing province"),
      Subdivision("Jeollabuk-do", "KR-45", "province"),
      Subdivision("Jeollanam-do", "KR-46", "province"),
      Subdivision("Sejong", "KR-50", "special self-governing city"),
      Subdivision("Seoul-teukbyeolsi", "KR-11", "special city"),
      Subdivision("Ulsan-gwangyeoksi", "KR-31", "metropolitan city")
    )
  }

  case object KW extends Country("Kuwait", "KW", "KWT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Aḩmadī", "KW-AH", "governorate"),
      Subdivision("Al Farwānīyah", "KW-FA", "governorate"),
      Subdivision("Al Jahrā’", "KW-JA", "governorate"),
      Subdivision("Al ‘Āşimah", "KW-KU", "governorate"),
      Subdivision("Mubārak al Kabīr", "KW-MU", "governorate"),
      Subdivision("Ḩawallī", "KW-HA", "governorate")
    )
  }

  case object KY extends Country("Cayman Islands (the)", "KY", "CYM")

  case object KZ extends Country("Kazakhstan", "KZ", "KAZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akmolinskaja oblast'", "KZ-AKM", "region"),
      Subdivision("Aktjubinskaja oblast'", "KZ-AKT", "region"),
      Subdivision("Almatinskaja oblast'", "KZ-ALM", "region"),
      Subdivision("Almaty", "KZ-ALA", "city"),
      Subdivision("Atyrauskaja oblast'", "KZ-ATY", "region"),
      Subdivision("Batys Qazaqstan oblysy", "KZ-ZAP", "region"),
      Subdivision("Karagandinskaja oblast'", "KZ-KAR", "region"),
      Subdivision("Kostanajskaja oblast'", "KZ-KUS", "region"),
      Subdivision("Kyzylordinskaja oblast'", "KZ-KZY", "region"),
      Subdivision("Mangghystaū oblysy", "KZ-MAN", "region"),
      Subdivision("Nur-Sultan", "KZ-AST", "city"),
      Subdivision("Pavlodar oblysy", "KZ-PAV", "region"),
      Subdivision("Severo-Kazahstanskaja oblast'", "KZ-SEV", "region"),
      Subdivision("Shyghys Qazaqstan oblysy", "KZ-VOS", "region"),
      Subdivision("Shymkent", "KZ-SHY", "city"),
      Subdivision("Turkestankaya oblast'", "KZ-YUZ", "region"),
      Subdivision("Zhambyl oblysy", "KZ-ZHA", "region")
    )
  }

  case object LA extends Country("Lao People's Democratic Republic (the)", "LA", "LAO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Attapu", "LA-AT", "province"),
      Subdivision("Bokèo", "LA-BK", "province"),
      Subdivision("Bolikhamxai", "LA-BL", "province"),
      Subdivision("Champasak", "LA-CH", "province"),
      Subdivision("Houaphan", "LA-HO", "province"),
      Subdivision("Khammouan", "LA-KH", "province"),
      Subdivision("Louang Namtha", "LA-LM", "province"),
      Subdivision("Louangphabang", "LA-LP", "province"),
      Subdivision("Oudômxai", "LA-OU", "province"),
      Subdivision("Phôngsali", "LA-PH", "province"),
      Subdivision("Salavan", "LA-SL", "province"),
      Subdivision("Savannakhét", "LA-SV", "province"),
      Subdivision("Viangchan", "LA-VT", "prefecture"),
      Subdivision("Viangchan", "LA-VI", "province"),
      Subdivision("Xaignabouli", "LA-XA", "province"),
      Subdivision("Xaisômboun", "LA-XS", "province"),
      Subdivision("Xiangkhouang", "LA-XI", "province"),
      Subdivision("Xékong", "LA-XE", "province")
    )
  }

  case object LB extends Country("Lebanon", "LB", "LBN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aakkâr", "LB-AK", "governorate"),
      Subdivision("Al Biqā‘", "LB-BI", "governorate"),
      Subdivision("Al Janūb", "LB-JA", "governorate"),
      Subdivision("An Nabaţīyah", "LB-NA", "governorate"),
      Subdivision("Ash Shimāl", "LB-AS", "governorate"),
      Subdivision("Baalbek-Hermel", "LB-BH", "governorate"),
      Subdivision("Bayrūt", "LB-BA", "governorate"),
      Subdivision("Jabal Lubnān", "LB-JL", "governorate")
    )
  }

  case object LC extends Country("Saint Lucia", "LC", "LCA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anse la Raye", "LC-01", "district"),
      Subdivision("Canaries", "LC-12", "district"),
      Subdivision("Castries", "LC-02", "district"),
      Subdivision("Choiseul", "LC-03", "district"),
      Subdivision("Dennery", "LC-05", "district"),
      Subdivision("Gros Islet", "LC-06", "district"),
      Subdivision("Laborie", "LC-07", "district"),
      Subdivision("Micoud", "LC-08", "district"),
      Subdivision("Soufrière", "LC-10", "district"),
      Subdivision("Vieux Fort", "LC-11", "district")
    )
  }

  case object LI extends Country("Liechtenstein", "LI", "LIE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balzers", "LI-01", "commune"),
      Subdivision("Eschen", "LI-02", "commune"),
      Subdivision("Gamprin", "LI-03", "commune"),
      Subdivision("Mauren", "LI-04", "commune"),
      Subdivision("Planken", "LI-05", "commune"),
      Subdivision("Ruggell", "LI-06", "commune"),
      Subdivision("Schaan", "LI-07", "commune"),
      Subdivision("Schellenberg", "LI-08", "commune"),
      Subdivision("Triesen", "LI-09", "commune"),
      Subdivision("Triesenberg", "LI-10", "commune"),
      Subdivision("Vaduz", "LI-11", "commune")
    )
  }

  case object LK extends Country("Sri Lanka", "LK", "LKA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ampara", "LK-52", "district"),
      Subdivision("Ampāntōṭṭai", "LK-33", "district"),
      Subdivision("Anuradhapura", "LK-71", "district"),
      Subdivision("Badulla", "LK-81", "district"),
      Subdivision("Basnāhira paḷāta", "LK-1", "province"),
      Subdivision("Batticaloa", "LK-51", "district"),
      Subdivision("Central Province", "LK-2", "province"),
      Subdivision("Chappirakamuva mākāṇam", "LK-9", "province"),
      Subdivision("Colombo", "LK-11", "district"),
      Subdivision("Dakuṇu paḷāta", "LK-3", "province"),
      Subdivision("Eastern Province", "LK-5", "province"),
      Subdivision("Galle", "LK-31", "district"),
      Subdivision("Gampaha", "LK-12", "district"),
      Subdivision("Irattiṉapuri", "LK-91", "district"),
      Subdivision("Jaffna", "LK-41", "district"),
      Subdivision("Kalutara", "LK-13", "district"),
      Subdivision("Kandy", "LK-21", "district"),
      Subdivision("Kegalla", "LK-92", "district"),
      Subdivision("Kilinochchi", "LK-42", "district"),
      Subdivision("Kurunegala", "LK-61", "district"),
      Subdivision("Mannar", "LK-43", "district"),
      Subdivision("Matale", "LK-22", "district"),
      Subdivision("Matara", "LK-32", "district"),
      Subdivision("Monaragala", "LK-82", "district"),
      Subdivision("Mulativ", "LK-45", "district"),
      Subdivision("North Central Province", "LK-7", "province"),
      Subdivision("North Western Province", "LK-6", "province"),
      Subdivision("Northern Province", "LK-4", "province"),
      Subdivision("Nuvara Ĕliya", "LK-23", "district"),
      Subdivision("Polonnaruwa", "LK-72", "district"),
      Subdivision("Puttalam", "LK-62", "district"),
      Subdivision("Tirukŏṇamalai", "LK-53", "district"),
      Subdivision("Uva Province", "LK-8", "province"),
      Subdivision("Vavuniya", "LK-44", "district")
    )
  }

  case object LR extends Country("Liberia", "LR", "LBR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bomi", "LR-BM", "county"),
      Subdivision("Bong", "LR-BG", "county"),
      Subdivision("Gbarpolu", "LR-GP", "county"),
      Subdivision("Grand Bassa", "LR-GB", "county"),
      Subdivision("Grand Cape Mount", "LR-CM", "county"),
      Subdivision("Grand Gedeh", "LR-GG", "county"),
      Subdivision("Grand Kru", "LR-GK", "county"),
      Subdivision("Lofa", "LR-LO", "county"),
      Subdivision("Margibi", "LR-MG", "county"),
      Subdivision("Maryland", "LR-MY", "county"),
      Subdivision("Montserrado", "LR-MO", "county"),
      Subdivision("Nimba", "LR-NI", "county"),
      Subdivision("River Cess", "LR-RI", "county"),
      Subdivision("River Gee", "LR-RG", "county"),
      Subdivision("Sinoe", "LR-SI", "county")
    )
  }

  case object LS extends Country("Lesotho", "LS", "LSO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Berea", "LS-D", "district"),
      Subdivision("Botha-Bothe", "LS-B", "district"),
      Subdivision("Leribe", "LS-C", "district"),
      Subdivision("Mafeteng", "LS-E", "district"),
      Subdivision("Maseru", "LS-A", "district"),
      Subdivision("Mohale's Hoek", "LS-F", "district"),
      Subdivision("Mokhotlong", "LS-J", "district"),
      Subdivision("Qacha's Nek", "LS-H", "district"),
      Subdivision("Quthing", "LS-G", "district"),
      Subdivision("Thaba-Tseka", "LS-K", "district")
    )
  }

  case object LT extends Country("Lithuania", "LT", "LTU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akmenė", "LT-01", "district municipality"),
      Subdivision("Alytaus apskritis", "LT-AL", "county"),
      Subdivision("Alytaus miestas", "LT-02", "city municipality"),
      Subdivision("Alytus", "LT-03", "district municipality"),
      Subdivision("Anykščiai", "LT-04", "district municipality"),
      Subdivision("Birštonas", "LT-05", "municipality"),
      Subdivision("Biržai", "LT-06", "district municipality"),
      Subdivision("Druskininkai", "LT-07", "municipality"),
      Subdivision("Elektrėnai", "LT-08", "municipality"),
      Subdivision("Ignalina", "LT-09", "district municipality"),
      Subdivision("Jonava", "LT-10", "district municipality"),
      Subdivision("Joniškis", "LT-11", "district municipality"),
      Subdivision("Jurbarkas", "LT-12", "district municipality"),
      Subdivision("Kaišiadorys", "LT-13", "district municipality"),
      Subdivision("Kalvarija", "LT-14", "municipality"),
      Subdivision("Kaunas", "LT-16", "district municipality"),
      Subdivision("Kauno apskritis", "LT-KU", "county"),
      Subdivision("Kauno miestas", "LT-15", "city municipality"),
      Subdivision("Kazlų Rūdos", "LT-17", "municipality"),
      Subdivision("Kelmė", "LT-19", "district municipality"),
      Subdivision("Klaipėda", "LT-21", "district municipality"),
      Subdivision("Klaipėdos apskritis", "LT-KL", "county"),
      Subdivision("Klaipėdos miestas", "LT-20", "city municipality"),
      Subdivision("Kretinga", "LT-22", "district municipality"),
      Subdivision("Kupiškis", "LT-23", "district municipality"),
      Subdivision("Kėdainiai", "LT-18", "district municipality"),
      Subdivision("Lazdijai", "LT-24", "district municipality"),
      Subdivision("Marijampolė", "LT-25", "district municipality"),
      Subdivision("Marijampolės apskritis", "LT-MR", "county"),
      Subdivision("Mažeikiai", "LT-26", "district municipality"),
      Subdivision("Molėtai", "LT-27", "district municipality"),
      Subdivision("Neringa", "LT-28", "municipality"),
      Subdivision("Pagėgiai", "LT-29", "municipality"),
      Subdivision("Pakruojis", "LT-30", "district municipality"),
      Subdivision("Palangos miestas", "LT-31", "city municipality"),
      Subdivision("Panevėžio apskritis", "LT-PN", "county"),
      Subdivision("Panevėžio miestas", "LT-32", "city municipality"),
      Subdivision("Panevėžys", "LT-33", "district municipality"),
      Subdivision("Pasvalys", "LT-34", "district municipality"),
      Subdivision("Plungė", "LT-35", "district municipality"),
      Subdivision("Prienai", "LT-36", "district municipality"),
      Subdivision("Radviliškis", "LT-37", "district municipality"),
      Subdivision("Raseiniai", "LT-38", "district municipality"),
      Subdivision("Rietavas", "LT-39", "municipality"),
      Subdivision("Rokiškis", "LT-40", "district municipality"),
      Subdivision("Skuodas", "LT-48", "district municipality"),
      Subdivision("Tauragė", "LT-50", "district municipality"),
      Subdivision("Tauragės apskritis", "LT-TA", "county"),
      Subdivision("Telšiai", "LT-51", "district municipality"),
      Subdivision("Telšių apskritis", "LT-TE", "county"),
      Subdivision("Trakai", "LT-52", "district municipality"),
      Subdivision("Ukmergė", "LT-53", "district municipality"),
      Subdivision("Utena", "LT-54", "district municipality"),
      Subdivision("Utenos apskritis", "LT-UT", "county"),
      Subdivision("Varėna", "LT-55", "district municipality"),
      Subdivision("Vilkaviškis", "LT-56", "district municipality"),
      Subdivision("Vilniaus apskritis", "LT-VL", "county"),
      Subdivision("Vilniaus miestas", "LT-57", "city municipality"),
      Subdivision("Vilnius", "LT-58", "district municipality"),
      Subdivision("Visaginas", "LT-59", "municipality"),
      Subdivision("Zarasai", "LT-60", "district municipality"),
      Subdivision("Šakiai", "LT-41", "district municipality"),
      Subdivision("Šalčininkai", "LT-42", "district municipality"),
      Subdivision("Šiauliai", "LT-44", "district municipality"),
      Subdivision("Šiaulių apskritis", "LT-SA", "county"),
      Subdivision("Šiaulių miestas", "LT-43", "city municipality"),
      Subdivision("Šilalė", "LT-45", "district municipality"),
      Subdivision("Šilutė", "LT-46", "district municipality"),
      Subdivision("Širvintos", "LT-47", "district municipality"),
      Subdivision("Švenčionys", "LT-49", "district municipality")
    )
  }

  case object LU extends Country("Luxembourg", "LU", "LUX") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Capellen", "LU-CA", "canton"),
      Subdivision("Clerf", "LU-CL", "canton"),
      Subdivision("Diekirch", "LU-DI", "canton"),
      Subdivision("Echternach", "LU-EC", "canton"),
      Subdivision("Esch an der Alzette", "LU-ES", "canton"),
      Subdivision("Grevenmacher", "LU-GR", "canton"),
      Subdivision("Luxembourg", "LU-LU", "canton"),
      Subdivision("Mersch", "LU-ME", "canton"),
      Subdivision("Redange", "LU-RD", "canton"),
      Subdivision("Remich", "LU-RM", "canton"),
      Subdivision("Veianen", "LU-VD", "canton"),
      Subdivision("Wiltz", "LU-WI", "canton")
    )
  }

  case object LV extends Country("Latvia", "LV", "LVA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aizkraukles novads", "LV-002", "municipality"),
      Subdivision("Alūksnes novads", "LV-007", "municipality"),
      Subdivision("Augšdaugavas novads", "LV-111", "municipality"),
      Subdivision("Balvu novads", "LV-015", "municipality"),
      Subdivision("Bauskas novads", "LV-016", "municipality"),
      Subdivision("Cēsu novads", "LV-022", "municipality"),
      Subdivision("Daugavpils", "LV-DGV", "state city"),
      Subdivision("Dienvidkurzemes Novads", "LV-112", "municipality"),
      Subdivision("Dobeles novads", "LV-026", "municipality"),
      Subdivision("Gulbenes novads", "LV-033", "municipality"),
      Subdivision("Jelgava", "LV-JEL", "state city"),
      Subdivision("Jelgavas novads", "LV-041", "municipality"),
      Subdivision("Jēkabpils novads", "LV-042", "municipality"),
      Subdivision("Jūrmala", "LV-JUR", "state city"),
      Subdivision("Krāslavas novads", "LV-047", "municipality"),
      Subdivision("Kuldīgas novads", "LV-050", "municipality"),
      Subdivision("Liepāja", "LV-LPX", "state city"),
      Subdivision("Limbažu novads", "LV-054", "municipality"),
      Subdivision("Ludzas novads", "LV-058", "municipality"),
      Subdivision("Līvānu novads", "LV-056", "municipality"),
      Subdivision("Madonas novads", "LV-059", "municipality"),
      Subdivision("Mārupes novads", "LV-062", "municipality"),
      Subdivision("Ogres novads", "LV-067", "municipality"),
      Subdivision("Olaines novads", "LV-068", "municipality"),
      Subdivision("Preiļu novads", "LV-073", "municipality"),
      Subdivision("Ropažu novads", "LV-080", "municipality"),
      Subdivision("Rēzekne", "LV-REZ", "state city"),
      Subdivision("Rēzeknes novads", "LV-077", "municipality"),
      Subdivision("Rīga", "LV-RIX", "state city"),
      Subdivision("Salaspils novads", "LV-087", "municipality"),
      Subdivision("Saldus novads", "LV-088", "municipality"),
      Subdivision("Saulkrastu novads", "LV-089", "municipality"),
      Subdivision("Siguldas novads", "LV-091", "municipality"),
      Subdivision("Smiltenes novads", "LV-094", "municipality"),
      Subdivision("Talsu novads", "LV-097", "municipality"),
      Subdivision("Tukuma novads", "LV-099", "municipality"),
      Subdivision("Valkas novads", "LV-101", "municipality"),
      Subdivision("Valmieras Novads", "LV-113", "municipality"),
      Subdivision("Varakļānu novads", "LV-102", "municipality"),
      Subdivision("Ventspils", "LV-VEN", "state city"),
      Subdivision("Ventspils novads", "LV-106", "municipality"),
      Subdivision("Ādažu novads", "LV-011", "municipality"),
      Subdivision("Ķekavas novads", "LV-052", "municipality")
    )
  }

  case object LY extends Country("Libya", "LY", "LBY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Buţnān", "LY-BU", "popularate"),
      Subdivision("Al Jabal al Akhḑar", "LY-JA", "popularate"),
      Subdivision("Al Jabal al Gharbī", "LY-JG", "popularate"),
      Subdivision("Al Jafārah", "LY-JI", "popularate"),
      Subdivision("Al Jufrah", "LY-JU", "popularate"),
      Subdivision("Al Kufrah", "LY-KF", "popularate"),
      Subdivision("Al Marj", "LY-MJ", "popularate"),
      Subdivision("Al Marqab", "LY-MB", "popularate"),
      Subdivision("Al Wāḩāt", "LY-WA", "popularate"),
      Subdivision("An Nuqāţ al Khams", "LY-NQ", "popularate"),
      Subdivision("Az Zāwiyah", "LY-ZA", "popularate"),
      Subdivision("Banghāzī", "LY-BA", "popularate"),
      Subdivision("Darnah", "LY-DR", "popularate"),
      Subdivision("Ghāt", "LY-GT", "popularate"),
      Subdivision("Mişrātah", "LY-MI", "popularate"),
      Subdivision("Murzuq", "LY-MQ", "popularate"),
      Subdivision("Nālūt", "LY-NL", "popularate"),
      Subdivision("Sabhā", "LY-SB", "popularate"),
      Subdivision("Surt", "LY-SR", "popularate"),
      Subdivision("Wādī al Ḩayāt", "LY-WD", "popularate"),
      Subdivision("Wādī ash Shāţi’", "LY-WS", "popularate"),
      Subdivision("Ţarābulus", "LY-TB", "popularate")
    )
  }

  case object MA extends Country("Morocco", "MA", "MAR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agadir-Ida-Ou-Tanane", "MA-AGD", "prefecture"),
      Subdivision("Al Haouz", "MA-HAO", "province"),
      Subdivision("Al Hoceïma", "MA-HOC", "province"),
      Subdivision("Aousserd", "MA-AOU", "province"),
      Subdivision("Assa-Zag", "MA-ASZ", "province"),
      Subdivision("Azilal", "MA-AZI", "province"),
      Subdivision("Benslimane", "MA-BES", "province"),
      Subdivision("Berkane", "MA-BER", "province"),
      Subdivision("Berrechid", "MA-BRR", "province"),
      Subdivision("Boujdour", "MA-BOD", "province"),
      Subdivision("Boulemane", "MA-BOM", "province"),
      Subdivision("Béni Mellal", "MA-BEM", "province"),
      Subdivision("Béni Mellal-Khénifra", "MA-05", "region"),
      Subdivision("Casablanca", "MA-CAS", "prefecture"),
      Subdivision("Casablanca-Settat", "MA-06", "region"),
      Subdivision("Chefchaouen", "MA-CHE", "province"),
      Subdivision("Chichaoua", "MA-CHI", "province"),
      Subdivision("Chtouka-Ait Baha", "MA-CHT", "province"),
      Subdivision("Dakhla-Oued Ed-Dahab", "MA-12", "region"),
      Subdivision("Driouch", "MA-DRI", "province"),
      Subdivision("Drâa-Tafilalet", "MA-08", "region"),
      Subdivision("El Hajeb", "MA-HAJ", "province"),
      Subdivision("El Jadida", "MA-JDI", "province"),
      Subdivision("El Kelâa des Sraghna", "MA-KES", "province"),
      Subdivision("Errachidia", "MA-ERR", "province"),
      Subdivision("Es-Semara", "MA-ESM", "province"),
      Subdivision("Essaouira", "MA-ESI", "province"),
      Subdivision("Fahs-Anjra", "MA-FAH", "province"),
      Subdivision("Figuig", "MA-FIG", "province"),
      Subdivision("Fquih Ben Salah", "MA-FQH", "province"),
      Subdivision("Fès", "MA-FES", "prefecture"),
      Subdivision("Fès-Meknès", "MA-03", "region"),
      Subdivision("Guelmim", "MA-GUE", "province"),
      Subdivision("Guelmim-Oued Noun", "MA-10", "region"),
      Subdivision("Guercif", "MA-GUF", "province"),
      Subdivision("Ifrane", "MA-IFR", "province"),
      Subdivision("Inezgane-Ait Melloul", "MA-INE", "prefecture"),
      Subdivision("Jerada", "MA-JRA", "province"),
      Subdivision("Khouribga", "MA-KHO", "province"),
      Subdivision("Khémisset", "MA-KHE", "province"),
      Subdivision("Khénifra", "MA-KHN", "province"),
      Subdivision("Kénitra", "MA-KEN", "province"),
      Subdivision("L'Oriental", "MA-02", "region"),
      Subdivision("Larache", "MA-LAR", "province"),
      Subdivision("Laâyoune", "MA-LAA", "province"),
      Subdivision("Laâyoune-Sakia El Hamra", "MA-11", "region"),
      Subdivision("Marrakech", "MA-MAR", "prefecture"),
      Subdivision("Marrakech-Safi", "MA-07", "region"),
      Subdivision("Meknès", "MA-MEK", "prefecture"),
      Subdivision("Midelt", "MA-MID", "province"),
      Subdivision("Mohammadia", "MA-MOH", "prefecture"),
      Subdivision("Moulay Yacoub", "MA-MOU", "province"),
      Subdivision("Médiouna", "MA-MED", "province"),
      Subdivision("M’diq-Fnideq", "MA-MDF", "prefecture"),
      Subdivision("Nador", "MA-NAD", "province"),
      Subdivision("Nouaceur", "MA-NOU", "province"),
      Subdivision("Ouarzazate", "MA-OUA", "province"),
      Subdivision("Oued Ed-Dahab", "MA-OUD", "province"),
      Subdivision("Ouezzane", "MA-OUZ", "province"),
      Subdivision("Oujda-Angad", "MA-OUJ", "prefecture"),
      Subdivision("Rabat", "MA-RAB", "prefecture"),
      Subdivision("Rabat-Salé-Kénitra", "MA-04", "region"),
      Subdivision("Rehamna", "MA-REH", "province"),
      Subdivision("Safi", "MA-SAF", "province"),
      Subdivision("Salé", "MA-SAL", "prefecture"),
      Subdivision("Sefrou", "MA-SEF", "province"),
      Subdivision("Settat", "MA-SET", "province"),
      Subdivision("Sidi Bennour", "MA-SIB", "province"),
      Subdivision("Sidi Ifni", "MA-SIF", "province"),
      Subdivision("Sidi Kacem", "MA-SIK", "province"),
      Subdivision("Sidi Slimane", "MA-SIL", "province"),
      Subdivision("Skhirate-Témara", "MA-SKH", "prefecture"),
      Subdivision("Souss-Massa", "MA-09", "region"),
      Subdivision("Tan-Tan", "MA-TNT", "province"),
      Subdivision("Tanger-Assilah", "MA-TNG", "prefecture"),
      Subdivision("Tanger-Tétouan-Al Hoceïma", "MA-01", "region"),
      Subdivision("Taounate", "MA-TAO", "province"),
      Subdivision("Taourirt", "MA-TAI", "province"),
      Subdivision("Tarfaya", "MA-TAF", "province"),
      Subdivision("Taroudannt", "MA-TAR", "province"),
      Subdivision("Tata", "MA-TAT", "province"),
      Subdivision("Taza", "MA-TAZ", "province"),
      Subdivision("Tinghir", "MA-TIN", "province"),
      Subdivision("Tiznit", "MA-TIZ", "province"),
      Subdivision("Tétouan", "MA-TET", "province"),
      Subdivision("Youssoufia", "MA-YUS", "province"),
      Subdivision("Zagora", "MA-ZAG", "province")
    )
  }

  case object MC extends Country("Monaco", "MC", "MCO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Fontvieille", "MC-FO", "quarter"),
      Subdivision("Jardin Exotique", "MC-JE", "quarter"),
      Subdivision("La Colle", "MC-CL", "quarter"),
      Subdivision("La Condamine", "MC-CO", "quarter"),
      Subdivision("La Gare", "MC-GA", "quarter"),
      Subdivision("La Source", "MC-SO", "quarter"),
      Subdivision("Larvotto", "MC-LA", "quarter"),
      Subdivision("Malbousquet", "MC-MA", "quarter"),
      Subdivision("Monaco-Ville", "MC-MO", "quarter"),
      Subdivision("Moneghetti", "MC-MG", "quarter"),
      Subdivision("Monte-Carlo", "MC-MC", "quarter"),
      Subdivision("Moulins", "MC-MU", "quarter"),
      Subdivision("Port-Hercule", "MC-PH", "quarter"),
      Subdivision("Saint-Roman", "MC-SR", "quarter"),
      Subdivision("Sainte-Dévote", "MC-SD", "quarter"),
      Subdivision("Spélugues", "MC-SP", "quarter"),
      Subdivision("Vallon de la Rousse", "MC-VR", "quarter")
    )
  }

  case object MD extends Country("Moldova (the Republic of)", "MD", "MDA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anenii Noi", "MD-AN", "district"),
      Subdivision("Basarabeasca", "MD-BS", "district"),
      Subdivision("Bender", "MD-BD", "city"),
      Subdivision("Briceni", "MD-BR", "district"),
      Subdivision("Bălți", "MD-BA", "city"),
      Subdivision("Cahul", "MD-CA", "district"),
      Subdivision("Cantemir", "MD-CT", "district"),
      Subdivision("Chișinău", "MD-CU", "city"),
      Subdivision("Cimișlia", "MD-CM", "district"),
      Subdivision("Criuleni", "MD-CR", "district"),
      Subdivision("Călărași", "MD-CL", "district"),
      Subdivision("Căușeni", "MD-CS", "district"),
      Subdivision("Dondușeni", "MD-DO", "district"),
      Subdivision("Drochia", "MD-DR", "district"),
      Subdivision("Dubăsari", "MD-DU", "district"),
      Subdivision("Edineț", "MD-ED", "district"),
      Subdivision("Florești", "MD-FL", "district"),
      Subdivision("Fălești", "MD-FA", "district"),
      Subdivision("Glodeni", "MD-GL", "district"),
      Subdivision("Găgăuzia, Unitatea teritorială autonomă", "MD-GA", "autonomous territorial unit"),
      Subdivision("Hîncești", "MD-HI", "district"),
      Subdivision("Ialoveni", "MD-IA", "district"),
      Subdivision("Leova", "MD-LE", "district"),
      Subdivision("Nisporeni", "MD-NI", "district"),
      Subdivision("Ocnița", "MD-OC", "district"),
      Subdivision("Orhei", "MD-OR", "district"),
      Subdivision("Rezina", "MD-RE", "district"),
      Subdivision("Rîșcani", "MD-RI", "district"),
      Subdivision("Soroca", "MD-SO", "district"),
      Subdivision("Strășeni", "MD-ST", "district"),
      Subdivision("Stînga Nistrului, unitatea teritorială din", "MD-SN", "territorial unit"),
      Subdivision("Sîngerei", "MD-SI", "district"),
      Subdivision("Taraclia", "MD-TA", "district"),
      Subdivision("Telenești", "MD-TE", "district"),
      Subdivision("Ungheni", "MD-UN", "district"),
      Subdivision("Șoldănești", "MD-SD", "district"),
      Subdivision("Ștefan Vodă", "MD-SV", "district")
    )
  }

  case object ME extends Country("Montenegro", "ME", "MNE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andrijevica", "ME-01", "municipality"),
      Subdivision("Bar", "ME-02", "municipality"),
      Subdivision("Berane", "ME-03", "municipality"),
      Subdivision("Bijelo Polje", "ME-04", "municipality"),
      Subdivision("Budva", "ME-05", "municipality"),
      Subdivision("Cetinje", "ME-06", "municipality"),
      Subdivision("Danilovgrad", "ME-07", "municipality"),
      Subdivision("Gusinje", "ME-22", "municipality"),
      Subdivision("Herceg-Novi", "ME-08", "municipality"),
      Subdivision("Kolašin", "ME-09", "municipality"),
      Subdivision("Kotor", "ME-10", "municipality"),
      Subdivision("Mojkovac", "ME-11", "municipality"),
      Subdivision("Nikšić", "ME-12", "municipality"),
      Subdivision("Petnjica", "ME-23", "municipality"),
      Subdivision("Plav", "ME-13", "municipality"),
      Subdivision("Pljevlja", "ME-14", "municipality"),
      Subdivision("Plužine", "ME-15", "municipality"),
      Subdivision("Podgorica", "ME-16", "municipality"),
      Subdivision("Rožaje", "ME-17", "municipality"),
      Subdivision("Tivat", "ME-19", "municipality"),
      Subdivision("Tuzi", "ME-24", "municipality"),
      Subdivision("Ulcinj", "ME-20", "municipality"),
      Subdivision("Šavnik", "ME-18", "municipality"),
      Subdivision("Žabljak", "ME-21", "municipality")
    )
  }

  case object MF extends Country("Saint Martin (French part)", "MF", "MAF")

  case object MG extends Country("Madagascar", "MG", "MDG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Antananarivo", "MG-T", "province"),
      Subdivision("Antsiranana", "MG-D", "province"),
      Subdivision("Fianarantsoa", "MG-F", "province"),
      Subdivision("Mahajanga", "MG-M", "province"),
      Subdivision("Toamasina", "MG-A", "province"),
      Subdivision("Toliara", "MG-U", "province")
    )
  }

  case object MH extends Country("Marshall Islands (the)", "MH", "MHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aelok", "MH-ALK", "municipality"),
      Subdivision("Aelōn̄ḷapḷap", "MH-ALL", "municipality"),
      Subdivision("Arno", "MH-ARN", "municipality"),
      Subdivision("Aur", "MH-AUR", "municipality"),
      Subdivision("Bikini & Kili", "MH-KIL", "municipality"),
      Subdivision("Ebon", "MH-EBO", "municipality"),
      Subdivision("Ellep", "MH-LIB", "municipality"),
      Subdivision("Enewetak & Ujelang", "MH-ENI", "municipality"),
      Subdivision("Jabat", "MH-JAB", "municipality"),
      Subdivision("Jaluit", "MH-JAL", "municipality"),
      Subdivision("Kuwajleen", "MH-KWA", "municipality"),
      Subdivision("Lae", "MH-LAE", "municipality"),
      Subdivision("Likiep", "MH-LIK", "municipality"),
      Subdivision("Majuro", "MH-MAJ", "municipality"),
      Subdivision("Maloelap", "MH-MAL", "municipality"),
      Subdivision("Mejit", "MH-MEJ", "municipality"),
      Subdivision("Mile", "MH-MIL", "municipality"),
      Subdivision("Namdrik", "MH-NMK", "municipality"),
      Subdivision("Namu", "MH-NMU", "municipality"),
      Subdivision("Ralik chain", "MH-L", "chain (of islands)"),
      Subdivision("Ratak chain", "MH-T", "chain (of islands)"),
      Subdivision("Rongelap", "MH-RON", "municipality"),
      Subdivision("Ujae", "MH-UJA", "municipality"),
      Subdivision("Utrik", "MH-UTI", "municipality"),
      Subdivision("Wotho", "MH-WTH", "municipality"),
      Subdivision("Wotje", "MH-WTJ", "municipality")
    )
  }

  case object MK extends Country("North Macedonia", "MK", "MKD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aerodrom †", "MK-801", "municipality"),
      Subdivision("Aračinovo", "MK-802", "municipality"),
      Subdivision("Berovo", "MK-201", "municipality"),
      Subdivision("Bitola", "MK-501", "municipality"),
      Subdivision("Bogdanci", "MK-401", "municipality"),
      Subdivision("Bogovinje", "MK-601", "municipality"),
      Subdivision("Bosilovo", "MK-402", "municipality"),
      Subdivision("Brvenica", "MK-602", "municipality"),
      Subdivision("Butel †", "MK-803", "municipality"),
      Subdivision("Centar Župa", "MK-313", "municipality"),
      Subdivision("Centar †", "MK-814", "municipality"),
      Subdivision("Debar", "MK-303", "municipality"),
      Subdivision("Debrca", "MK-304", "municipality"),
      Subdivision("Delčevo", "MK-203", "municipality"),
      Subdivision("Demir Hisar", "MK-502", "municipality"),
      Subdivision("Demir Kapija", "MK-103", "municipality"),
      Subdivision("Dojran", "MK-406", "municipality"),
      Subdivision("Dolneni", "MK-503", "municipality"),
      Subdivision("Gazi Baba †", "MK-804", "municipality"),
      Subdivision("Gevgelija", "MK-405", "municipality"),
      Subdivision("Gjorče Petrov †", "MK-805", "municipality"),
      Subdivision("Gostivar", "MK-604", "municipality"),
      Subdivision("Gradsko", "MK-102", "municipality"),
      Subdivision("Ilinden", "MK-807", "municipality"),
      Subdivision("Jegunovce", "MK-606", "municipality"),
      Subdivision("Karbinci", "MK-205", "municipality"),
      Subdivision("Karpoš †", "MK-808", "municipality"),
      Subdivision("Kavadarci", "MK-104", "municipality"),
      Subdivision("Kisela Voda †", "MK-809", "municipality"),
      Subdivision("Kičevo", "MK-307", "municipality"),
      Subdivision("Konče", "MK-407", "municipality"),
      Subdivision("Kočani", "MK-206", "municipality"),
      Subdivision("Kratovo", "MK-701", "municipality"),
      Subdivision("Kriva Palanka", "MK-702", "municipality"),
      Subdivision("Krivogaštani", "MK-504", "municipality"),
      Subdivision("Kruševo", "MK-505", "municipality"),
      Subdivision("Kumanovo", "MK-703", "municipality"),
      Subdivision("Lipkovo", "MK-704", "municipality"),
      Subdivision("Lozovo", "MK-105", "municipality"),
      Subdivision("Makedonska Kamenica", "MK-207", "municipality"),
      Subdivision("Makedonski Brod", "MK-308", "municipality"),
      Subdivision("Mavrovo i Rostuše", "MK-607", "municipality"),
      Subdivision("Mogila", "MK-506", "municipality"),
      Subdivision("Negotino", "MK-106", "municipality"),
      Subdivision("Novaci", "MK-507", "municipality"),
      Subdivision("Novo Selo", "MK-408", "municipality"),
      Subdivision("Ohrid", "MK-310", "municipality"),
      Subdivision("Pehčevo", "MK-208", "municipality"),
      Subdivision("Petrovec", "MK-810", "municipality"),
      Subdivision("Plasnica", "MK-311", "municipality"),
      Subdivision("Prilep", "MK-508", "municipality"),
      Subdivision("Probištip", "MK-209", "municipality"),
      Subdivision("Radoviš", "MK-409", "municipality"),
      Subdivision("Rankovce", "MK-705", "municipality"),
      Subdivision("Resen", "MK-509", "municipality"),
      Subdivision("Rosoman", "MK-107", "municipality"),
      Subdivision("Saraj †", "MK-811", "municipality"),
      Subdivision("Sopište", "MK-812", "municipality"),
      Subdivision("Staro Nagoričane", "MK-706", "municipality"),
      Subdivision("Struga", "MK-312", "municipality"),
      Subdivision("Strumica", "MK-410", "municipality"),
      Subdivision("Studeničani", "MK-813", "municipality"),
      Subdivision("Sveti Nikole", "MK-108", "municipality"),
      Subdivision("Tearce", "MK-608", "municipality"),
      Subdivision("Tetovo", "MK-609", "municipality"),
      Subdivision("Valandovo", "MK-403", "municipality"),
      Subdivision("Vasilevo", "MK-404", "municipality"),
      Subdivision("Veles", "MK-101", "municipality"),
      Subdivision("Vevčani", "MK-301", "municipality"),
      Subdivision("Vinica", "MK-202", "municipality"),
      Subdivision("Vrapčište", "MK-603", "municipality"),
      Subdivision("Zelenikovo", "MK-806", "municipality"),
      Subdivision("Zrnovci", "MK-204", "municipality"),
      Subdivision("Čair †", "MK-815", "municipality"),
      Subdivision("Čaška", "MK-109", "municipality"),
      Subdivision("Češinovo-Obleševo", "MK-210", "municipality"),
      Subdivision("Čučer-Sandevo", "MK-816", "municipality"),
      Subdivision("Štip", "MK-211", "municipality"),
      Subdivision("Šuto Orizari †", "MK-817", "municipality"),
      Subdivision("Želino", "MK-605", "municipality")
    )
  }

  case object ML extends Country("Mali", "ML", "MLI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bamako", "ML-BKO", "district"),
      Subdivision("Gao", "ML-7", "region"),
      Subdivision("Kayes", "ML-1", "region"),
      Subdivision("Kidal", "ML-8", "region"),
      Subdivision("Koulikoro", "ML-2", "region"),
      Subdivision("Mopti", "ML-5", "region"),
      Subdivision("Ménaka", "ML-9", "region"),
      Subdivision("Sikasso", "ML-3", "region"),
      Subdivision("Ségou", "ML-4", "region"),
      Subdivision("Taoudénit", "ML-10", "region"),
      Subdivision("Tombouctou", "ML-6", "region")
    )
  }

  case object MM extends Country("Myanmar", "MM", "MMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ayeyarwady", "MM-07", "region"),
      Subdivision("Bago", "MM-02", "region"),
      Subdivision("Chin", "MM-14", "state"),
      Subdivision("Kachin", "MM-11", "state"),
      Subdivision("Kayah", "MM-12", "state"),
      Subdivision("Kayin", "MM-13", "state"),
      Subdivision("Magway", "MM-03", "region"),
      Subdivision("Mandalay", "MM-04", "region"),
      Subdivision("Mon", "MM-15", "state"),
      Subdivision("Nay Pyi Taw", "MM-18", "union territory"),
      Subdivision("Rakhine", "MM-16", "state"),
      Subdivision("Sagaing", "MM-01", "region"),
      Subdivision("Shan", "MM-17", "state"),
      Subdivision("Tanintharyi", "MM-05", "region"),
      Subdivision("Yangon", "MM-06", "region")
    )
  }

  case object MN extends Country("Mongolia", "MN", "MNG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arhangay", "MN-073", "province"),
      Subdivision("Bayan-Ölgiy", "MN-071", "province"),
      Subdivision("Bayanhongor", "MN-069", "province"),
      Subdivision("Bulgan", "MN-067", "province"),
      Subdivision("Darhan uul", "MN-037", "province"),
      Subdivision("Dornod", "MN-061", "province"),
      Subdivision("Dornogovĭ", "MN-063", "province"),
      Subdivision("Dundgovĭ", "MN-059", "province"),
      Subdivision("Dzavhan", "MN-057", "province"),
      Subdivision("Govĭ-Altay", "MN-065", "province"),
      Subdivision("Govĭ-Sümber", "MN-064", "province"),
      Subdivision("Hentiy", "MN-039", "province"),
      Subdivision("Hovd", "MN-043", "province"),
      Subdivision("Hövsgöl", "MN-041", "province"),
      Subdivision("Orhon", "MN-035", "province"),
      Subdivision("Selenge", "MN-049", "province"),
      Subdivision("Sühbaatar", "MN-051", "province"),
      Subdivision("Töv", "MN-047", "province"),
      Subdivision("Ulaanbaatar", "MN-1", "capital city"),
      Subdivision("Uvs", "MN-046", "province"),
      Subdivision("Ömnögovĭ", "MN-053", "province"),
      Subdivision("Övörhangay", "MN-055", "province")
    )
  }

  case object MO extends Country("Macao", "MO", "MAC")

  case object MP extends Country("Northern Mariana Islands (the)", "MP", "MNP")

  case object MQ extends Country("Martinique", "MQ", "MTQ")

  case object MR extends Country("Mauritania", "MR", "MRT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adrar", "MR-07", "region"),
      Subdivision("Assaba", "MR-03", "region"),
      Subdivision("Brakna", "MR-05", "region"),
      Subdivision("Dakhlet Nouâdhibou", "MR-08", "region"),
      Subdivision("Gorgol", "MR-04", "region"),
      Subdivision("Guidimaka", "MR-10", "region"),
      Subdivision("Hodh ech Chargui", "MR-01", "region"),
      Subdivision("Hodh el Gharbi", "MR-02", "region"),
      Subdivision("Inchiri", "MR-12", "region"),
      Subdivision("Nouakchott Nord", "MR-14", "region"),
      Subdivision("Nouakchott Ouest", "MR-13", "region"),
      Subdivision("Nouakchott Sud", "MR-15", "region"),
      Subdivision("Tagant", "MR-09", "region"),
      Subdivision("Tiris Zemmour", "MR-11", "region"),
      Subdivision("Trarza", "MR-06", "region")
    )
  }

  case object MS extends Country("Montserrat", "MS", "MSR")

  case object MT extends Country("Malta", "MT", "MLT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Attard", "MT-01", "local council"),
      Subdivision("Balzan", "MT-02", "local council"),
      Subdivision("Birgu", "MT-03", "local council"),
      Subdivision("Birkirkara", "MT-04", "local council"),
      Subdivision("Birżebbuġa", "MT-05", "local council"),
      Subdivision("Bormla", "MT-06", "local council"),
      Subdivision("Dingli", "MT-07", "local council"),
      Subdivision("Fgura", "MT-08", "local council"),
      Subdivision("Floriana", "MT-09", "local council"),
      Subdivision("Fontana", "MT-10", "local council"),
      Subdivision("Gudja", "MT-11", "local council"),
      Subdivision("Għajnsielem", "MT-13", "local council"),
      Subdivision("Għarb", "MT-14", "local council"),
      Subdivision("Għargħur", "MT-15", "local council"),
      Subdivision("Għasri", "MT-16", "local council"),
      Subdivision("Għaxaq", "MT-17", "local council"),
      Subdivision("Gżira", "MT-12", "local council"),
      Subdivision("Iklin", "MT-19", "local council"),
      Subdivision("Isla", "MT-20", "local council"),
      Subdivision("Kalkara", "MT-21", "local council"),
      Subdivision("Kerċem", "MT-22", "local council"),
      Subdivision("Kirkop", "MT-23", "local council"),
      Subdivision("Lija", "MT-24", "local council"),
      Subdivision("Luqa", "MT-25", "local council"),
      Subdivision("Marsa", "MT-26", "local council"),
      Subdivision("Marsaskala", "MT-27", "local council"),
      Subdivision("Marsaxlokk", "MT-28", "local council"),
      Subdivision("Mdina", "MT-29", "local council"),
      Subdivision("Mellieħa", "MT-30", "local council"),
      Subdivision("Mosta", "MT-32", "local council"),
      Subdivision("Mqabba", "MT-33", "local council"),
      Subdivision("Msida", "MT-34", "local council"),
      Subdivision("Mtarfa", "MT-35", "local council"),
      Subdivision("Munxar", "MT-36", "local council"),
      Subdivision("Mġarr", "MT-31", "local council"),
      Subdivision("Nadur", "MT-37", "local council"),
      Subdivision("Naxxar", "MT-38", "local council"),
      Subdivision("Paola", "MT-39", "local council"),
      Subdivision("Pembroke", "MT-40", "local council"),
      Subdivision("Pietà", "MT-41", "local council"),
      Subdivision("Qala", "MT-42", "local council"),
      Subdivision("Qormi", "MT-43", "local council"),
      Subdivision("Qrendi", "MT-44", "local council"),
      Subdivision("Rabat Gozo", "MT-45", "local council"),
      Subdivision("Rabat Malta", "MT-46", "local council"),
      Subdivision("Safi", "MT-47", "local council"),
      Subdivision("Saint John", "MT-49", "local council"),
      Subdivision("Saint Julian's", "MT-48", "local council"),
      Subdivision("Saint Lawrence", "MT-50", "local council"),
      Subdivision("Saint Lucia's", "MT-53", "local council"),
      Subdivision("Saint Paul's Bay", "MT-51", "local council"),
      Subdivision("Sannat", "MT-52", "local council"),
      Subdivision("Santa Venera", "MT-54", "local council"),
      Subdivision("Siġġiewi", "MT-55", "local council"),
      Subdivision("Sliema", "MT-56", "local council"),
      Subdivision("Swieqi", "MT-57", "local council"),
      Subdivision("Ta' Xbiex", "MT-58", "local council"),
      Subdivision("Tarxien", "MT-59", "local council"),
      Subdivision("Valletta", "MT-60", "local council"),
      Subdivision("Xagħra", "MT-61", "local council"),
      Subdivision("Xewkija", "MT-62", "local council"),
      Subdivision("Xgħajra", "MT-63", "local council"),
      Subdivision("Ħamrun", "MT-18", "local council"),
      Subdivision("Żabbar", "MT-64", "local council"),
      Subdivision("Żebbuġ Gozo", "MT-65", "local council"),
      Subdivision("Żebbuġ Malta", "MT-66", "local council"),
      Subdivision("Żejtun", "MT-67", "local council"),
      Subdivision("Żurrieq", "MT-68", "local council")
    )
  }

  case object MU extends Country("Mauritius", "MU", "MUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agalega Islands", "MU-AG", "dependency"),
      Subdivision("Black River", "MU-BL", "district"),
      Subdivision("Cargados Carajos Shoals", "MU-CC", "dependency"),
      Subdivision("Flacq", "MU-FL", "district"),
      Subdivision("Grand Port", "MU-GP", "district"),
      Subdivision("Moka", "MU-MO", "district"),
      Subdivision("Pamplemousses", "MU-PA", "district"),
      Subdivision("Plaines Wilhems", "MU-PW", "district"),
      Subdivision("Port Louis", "MU-PL", "district"),
      Subdivision("Rivière du Rempart", "MU-RR", "district"),
      Subdivision("Rodrigues Island", "MU-RO", "dependency"),
      Subdivision("Savanne", "MU-SA", "district")
    )
  }

  case object MV extends Country("Maldives", "MV", "MDV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Addu", "MV-01", "city"),
      Subdivision("Ariatholhu Dhekunuburi", "MV-00", "administrative atoll"),
      Subdivision("Ariatholhu Uthuruburi", "MV-02", "administrative atoll"),
      Subdivision("Faadhippolhu", "MV-03", "administrative atoll"),
      Subdivision("Felidheatholhu", "MV-04", "administrative atoll"),
      Subdivision("Fuvammulah", "MV-29", "administrative atoll"),
      Subdivision("Hahdhunmathi", "MV-05", "administrative atoll"),
      Subdivision("Huvadhuatholhu Dhekunuburi", "MV-28", "administrative atoll"),
      Subdivision("Huvadhuatholhu Uthuruburi", "MV-27", "administrative atoll"),
      Subdivision("Kolhumadulu", "MV-08", "administrative atoll"),
      Subdivision("Maale", "MV-MLE", "city"),
      Subdivision("Maaleatholhu", "MV-26", "administrative atoll"),
      Subdivision("Maalhosmadulu Dhekunuburi", "MV-20", "administrative atoll"),
      Subdivision("Maalhosmadulu Uthuruburi", "MV-13", "administrative atoll"),
      Subdivision("Miladhunmadulu Dhekunuburi", "MV-25", "administrative atoll"),
      Subdivision("Miladhunmadulu Uthuruburi", "MV-24", "administrative atoll"),
      Subdivision("Mulakatholhu", "MV-12", "administrative atoll"),
      Subdivision("Nilandheatholhu Dhekunuburi", "MV-17", "administrative atoll"),
      Subdivision("Nilandheatholhu Uthuruburi", "MV-14", "administrative atoll"),
      Subdivision("North Thiladhunmathi", "MV-07", "administrative atoll"),
      Subdivision("South Thiladhunmathi", "MV-23", "administrative atoll")
    )
  }

  case object MW extends Country("Malawi", "MW", "MWI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balaka", "MW-BA", "district"),
      Subdivision("Blantyre", "MW-BL", "district"),
      Subdivision("Central Region", "MW-C", "region"),
      Subdivision("Chakumpoto", "MW-N", "region"),
      Subdivision("Chakumwera", "MW-S", "region"),
      Subdivision("Chikwawa", "MW-CK", "district"),
      Subdivision("Chiradzulu", "MW-CR", "district"),
      Subdivision("Chitipa", "MW-CT", "district"),
      Subdivision("Dedza", "MW-DE", "district"),
      Subdivision("Dowa", "MW-DO", "district"),
      Subdivision("Karonga", "MW-KR", "district"),
      Subdivision("Kasungu", "MW-KS", "district"),
      Subdivision("Likoma", "MW-LK", "district"),
      Subdivision("Lilongwe", "MW-LI", "district"),
      Subdivision("Machinga", "MW-MH", "district"),
      Subdivision("Mangochi", "MW-MG", "district"),
      Subdivision("Mchinji", "MW-MC", "district"),
      Subdivision("Mulanje", "MW-MU", "district"),
      Subdivision("Mwanza", "MW-MW", "district"),
      Subdivision("Mzimba", "MW-MZ", "district"),
      Subdivision("Neno", "MW-NE", "district"),
      Subdivision("Nkhata Bay", "MW-NB", "district"),
      Subdivision("Nkhotakota", "MW-NK", "district"),
      Subdivision("Nsanje", "MW-NS", "district"),
      Subdivision("Ntcheu", "MW-NU", "district"),
      Subdivision("Ntchisi", "MW-NI", "district"),
      Subdivision("Phalombe", "MW-PH", "district"),
      Subdivision("Rumphi", "MW-RU", "district"),
      Subdivision("Salima", "MW-SA", "district"),
      Subdivision("Thyolo", "MW-TH", "district"),
      Subdivision("Zomba", "MW-ZO", "district")
    )
  }

  case object MX extends Country("Mexico", "MX", "MEX") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aguascalientes", "MX-AGU", "state"),
      Subdivision("Baja California", "MX-BCN", "state"),
      Subdivision("Baja California Sur", "MX-BCS", "state"),
      Subdivision("Campeche", "MX-CAM", "state"),
      Subdivision("Chiapas", "MX-CHP", "state"),
      Subdivision("Chihuahua", "MX-CHH", "state"),
      Subdivision("Ciudad de México", "MX-CMX", "federal district"),
      Subdivision("Coahuila de Zaragoza", "MX-COA", "state"),
      Subdivision("Colima", "MX-COL", "state"),
      Subdivision("Durango", "MX-DUR", "state"),
      Subdivision("Guanajuato", "MX-GUA", "state"),
      Subdivision("Guerrero", "MX-GRO", "state"),
      Subdivision("Hidalgo", "MX-HID", "state"),
      Subdivision("Jalisco", "MX-JAL", "state"),
      Subdivision("Michoacán de Ocampo", "MX-MIC", "state"),
      Subdivision("Morelos", "MX-MOR", "state"),
      Subdivision("México", "MX-MEX", "state"),
      Subdivision("Nayarit", "MX-NAY", "state"),
      Subdivision("Nuevo León", "MX-NLE", "state"),
      Subdivision("Oaxaca", "MX-OAX", "state"),
      Subdivision("Puebla", "MX-PUE", "state"),
      Subdivision("Querétaro", "MX-QUE", "state"),
      Subdivision("Quintana Roo", "MX-ROO", "state"),
      Subdivision("San Luis Potosí", "MX-SLP", "state"),
      Subdivision("Sinaloa", "MX-SIN", "state"),
      Subdivision("Sonora", "MX-SON", "state"),
      Subdivision("Tabasco", "MX-TAB", "state"),
      Subdivision("Tamaulipas", "MX-TAM", "state"),
      Subdivision("Tlaxcala", "MX-TLA", "state"),
      Subdivision("Veracruz de Ignacio de la Llave", "MX-VER", "state"),
      Subdivision("Yucatán", "MX-YUC", "state"),
      Subdivision("Zacatecas", "MX-ZAC", "state")
    )
  }

  case object MY extends Country("Malaysia", "MY", "MYS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Johor", "MY-01", "state"),
      Subdivision("Kedah", "MY-02", "state"),
      Subdivision("Kelantan", "MY-03", "state"),
      Subdivision("Melaka", "MY-04", "state"),
      Subdivision("Negeri Sembilan", "MY-05", "state"),
      Subdivision("Pahang", "MY-06", "state"),
      Subdivision("Perak", "MY-08", "state"),
      Subdivision("Perlis", "MY-09", "state"),
      Subdivision("Pulau Pinang", "MY-07", "state"),
      Subdivision("Sabah", "MY-12", "state"),
      Subdivision("Sarawak", "MY-13", "state"),
      Subdivision("Selangor", "MY-10", "state"),
      Subdivision("Terengganu", "MY-11", "state"),
      Subdivision("Wilayah Persekutuan Kuala Lumpur", "MY-14", "federal territory"),
      Subdivision("Wilayah Persekutuan Labuan", "MY-15", "federal territory"),
      Subdivision("Wilayah Persekutuan Putrajaya", "MY-16", "federal territory")
    )
  }

  case object MZ extends Country("Mozambique", "MZ", "MOZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Cabo Delgado", "MZ-P", "province"),
      Subdivision("Gaza", "MZ-G", "province"),
      Subdivision("Inhambane", "MZ-I", "province"),
      Subdivision("Manica", "MZ-B", "province"),
      Subdivision("Maputo", "MZ-MPM", "city"),
      Subdivision("Maputo", "MZ-L", "province"),
      Subdivision("Nampula", "MZ-N", "province"),
      Subdivision("Niassa", "MZ-A", "province"),
      Subdivision("Sofala", "MZ-S", "province"),
      Subdivision("Tete", "MZ-T", "province"),
      Subdivision("Zambézia", "MZ-Q", "province")
    )
  }

  case object NA extends Country("Namibia", "NA", "NAM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("//Karas", "NA-KA", "region"),
      Subdivision("Erongo", "NA-ER", "region"),
      Subdivision("Hardap", "NA-HA", "region"),
      Subdivision("Kavango East", "NA-KE", "region"),
      Subdivision("Kavango West", "NA-KW", "region"),
      Subdivision("Khomas", "NA-KH", "region"),
      Subdivision("Kunene", "NA-KU", "region"),
      Subdivision("Ohangwena", "NA-OW", "region"),
      Subdivision("Omaheke", "NA-OH", "region"),
      Subdivision("Omusati", "NA-OS", "region"),
      Subdivision("Oshana", "NA-ON", "region"),
      Subdivision("Oshikoto", "NA-OT", "region"),
      Subdivision("Otjozondjupa", "NA-OD", "region"),
      Subdivision("Zambezi", "NA-CA", "region")
    )
  }

  case object NC extends Country("New Caledonia", "NC", "NCL")

  case object NE extends Country("Niger (the)", "NE", "NER") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agadez", "NE-1", "region"),
      Subdivision("Diffa", "NE-2", "region"),
      Subdivision("Dosso", "NE-3", "region"),
      Subdivision("Maradi", "NE-4", "region"),
      Subdivision("Niamey", "NE-8", "urban community"),
      Subdivision("Tahoua", "NE-5", "region"),
      Subdivision("Tillabéri", "NE-6", "region"),
      Subdivision("Zinder", "NE-7", "region")
    )
  }

  case object NF extends Country("Norfolk Island", "NF", "NFK")

  case object NG extends Country("Nigeria", "NG", "NGA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abia", "NG-AB", "state"),
      Subdivision("Abuja Federal Capital Territory", "NG-FC", "capital territory"),
      Subdivision("Adamawa", "NG-AD", "state"),
      Subdivision("Akwa Ibom", "NG-AK", "state"),
      Subdivision("Anambra", "NG-AN", "state"),
      Subdivision("Bauchi", "NG-BA", "state"),
      Subdivision("Bayelsa", "NG-BY", "state"),
      Subdivision("Benue", "NG-BE", "state"),
      Subdivision("Borno", "NG-BO", "state"),
      Subdivision("Cross River", "NG-CR", "state"),
      Subdivision("Delta", "NG-DE", "state"),
      Subdivision("Ebonyi", "NG-EB", "state"),
      Subdivision("Edo", "NG-ED", "state"),
      Subdivision("Ekiti", "NG-EK", "state"),
      Subdivision("Enugu", "NG-EN", "state"),
      Subdivision("Gombe", "NG-GO", "state"),
      Subdivision("Imo", "NG-IM", "state"),
      Subdivision("Jigawa", "NG-JI", "state"),
      Subdivision("Kaduna", "NG-KD", "state"),
      Subdivision("Kano", "NG-KN", "state"),
      Subdivision("Katsina", "NG-KT", "state"),
      Subdivision("Kebbi", "NG-KE", "state"),
      Subdivision("Kogi", "NG-KO", "state"),
      Subdivision("Kwara", "NG-KW", "state"),
      Subdivision("Lagos", "NG-LA", "state"),
      Subdivision("Nasarawa", "NG-NA", "state"),
      Subdivision("Niger", "NG-NI", "state"),
      Subdivision("Ogun", "NG-OG", "state"),
      Subdivision("Ondo", "NG-ON", "state"),
      Subdivision("Osun", "NG-OS", "state"),
      Subdivision("Oyo", "NG-OY", "state"),
      Subdivision("Plateau", "NG-PL", "state"),
      Subdivision("Rivers", "NG-RI", "state"),
      Subdivision("Sokoto", "NG-SO", "state"),
      Subdivision("Taraba", "NG-TA", "state"),
      Subdivision("Yobe", "NG-YO", "state"),
      Subdivision("Zamfara", "NG-ZA", "state")
    )
  }

  case object NI extends Country("Nicaragua", "NI", "NIC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Boaco", "NI-BO", "department"),
      Subdivision("Carazo", "NI-CA", "department"),
      Subdivision("Chinandega", "NI-CI", "department"),
      Subdivision("Chontales", "NI-CO", "department"),
      Subdivision("Costa Caribe Norte", "NI-AN", "autonomous region"),
      Subdivision("Costa Caribe Sur", "NI-AS", "autonomous region"),
      Subdivision("Estelí", "NI-ES", "department"),
      Subdivision("Granada", "NI-GR", "department"),
      Subdivision("Jinotega", "NI-JI", "department"),
      Subdivision("León", "NI-LE", "department"),
      Subdivision("Madriz", "NI-MD", "department"),
      Subdivision("Managua", "NI-MN", "department"),
      Subdivision("Masaya", "NI-MS", "department"),
      Subdivision("Matagalpa", "NI-MT", "department"),
      Subdivision("Nueva Segovia", "NI-NS", "department"),
      Subdivision("Rivas", "NI-RI", "department"),
      Subdivision("Río San Juan", "NI-SJ", "department")
    )
  }

  case object NL extends Country("Netherlands (the)", "NL", "NLD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aruba", "NL-AW", "country"),
      Subdivision("Bonaire", "NL-BQ1", "special municipality"),
      Subdivision("Curaçao", "NL-CW", "country"),
      Subdivision("Drenthe", "NL-DR", "province"),
      Subdivision("Flevoland", "NL-FL", "province"),
      Subdivision("Fryslân", "NL-FR", "province"),
      Subdivision("Gelderland", "NL-GE", "province"),
      Subdivision("Groningen", "NL-GR", "province"),
      Subdivision("Limburg", "NL-LI", "province"),
      Subdivision("Noord-Brabant", "NL-NB", "province"),
      Subdivision("Noord-Holland", "NL-NH", "province"),
      Subdivision("Overijssel", "NL-OV", "province"),
      Subdivision("Saba", "NL-BQ2", "special municipality"),
      Subdivision("Sint Eustatius", "NL-BQ3", "special municipality"),
      Subdivision("Sint Maarten", "NL-SX", "country"),
      Subdivision("Utrecht", "NL-UT", "province"),
      Subdivision("Zeeland", "NL-ZE", "province"),
      Subdivision("Zuid-Holland", "NL-ZH", "province")
    )
  }

  case object NO extends Country("Norway", "NO", "NOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agder", "NO-42", "county"),
      Subdivision("Innlandet", "NO-34", "county"),
      Subdivision("Jan Mayen", "NO-22", "arctic region"),
      Subdivision("Møre og Romsdal", "NO-15", "county"),
      Subdivision("Nordland", "NO-18", "county"),
      Subdivision("Oslo", "NO-03", "county"),
      Subdivision("Rogaland", "NO-11", "county"),
      Subdivision("Romssa ja Finnmárkku", "NO-54", "county"),
      Subdivision("Svalbard", "NO-21", "arctic region"),
      Subdivision("Trööndelage", "NO-50", "county"),
      Subdivision("Vestfold og Telemark", "NO-38", "county"),
      Subdivision("Vestland", "NO-46", "county"),
      Subdivision("Viken", "NO-30", "county")
    )
  }

  case object NP extends Country("Nepal", "NP", "NPL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bagmati", "NP-BA", "zone"),
      Subdivision("Bheri", "NP-BH", "zone"),
      Subdivision("Bāgmatī", "NP-P3", "province"),
      Subdivision("Central", "NP-1", "development region"),
      Subdivision("Dhawalagiri", "NP-DH", "zone"),
      Subdivision("Eastern", "NP-4", "development region"),
      Subdivision("Far Western", "NP-5", "development region"),
      Subdivision("Gandaki", "NP-GA", "zone"),
      Subdivision("Gandaki", "NP-P4", "province"),
      Subdivision("Janakpur", "NP-JA", "zone"),
      Subdivision("Karnali", "NP-KA", "zone"),
      Subdivision("Karnali", "NP-P6", "province"),
      Subdivision("Kosi", "NP-KO", "zone"),
      Subdivision("Lumbini", "NP-LU", "zone"),
      Subdivision("Lumbini", "NP-P5", "province"),
      Subdivision("Madhya Pashchimanchal", "NP-2", "development region"),
      Subdivision("Mahakali", "NP-MA", "zone"),
      Subdivision("Mechi", "NP-ME", "zone"),
      Subdivision("Narayani", "NP-NA", "zone"),
      Subdivision("Pashchimanchal", "NP-3", "development region"),
      Subdivision("Pradesh 1", "NP-P1", "province"),
      Subdivision("Pradesh 2", "NP-P2", "province"),
      Subdivision("Rapti", "NP-RA", "zone"),
      Subdivision("Sagarmatha", "NP-SA", "zone"),
      Subdivision("Seti", "NP-SE", "zone"),
      Subdivision("Sudūr Pashchim", "NP-P7", "province")
    )
  }

  case object NR extends Country("Nauru", "NR", "NRU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aiwo", "NR-01", "district"),
      Subdivision("Anabar", "NR-02", "district"),
      Subdivision("Anetan", "NR-03", "district"),
      Subdivision("Anibare", "NR-04", "district"),
      Subdivision("Baitsi", "NR-05", "district"),
      Subdivision("Boe", "NR-06", "district"),
      Subdivision("Buada", "NR-07", "district"),
      Subdivision("Denigomodu", "NR-08", "district"),
      Subdivision("Ewa", "NR-09", "district"),
      Subdivision("Ijuw", "NR-10", "district"),
      Subdivision("Meneng", "NR-11", "district"),
      Subdivision("Nibok", "NR-12", "district"),
      Subdivision("Uaboe", "NR-13", "district"),
      Subdivision("Yaren", "NR-14", "district")
    )
  }

  case object NU extends Country("Niue", "NU", "NIU")

  case object NZ extends Country("New Zealand", "NZ", "NZL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Auckland", "NZ-AUK", "region"),
      Subdivision("Bay of Plenty", "NZ-BOP", "region"),
      Subdivision("Canterbury", "NZ-CAN", "region"),
      Subdivision("Chatham Islands Territory", "NZ-CIT", "special island authority"),
      Subdivision("Gisborne", "NZ-GIS", "region"),
      Subdivision("Hawke's Bay", "NZ-HKB", "region"),
      Subdivision("Manawatu Whanganui", "NZ-MWT", "region"),
      Subdivision("Marlborough", "NZ-MBH", "region"),
      Subdivision("Murihiku", "NZ-STL", "region"),
      Subdivision("Nelson", "NZ-NSN", "region"),
      Subdivision("Northland", "NZ-NTL", "region"),
      Subdivision("Otago", "NZ-OTA", "region"),
      Subdivision("Taranaki", "NZ-TKI", "region"),
      Subdivision("Tasman", "NZ-TAS", "region"),
      Subdivision("Te Taihau ā uru", "NZ-WTC", "region"),
      Subdivision("Te Whanga-nui-a-Tara", "NZ-WGN", "region"),
      Subdivision("Waikato", "NZ-WKO", "region")
    )
  }

  case object OM extends Country("Oman", "OM", "OMN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Dākhilīyah", "OM-DA", "governorate"),
      Subdivision("Al Buraymī", "OM-BU", "governorate"),
      Subdivision("Al Wusţá", "OM-WU", "governorate"),
      Subdivision("Az̧ Z̧āhirah", "OM-ZA", "governorate"),
      Subdivision("Janūb al Bāţinah", "OM-BJ", "governorate"),
      Subdivision("Janūb ash Sharqīyah", "OM-SJ", "governorate"),
      Subdivision("Masqaţ", "OM-MA", "governorate"),
      Subdivision("Musandam", "OM-MU", "governorate"),
      Subdivision("Shamāl al Bāţinah", "OM-BS", "governorate"),
      Subdivision("Shamāl ash Sharqīyah", "OM-SS", "governorate"),
      Subdivision("Z̧ufār", "OM-ZU", "governorate")
    )
  }

  case object PA extends Country("Panama", "PA", "PAN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bocas del Toro", "PA-1", "province"),
      Subdivision("Chiriquí", "PA-4", "province"),
      Subdivision("Coclé", "PA-2", "province"),
      Subdivision("Colón", "PA-3", "province"),
      Subdivision("Darién", "PA-5", "province"),
      Subdivision("Emberá", "PA-EM", "indigenous region"),
      Subdivision("Guna Yala", "PA-KY", "indigenous region"),
      Subdivision("Herrera", "PA-6", "province"),
      Subdivision("Los Santos", "PA-7", "province"),
      Subdivision("Naso Tjër Di", "PA-NT", "indigenous region"),
      Subdivision("Ngöbe-Buglé", "PA-NB", "indigenous region"),
      Subdivision("Panamá", "PA-8", "province"),
      Subdivision("Panamá Oeste", "PA-10", "province"),
      Subdivision("Veraguas", "PA-9", "province")
    )
  }

  case object PE extends Country("Peru", "PE", "PER") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amarumayu", "PE-AMA", "region"),
      Subdivision("Ancash", "PE-ANC", "region"),
      Subdivision("Apurimaq", "PE-APU", "region"),
      Subdivision("Arequipa", "PE-ARE", "region"),
      Subdivision("Ayacucho", "PE-AYA", "region"),
      Subdivision("Cajamarca", "PE-CAJ", "region"),
      Subdivision("Cusco", "PE-CUS", "region"),
      Subdivision("El Callao", "PE-CAL", "region"),
      Subdivision("Huancavelica", "PE-HUV", "region"),
      Subdivision("Hunin", "PE-JUN", "region"),
      Subdivision("Huánuco", "PE-HUC", "region"),
      Subdivision("Ica", "PE-ICA", "region"),
      Subdivision("La Libertad", "PE-LAL", "region"),
      Subdivision("Lambayeque", "PE-LAM", "region"),
      Subdivision("Lima", "PE-LIM", "region"),
      Subdivision("Lima hatun llaqta", "PE-LMA", "municipality"),
      Subdivision("Loreto", "PE-LOR", "region"),
      Subdivision("Madre de Dios", "PE-MDD", "region"),
      Subdivision("Moquegua", "PE-MOQ", "region"),
      Subdivision("Pasco", "PE-PAS", "region"),
      Subdivision("Piura", "PE-PIU", "region"),
      Subdivision("Puno", "PE-PUN", "region"),
      Subdivision("San Martin", "PE-SAM", "region"),
      Subdivision("Tacna", "PE-TAC", "region"),
      Subdivision("Tumbes", "PE-TUM", "region"),
      Subdivision("Ucayali", "PE-UCA", "region")
    )
  }

  case object PF extends Country("French Polynesia", "PF", "PYF")

  case object PG extends Country("Papua New Guinea", "PG", "PNG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bougainville", "PG-NSB", "autonomous region"),
      Subdivision("Central", "PG-CPM", "province"),
      Subdivision("Chimbu", "PG-CPK", "province"),
      Subdivision("East New Britain", "PG-EBR", "province"),
      Subdivision("East Sepik", "PG-ESW", "province"),
      Subdivision("Eastern Highlands", "PG-EHG", "province"),
      Subdivision("Enga", "PG-EPW", "province"),
      Subdivision("Gulf", "PG-GPK", "province"),
      Subdivision("Hela", "PG-HLA", "province"),
      Subdivision("Jiwaka", "PG-JWK", "province"),
      Subdivision("Madang", "PG-MPM", "province"),
      Subdivision("Manus", "PG-MRL", "province"),
      Subdivision("Milne Bay", "PG-MBA", "province"),
      Subdivision("Morobe", "PG-MPL", "province"),
      Subdivision("National Capital District", "PG-NCD", "district"),
      Subdivision("New Ireland", "PG-NIK", "province"),
      Subdivision("Northern", "PG-NPP", "province"),
      Subdivision("Southern Highlands", "PG-SHM", "province"),
      Subdivision("West New Britain", "PG-WBK", "province"),
      Subdivision("West Sepik", "PG-SAN", "province"),
      Subdivision("Western", "PG-WPD", "province"),
      Subdivision("Western Highlands", "PG-WHM", "province")
    )
  }

  case object PH extends Country("Philippines (the)", "PH", "PHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abra", "PH-ABR", "province"),
      Subdivision("Agusan del Norte", "PH-AGN", "province"),
      Subdivision("Agusan del Sur", "PH-AGS", "province"),
      Subdivision("Aklan", "PH-AKL", "province"),
      Subdivision("Albay", "PH-ALB", "province"),
      Subdivision("Antike", "PH-ANT", "province"),
      Subdivision("Apayao", "PH-APA", "province"),
      Subdivision("Aurora", "PH-AUR", "province"),
      Subdivision("Autonomous Region in Muslim Mindanao", "PH-14", "region"),
      Subdivision("Basilan", "PH-BAS", "province"),
      Subdivision("Bataan", "PH-BAN", "province"),
      Subdivision("Batanes", "PH-BTN", "province"),
      Subdivision("Batangas", "PH-BTG", "province"),
      Subdivision("Benget", "PH-BEN", "province"),
      Subdivision("Bicol", "PH-05", "region"),
      Subdivision("Biliran", "PH-BIL", "province"),
      Subdivision("Bohol", "PH-BOH", "province"),
      Subdivision("Bukidnon", "PH-BUK", "province"),
      Subdivision("Bulacan", "PH-BUL", "province"),
      Subdivision("Cagayan", "PH-CAG", "province"),
      Subdivision("Cagayan Valley", "PH-02", "region"),
      Subdivision("Calabarzon", "PH-40", "region"),
      Subdivision("Camarines Norte", "PH-CAN", "province"),
      Subdivision("Camarines Sur", "PH-CAS", "province"),
      Subdivision("Camiguin", "PH-CAM", "province"),
      Subdivision("Capiz", "PH-CAP", "province"),
      Subdivision("Caraga", "PH-13", "region"),
      Subdivision("Catanduanes", "PH-CAT", "province"),
      Subdivision("Cavite", "PH-CAV", "province"),
      Subdivision("Cebu", "PH-CEB", "province"),
      Subdivision("Central Luzon", "PH-03", "region"),
      Subdivision("Central Visayas", "PH-07", "region"),
      Subdivision("Cordillera Administrative Region", "PH-15", "region"),
      Subdivision("Cotabato", "PH-NCO", "province"),
      Subdivision("Davao", "PH-11", "region"),
      Subdivision("Davao Occidental", "PH-DVO", "province"),
      Subdivision("Davao Oriental", "PH-DAO", "province"),
      Subdivision("Davao de Oro", "PH-COM", "province"),
      Subdivision("Davao del Norte", "PH-DAV", "province"),
      Subdivision("Davao del Sur", "PH-DAS", "province"),
      Subdivision("Dinagat Islands", "PH-DIN", "province"),
      Subdivision("Eastern Samar", "PH-EAS", "province"),
      Subdivision("Eastern Visayas", "PH-08", "region"),
      Subdivision("Gimaras", "PH-GUI", "province"),
      Subdivision("Hilagang Iloko", "PH-ILN", "province"),
      Subdivision("Hilagang Lanaw", "PH-LAN", "province"),
      Subdivision("Hilagang Samar", "PH-NSA", "province"),
      Subdivision("Hilagang Sambuwangga", "PH-ZAN", "province"),
      Subdivision("Hilagang Surigaw", "PH-SUN", "province"),
      Subdivision("Ifugao", "PH-IFU", "province"),
      Subdivision("Ilocos", "PH-01", "region"),
      Subdivision("Ilocos Sur", "PH-ILS", "province"),
      Subdivision("Iloilo", "PH-ILI", "province"),
      Subdivision("Isabela", "PH-ISA", "province"),
      Subdivision("Kalinga", "PH-KAL", "province"),
      Subdivision("Kanlurang Mindoro", "PH-MDC", "province"),
      Subdivision("Kanlurang Misamis", "PH-MSC", "province"),
      Subdivision("Kanlurang Negros", "PH-NEC", "province"),
      Subdivision("Katimogang Leyte", "PH-SLE", "province"),
      Subdivision("Keson", "PH-QUE", "province"),
      Subdivision("Kirino", "PH-QUI", "province"),
      Subdivision("La Union", "PH-LUN", "province"),
      Subdivision("Laguna", "PH-LAG", "province"),
      Subdivision("Lalawigang Bulubundukin", "PH-MOU", "province"),
      Subdivision("Lanao del Sur", "PH-LAS", "province"),
      Subdivision("Leyte", "PH-LEY", "province"),
      Subdivision("Magindanaw", "PH-MAG", "province"),
      Subdivision("Marinduke", "PH-MAD", "province"),
      Subdivision("Masbate", "PH-MAS", "province"),
      Subdivision("Mimaropa", "PH-41", "region"),
      Subdivision("Mindoro Oriental", "PH-MDR", "province"),
      Subdivision("Misamis Oriental", "PH-MSR", "province"),
      Subdivision("National Capital Region", "PH-00", "region"),
      Subdivision("Negros Oriental", "PH-NER", "province"),
      Subdivision("Northern Mindanao", "PH-10", "region"),
      Subdivision("Nueva Ecija", "PH-NUE", "province"),
      Subdivision("Nueva Vizcaya", "PH-NUV", "province"),
      Subdivision("Palawan", "PH-PLW", "province"),
      Subdivision("Pampanga", "PH-PAM", "province"),
      Subdivision("Pangasinan", "PH-PAN", "province"),
      Subdivision("Rehiyon ng Kanlurang Bisaya", "PH-06", "region"),
      Subdivision("Rehiyon ng Soccsksargen", "PH-12", "region"),
      Subdivision("Rehiyon ng Tangway ng Sambuwangga", "PH-09", "region"),
      Subdivision("Risal", "PH-RIZ", "province"),
      Subdivision("Romblon", "PH-ROM", "province"),
      Subdivision("Samar", "PH-WSA", "province"),
      Subdivision("Sambales", "PH-ZMB", "province"),
      Subdivision("Sambuwangga Sibugay", "PH-ZSI", "province"),
      Subdivision("Sarangani", "PH-SAR", "province"),
      Subdivision("Sikihor", "PH-SIG", "province"),
      Subdivision("Sorsogon", "PH-SOR", "province"),
      Subdivision("South Cotabato", "PH-SCO", "province"),
      Subdivision("Sultan Kudarat", "PH-SUK", "province"),
      Subdivision("Sulu", "PH-SLU", "province"),
      Subdivision("Surigao del Sur", "PH-SUR", "province"),
      Subdivision("Tarlac", "PH-TAR", "province"),
      Subdivision("Tawi-Tawi", "PH-TAW", "province"),
      Subdivision("Timog Sambuwangga", "PH-ZAS", "province")
    )
  }

  case object PK extends Country("Pakistan", "PK", "PAK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azad Jammu and Kashmir", "PK-JK", "Pakistan administered area"),
      Subdivision("Balochistan", "PK-BA", "province"),
      Subdivision("Gilgit-Baltistan", "PK-GB", "Pakistan administered area"),
      Subdivision("Islamabad", "PK-IS", "federal capital territory"),
      Subdivision("Khaībar Pakhtūnkhwā", "PK-KP", "province"),
      Subdivision("Panjāb", "PK-PB", "province"),
      Subdivision("Sindh", "PK-SD", "province")
    )
  }

  case object PL extends Country("Poland", "PL", "POL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dolnośląskie", "PL-02", "voivodship"),
      Subdivision("Kujawsko-pomorskie", "PL-04", "voivodship"),
      Subdivision("Lubelskie", "PL-06", "voivodship"),
      Subdivision("Lubuskie", "PL-08", "voivodship"),
      Subdivision("Mazowieckie", "PL-14", "voivodship"),
      Subdivision("Małopolskie", "PL-12", "voivodship"),
      Subdivision("Opolskie", "PL-16", "voivodship"),
      Subdivision("Podkarpackie", "PL-18", "voivodship"),
      Subdivision("Podlaskie", "PL-20", "voivodship"),
      Subdivision("Pomorskie", "PL-22", "voivodship"),
      Subdivision("Warmińsko-mazurskie", "PL-28", "voivodship"),
      Subdivision("Wielkopolskie", "PL-30", "voivodship"),
      Subdivision("Zachodniopomorskie", "PL-32", "voivodship"),
      Subdivision("Łódzkie", "PL-10", "voivodship"),
      Subdivision("Śląskie", "PL-24", "voivodship"),
      Subdivision("Świętokrzyskie", "PL-26", "voivodship")
    )
  }

  case object PM extends Country("Saint Pierre and Miquelon", "PM", "SPM")

  case object PN extends Country("Pitcairn", "PN", "PCN")

  case object PR extends Country("Puerto Rico", "PR", "PRI")

  case object PS extends Country("Palestine, State of", "PS", "PSE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Khalīl", "PS-HBN", "governorate"),
      Subdivision("Al Quds", "PS-JEM", "governorate"),
      Subdivision("Arīḩā wal Aghwār", "PS-JRH", "governorate"),
      Subdivision("Bayt Laḩm", "PS-BTH", "governorate"),
      Subdivision("Dayr al Balaḩ", "PS-DEB", "governorate"),
      Subdivision("Gaza", "PS-GZA", "governorate"),
      Subdivision("Janīn", "PS-JEN", "governorate"),
      Subdivision("Khan Yunis", "PS-KYS", "governorate"),
      Subdivision("Nablus", "PS-NBS", "governorate"),
      Subdivision("North Gaza", "PS-NGZ", "governorate"),
      Subdivision("Qalqilya", "PS-QQA", "governorate"),
      Subdivision("Rafah", "PS-RFH", "governorate"),
      Subdivision("Ramallah", "PS-RBH", "governorate"),
      Subdivision("Salfit", "PS-SLT", "governorate"),
      Subdivision("Tubas", "PS-TBS", "governorate"),
      Subdivision("Tulkarm", "PS-TKM", "governorate")
    )
  }

  case object PT extends Country("Portugal", "PT", "PRT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aveiro", "PT-01", "district"),
      Subdivision("Beja", "PT-02", "district"),
      Subdivision("Braga", "PT-03", "district"),
      Subdivision("Bragança", "PT-04", "district"),
      Subdivision("Castelo Branco", "PT-05", "district"),
      Subdivision("Coimbra", "PT-06", "district"),
      Subdivision("Faro", "PT-08", "district"),
      Subdivision("Guarda", "PT-09", "district"),
      Subdivision("Leiria", "PT-10", "district"),
      Subdivision("Lisboa", "PT-11", "district"),
      Subdivision("Portalegre", "PT-12", "district"),
      Subdivision("Porto", "PT-13", "district"),
      Subdivision("Região Autónoma da Madeira", "PT-30", "autonomous region"),
      Subdivision("Região Autónoma dos Açores", "PT-20", "autonomous region"),
      Subdivision("Santarém", "PT-14", "district"),
      Subdivision("Setúbal", "PT-15", "district"),
      Subdivision("Viana do Castelo", "PT-16", "district"),
      Subdivision("Vila Real", "PT-17", "district"),
      Subdivision("Viseu", "PT-18", "district"),
      Subdivision("Évora", "PT-07", "district")
    )
  }

  case object PW extends Country("Palau", "PW", "PLW") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aimeliik", "PW-002", "state"),
      Subdivision("Airai", "PW-004", "state"),
      Subdivision("Angaur", "PW-010", "state"),
      Subdivision("Hatohobei", "PW-050", "state"),
      Subdivision("Kayangel", "PW-100", "state"),
      Subdivision("Koror", "PW-150", "state"),
      Subdivision("Melekeok", "PW-212", "state"),
      Subdivision("Ngaraard", "PW-214", "state"),
      Subdivision("Ngarchelong", "PW-218", "state"),
      Subdivision("Ngardmau", "PW-222", "state"),
      Subdivision("Ngatpang", "PW-224", "state"),
      Subdivision("Ngchesar", "PW-226", "state"),
      Subdivision("Ngeremlengui", "PW-227", "state"),
      Subdivision("Ngiwal", "PW-228", "state"),
      Subdivision("Peleliu", "PW-350", "state"),
      Subdivision("Sonsorol", "PW-370", "state")
    )
  }

  case object PY extends Country("Paraguay", "PY", "PRY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alto Paraguay", "PY-16", "department"),
      Subdivision("Alto Paraná", "PY-10", "department"),
      Subdivision("Amambay", "PY-13", "department"),
      Subdivision("Asunción", "PY-ASU", "capital"),
      Subdivision("Boquerón", "PY-19", "department"),
      Subdivision("Caaguazú", "PY-5", "department"),
      Subdivision("Caazapá", "PY-6", "department"),
      Subdivision("Canindeyú", "PY-14", "department"),
      Subdivision("Central", "PY-11", "department"),
      Subdivision("Concepción", "PY-1", "department"),
      Subdivision("Cordillera", "PY-3", "department"),
      Subdivision("Guairá", "PY-4", "department"),
      Subdivision("Itapúa", "PY-7", "department"),
      Subdivision("Misiones", "PY-8", "department"),
      Subdivision("Paraguarí", "PY-9", "department"),
      Subdivision("Presidente Hayes", "PY-15", "department"),
      Subdivision("San Pedro", "PY-2", "department"),
      Subdivision("Ñeembucú", "PY-12", "department")
    )
  }

  case object QA extends Country("Qatar", "QA", "QAT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Dawḩah", "QA-DA", "municipality"),
      Subdivision("Al Khawr wa adh Dhakhīrah", "QA-KH", "municipality"),
      Subdivision("Al Wakrah", "QA-WA", "municipality"),
      Subdivision("Ar Rayyān", "QA-RA", "municipality"),
      Subdivision("Ash Shamāl", "QA-MS", "municipality"),
      Subdivision("Ash Shīḩānīyah", "QA-SH", "municipality"),
      Subdivision("Az̧ Z̧a‘āyin", "QA-ZA", "municipality"),
      Subdivision("Umm Şalāl", "QA-US", "municipality")
    )
  }

  case object RE extends Country("Réunion", "RE", "REU")

  case object RO extends Country("Romania", "RO", "ROU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alba", "RO-AB", "department"),
      Subdivision("Arad", "RO-AR", "department"),
      Subdivision("Argeș", "RO-AG", "department"),
      Subdivision("Bacău", "RO-BC", "department"),
      Subdivision("Bihor", "RO-BH", "department"),
      Subdivision("Bistrița-Năsăud", "RO-BN", "department"),
      Subdivision("Botoșani", "RO-BT", "department"),
      Subdivision("Brașov", "RO-BV", "department"),
      Subdivision("Brăila", "RO-BR", "department"),
      Subdivision("București", "RO-B", "municipality"),
      Subdivision("Buzău", "RO-BZ", "department"),
      Subdivision("Caraș-Severin", "RO-CS", "department"),
      Subdivision("Cluj", "RO-CJ", "department"),
      Subdivision("Constanța", "RO-CT", "department"),
      Subdivision("Covasna", "RO-CV", "department"),
      Subdivision("Călărași", "RO-CL", "department"),
      Subdivision("Dolj", "RO-DJ", "department"),
      Subdivision("Dâmbovița", "RO-DB", "department"),
      Subdivision("Galați", "RO-GL", "department"),
      Subdivision("Giurgiu", "RO-GR", "department"),
      Subdivision("Gorj", "RO-GJ", "department"),
      Subdivision("Harghita", "RO-HR", "department"),
      Subdivision("Hunedoara", "RO-HD", "department"),
      Subdivision("Ialomița", "RO-IL", "department"),
      Subdivision("Iași", "RO-IS", "department"),
      Subdivision("Ilfov", "RO-IF", "department"),
      Subdivision("Maramureș", "RO-MM", "department"),
      Subdivision("Mehedinți", "RO-MH", "department"),
      Subdivision("Mureș", "RO-MS", "department"),
      Subdivision("Neamț", "RO-NT", "department"),
      Subdivision("Olt", "RO-OT", "department"),
      Subdivision("Prahova", "RO-PH", "department"),
      Subdivision("Satu Mare", "RO-SM", "department"),
      Subdivision("Sibiu", "RO-SB", "department"),
      Subdivision("Suceava", "RO-SV", "department"),
      Subdivision("Sălaj", "RO-SJ", "department"),
      Subdivision("Teleorman", "RO-TR", "department"),
      Subdivision("Timiș", "RO-TM", "department"),
      Subdivision("Tulcea", "RO-TL", "department"),
      Subdivision("Vaslui", "RO-VS", "department"),
      Subdivision("Vrancea", "RO-VN", "department"),
      Subdivision("Vâlcea", "RO-VL", "department")
    )
  }

  case object RS extends Country("Serbia", "RS", "SRB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Beograd", "RS-00", "city"),
      Subdivision("Borski okrug", "RS-14", "district"),
      Subdivision("Braničevski okrug", "RS-11", "district"),
      Subdivision("Jablanički okrug", "RS-23", "district"),
      Subdivision("Južnobanatski okrug", "RS-04", "district"),
      Subdivision("Južnobački okrug", "RS-06", "district"),
      Subdivision("Kolubarski okrug", "RS-09", "district"),
      Subdivision("Kosovo-Metohija", "RS-KM", "autonomous province"),
      Subdivision("Kosovski okrug", "RS-25", "district"),
      Subdivision("Kosovsko-Mitrovački okrug", "RS-28", "district"),
      Subdivision("Kosovsko-Pomoravski okrug", "RS-29", "district"),
      Subdivision("Mačvanski okrug", "RS-08", "district"),
      Subdivision("Moravički okrug", "RS-17", "district"),
      Subdivision("Nišavski okrug", "RS-20", "district"),
      Subdivision("Pećki okrug", "RS-26", "district"),
      Subdivision("Pirotski okrug", "RS-22", "district"),
      Subdivision("Podunavski okrug", "RS-10", "district"),
      Subdivision("Pomoravski okrug", "RS-13", "district"),
      Subdivision("Prizrenski okrug", "RS-27", "district"),
      Subdivision("Pčinjski okrug", "RS-24", "district"),
      Subdivision("Rasinski okrug", "RS-19", "district"),
      Subdivision("Raški okrug", "RS-18", "district"),
      Subdivision("Severnobanatski okrug", "RS-03", "district"),
      Subdivision("Severnobački okrug", "RS-01", "district"),
      Subdivision("Srednjebanatski okrug", "RS-02", "district"),
      Subdivision("Sremski okrug", "RS-07", "district"),
      Subdivision("Toplički okrug", "RS-21", "district"),
      Subdivision("Vojvodina", "RS-VO", "autonomous province"),
      Subdivision("Zaječarski okrug", "RS-15", "district"),
      Subdivision("Zapadnobački okrug", "RS-05", "district"),
      Subdivision("Zlatiborski okrug", "RS-16", "district"),
      Subdivision("Šumadijski okrug", "RS-12", "district")
    )
  }

  case object RU extends Country("Russian Federation (the)", "RU", "RUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adygeja, Respublika", "RU-AD", "republic"),
      Subdivision("Altaj, Respublika", "RU-AL", "republic"),
      Subdivision("Altajskij kraj", "RU-ALT", "administrative territory"),
      Subdivision("Amurskaja oblast'", "RU-AMU", "administrative region"),
      Subdivision("Arhangel'skaja oblast'", "RU-ARK", "administrative region"),
      Subdivision("Astrahanskaja oblast'", "RU-AST", "administrative region"),
      Subdivision("Bashkortostan, Respublika", "RU-BA", "republic"),
      Subdivision("Belgorodskaja oblast'", "RU-BEL", "administrative region"),
      Subdivision("Brjanskaja oblast'", "RU-BRY", "administrative region"),
      Subdivision("Burjatija, Respublika", "RU-BU", "republic"),
      Subdivision("Chechenskaya Respublika", "RU-CE", "republic"),
      Subdivision("Chelyabinskaya oblast'", "RU-CHE", "administrative region"),
      Subdivision("Chukotskiy avtonomnyy okrug", "RU-CHU", "autonomous district"),
      Subdivision("Chuvashskaya Respublika", "RU-CU", "republic"),
      Subdivision("Dagestan, Respublika", "RU-DA", "republic"),
      Subdivision("Evrejskaja avtonomnaja oblast'", "RU-YEV", "autonomous region"),
      Subdivision("Habarovskij kraj", "RU-KHA", "administrative territory"),
      Subdivision("Hakasija, Respublika", "RU-KK", "republic"),
      Subdivision("Hanty-Mansijskij avtonomnyj okrug", "RU-KHM", "autonomous district"),
      Subdivision("Ingushetiya, Respublika", "RU-IN", "republic"),
      Subdivision("Irkutskaja oblast'", "RU-IRK", "administrative region"),
      Subdivision("Ivanovskaja oblast'", "RU-IVA", "administrative region"),
      Subdivision("Jamalo-Neneckij avtonomnyj okrug", "RU-YAN", "autonomous district"),
      Subdivision("Jaroslavskaja oblast'", "RU-YAR", "administrative region"),
      Subdivision("Kabardino-Balkarskaja Respublika", "RU-KB", "republic"),
      Subdivision("Kaliningradskaja oblast'", "RU-KGD", "administrative region"),
      Subdivision("Kalmykija, Respublika", "RU-KL", "republic"),
      Subdivision("Kaluzhskaya oblast'", "RU-KLU", "administrative region"),
      Subdivision("Kamchatskiy kray", "RU-KAM", "administrative territory"),
      Subdivision("Karachayevo-Cherkesskaya Respublika", "RU-KC", "republic"),
      Subdivision("Karelija, Respublika", "RU-KR", "republic"),
      Subdivision("Kemerovskaja oblast'", "RU-KEM", "administrative region"),
      Subdivision("Kirovskaja oblast'", "RU-KIR", "administrative region"),
      Subdivision("Komi, Respublika", "RU-KO", "republic"),
      Subdivision("Kostromskaja oblast'", "RU-KOS", "administrative region"),
      Subdivision("Krasnodarskij kraj", "RU-KDA", "administrative territory"),
      Subdivision("Krasnojarskij kraj", "RU-KYA", "administrative territory"),
      Subdivision("Kurganskaja oblast'", "RU-KGN", "administrative region"),
      Subdivision("Kurskaja oblast'", "RU-KRS", "administrative region"),
      Subdivision("Leningradskaja oblast'", "RU-LEN", "administrative region"),
      Subdivision("Lipeckaja oblast'", "RU-LIP", "administrative region"),
      Subdivision("Magadanskaja oblast'", "RU-MAG", "administrative region"),
      Subdivision("Marij Èl, Respublika", "RU-ME", "republic"),
      Subdivision("Mordovija, Respublika", "RU-MO", "republic"),
      Subdivision("Moskovskaja oblast'", "RU-MOS", "administrative region"),
      Subdivision("Moskva", "RU-MOW", "autonomous city"),
      Subdivision("Murmanskaja oblast'", "RU-MUR", "administrative region"),
      Subdivision("Neneckij avtonomnyj okrug", "RU-NEN", "autonomous district"),
      Subdivision("Nizhegorodskaya oblast'", "RU-NIZ", "administrative region"),
      Subdivision("Novgorodskaja oblast'", "RU-NGR", "administrative region"),
      Subdivision("Novosibirskaja oblast'", "RU-NVS", "administrative region"),
      Subdivision("Omskaja oblast'", "RU-OMS", "administrative region"),
      Subdivision("Orenburgskaja oblast'", "RU-ORE", "administrative region"),
      Subdivision("Orlovskaja oblast'", "RU-ORL", "administrative region"),
      Subdivision("Penzenskaja oblast'", "RU-PNZ", "administrative region"),
      Subdivision("Permskij kraj", "RU-PER", "administrative territory"),
      Subdivision("Primorskij kraj", "RU-PRI", "administrative territory"),
      Subdivision("Pskovskaja oblast'", "RU-PSK", "administrative region"),
      Subdivision("Rjazanskaja oblast'", "RU-RYA", "administrative region"),
      Subdivision("Rostovskaja oblast'", "RU-ROS", "administrative region"),
      Subdivision("Saha, Respublika", "RU-SA", "republic"),
      Subdivision("Sahalinskaja oblast'", "RU-SAK", "administrative region"),
      Subdivision("Samarskaja oblast'", "RU-SAM", "administrative region"),
      Subdivision("Sankt-Peterburg", "RU-SPE", "autonomous city"),
      Subdivision("Saratovskaja oblast'", "RU-SAR", "administrative region"),
      Subdivision("Severnaja Osetija, Respublika", "RU-SE", "republic"),
      Subdivision("Smolenskaja oblast'", "RU-SMO", "administrative region"),
      Subdivision("Stavropol'skij kraj", "RU-STA", "administrative territory"),
      Subdivision("Sverdlovskaja oblast'", "RU-SVE", "administrative region"),
      Subdivision("Tambovskaja oblast'", "RU-TAM", "administrative region"),
      Subdivision("Tatarstan, Respublika", "RU-TA", "republic"),
      Subdivision("Tjumenskaja oblast'", "RU-TYU", "administrative region"),
      Subdivision("Tomskaja oblast'", "RU-TOM", "administrative region"),
      Subdivision("Tul'skaja oblast'", "RU-TUL", "administrative region"),
      Subdivision("Tverskaja oblast'", "RU-TVE", "administrative region"),
      Subdivision("Tyva, Respublika", "RU-TY", "republic"),
      Subdivision("Udmurtskaja Respublika", "RU-UD", "republic"),
      Subdivision("Ul'janovskaja oblast'", "RU-ULY", "administrative region"),
      Subdivision("Vladimirskaja oblast'", "RU-VLA", "administrative region"),
      Subdivision("Volgogradskaja oblast'", "RU-VGG", "administrative region"),
      Subdivision("Vologodskaja oblast'", "RU-VLG", "administrative region"),
      Subdivision("Voronezhskaya oblast'", "RU-VOR", "administrative region"),
      Subdivision("Zabajkal'skij kraj", "RU-ZAB", "administrative territory")
    )
  }

  case object RW extends Country("Rwanda", "RW", "RWA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amajyaruguru", "RW-03", "province"),
      Subdivision("Amajyepfo", "RW-05", "province"),
      Subdivision("City of Kigali", "RW-01", "city"),
      Subdivision("Eastern", "RW-02", "province"),
      Subdivision("Iburengerazuba", "RW-04", "province")
    )
  }

  case object SA extends Country("Saudi Arabia", "SA", "SAU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("'Asīr", "SA-14", "region"),
      Subdivision("Al Bāḩah", "SA-11", "region"),
      Subdivision("Al Jawf", "SA-12", "region"),
      Subdivision("Al Madīnah al Munawwarah", "SA-03", "region"),
      Subdivision("Al Qaşīm", "SA-05", "region"),
      Subdivision("Al Ḩudūd ash Shamālīyah", "SA-08", "region"),
      Subdivision("Ar Riyāḑ", "SA-01", "region"),
      Subdivision("Ash Sharqīyah", "SA-04", "region"),
      Subdivision("Jāzān", "SA-09", "region"),
      Subdivision("Makkah al Mukarramah", "SA-02", "region"),
      Subdivision("Najrān", "SA-10", "region"),
      Subdivision("Tabūk", "SA-07", "region"),
      Subdivision("Ḩā'il", "SA-06", "region")
    )
  }

  case object SB extends Country("Solomon Islands", "SB", "SLB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Capital Territory", "SB-CT", "capital territory"),
      Subdivision("Central", "SB-CE", "province"),
      Subdivision("Choiseul", "SB-CH", "province"),
      Subdivision("Guadalcanal", "SB-GU", "province"),
      Subdivision("Isabel", "SB-IS", "province"),
      Subdivision("Makira-Ulawa", "SB-MK", "province"),
      Subdivision("Malaita", "SB-ML", "province"),
      Subdivision("Rennell and Bellona", "SB-RB", "province"),
      Subdivision("Temotu", "SB-TE", "province"),
      Subdivision("Western", "SB-WE", "province")
    )
  }

  case object SC extends Country("Seychelles", "SC", "SYC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ans Bwalo", "SC-02", "district"),
      Subdivision("Ans Etwal", "SC-03", "district"),
      Subdivision("Ans Royal", "SC-05", "district"),
      Subdivision("Ans o Pen", "SC-01", "district"),
      Subdivision("Au Cap", "SC-04", "district"),
      Subdivision("Baie Lazare", "SC-06", "district"),
      Subdivision("Baie Sainte Anne", "SC-07", "district"),
      Subdivision("Beau Vallon", "SC-08", "district"),
      Subdivision("Bel Air", "SC-09", "district"),
      Subdivision("Bel Ombre", "SC-10", "district"),
      Subdivision("Cascade", "SC-11", "district"),
      Subdivision("English River", "SC-16", "district"),
      Subdivision("Glacis", "SC-12", "district"),
      Subdivision("Grand Ans Mae", "SC-13", "district"),
      Subdivision("Grand Ans Pralen", "SC-14", "district"),
      Subdivision("Ile Perseverance I", "SC-26", "district"),
      Subdivision("Ile Perseverance II", "SC-27", "district"),
      Subdivision("La Digue", "SC-15", "district"),
      Subdivision("Lemamel", "SC-24", "district"),
      Subdivision("Mon Bikston", "SC-17", "district"),
      Subdivision("Mon Fleri", "SC-18", "district"),
      Subdivision("Plaisance", "SC-19", "district"),
      Subdivision("Pointe La Rue", "SC-20", "district"),
      Subdivision("Porglo", "SC-21", "district"),
      Subdivision("Roche Caiman", "SC-25", "district"),
      Subdivision("Saint Louis", "SC-22", "district"),
      Subdivision("Takamaka", "SC-23", "district")
    )
  }

  case object SD extends Country("Sudan (the)", "SD", "SDN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Baḩr al Aḩmar", "SD-RS", "state"),
      Subdivision("Al Jazīrah", "SD-GZ", "state"),
      Subdivision("Al Kharţūm", "SD-KH", "state"),
      Subdivision("Al Qaḑārif", "SD-GD", "state"),
      Subdivision("An Nīl al Abyaḑ", "SD-NW", "state"),
      Subdivision("An Nīl al Azraq", "SD-NB", "state"),
      Subdivision("Ash Shamālīyah", "SD-NO", "state"),
      Subdivision("Central Darfur", "SD-DC", "state"),
      Subdivision("East Darfur", "SD-DE", "state"),
      Subdivision("Gharb Dārfūr", "SD-DW", "state"),
      Subdivision("Gharb Kurdufān", "SD-GK", "state"),
      Subdivision("Janūb Dārfūr", "SD-DS", "state"),
      Subdivision("Janūb Kurdufān", "SD-KS", "state"),
      Subdivision("Kassala", "SD-KA", "state"),
      Subdivision("Nahr an Nīl", "SD-NR", "state"),
      Subdivision("North Darfur", "SD-DN", "state"),
      Subdivision("North Kordofan", "SD-KN", "state"),
      Subdivision("Sennar", "SD-SI", "state")
    )
  }

  case object SE extends Country("Sweden", "SE", "SWE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Blekinge län", "SE-K", "county"),
      Subdivision("Dalarnas län", "SE-W", "county"),
      Subdivision("Gotlands län", "SE-I", "county"),
      Subdivision("Gävleborgs län", "SE-X", "county"),
      Subdivision("Hallands län", "SE-N", "county"),
      Subdivision("Jämtlands län", "SE-Z", "county"),
      Subdivision("Jönköpings län", "SE-F", "county"),
      Subdivision("Kalmar län", "SE-H", "county"),
      Subdivision("Kronobergs län", "SE-G", "county"),
      Subdivision("Norrbottens län", "SE-BD", "county"),
      Subdivision("Skåne län", "SE-M", "county"),
      Subdivision("Stockholms län", "SE-AB", "county"),
      Subdivision("Södermanlands län", "SE-D", "county"),
      Subdivision("Uppsala län", "SE-C", "county"),
      Subdivision("Värmlands län", "SE-S", "county"),
      Subdivision("Västerbottens län", "SE-AC", "county"),
      Subdivision("Västernorrlands län", "SE-Y", "county"),
      Subdivision("Västmanlands län", "SE-U", "county"),
      Subdivision("Västra Götalands län", "SE-O", "county"),
      Subdivision("Örebro län", "SE-T", "county"),
      Subdivision("Östergötlands län", "SE-E", "county")
    )
  }

  case object SG extends Country("Singapore", "SG", "SGP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central Singapore", "SG-01", "district"),
      Subdivision("North East", "SG-02", "district"),
      Subdivision("North West", "SG-03", "district"),
      Subdivision("South East", "SG-04", "district"),
      Subdivision("South West", "SG-05", "district")
    )
  }

  case object SH extends Country("Saint Helena, Ascension and Tristan da Cunha", "SH", "SHN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ascension", "SH-AC", "geographical entity"),
      Subdivision("Saint Helena", "SH-HL", "geographical entity"),
      Subdivision("Tristan da Cunha", "SH-TA", "geographical entity")
    )
  }

  case object SI extends Country("Slovenia", "SI", "SVN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ajdovščina", "SI-001", "municipality"),
      Subdivision("Ankaran", "SI-213", "municipality"),
      Subdivision("Apače", "SI-195", "municipality"),
      Subdivision("Beltinci", "SI-002", "municipality"),
      Subdivision("Benedikt", "SI-148", "municipality"),
      Subdivision("Bistrica ob Sotli", "SI-149", "municipality"),
      Subdivision("Bled", "SI-003", "municipality"),
      Subdivision("Bloke", "SI-150", "municipality"),
      Subdivision("Bohinj", "SI-004", "municipality"),
      Subdivision("Borovnica", "SI-005", "municipality"),
      Subdivision("Bovec", "SI-006", "municipality"),
      Subdivision("Braslovče", "SI-151", "municipality"),
      Subdivision("Brda", "SI-007", "municipality"),
      Subdivision("Brezovica", "SI-008", "municipality"),
      Subdivision("Brežice", "SI-009", "municipality"),
      Subdivision("Cankova", "SI-152", "municipality"),
      Subdivision("Celje", "SI-011", "municipality"),
      Subdivision("Cerklje na Gorenjskem", "SI-012", "municipality"),
      Subdivision("Cerknica", "SI-013", "municipality"),
      Subdivision("Cerkno", "SI-014", "municipality"),
      Subdivision("Cerkvenjak", "SI-153", "municipality"),
      Subdivision("Cirkulane", "SI-196", "municipality"),
      Subdivision("Destrnik", "SI-018", "municipality"),
      Subdivision("Divača", "SI-019", "municipality"),
      Subdivision("Dobje", "SI-154", "municipality"),
      Subdivision("Dobrepolje", "SI-020", "municipality"),
      Subdivision("Dobrna", "SI-155", "municipality"),
      Subdivision("Dobrova-Polhov Gradec", "SI-021", "municipality"),
      Subdivision("Dobrovnik", "SI-156", "municipality"),
      Subdivision("Dol pri Ljubljani", "SI-022", "municipality"),
      Subdivision("Dolenjske Toplice", "SI-157", "municipality"),
      Subdivision("Domžale", "SI-023", "municipality"),
      Subdivision("Dornava", "SI-024", "municipality"),
      Subdivision("Dravograd", "SI-025", "municipality"),
      Subdivision("Duplek", "SI-026", "municipality"),
      Subdivision("Gorenja vas-Poljane", "SI-027", "municipality"),
      Subdivision("Gorišnica", "SI-028", "municipality"),
      Subdivision("Gorje", "SI-207", "municipality"),
      Subdivision("Gornja Radgona", "SI-029", "municipality"),
      Subdivision("Gornji Grad", "SI-030", "municipality"),
      Subdivision("Gornji Petrovci", "SI-031", "municipality"),
      Subdivision("Grad", "SI-158", "municipality"),
      Subdivision("Grosuplje", "SI-032", "municipality"),
      Subdivision("Hajdina", "SI-159", "municipality"),
      Subdivision("Hodoš", "SI-161", "municipality"),
      Subdivision("Horjul", "SI-162", "municipality"),
      Subdivision("Hoče-Slivnica", "SI-160", "municipality"),
      Subdivision("Hrastnik", "SI-034", "municipality"),
      Subdivision("Hrpelje-Kozina", "SI-035", "municipality"),
      Subdivision("Idrija", "SI-036", "municipality"),
      Subdivision("Ig", "SI-037", "municipality"),
      Subdivision("Ilirska Bistrica", "SI-038", "municipality"),
      Subdivision("Ivančna Gorica", "SI-039", "municipality"),
      Subdivision("Izola", "SI-040", "municipality"),
      Subdivision("Jesenice", "SI-041", "municipality"),
      Subdivision("Jezersko", "SI-163", "municipality"),
      Subdivision("Juršinci", "SI-042", "municipality"),
      Subdivision("Kamnik", "SI-043", "municipality"),
      Subdivision("Kanal", "SI-044", "municipality"),
      Subdivision("Kidričevo", "SI-045", "municipality"),
      Subdivision("Kobarid", "SI-046", "municipality"),
      Subdivision("Kobilje", "SI-047", "municipality"),
      Subdivision("Komen", "SI-049", "municipality"),
      Subdivision("Komenda", "SI-164", "municipality"),
      Subdivision("Koper", "SI-050", "municipality"),
      Subdivision("Kosanjevica na Krki", "SI-197", "municipality"),
      Subdivision("Kostel", "SI-165", "municipality"),
      Subdivision("Kozje", "SI-051", "municipality"),
      Subdivision("Kočevje", "SI-048", "municipality"),
      Subdivision("Kranj", "SI-052", "municipality"),
      Subdivision("Kranjska Gora", "SI-053", "municipality"),
      Subdivision("Križevci", "SI-166", "municipality"),
      Subdivision("Krško", "SI-054", "municipality"),
      Subdivision("Kungota", "SI-055", "municipality"),
      Subdivision("Kuzma", "SI-056", "municipality"),
      Subdivision("Laško", "SI-057", "municipality"),
      Subdivision("Lenart", "SI-058", "municipality"),
      Subdivision("Lendava", "SI-059", "municipality"),
      Subdivision("Litija", "SI-060", "municipality"),
      Subdivision("Ljubljana", "SI-061", "municipality"),
      Subdivision("Ljubno", "SI-062", "municipality"),
      Subdivision("Ljutomer", "SI-063", "municipality"),
      Subdivision("Log-Dragomer", "SI-208", "municipality"),
      Subdivision("Logatec", "SI-064", "municipality"),
      Subdivision("Lovrenc na Pohorju", "SI-167", "municipality"),
      Subdivision("Loška dolina", "SI-065", "municipality"),
      Subdivision("Loški Potok", "SI-066", "municipality"),
      Subdivision("Lukovica", "SI-068", "municipality"),
      Subdivision("Luče", "SI-067", "municipality"),
      Subdivision("Majšperk", "SI-069", "municipality"),
      Subdivision("Makole", "SI-198", "municipality"),
      Subdivision("Maribor", "SI-070", "municipality"),
      Subdivision("Markovci", "SI-168", "municipality"),
      Subdivision("Medvode", "SI-071", "municipality"),
      Subdivision("Mengeš", "SI-072", "municipality"),
      Subdivision("Metlika", "SI-073", "municipality"),
      Subdivision("Mežica", "SI-074", "municipality"),
      Subdivision("Miklavž na Dravskem polju", "SI-169", "municipality"),
      Subdivision("Miren-Kostanjevica", "SI-075", "municipality"),
      Subdivision("Mirna", "SI-212", "municipality"),
      Subdivision("Mirna Peč", "SI-170", "municipality"),
      Subdivision("Mislinja", "SI-076", "municipality"),
      Subdivision("Mokronog-Trebelno", "SI-199", "municipality"),
      Subdivision("Moravske Toplice", "SI-078", "municipality"),
      Subdivision("Moravče", "SI-077", "municipality"),
      Subdivision("Mozirje", "SI-079", "municipality"),
      Subdivision("Murska Sobota", "SI-080", "municipality"),
      Subdivision("Muta", "SI-081", "municipality"),
      Subdivision("Naklo", "SI-082", "municipality"),
      Subdivision("Nazarje", "SI-083", "municipality"),
      Subdivision("Nova Gorica", "SI-084", "municipality"),
      Subdivision("Novo Mesto", "SI-085", "municipality"),
      Subdivision("Odranci", "SI-086", "municipality"),
      Subdivision("Oplotnica", "SI-171", "municipality"),
      Subdivision("Ormož", "SI-087", "municipality"),
      Subdivision("Osilnica", "SI-088", "municipality"),
      Subdivision("Pesnica", "SI-089", "municipality"),
      Subdivision("Piran", "SI-090", "municipality"),
      Subdivision("Pivka", "SI-091", "municipality"),
      Subdivision("Podlehnik", "SI-172", "municipality"),
      Subdivision("Podvelka", "SI-093", "municipality"),
      Subdivision("Podčetrtek", "SI-092", "municipality"),
      Subdivision("Poljčane", "SI-200", "municipality"),
      Subdivision("Polzela", "SI-173", "municipality"),
      Subdivision("Postojna", "SI-094", "municipality"),
      Subdivision("Prebold", "SI-174", "municipality"),
      Subdivision("Preddvor", "SI-095", "municipality"),
      Subdivision("Prevalje", "SI-175", "municipality"),
      Subdivision("Ptuj", "SI-096", "municipality"),
      Subdivision("Puconci", "SI-097", "municipality"),
      Subdivision("Radenci", "SI-100", "municipality"),
      Subdivision("Radeče", "SI-099", "municipality"),
      Subdivision("Radlje ob Dravi", "SI-101", "municipality"),
      Subdivision("Radovljica", "SI-102", "municipality"),
      Subdivision("Ravne na Koroškem", "SI-103", "municipality"),
      Subdivision("Razkrižje", "SI-176", "municipality"),
      Subdivision("Rače-Fram", "SI-098", "municipality"),
      Subdivision("Renče-Vogrsko", "SI-201", "municipality"),
      Subdivision("Rečica ob Savinji", "SI-209", "municipality"),
      Subdivision("Ribnica", "SI-104", "municipality"),
      Subdivision("Ribnica na Pohorju", "SI-177", "municipality"),
      Subdivision("Rogatec", "SI-107", "municipality"),
      Subdivision("Rogaška Slatina", "SI-106", "municipality"),
      Subdivision("Rogašovci", "SI-105", "municipality"),
      Subdivision("Ruše", "SI-108", "municipality"),
      Subdivision("Selnica ob Dravi", "SI-178", "municipality"),
      Subdivision("Semič", "SI-109", "municipality"),
      Subdivision("Sevnica", "SI-110", "municipality"),
      Subdivision("Sežana", "SI-111", "municipality"),
      Subdivision("Slovenj Gradec", "SI-112", "municipality"),
      Subdivision("Slovenska Bistrica", "SI-113", "municipality"),
      Subdivision("Slovenske Konjice", "SI-114", "municipality"),
      Subdivision("Sodražica", "SI-179", "municipality"),
      Subdivision("Solčava", "SI-180", "municipality"),
      Subdivision("Središče ob Dravi", "SI-202", "municipality"),
      Subdivision("Starše", "SI-115", "municipality"),
      Subdivision("Straža", "SI-203", "municipality"),
      Subdivision("Sveta Ana", "SI-181", "municipality"),
      Subdivision("Sveta Trojica v Slovenskih goricah", "SI-204", "municipality"),
      Subdivision("Sveti Andraž v Slovenskih goricah", "SI-182", "municipality"),
      Subdivision("Sveti Jurij ob Ščavnici", "SI-116", "municipality"),
      Subdivision("Sveti Jurij v Slovenskih goricah", "SI-210", "municipality"),
      Subdivision("Sveti Tomaž", "SI-205", "municipality"),
      Subdivision("Tabor", "SI-184", "municipality"),
      Subdivision("Tišina", "SI-010", "municipality"),
      Subdivision("Tolmin", "SI-128", "municipality"),
      Subdivision("Trbovlje", "SI-129", "municipality"),
      Subdivision("Trebnje", "SI-130", "municipality"),
      Subdivision("Trnovska Vas", "SI-185", "municipality"),
      Subdivision("Trzin", "SI-186", "municipality"),
      Subdivision("Tržič", "SI-131", "municipality"),
      Subdivision("Turnišče", "SI-132", "municipality"),
      Subdivision("Velenje", "SI-133", "municipality"),
      Subdivision("Velika Polana", "SI-187", "municipality"),
      Subdivision("Velike Lašče", "SI-134", "municipality"),
      Subdivision("Veržej", "SI-188", "municipality"),
      Subdivision("Videm", "SI-135", "municipality"),
      Subdivision("Vipava", "SI-136", "municipality"),
      Subdivision("Vitanje", "SI-137", "municipality"),
      Subdivision("Vodice", "SI-138", "municipality"),
      Subdivision("Vojnik", "SI-139", "municipality"),
      Subdivision("Vransko", "SI-189", "municipality"),
      Subdivision("Vrhnika", "SI-140", "municipality"),
      Subdivision("Vuzenica", "SI-141", "municipality"),
      Subdivision("Zagorje ob Savi", "SI-142", "municipality"),
      Subdivision("Zavrč", "SI-143", "municipality"),
      Subdivision("Zreče", "SI-144", "municipality"),
      Subdivision("Črenšovci", "SI-015", "municipality"),
      Subdivision("Črna na Koroškem", "SI-016", "municipality"),
      Subdivision("Črnomelj", "SI-017", "municipality"),
      Subdivision("Šalovci", "SI-033", "municipality"),
      Subdivision("Šempeter-Vrtojba", "SI-183", "municipality"),
      Subdivision("Šentilj", "SI-118", "municipality"),
      Subdivision("Šentjernej", "SI-119", "municipality"),
      Subdivision("Šentjur", "SI-120", "municipality"),
      Subdivision("Šentrupert", "SI-211", "municipality"),
      Subdivision("Šenčur", "SI-117", "municipality"),
      Subdivision("Škocjan", "SI-121", "municipality"),
      Subdivision("Škofja Loka", "SI-122", "municipality"),
      Subdivision("Škofljica", "SI-123", "municipality"),
      Subdivision("Šmarje pri Jelšah", "SI-124", "municipality"),
      Subdivision("Šmarješke Toplice", "SI-206", "municipality"),
      Subdivision("Šmartno ob Paki", "SI-125", "municipality"),
      Subdivision("Šmartno pri Litiji", "SI-194", "municipality"),
      Subdivision("Šoštanj", "SI-126", "municipality"),
      Subdivision("Štore", "SI-127", "municipality"),
      Subdivision("Žalec", "SI-190", "municipality"),
      Subdivision("Železniki", "SI-146", "municipality"),
      Subdivision("Žetale", "SI-191", "municipality"),
      Subdivision("Žiri", "SI-147", "municipality"),
      Subdivision("Žirovnica", "SI-192", "municipality"),
      Subdivision("Žužemberk", "SI-193", "municipality")
    )
  }

  case object SJ extends Country("Svalbard and Jan Mayen", "SJ", "SJM")

  case object SK extends Country("Slovakia", "SK", "SVK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Banskobystrický kraj", "SK-BC", "region"),
      Subdivision("Bratislavský kraj", "SK-BL", "region"),
      Subdivision("Košický kraj", "SK-KI", "region"),
      Subdivision("Nitriansky kraj", "SK-NI", "region"),
      Subdivision("Prešovský kraj", "SK-PV", "region"),
      Subdivision("Trenčiansky kraj", "SK-TC", "region"),
      Subdivision("Trnavský kraj", "SK-TA", "region"),
      Subdivision("Žilinský kraj", "SK-ZI", "region")
    )
  }

  case object SL extends Country("Sierra Leone", "SL", "SLE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Eastern", "SL-E", "province"),
      Subdivision("North Western", "SL-NW", "province"),
      Subdivision("Northern", "SL-N", "province"),
      Subdivision("Southern", "SL-S", "province"),
      Subdivision("Western Area", "SL-W", "area")
    )
  }

  case object SM extends Country("San Marino", "SM", "SMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acquaviva", "SM-01", "municipality"),
      Subdivision("Borgo Maggiore", "SM-06", "municipality"),
      Subdivision("Chiesanuova", "SM-02", "municipality"),
      Subdivision("Città di San Marino", "SM-07", "municipality"),
      Subdivision("Domagnano", "SM-03", "municipality"),
      Subdivision("Faetano", "SM-04", "municipality"),
      Subdivision("Fiorentino", "SM-05", "municipality"),
      Subdivision("Montegiardino", "SM-08", "municipality"),
      Subdivision("Serravalle", "SM-09", "municipality")
    )
  }

  case object SN extends Country("Senegal", "SN", "SEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dakar", "SN-DK", "region"),
      Subdivision("Diourbel", "SN-DB", "region"),
      Subdivision("Fatick", "SN-FK", "region"),
      Subdivision("Kaffrine", "SN-KA", "region"),
      Subdivision("Kaolack", "SN-KL", "region"),
      Subdivision("Kolda", "SN-KD", "region"),
      Subdivision("Kédougou", "SN-KE", "region"),
      Subdivision("Louga", "SN-LG", "region"),
      Subdivision("Matam", "SN-MT", "region"),
      Subdivision("Saint-Louis", "SN-SL", "region"),
      Subdivision("Sédhiou", "SN-SE", "region"),
      Subdivision("Tambacounda", "SN-TC", "region"),
      Subdivision("Thiès", "SN-TH", "region"),
      Subdivision("Ziguinchor", "SN-ZG", "region")
    )
  }

  case object SO extends Country("Somalia", "SO", "SOM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Awdal", "SO-AW", "region"),
      Subdivision("Bakool", "SO-BK", "region"),
      Subdivision("Banaadir", "SO-BN", "region"),
      Subdivision("Bari", "SO-BR", "region"),
      Subdivision("Bay", "SO-BY", "region"),
      Subdivision("Galguduud", "SO-GA", "region"),
      Subdivision("Gedo", "SO-GE", "region"),
      Subdivision("Hiiraan", "SO-HI", "region"),
      Subdivision("Jubbada Dhexe", "SO-JD", "region"),
      Subdivision("Jubbada Hoose", "SO-JH", "region"),
      Subdivision("Mudug", "SO-MU", "region"),
      Subdivision("Nugaal", "SO-NU", "region"),
      Subdivision("Sanaag", "SO-SA", "region"),
      Subdivision("Shabeellaha Dhexe", "SO-SD", "region"),
      Subdivision("Shabeellaha Hoose", "SO-SH", "region"),
      Subdivision("Sool", "SO-SO", "region"),
      Subdivision("Togdheer", "SO-TO", "region"),
      Subdivision("Woqooyi Galbeed", "SO-WO", "region")
    )
  }

  case object SR extends Country("Suriname", "SR", "SUR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Brokopondo", "SR-BR", "district"),
      Subdivision("Commewijne", "SR-CM", "district"),
      Subdivision("Coronie", "SR-CR", "district"),
      Subdivision("Marowijne", "SR-MA", "district"),
      Subdivision("Nickerie", "SR-NI", "district"),
      Subdivision("Para", "SR-PR", "district"),
      Subdivision("Paramaribo", "SR-PM", "district"),
      Subdivision("Saramacca", "SR-SA", "district"),
      Subdivision("Sipaliwini", "SR-SI", "district"),
      Subdivision("Wanica", "SR-WA", "district")
    )
  }

  case object SS extends Country("South Sudan", "SS", "SSD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central Equatoria", "SS-EC", "state"),
      Subdivision("Eastern Equatoria", "SS-EE", "state"),
      Subdivision("Jonglei", "SS-JG", "state"),
      Subdivision("Lakes", "SS-LK", "state"),
      Subdivision("Northern Bahr el Ghazal", "SS-BN", "state"),
      Subdivision("Unity", "SS-UY", "state"),
      Subdivision("Upper Nile", "SS-NU", "state"),
      Subdivision("Warrap", "SS-WR", "state"),
      Subdivision("Western Bahr el Ghazal", "SS-BW", "state"),
      Subdivision("Western Equatoria", "SS-EW", "state")
    )
  }

  case object ST extends Country("Sao Tome and Principe", "ST", "STP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Cantagalo", "ST-02", "district"),
      Subdivision("Caué", "ST-03", "district"),
      Subdivision("Lembá", "ST-04", "district"),
      Subdivision("Lobata", "ST-05", "district"),
      Subdivision("Mé-Zóchi", "ST-06", "district"),
      Subdivision("Príncipe", "ST-P", "autonomous region"),
      Subdivision("Água Grande", "ST-01", "district")
    )
  }

  case object SV extends Country("El Salvador", "SV", "SLV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahuachapán", "SV-AH", "department"),
      Subdivision("Cabañas", "SV-CA", "department"),
      Subdivision("Chalatenango", "SV-CH", "department"),
      Subdivision("Cuscatlán", "SV-CU", "department"),
      Subdivision("La Libertad", "SV-LI", "department"),
      Subdivision("La Paz", "SV-PA", "department"),
      Subdivision("La Unión", "SV-UN", "department"),
      Subdivision("Morazán", "SV-MO", "department"),
      Subdivision("San Miguel", "SV-SM", "department"),
      Subdivision("San Salvador", "SV-SS", "department"),
      Subdivision("San Vicente", "SV-SV", "department"),
      Subdivision("Santa Ana", "SV-SA", "department"),
      Subdivision("Sonsonate", "SV-SO", "department"),
      Subdivision("Usulután", "SV-US", "department")
    )
  }

  case object SX extends Country("Sint Maarten (Dutch part)", "SX", "SXM")

  case object SY extends Country("Syrian Arab Republic (the)", "SY", "SYR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Lādhiqīyah", "SY-LA", "province"),
      Subdivision("Al Qunayţirah", "SY-QU", "province"),
      Subdivision("Al Ḩasakah", "SY-HA", "province"),
      Subdivision("Ar Raqqah", "SY-RA", "province"),
      Subdivision("As Suwaydā'", "SY-SU", "province"),
      Subdivision("Dar'ā", "SY-DR", "province"),
      Subdivision("Dayr az Zawr", "SY-DY", "province"),
      Subdivision("Dimashq", "SY-DI", "province"),
      Subdivision("Idlib", "SY-ID", "province"),
      Subdivision("Rīf Dimashq", "SY-RD", "province"),
      Subdivision("Ţarţūs", "SY-TA", "province"),
      Subdivision("Ḩalab", "SY-HL", "province"),
      Subdivision("Ḩamāh", "SY-HM", "province"),
      Subdivision("Ḩimş", "SY-HI", "province")
    )
  }

  case object SZ extends Country("Eswatini", "SZ", "SWZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Hhohho", "SZ-HH", "region"),
      Subdivision("Lubombo", "SZ-LU", "region"),
      Subdivision("Manzini", "SZ-MA", "region"),
      Subdivision("Shiselweni", "SZ-SH", "region")
    )
  }

  case object TC extends Country("Turks and Caicos Islands (the)", "TC", "TCA")

  case object TD extends Country("Chad", "TD", "TCD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Baţḩā’", "TD-BA", "province"),
      Subdivision("Al Buḩayrah", "TD-LC", "province"),
      Subdivision("Bahr el Ghazal", "TD-BG", "province"),
      Subdivision("Borkou", "TD-BO", "province"),
      Subdivision("Chari-Baguirmi", "TD-CB", "province"),
      Subdivision("Ennedi-Est", "TD-EE", "province"),
      Subdivision("Ennedi-Ouest", "TD-EO", "province"),
      Subdivision("Guéra", "TD-GR", "province"),
      Subdivision("Hadjer Lamis", "TD-HL", "province"),
      Subdivision("Kanem", "TD-KA", "province"),
      Subdivision("Logone-Occidental", "TD-LO", "province"),
      Subdivision("Logone-Oriental", "TD-LR", "province"),
      Subdivision("Madīnat Injamīnā", "TD-ND", "province"),
      Subdivision("Mandoul", "TD-MA", "province"),
      Subdivision("Mayo-Kebbi-Est", "TD-ME", "province"),
      Subdivision("Mayo-Kebbi-Ouest", "TD-MO", "province"),
      Subdivision("Moyen-Chari", "TD-MC", "province"),
      Subdivision("Ouaddaï", "TD-OD", "province"),
      Subdivision("Salamat", "TD-SA", "province"),
      Subdivision("Sila", "TD-SI", "province"),
      Subdivision("Tandjilé", "TD-TA", "province"),
      Subdivision("Tibastī", "TD-TI", "province"),
      Subdivision("Wadi Fira", "TD-WF", "province")
    )
  }

  case object TF extends Country("French Southern Territories (the)", "TF", "ATF")

  case object TG extends Country("Togo", "TG", "TGO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Centrale", "TG-C", "region"),
      Subdivision("Kara", "TG-K", "region"),
      Subdivision("Maritime", "TG-M", "region"),
      Subdivision("Plateaux", "TG-P", "region"),
      Subdivision("Savanes", "TG-S", "region")
    )
  }

  case object TH extends Country("Thailand", "TH", "THA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amnat Charoen", "TH-37", "province"),
      Subdivision("Ang Thong", "TH-15", "province"),
      Subdivision("Bueng Kan", "TH-38", "province"),
      Subdivision("Buri Ram", "TH-31", "province"),
      Subdivision("Chachoengsao", "TH-24", "province"),
      Subdivision("Chai Nat", "TH-18", "province"),
      Subdivision("Chaiyaphum", "TH-36", "province"),
      Subdivision("Chanthaburi", "TH-22", "province"),
      Subdivision("Chiang Mai", "TH-50", "province"),
      Subdivision("Chiang Rai", "TH-57", "province"),
      Subdivision("Chon Buri", "TH-20", "province"),
      Subdivision("Chumphon", "TH-86", "province"),
      Subdivision("Kalasin", "TH-46", "province"),
      Subdivision("Kamphaeng Phet", "TH-62", "province"),
      Subdivision("Kanchanaburi", "TH-71", "province"),
      Subdivision("Khon Kaen", "TH-40", "province"),
      Subdivision("Krabi", "TH-81", "province"),
      Subdivision("Krung Thep Maha Nakhon", "TH-10", "metropolitan administration"),
      Subdivision("Lampang", "TH-52", "province"),
      Subdivision("Lamphun", "TH-51", "province"),
      Subdivision("Loei", "TH-42", "province"),
      Subdivision("Lop Buri", "TH-16", "province"),
      Subdivision("Mae Hong Son", "TH-58", "province"),
      Subdivision("Maha Sarakham", "TH-44", "province"),
      Subdivision("Mukdahan", "TH-49", "province"),
      Subdivision("Nakhon Nayok", "TH-26", "province"),
      Subdivision("Nakhon Pathom", "TH-73", "province"),
      Subdivision("Nakhon Phanom", "TH-48", "province"),
      Subdivision("Nakhon Ratchasima", "TH-30", "province"),
      Subdivision("Nakhon Sawan", "TH-60", "province"),
      Subdivision("Nakhon Si Thammarat", "TH-80", "province"),
      Subdivision("Nan", "TH-55", "province"),
      Subdivision("Narathiwat", "TH-96", "province"),
      Subdivision("Nong Bua Lam Phu", "TH-39", "province"),
      Subdivision("Nong Khai", "TH-43", "province"),
      Subdivision("Nonthaburi", "TH-12", "province"),
      Subdivision("Pathum Thani", "TH-13", "province"),
      Subdivision("Pattani", "TH-94", "province"),
      Subdivision("Phangnga", "TH-82", "province"),
      Subdivision("Phatthalung", "TH-93", "province"),
      Subdivision("Phatthaya", "TH-S", "special administrative city"),
      Subdivision("Phayao", "TH-56", "province"),
      Subdivision("Phetchabun", "TH-67", "province"),
      Subdivision("Phetchaburi", "TH-76", "province"),
      Subdivision("Phichit", "TH-66", "province"),
      Subdivision("Phitsanulok", "TH-65", "province"),
      Subdivision("Phra Nakhon Si Ayutthaya", "TH-14", "province"),
      Subdivision("Phrae", "TH-54", "province"),
      Subdivision("Phuket", "TH-83", "province"),
      Subdivision("Prachin Buri", "TH-25", "province"),
      Subdivision("Prachuap Khiri Khan", "TH-77", "province"),
      Subdivision("Ranong", "TH-85", "province"),
      Subdivision("Ratchaburi", "TH-70", "province"),
      Subdivision("Rayong", "TH-21", "province"),
      Subdivision("Roi Et", "TH-45", "province"),
      Subdivision("Sa Kaeo", "TH-27", "province"),
      Subdivision("Sakon Nakhon", "TH-47", "province"),
      Subdivision("Samut Prakan", "TH-11", "province"),
      Subdivision("Samut Sakhon", "TH-74", "province"),
      Subdivision("Samut Songkhram", "TH-75", "province"),
      Subdivision("Saraburi", "TH-19", "province"),
      Subdivision("Satun", "TH-91", "province"),
      Subdivision("Si Sa Ket", "TH-33", "province"),
      Subdivision("Sing Buri", "TH-17", "province"),
      Subdivision("Songkhla", "TH-90", "province"),
      Subdivision("Sukhothai", "TH-64", "province"),
      Subdivision("Suphan Buri", "TH-72", "province"),
      Subdivision("Surat Thani", "TH-84", "province"),
      Subdivision("Surin", "TH-32", "province"),
      Subdivision("Tak", "TH-63", "province"),
      Subdivision("Trang", "TH-92", "province"),
      Subdivision("Trat", "TH-23", "province"),
      Subdivision("Ubon Ratchathani", "TH-34", "province"),
      Subdivision("Udon Thani", "TH-41", "province"),
      Subdivision("Uthai Thani", "TH-61", "province"),
      Subdivision("Uttaradit", "TH-53", "province"),
      Subdivision("Yala", "TH-95", "province"),
      Subdivision("Yasothon", "TH-35", "province")
    )
  }

  case object TJ extends Country("Tajikistan", "TJ", "TJK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dushanbe", "TJ-DU", "capital territory"),
      Subdivision("Khatlon", "TJ-KT", "region"),
      Subdivision("Kŭhistoni Badakhshon", "TJ-GB", "autonomous region"),
      Subdivision("Sughd", "TJ-SU", "region"),
      Subdivision("nohiyahoi tobei jumhurí", "TJ-RA", "districts under republic administration")
    )
  }

  case object TK extends Country("Tokelau", "TK", "TKL")

  case object TL extends Country("Timor-Leste", "TL", "TLS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aileu", "TL-AL", "municipality"),
      Subdivision("Ainaro", "TL-AN", "municipality"),
      Subdivision("Baucau", "TL-BA", "municipality"),
      Subdivision("Bobonaro", "TL-BO", "municipality"),
      Subdivision("Cova Lima", "TL-CO", "municipality"),
      Subdivision("Díli", "TL-DI", "municipality"),
      Subdivision("Ermera", "TL-ER", "municipality"),
      Subdivision("Lautein", "TL-LA", "municipality"),
      Subdivision("Likisá", "TL-LI", "municipality"),
      Subdivision("Manatuto", "TL-MT", "municipality"),
      Subdivision("Manufahi", "TL-MF", "municipality"),
      Subdivision("Oekusi-Ambenu", "TL-OE", "special administrative region"),
      Subdivision("Vikeke", "TL-VI", "municipality")
    )
  }

  case object TM extends Country("Turkmenistan", "TM", "TKM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahal", "TM-A", "region"),
      Subdivision("Aşgabat", "TM-S", "city"),
      Subdivision("Balkan", "TM-B", "region"),
      Subdivision("Daşoguz", "TM-D", "region"),
      Subdivision("Lebap", "TM-L", "region"),
      Subdivision("Mary", "TM-M", "region")
    )
  }

  case object TN extends Country("Tunisia", "TN", "TUN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ben Arous", "TN-13", "governorate"),
      Subdivision("Bizerte", "TN-23", "governorate"),
      Subdivision("Béja", "TN-31", "governorate"),
      Subdivision("Gabès", "TN-81", "governorate"),
      Subdivision("Gafsa", "TN-71", "governorate"),
      Subdivision("Jendouba", "TN-32", "governorate"),
      Subdivision("Kairouan", "TN-41", "governorate"),
      Subdivision("Kasserine", "TN-42", "governorate"),
      Subdivision("Kébili", "TN-73", "governorate"),
      Subdivision("L'Ariana", "TN-12", "governorate"),
      Subdivision("La Manouba", "TN-14", "governorate"),
      Subdivision("Le Kef", "TN-33", "governorate"),
      Subdivision("Mahdia", "TN-53", "governorate"),
      Subdivision("Monastir", "TN-52", "governorate"),
      Subdivision("Médenine", "TN-82", "governorate"),
      Subdivision("Nabeul", "TN-21", "governorate"),
      Subdivision("Sfax", "TN-61", "governorate"),
      Subdivision("Sidi Bouzid", "TN-43", "governorate"),
      Subdivision("Siliana", "TN-34", "governorate"),
      Subdivision("Sousse", "TN-51", "governorate"),
      Subdivision("Tataouine", "TN-83", "governorate"),
      Subdivision("Tozeur", "TN-72", "governorate"),
      Subdivision("Tunis", "TN-11", "governorate"),
      Subdivision("Zaghouan", "TN-22", "governorate")
    )
  }

  case object TO extends Country("Tonga", "TO", "TON") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("'Eua", "TO-01", "division"),
      Subdivision("Ha'apai", "TO-02", "division"),
      Subdivision("Niuas", "TO-03", "division"),
      Subdivision("Tongatapu", "TO-04", "division"),
      Subdivision("Vava'u", "TO-05", "division")
    )
  }

  case object TR extends Country("Türkiye", "TR", "TUR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adana", "TR-01", "province"),
      Subdivision("Adıyaman", "TR-02", "province"),
      Subdivision("Afyonkarahisar", "TR-03", "province"),
      Subdivision("Aksaray", "TR-68", "province"),
      Subdivision("Amasya", "TR-05", "province"),
      Subdivision("Ankara", "TR-06", "province"),
      Subdivision("Antalya", "TR-07", "province"),
      Subdivision("Ardahan", "TR-75", "province"),
      Subdivision("Artvin", "TR-08", "province"),
      Subdivision("Aydın", "TR-09", "province"),
      Subdivision("Ağrı", "TR-04", "province"),
      Subdivision("Balıkesir", "TR-10", "province"),
      Subdivision("Bartın", "TR-74", "province"),
      Subdivision("Batman", "TR-72", "province"),
      Subdivision("Bayburt", "TR-69", "province"),
      Subdivision("Bilecik", "TR-11", "province"),
      Subdivision("Bingöl", "TR-12", "province"),
      Subdivision("Bitlis", "TR-13", "province"),
      Subdivision("Bolu", "TR-14", "province"),
      Subdivision("Burdur", "TR-15", "province"),
      Subdivision("Bursa", "TR-16", "province"),
      Subdivision("Denizli", "TR-20", "province"),
      Subdivision("Diyarbakır", "TR-21", "province"),
      Subdivision("Düzce", "TR-81", "province"),
      Subdivision("Edirne", "TR-22", "province"),
      Subdivision("Elazığ", "TR-23", "province"),
      Subdivision("Erzincan", "TR-24", "province"),
      Subdivision("Erzurum", "TR-25", "province"),
      Subdivision("Eskişehir", "TR-26", "province"),
      Subdivision("Gaziantep", "TR-27", "province"),
      Subdivision("Giresun", "TR-28", "province"),
      Subdivision("Gümüşhane", "TR-29", "province"),
      Subdivision("Hakkâri", "TR-30", "province"),
      Subdivision("Hatay", "TR-31", "province"),
      Subdivision("Isparta", "TR-32", "province"),
      Subdivision("Iğdır", "TR-76", "province"),
      Subdivision("Kahramanmaraş", "TR-46", "province"),
      Subdivision("Karabük", "TR-78", "province"),
      Subdivision("Karaman", "TR-70", "province"),
      Subdivision("Kars", "TR-36", "province"),
      Subdivision("Kastamonu", "TR-37", "province"),
      Subdivision("Kayseri", "TR-38", "province"),
      Subdivision("Kilis", "TR-79", "province"),
      Subdivision("Kocaeli", "TR-41", "province"),
      Subdivision("Konya", "TR-42", "province"),
      Subdivision("Kütahya", "TR-43", "province"),
      Subdivision("Kırklareli", "TR-39", "province"),
      Subdivision("Kırıkkale", "TR-71", "province"),
      Subdivision("Kırşehir", "TR-40", "province"),
      Subdivision("Malatya", "TR-44", "province"),
      Subdivision("Manisa", "TR-45", "province"),
      Subdivision("Mardin", "TR-47", "province"),
      Subdivision("Mersin", "TR-33", "province"),
      Subdivision("Muğla", "TR-48", "province"),
      Subdivision("Muş", "TR-49", "province"),
      Subdivision("Nevşehir", "TR-50", "province"),
      Subdivision("Niğde", "TR-51", "province"),
      Subdivision("Ordu", "TR-52", "province"),
      Subdivision("Osmaniye", "TR-80", "province"),
      Subdivision("Rize", "TR-53", "province"),
      Subdivision("Sakarya", "TR-54", "province"),
      Subdivision("Samsun", "TR-55", "province"),
      Subdivision("Siirt", "TR-56", "province"),
      Subdivision("Sinop", "TR-57", "province"),
      Subdivision("Sivas", "TR-58", "province"),
      Subdivision("Tekirdağ", "TR-59", "province"),
      Subdivision("Tokat", "TR-60", "province"),
      Subdivision("Trabzon", "TR-61", "province"),
      Subdivision("Tunceli", "TR-62", "province"),
      Subdivision("Uşak", "TR-64", "province"),
      Subdivision("Van", "TR-65", "province"),
      Subdivision("Yalova", "TR-77", "province"),
      Subdivision("Yozgat", "TR-66", "province"),
      Subdivision("Zonguldak", "TR-67", "province"),
      Subdivision("Çanakkale", "TR-17", "province"),
      Subdivision("Çankırı", "TR-18", "province"),
      Subdivision("Çorum", "TR-19", "province"),
      Subdivision("İstanbul", "TR-34", "province"),
      Subdivision("İzmir", "TR-35", "province"),
      Subdivision("Şanlıurfa", "TR-63", "province"),
      Subdivision("Şırnak", "TR-73", "province")
    )
  }

  case object TT extends Country("Trinidad and Tobago", "TT", "TTO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arima", "TT-ARI", "borough"),
      Subdivision("Chaguanas", "TT-CHA", "borough"),
      Subdivision("Couva-Tabaquite-Talparo", "TT-CTT", "region"),
      Subdivision("Diego Martin", "TT-DMN", "region"),
      Subdivision("Mayaro-Rio Claro", "TT-MRC", "region"),
      Subdivision("Penal-Debe", "TT-PED", "region"),
      Subdivision("Point Fortin", "TT-PTF", "borough"),
      Subdivision("Port of Spain", "TT-POS", "city"),
      Subdivision("Princes Town", "TT-PRT", "region"),
      Subdivision("San Fernando", "TT-SFO", "city"),
      Subdivision("San Juan-Laventille", "TT-SJL", "region"),
      Subdivision("Sangre Grande", "TT-SGE", "region"),
      Subdivision("Siparia", "TT-SIP", "region"),
      Subdivision("Tobago", "TT-TOB", "ward"),
      Subdivision("Tunapuna-Piarco", "TT-TUP", "region")
    )
  }

  case object TV extends Country("Tuvalu", "TV", "TUV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Funafuti", "TV-FUN", "town council"),
      Subdivision("Nanumaga", "TV-NMG", "island council"),
      Subdivision("Nanumea", "TV-NMA", "island council"),
      Subdivision("Niutao", "TV-NIT", "island council"),
      Subdivision("Nui", "TV-NUI", "island council"),
      Subdivision("Nukufetau", "TV-NKF", "island council"),
      Subdivision("Nukulaelae", "TV-NKL", "island council"),
      Subdivision("Vaitupu", "TV-VAI", "island council")
    )
  }

  case object TW extends Country("Taiwan (Province of China)", "TW", "TWN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Changhua", "TW-CHA", "county"),
      Subdivision("Chiayi", "TW-CYI", "city"),
      Subdivision("Chiayi", "TW-CYQ", "county"),
      Subdivision("Hsinchu", "TW-HSZ", "city"),
      Subdivision("Hsinchu", "TW-HSQ", "county"),
      Subdivision("Hualien", "TW-HUA", "county"),
      Subdivision("Kaohsiung", "TW-KHH", "special municipality"),
      Subdivision("Keelung", "TW-KEE", "city"),
      Subdivision("Kinmen", "TW-KIN", "county"),
      Subdivision("Lienchiang", "TW-LIE", "county"),
      Subdivision("Miaoli", "TW-MIA", "county"),
      Subdivision("Nantou", "TW-NAN", "county"),
      Subdivision("New Taipei", "TW-NWT", "special municipality"),
      Subdivision("Penghu", "TW-PEN", "county"),
      Subdivision("Pingtung", "TW-PIF", "county"),
      Subdivision("Taichung", "TW-TXG", "special municipality"),
      Subdivision("Tainan", "TW-TNN", "special municipality"),
      Subdivision("Taipei", "TW-TPE", "special municipality"),
      Subdivision("Taitung", "TW-TTT", "county"),
      Subdivision("Taoyuan", "TW-TAO", "special municipality"),
      Subdivision("Yilan", "TW-ILA", "county"),
      Subdivision("Yunlin", "TW-YUN", "county")
    )
  }

  case object TZ extends Country("Tanzania, the United Republic of", "TZ", "TZA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arusha", "TZ-01", "region"),
      Subdivision("Coast", "TZ-19", "region"),
      Subdivision("Dar es Salaam", "TZ-02", "region"),
      Subdivision("Dodoma", "TZ-03", "region"),
      Subdivision("Geita", "TZ-27", "region"),
      Subdivision("Iringa", "TZ-04", "region"),
      Subdivision("Kagera", "TZ-05", "region"),
      Subdivision("Kaskazini Pemba", "TZ-06", "region"),
      Subdivision("Kaskazini Unguja", "TZ-07", "region"),
      Subdivision("Katavi", "TZ-28", "region"),
      Subdivision("Kigoma", "TZ-08", "region"),
      Subdivision("Kilimanjaro", "TZ-09", "region"),
      Subdivision("Kusini Pemba", "TZ-10", "region"),
      Subdivision("Kusini Unguja", "TZ-11", "region"),
      Subdivision("Lindi", "TZ-12", "region"),
      Subdivision("Manyara", "TZ-26", "region"),
      Subdivision("Mara", "TZ-13", "region"),
      Subdivision("Mbeya", "TZ-14", "region"),
      Subdivision("Mjini Magharibi", "TZ-15", "region"),
      Subdivision("Morogoro", "TZ-16", "region"),
      Subdivision("Mtwara", "TZ-17", "region"),
      Subdivision("Mwanza", "TZ-18", "region"),
      Subdivision("Njombe", "TZ-29", "region"),
      Subdivision("Rukwa", "TZ-20", "region"),
      Subdivision("Ruvuma", "TZ-21", "region"),
      Subdivision("Shinyanga", "TZ-22", "region"),
      Subdivision("Simiyu", "TZ-30", "region"),
      Subdivision("Singida", "TZ-23", "region"),
      Subdivision("Songwe", "TZ-31", "region"),
      Subdivision("Tabora", "TZ-24", "region"),
      Subdivision("Tanga", "TZ-25", "region")
    )
  }

  case object UA extends Country("Ukraine", "UA", "UKR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Avtonomna Respublika Krym", "UA-43", "republic"),
      Subdivision("Cherkaska oblast", "UA-71", "region"),
      Subdivision("Chernihivska oblast", "UA-74", "region"),
      Subdivision("Chernivetska oblast", "UA-77", "region"),
      Subdivision("Dnipropetrovska oblast", "UA-12", "region"),
      Subdivision("Donetska oblast", "UA-14", "region"),
      Subdivision("Ivano-Frankivska oblast", "UA-26", "region"),
      Subdivision("Kharkivska oblast", "UA-63", "region"),
      Subdivision("Khersonska oblast", "UA-65", "region"),
      Subdivision("Khmelnytska oblast", "UA-68", "region"),
      Subdivision("Kirovohradska oblast", "UA-35", "region"),
      Subdivision("Kyiv", "UA-30", "city"),
      Subdivision("Kyivska oblast", "UA-32", "region"),
      Subdivision("Luhanska oblast", "UA-09", "region"),
      Subdivision("Lvivska oblast", "UA-46", "region"),
      Subdivision("Mykolaivska oblast", "UA-48", "region"),
      Subdivision("Odeska oblast", "UA-51", "region"),
      Subdivision("Poltavska oblast", "UA-53", "region"),
      Subdivision("Rivnenska oblast", "UA-56", "region"),
      Subdivision("Sevastopol", "UA-40", "city"),
      Subdivision("Sumska oblast", "UA-59", "region"),
      Subdivision("Ternopilska oblast", "UA-61", "region"),
      Subdivision("Vinnytska oblast", "UA-05", "region"),
      Subdivision("Volynska oblast", "UA-07", "region"),
      Subdivision("Zakarpatska oblast", "UA-21", "region"),
      Subdivision("Zaporizka oblast", "UA-23", "region"),
      Subdivision("Zhytomyrska oblast", "UA-18", "region")
    )
  }

  case object UG extends Country("Uganda", "UG", "UGA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abim", "UG-314", "district"),
      Subdivision("Adjumani", "UG-301", "district"),
      Subdivision("Agago", "UG-322", "district"),
      Subdivision("Alebtong", "UG-323", "district"),
      Subdivision("Amolatar", "UG-315", "district"),
      Subdivision("Amudat", "UG-324", "district"),
      Subdivision("Amuria", "UG-216", "district"),
      Subdivision("Amuru", "UG-316", "district"),
      Subdivision("Apac", "UG-302", "district"),
      Subdivision("Arua", "UG-303", "district"),
      Subdivision("Budaka", "UG-217", "district"),
      Subdivision("Bududa", "UG-218", "district"),
      Subdivision("Bugiri", "UG-201", "district"),
      Subdivision("Bugweri", "UG-235", "district"),
      Subdivision("Buhweju", "UG-420", "district"),
      Subdivision("Buikwe", "UG-117", "district"),
      Subdivision("Bukedea", "UG-219", "district"),
      Subdivision("Bukomansibi", "UG-118", "district"),
      Subdivision("Bukwo", "UG-220", "district"),
      Subdivision("Bulambuli", "UG-225", "district"),
      Subdivision("Buliisa", "UG-416", "district"),
      Subdivision("Bundibugyo", "UG-401", "district"),
      Subdivision("Bunyangabu", "UG-430", "district"),
      Subdivision("Bushenyi", "UG-402", "district"),
      Subdivision("Busia", "UG-202", "district"),
      Subdivision("Butaleja", "UG-221", "district"),
      Subdivision("Butambala", "UG-119", "district"),
      Subdivision("Butebo", "UG-233", "district"),
      Subdivision("Buvuma", "UG-120", "district"),
      Subdivision("Buyende", "UG-226", "district"),
      Subdivision("Central", "UG-C", "geographical region"),
      Subdivision("Dokolo", "UG-317", "district"),
      Subdivision("Eastern", "UG-E", "geographical region"),
      Subdivision("Gomba", "UG-121", "district"),
      Subdivision("Gulu", "UG-304", "district"),
      Subdivision("Hoima", "UG-403", "district"),
      Subdivision("Ibanda", "UG-417", "district"),
      Subdivision("Iganga", "UG-203", "district"),
      Subdivision("Isingiro", "UG-418", "district"),
      Subdivision("Jinja", "UG-204", "district"),
      Subdivision("Kaabong", "UG-318", "district"),
      Subdivision("Kabale", "UG-404", "district"),
      Subdivision("Kabarole", "UG-405", "district"),
      Subdivision("Kaberamaido", "UG-213", "district"),
      Subdivision("Kagadi", "UG-427", "district"),
      Subdivision("Kakumiro", "UG-428", "district"),
      Subdivision("Kalaki", "UG-237", "district"),
      Subdivision("Kalangala", "UG-101", "district"),
      Subdivision("Kaliro", "UG-222", "district"),
      Subdivision("Kalungu", "UG-122", "district"),
      Subdivision("Kampala", "UG-102", "city"),
      Subdivision("Kamuli", "UG-205", "district"),
      Subdivision("Kamwenge", "UG-413", "district"),
      Subdivision("Kanungu", "UG-414", "district"),
      Subdivision("Kapchorwa", "UG-206", "district"),
      Subdivision("Kapelebyong", "UG-236", "district"),
      Subdivision("Karenga", "UG-335", "district"),
      Subdivision("Kasanda", "UG-126", "district"),
      Subdivision("Kasese", "UG-406", "district"),
      Subdivision("Katakwi", "UG-207", "district"),
      Subdivision("Kayunga", "UG-112", "district"),
      Subdivision("Kazo", "UG-433", "district"),
      Subdivision("Kibaale", "UG-407", "district"),
      Subdivision("Kiboga", "UG-103", "district"),
      Subdivision("Kibuku", "UG-227", "district"),
      Subdivision("Kikuube", "UG-432", "district"),
      Subdivision("Kiruhura", "UG-419", "district"),
      Subdivision("Kiryandongo", "UG-421", "district"),
      Subdivision("Kisoro", "UG-408", "district"),
      Subdivision("Kitagwenda", "UG-434", "district"),
      Subdivision("Kitgum", "UG-305", "district"),
      Subdivision("Koboko", "UG-319", "district"),
      Subdivision("Kole", "UG-325", "district"),
      Subdivision("Kotido", "UG-306", "district"),
      Subdivision("Kumi", "UG-208", "district"),
      Subdivision("Kwania", "UG-333", "district"),
      Subdivision("Kween", "UG-228", "district"),
      Subdivision("Kyankwanzi", "UG-123", "district"),
      Subdivision("Kyegegwa", "UG-422", "district"),
      Subdivision("Kyenjojo", "UG-415", "district"),
      Subdivision("Kyotera", "UG-125", "district"),
      Subdivision("Lamwo", "UG-326", "district"),
      Subdivision("Lira", "UG-307", "district"),
      Subdivision("Luuka", "UG-229", "district"),
      Subdivision("Luwero", "UG-104", "district"),
      Subdivision("Lwengo", "UG-124", "district"),
      Subdivision("Lyantonde", "UG-114", "district"),
      Subdivision("Madi-Okollo", "UG-336", "district"),
      Subdivision("Manafwa", "UG-223", "district"),
      Subdivision("Maracha", "UG-320", "district"),
      Subdivision("Masaka", "UG-105", "district"),
      Subdivision("Masindi", "UG-409", "district"),
      Subdivision("Mayuge", "UG-214", "district"),
      Subdivision("Mbale", "UG-209", "district"),
      Subdivision("Mbarara", "UG-410", "district"),
      Subdivision("Mitooma", "UG-423", "district"),
      Subdivision("Mityana", "UG-115", "district"),
      Subdivision("Moroto", "UG-308", "district"),
      Subdivision("Moyo", "UG-309", "district"),
      Subdivision("Mpigi", "UG-106", "district"),
      Subdivision("Mubende", "UG-107", "district"),
      Subdivision("Mukono", "UG-108", "district"),
      Subdivision("Nabilatuk", "UG-334", "district"),
      Subdivision("Nakapiripirit", "UG-311", "district"),
      Subdivision("Nakaseke", "UG-116", "district"),
      Subdivision("Nakasongola", "UG-109", "district"),
      Subdivision("Namayingo", "UG-230", "district"),
      Subdivision("Namisindwa", "UG-234", "district"),
      Subdivision("Namutumba", "UG-224", "district"),
      Subdivision("Napak", "UG-327", "district"),
      Subdivision("Nebbi", "UG-310", "district"),
      Subdivision("Ngora", "UG-231", "district"),
      Subdivision("Northern", "UG-N", "geographical region"),
      Subdivision("Ntoroko", "UG-424", "district"),
      Subdivision("Ntungamo", "UG-411", "district"),
      Subdivision("Nwoya", "UG-328", "district"),
      Subdivision("Obongi", "UG-337", "district"),
      Subdivision("Omoro", "UG-331", "district"),
      Subdivision("Otuke", "UG-329", "district"),
      Subdivision("Oyam", "UG-321", "district"),
      Subdivision("Pader", "UG-312", "district"),
      Subdivision("Pakwach", "UG-332", "district"),
      Subdivision("Pallisa", "UG-210", "district"),
      Subdivision("Rakai", "UG-110", "district"),
      Subdivision("Rubanda", "UG-429", "district"),
      Subdivision("Rubirizi", "UG-425", "district"),
      Subdivision("Rukiga", "UG-431", "district"),
      Subdivision("Rukungiri", "UG-412", "district"),
      Subdivision("Rwampara", "UG-435", "district"),
      Subdivision("Sembabule", "UG-111", "district"),
      Subdivision("Serere", "UG-232", "district"),
      Subdivision("Sheema", "UG-426", "district"),
      Subdivision("Sironko", "UG-215", "district"),
      Subdivision("Soroti", "UG-211", "district"),
      Subdivision("Tororo", "UG-212", "district"),
      Subdivision("Wakiso", "UG-113", "district"),
      Subdivision("Western", "UG-W", "geographical region"),
      Subdivision("Yumbe", "UG-313", "district"),
      Subdivision("Zombo", "UG-330", "district")
    )
  }

  case object UM extends Country("United States Minor Outlying Islands (the)", "UM", "UMI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baker Island", "UM-81", "islands, groups of islands"),
      Subdivision("Howland Island", "UM-84", "islands, groups of islands"),
      Subdivision("Jarvis Island", "UM-86", "islands, groups of islands"),
      Subdivision("Johnston Atoll", "UM-67", "islands, groups of islands"),
      Subdivision("Kingman Reef", "UM-89", "islands, groups of islands"),
      Subdivision("Midway Islands", "UM-71", "islands, groups of islands"),
      Subdivision("Navassa Island", "UM-76", "islands, groups of islands"),
      Subdivision("Palmyra Atoll", "UM-95", "islands, groups of islands"),
      Subdivision("Wake Island", "UM-79", "islands, groups of islands")
    )
  }

  case object US extends Country("United States of America (the)", "US", "USA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alabama", "US-AL", "state"),
      Subdivision("Alaska", "US-AK", "state"),
      Subdivision("American Samoa", "US-AS", "outlying area"),
      Subdivision("Arizona", "US-AZ", "state"),
      Subdivision("Arkansas", "US-AR", "state"),
      Subdivision("California", "US-CA", "state"),
      Subdivision("Colorado", "US-CO", "state"),
      Subdivision("Connecticut", "US-CT", "state"),
      Subdivision("Delaware", "US-DE", "state"),
      Subdivision("District of Columbia", "US-DC", "district"),
      Subdivision("Florida", "US-FL", "state"),
      Subdivision("Georgia", "US-GA", "state"),
      Subdivision("Guam", "US-GU", "outlying area"),
      Subdivision("Hawaii", "US-HI", "state"),
      Subdivision("Idaho", "US-ID", "state"),
      Subdivision("Illinois", "US-IL", "state"),
      Subdivision("Indiana", "US-IN", "state"),
      Subdivision("Iowa", "US-IA", "state"),
      Subdivision("Kansas", "US-KS", "state"),
      Subdivision("Kentucky", "US-KY", "state"),
      Subdivision("Louisiana", "US-LA", "state"),
      Subdivision("Maine", "US-ME", "state"),
      Subdivision("Maryland", "US-MD", "state"),
      Subdivision("Massachusetts", "US-MA", "state"),
      Subdivision("Michigan", "US-MI", "state"),
      Subdivision("Minnesota", "US-MN", "state"),
      Subdivision("Mississippi", "US-MS", "state"),
      Subdivision("Missouri", "US-MO", "state"),
      Subdivision("Montana", "US-MT", "state"),
      Subdivision("Nebraska", "US-NE", "state"),
      Subdivision("Nevada", "US-NV", "state"),
      Subdivision("New Hampshire", "US-NH", "state"),
      Subdivision("New Jersey", "US-NJ", "state"),
      Subdivision("New Mexico", "US-NM", "state"),
      Subdivision("New York", "US-NY", "state"),
      Subdivision("North Carolina", "US-NC", "state"),
      Subdivision("North Dakota", "US-ND", "state"),
      Subdivision("Northern Mariana Islands", "US-MP", "outlying area"),
      Subdivision("Ohio", "US-OH", "state"),
      Subdivision("Oklahoma", "US-OK", "state"),
      Subdivision("Oregon", "US-OR", "state"),
      Subdivision("Pennsylvania", "US-PA", "state"),
      Subdivision("Puerto Rico", "US-PR", "outlying area"),
      Subdivision("Rhode Island", "US-RI", "state"),
      Subdivision("South Carolina", "US-SC", "state"),
      Subdivision("South Dakota", "US-SD", "state"),
      Subdivision("Tennessee", "US-TN", "state"),
      Subdivision("Texas", "US-TX", "state"),
      Subdivision("United States Minor Outlying Islands", "US-UM", "outlying area"),
      Subdivision("Utah", "US-UT", "state"),
      Subdivision("Vermont", "US-VT", "state"),
      Subdivision("Virgin Islands, U.S.", "US-VI", "outlying area"),
      Subdivision("Virginia", "US-VA", "state"),
      Subdivision("Washington", "US-WA", "state"),
      Subdivision("West Virginia", "US-WV", "state"),
      Subdivision("Wisconsin", "US-WI", "state"),
      Subdivision("Wyoming", "US-WY", "state")
    )
  }

  case object UY extends Country("Uruguay", "UY", "URY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artigas", "UY-AR", "department"),
      Subdivision("Canelones", "UY-CA", "department"),
      Subdivision("Cerro Largo", "UY-CL", "department"),
      Subdivision("Colonia", "UY-CO", "department"),
      Subdivision("Durazno", "UY-DU", "department"),
      Subdivision("Flores", "UY-FS", "department"),
      Subdivision("Florida", "UY-FD", "department"),
      Subdivision("Lavalleja", "UY-LA", "department"),
      Subdivision("Maldonado", "UY-MA", "department"),
      Subdivision("Montevideo", "UY-MO", "department"),
      Subdivision("Paysandú", "UY-PA", "department"),
      Subdivision("Rivera", "UY-RV", "department"),
      Subdivision("Rocha", "UY-RO", "department"),
      Subdivision("Río Negro", "UY-RN", "department"),
      Subdivision("Salto", "UY-SA", "department"),
      Subdivision("San José", "UY-SJ", "department"),
      Subdivision("Soriano", "UY-SO", "department"),
      Subdivision("Tacuarembó", "UY-TA", "department"),
      Subdivision("Treinta y Tres", "UY-TT", "department")
    )
  }

  case object UZ extends Country("Uzbekistan", "UZ", "UZB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andijon", "UZ-AN", "region"),
      Subdivision("Buxoro", "UZ-BU", "region"),
      Subdivision("Farg‘ona", "UZ-FA", "region"),
      Subdivision("Jizzax", "UZ-JI", "region"),
      Subdivision("Namangan", "UZ-NG", "region"),
      Subdivision("Navoiy", "UZ-NW", "region"),
      Subdivision("Qashqadaryo", "UZ-QA", "region"),
      Subdivision("Qoraqalpog‘iston Respublikasi", "UZ-QR", "republic"),
      Subdivision("Samarqand", "UZ-SA", "region"),
      Subdivision("Sirdaryo", "UZ-SI", "region"),
      Subdivision("Surxondaryo", "UZ-SU", "region"),
      Subdivision("Toshkent", "UZ-TO", "region"),
      Subdivision("Toshkent", "UZ-TK", "city"),
      Subdivision("Xorazm", "UZ-XO", "region")
    )
  }

  case object VA extends Country("Holy See (the)", "VA", "VAT")

  case object VC extends Country("Saint Vincent and the Grenadines", "VC", "VCT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Charlotte", "VC-01", "parish"),
      Subdivision("Grenadines", "VC-06", "parish"),
      Subdivision("Saint Andrew", "VC-02", "parish"),
      Subdivision("Saint David", "VC-03", "parish"),
      Subdivision("Saint George", "VC-04", "parish"),
      Subdivision("Saint Patrick", "VC-05", "parish")
    )
  }

  case object VE extends Country("Venezuela (Bolivarian Republic of)", "VE", "VEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amazonas", "VE-Z", "state"),
      Subdivision("Anzoátegui", "VE-B", "state"),
      Subdivision("Apure", "VE-C", "state"),
      Subdivision("Aragua", "VE-D", "state"),
      Subdivision("Barinas", "VE-E", "state"),
      Subdivision("Bolívar", "VE-F", "state"),
      Subdivision("Carabobo", "VE-G", "state"),
      Subdivision("Cojedes", "VE-H", "state"),
      Subdivision("Delta Amacuro", "VE-Y", "state"),
      Subdivision("Dependencias Federales", "VE-W", "federal dependency"),
      Subdivision("Distrito Capital", "VE-A", "capital district"),
      Subdivision("Falcón", "VE-I", "state"),
      Subdivision("Guárico", "VE-J", "state"),
      Subdivision("La Guaira", "VE-X", "state"),
      Subdivision("Lara", "VE-K", "state"),
      Subdivision("Miranda", "VE-M", "state"),
      Subdivision("Monagas", "VE-N", "state"),
      Subdivision("Mérida", "VE-L", "state"),
      Subdivision("Nueva Esparta", "VE-O", "state"),
      Subdivision("Portuguesa", "VE-P", "state"),
      Subdivision("Sucre", "VE-R", "state"),
      Subdivision("Trujillo", "VE-T", "state"),
      Subdivision("Táchira", "VE-S", "state"),
      Subdivision("Yaracuy", "VE-U", "state"),
      Subdivision("Zulia", "VE-V", "state")
    )
  }

  case object VG extends Country("Virgin Islands (British)", "VG", "VGB")

  case object VI extends Country("Virgin Islands (U.S.)", "VI", "VIR")

  case object VN extends Country("Viet Nam", "VN", "VNM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("An Giang", "VN-44", "province"),
      Subdivision("Bà Rịa - Vũng Tàu", "VN-43", "province"),
      Subdivision("Bình Dương", "VN-57", "province"),
      Subdivision("Bình Phước", "VN-58", "province"),
      Subdivision("Bình Thuận", "VN-40", "province"),
      Subdivision("Bình Định", "VN-31", "province"),
      Subdivision("Bạc Liêu", "VN-55", "province"),
      Subdivision("Bắc Giang", "VN-54", "province"),
      Subdivision("Bắc Kạn", "VN-53", "province"),
      Subdivision("Bắc Ninh", "VN-56", "province"),
      Subdivision("Bến Tre", "VN-50", "province"),
      Subdivision("Cao Bằng", "VN-04", "province"),
      Subdivision("Cà Mau", "VN-59", "province"),
      Subdivision("Cần Thơ", "VN-CT", "municipality"),
      Subdivision("Gia Lai", "VN-30", "province"),
      Subdivision("Hà Giang", "VN-03", "province"),
      Subdivision("Hà Nam", "VN-63", "province"),
      Subdivision("Hà Nội", "VN-HN", "municipality"),
      Subdivision("Hà Tĩnh", "VN-23", "province"),
      Subdivision("Hòa Bình", "VN-14", "province"),
      Subdivision("Hưng Yên", "VN-66", "province"),
      Subdivision("Hải Dương", "VN-61", "province"),
      Subdivision("Hải Phòng", "VN-HP", "municipality"),
      Subdivision("Hậu Giang", "VN-73", "province"),
      Subdivision("Hồ Chí Minh", "VN-SG", "municipality"),
      Subdivision("Khánh Hòa", "VN-34", "province"),
      Subdivision("Kiến Giang", "VN-47", "province"),
      Subdivision("Kon Tum", "VN-28", "province"),
      Subdivision("Lai Châu", "VN-01", "province"),
      Subdivision("Long An", "VN-41", "province"),
      Subdivision("Lào Cai", "VN-02", "province"),
      Subdivision("Lâm Đồng", "VN-35", "province"),
      Subdivision("Lạng Sơn", "VN-09", "province"),
      Subdivision("Nam Định", "VN-67", "province"),
      Subdivision("Nghệ An", "VN-22", "province"),
      Subdivision("Ninh Bình", "VN-18", "province"),
      Subdivision("Ninh Thuận", "VN-36", "province"),
      Subdivision("Phú Thọ", "VN-68", "province"),
      Subdivision("Phú Yên", "VN-32", "province"),
      Subdivision("Quảng Bình", "VN-24", "province"),
      Subdivision("Quảng Nam", "VN-27", "province"),
      Subdivision("Quảng Ngãi", "VN-29", "province"),
      Subdivision("Quảng Ninh", "VN-13", "province"),
      Subdivision("Quảng Trị", "VN-25", "province"),
      Subdivision("Sóc Trăng", "VN-52", "province"),
      Subdivision("Sơn La", "VN-05", "province"),
      Subdivision("Thanh Hóa", "VN-21", "province"),
      Subdivision("Thái Bình", "VN-20", "province"),
      Subdivision("Thái Nguyên", "VN-69", "province"),
      Subdivision("Thừa Thiên-Huế", "VN-26", "province"),
      Subdivision("Tiền Giang", "VN-46", "province"),
      Subdivision("Trà Vinh", "VN-51", "province"),
      Subdivision("Tuyên Quang", "VN-07", "province"),
      Subdivision("Tây Ninh", "VN-37", "province"),
      Subdivision("Vĩnh Long", "VN-49", "province"),
      Subdivision("Vĩnh Phúc", "VN-70", "province"),
      Subdivision("Yên Bái", "VN-06", "province"),
      Subdivision("Điện Biên", "VN-71", "province"),
      Subdivision("Đà Nẵng", "VN-DN", "municipality"),
      Subdivision("Đắk Lắk", "VN-33", "province"),
      Subdivision("Đắk Nông", "VN-72", "province"),
      Subdivision("Đồng Nai", "VN-39", "province"),
      Subdivision("Đồng Tháp", "VN-45", "province")
    )
  }

  case object VU extends Country("Vanuatu", "VU", "VUT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Malampa", "VU-MAP", "province"),
      Subdivision("Pénama", "VU-PAM", "province"),
      Subdivision("Sanma", "VU-SAM", "province"),
      Subdivision("Shéfa", "VU-SEE", "province"),
      Subdivision("Taféa", "VU-TAE", "province"),
      Subdivision("Torba", "VU-TOB", "province")
    )
  }

  case object WF extends Country("Wallis and Futuna", "WF", "WLF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alo", "WF-AL", "administrative precinct"),
      Subdivision("Sigave", "WF-SG", "administrative precinct"),
      Subdivision("Uvea", "WF-UV", "administrative precinct")
    )
  }

  case object WS extends Country("Samoa", "WS", "WSM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("A'ana", "WS-AA", "district"),
      Subdivision("Aiga-i-le-Tai", "WS-AL", "district"),
      Subdivision("Atua", "WS-AT", "district"),
      Subdivision("Fa'asaleleaga", "WS-FA", "district"),
      Subdivision("Gaga'emauga", "WS-GE", "district"),
      Subdivision("Gagaifomauga", "WS-GI", "district"),
      Subdivision("Palauli", "WS-PA", "district"),
      Subdivision("Satupa'itea", "WS-SA", "district"),
      Subdivision("Tuamasaga", "WS-TU", "district"),
      Subdivision("Va'a-o-Fonoti", "WS-VF", "district"),
      Subdivision("Vaisigano", "WS-VS", "district")
    )
  }

  case object YE extends Country("Yemen", "YE", "YEM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abyan", "YE-AB", "governorate"),
      Subdivision("Al Bayḑā’", "YE-BA", "governorate"),
      Subdivision("Al Jawf", "YE-JA", "governorate"),
      Subdivision("Al Mahrah", "YE-MR", "governorate"),
      Subdivision("Al Maḩwīt", "YE-MW", "governorate"),
      Subdivision("Al Ḩudaydah", "YE-HU", "governorate"),
      Subdivision("Amānat al ‘Āşimah", "YE-SA", "municipality"),
      Subdivision("Arkhabīl Suquţrá", "YE-SU", "governorate"),
      Subdivision("Aḑ Ḑāli‘", "YE-DA", "governorate"),
      Subdivision("Dhamār", "YE-DH", "governorate"),
      Subdivision("Ibb", "YE-IB", "governorate"),
      Subdivision("Laḩij", "YE-LA", "governorate"),
      Subdivision("Ma’rib", "YE-MA", "governorate"),
      Subdivision("Raymah", "YE-RA", "governorate"),
      Subdivision("Shabwah", "YE-SH", "governorate"),
      Subdivision("Tāʻizz", "YE-TA", "governorate"),
      Subdivision("Şanʻā’", "YE-SN", "governorate"),
      Subdivision("Şāʻdah", "YE-SD", "governorate"),
      Subdivision("Ḩajjah", "YE-HJ", "governorate"),
      Subdivision("Ḩaḑramawt", "YE-HD", "governorate"),
      Subdivision("‘Adan", "YE-AD", "governorate"),
      Subdivision("‘Amrān", "YE-AM", "governorate")
    )
  }

  case object YT extends Country("Mayotte", "YT", "MYT")

  case object ZA extends Country("South Africa", "ZA", "ZAF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bokone Bophirima", "ZA-NW", "province"),
      Subdivision("Eastern Cape", "ZA-EC", "province"),
      Subdivision("Foreisetata", "ZA-FS", "province"),
      Subdivision("GaZulu-Natala", "ZA-KZN", "province"),
      Subdivision("Gauteng", "ZA-GP", "province"),
      Subdivision("Kapa Bodikela", "ZA-WC", "province"),
      Subdivision("Kapa Bokone", "ZA-NC", "province"),
      Subdivision("Limpopo", "ZA-LP", "province"),
      Subdivision("Mpumalanga", "ZA-MP", "province")
    )
  }

  case object ZM extends Country("Zambia", "ZM", "ZMB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central", "ZM-02", "province"),
      Subdivision("Copperbelt", "ZM-08", "province"),
      Subdivision("Eastern", "ZM-03", "province"),
      Subdivision("Luapula", "ZM-04", "province"),
      Subdivision("Lusaka", "ZM-09", "province"),
      Subdivision("Muchinga", "ZM-10", "province"),
      Subdivision("North-Western", "ZM-06", "province"),
      Subdivision("Northern", "ZM-05", "province"),
      Subdivision("Southern", "ZM-07", "province"),
      Subdivision("Western", "ZM-01", "province")
    )
  }

  case object ZW extends Country("Zimbabwe", "ZW", "ZWE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bulawayo", "ZW-BU", "province"),
      Subdivision("Harare", "ZW-HA", "province"),
      Subdivision("Manicaland", "ZW-MA", "province"),
      Subdivision("Mashonaland Central", "ZW-MC", "province"),
      Subdivision("Mashonaland East", "ZW-ME", "province"),
      Subdivision("Mashonaland West", "ZW-MW", "province"),
      Subdivision("Masvingo", "ZW-MV", "province"),
      Subdivision("Matabeleland North", "ZW-MN", "province"),
      Subdivision("Matabeleland South", "ZW-MS", "province"),
      Subdivision("Midlands", "ZW-MI", "province")
    )
  }

}
