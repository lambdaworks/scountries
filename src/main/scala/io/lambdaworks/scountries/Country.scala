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
      Subdivision("Andorra la Vella", "07", "parish"),
      Subdivision("Canillo", "02", "parish"),
      Subdivision("Encamp", "03", "parish"),
      Subdivision("Escaldes-Engordany", "08", "parish"),
      Subdivision("La Massana", "04", "parish"),
      Subdivision("Ordino", "05", "parish"),
      Subdivision("Sant Julià de Lòria", "06", "parish")
    )
  }

  case object AE extends Country("United Arab Emirates (the)", "AE", "ARE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abū Z̧aby", "AZ", "emirate"),
      Subdivision("Al Fujayrah", "FU", "emirate"),
      Subdivision("Ash Shāriqah", "SH", "emirate"),
      Subdivision("Dubayy", "DU", "emirate"),
      Subdivision("Ra’s al Khaymah", "RK", "emirate"),
      Subdivision("Umm al Qaywayn", "UQ", "emirate"),
      Subdivision("‘Ajmān", "AJ", "emirate")
    )
  }

  case object AF extends Country("Afghanistan", "AF", "AFG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Badakhshān", "BDS", "province"),
      Subdivision("Baghlān", "BGL", "province"),
      Subdivision("Balkh", "BAL", "province"),
      Subdivision("Bādghīs", "BDG", "province"),
      Subdivision("Bāmyān", "BAM", "province"),
      Subdivision("Dāykundī", "DAY", "province"),
      Subdivision("Farāh", "FRA", "province"),
      Subdivision("Fāryāb", "FYB", "province"),
      Subdivision("Ghaznī", "GHA", "province"),
      Subdivision("Ghōr", "GHO", "province"),
      Subdivision("Helmand", "HEL", "province"),
      Subdivision("Herāt", "HER", "province"),
      Subdivision("Jowzjān", "JOW", "province"),
      Subdivision("Kandahār", "KAN", "province"),
      Subdivision("Khōst", "KHO", "province"),
      Subdivision("Kunaṟ", "KNR", "province"),
      Subdivision("Kunduz", "KDZ", "province"),
      Subdivision("Kābul", "KAB", "province"),
      Subdivision("Kāpīsā", "KAP", "province"),
      Subdivision("Laghmān", "LAG", "province"),
      Subdivision("Lōgar", "LOG", "province"),
      Subdivision("Nangarhār", "NAN", "province"),
      Subdivision("Nīmrōz", "NIM", "province"),
      Subdivision("Nūristān", "NUR", "province"),
      Subdivision("Paktiyā", "PIA", "province"),
      Subdivision("Paktīkā", "PKA", "province"),
      Subdivision("Panjshayr", "PAN", "province"),
      Subdivision("Parwān", "PAR", "province"),
      Subdivision("Samangān", "SAM", "province"),
      Subdivision("Sar-e Pul", "SAR", "province"),
      Subdivision("Takhār", "TAK", "province"),
      Subdivision("Uruzgān", "URU", "province"),
      Subdivision("Wardak", "WAR", "province"),
      Subdivision("Zābul", "ZAB", "province")
    )
  }

  case object AG extends Country("Antigua and Barbuda", "AG", "ATG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Barbuda", "10", "dependency"),
      Subdivision("Redonda", "11", "dependency"),
      Subdivision("Saint George", "03", "parish"),
      Subdivision("Saint John", "04", "parish"),
      Subdivision("Saint Mary", "05", "parish"),
      Subdivision("Saint Paul", "06", "parish"),
      Subdivision("Saint Peter", "07", "parish"),
      Subdivision("Saint Philip", "08", "parish")
    )
  }

  case object AI extends Country("Anguilla", "AI", "AIA")

  case object AL extends Country("Albania", "AL", "ALB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Berat", "01", "county"),
      Subdivision("Dibër", "09", "county"),
      Subdivision("Durrës", "02", "county"),
      Subdivision("Elbasan", "03", "county"),
      Subdivision("Fier", "04", "county"),
      Subdivision("Gjirokastër", "05", "county"),
      Subdivision("Korçë", "06", "county"),
      Subdivision("Kukës", "07", "county"),
      Subdivision("Lezhë", "08", "county"),
      Subdivision("Shkodër", "10", "county"),
      Subdivision("Tiranë", "11", "county"),
      Subdivision("Vlorë", "12", "county")
    )
  }

  case object AM extends Country("Armenia", "AM", "ARM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aragac̣otn", "AG", "region"),
      Subdivision("Ararat", "AR", "region"),
      Subdivision("Armavir", "AV", "region"),
      Subdivision("Erevan", "ER", "city"),
      Subdivision("Geġark'unik'", "GR", "region"),
      Subdivision("Kotayk'", "KT", "region"),
      Subdivision("Loṙi", "LO", "region"),
      Subdivision("Syunik'", "SU", "region"),
      Subdivision("Tavuš", "TV", "region"),
      Subdivision("Vayoć Jor", "VD", "region"),
      Subdivision("Širak", "SH", "region")
    )
  }

  case object AO extends Country("Angola", "AO", "AGO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bengo", "BGO", "province"),
      Subdivision("Benguela", "BGU", "province"),
      Subdivision("Bié", "BIE", "province"),
      Subdivision("Cabinda", "CAB", "province"),
      Subdivision("Cuando Cubango", "CCU", "province"),
      Subdivision("Cuanza-Norte", "CNO", "province"),
      Subdivision("Cuanza-Sul", "CUS", "province"),
      Subdivision("Cunene", "CNN", "province"),
      Subdivision("Huambo", "HUA", "province"),
      Subdivision("Huíla", "HUI", "province"),
      Subdivision("Luanda", "LUA", "province"),
      Subdivision("Lunda-Norte", "LNO", "province"),
      Subdivision("Lunda-Sul", "LSU", "province"),
      Subdivision("Malange", "MAL", "province"),
      Subdivision("Moxico", "MOX", "province"),
      Subdivision("Namibe", "NAM", "province"),
      Subdivision("Uíge", "UIG", "province"),
      Subdivision("Zaire", "ZAI", "province")
    )
  }

  case object AQ extends Country("Antarctica", "AQ", "ATA")

  case object AR extends Country("Argentina", "AR", "ARG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Buenos Aires", "B", "province"),
      Subdivision("Catamarca", "K", "province"),
      Subdivision("Chaco", "H", "province"),
      Subdivision("Chubut", "U", "province"),
      Subdivision("Ciudad Autónoma de Buenos Aires", "C", "city"),
      Subdivision("Corrientes", "W", "province"),
      Subdivision("Córdoba", "X", "province"),
      Subdivision("Entre Ríos", "E", "province"),
      Subdivision("Formosa", "P", "province"),
      Subdivision("Jujuy", "Y", "province"),
      Subdivision("La Pampa", "L", "province"),
      Subdivision("La Rioja", "F", "province"),
      Subdivision("Mendoza", "M", "province"),
      Subdivision("Misiones", "N", "province"),
      Subdivision("Neuquén", "Q", "province"),
      Subdivision("Río Negro", "R", "province"),
      Subdivision("Salta", "A", "province"),
      Subdivision("San Juan", "J", "province"),
      Subdivision("San Luis", "D", "province"),
      Subdivision("Santa Cruz", "Z", "province"),
      Subdivision("Santa Fe", "S", "province"),
      Subdivision("Santiago del Estero", "G", "province"),
      Subdivision("Tierra del Fuego", "V", "province"),
      Subdivision("Tucumán", "T", "province")
    )
  }

  case object AS extends Country("American Samoa", "AS", "ASM")

  case object AT extends Country("Austria", "AT", "AUT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Burgenland", "1", "state"),
      Subdivision("Kärnten", "2", "state"),
      Subdivision("Niederösterreich", "3", "state"),
      Subdivision("Oberösterreich", "4", "state"),
      Subdivision("Salzburg", "5", "state"),
      Subdivision("Steiermark", "6", "state"),
      Subdivision("Tirol", "7", "state"),
      Subdivision("Vorarlberg", "8", "state"),
      Subdivision("Wien", "9", "state")
    )
  }

  case object AU extends Country("Australia", "AU", "AUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Australian Capital Territory", "ACT", "territory"),
      Subdivision("New South Wales", "NSW", "state"),
      Subdivision("Northern Territory", "NT", "territory"),
      Subdivision("Queensland", "QLD", "state"),
      Subdivision("South Australia", "SA", "state"),
      Subdivision("Tasmania", "TAS", "state"),
      Subdivision("Victoria", "VIC", "state"),
      Subdivision("Western Australia", "WA", "state")
    )
  }

  case object AW extends Country("Aruba", "AW", "ABW")

  case object AX extends Country("Åland Islands", "AX", "ALA")

  case object AZ extends Country("Azerbaijan", "AZ", "AZE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abşeron", "ABS", "rayon"),
      Subdivision("Astara", "AST", "rayon"),
      Subdivision("Ağcabədi", "AGC", "rayon"),
      Subdivision("Ağdam", "AGM", "rayon"),
      Subdivision("Ağdaş", "AGS", "rayon"),
      Subdivision("Ağstafa", "AGA", "rayon"),
      Subdivision("Ağsu", "AGU", "rayon"),
      Subdivision("Babək", "BAB", "rayon"),
      Subdivision("Bakı", "BA", "municipality"),
      Subdivision("Balakən", "BAL", "rayon"),
      Subdivision("Beyləqan", "BEY", "rayon"),
      Subdivision("Biləsuvar", "BIL", "rayon"),
      Subdivision("Bərdə", "BAR", "rayon"),
      Subdivision("Culfa", "CUL", "rayon"),
      Subdivision("Cəbrayıl", "CAB", "rayon"),
      Subdivision("Cəlilabad", "CAL", "rayon"),
      Subdivision("Daşkəsən", "DAS", "rayon"),
      Subdivision("Füzuli", "FUZ", "rayon"),
      Subdivision("Goranboy", "GOR", "rayon"),
      Subdivision("Göygöl", "GYG", "rayon"),
      Subdivision("Göyçay", "GOY", "rayon"),
      Subdivision("Gədəbəy", "GAD", "rayon"),
      Subdivision("Gəncə", "GA", "municipality"),
      Subdivision("Hacıqabul", "HAC", "rayon"),
      Subdivision("Kürdəmir", "KUR", "rayon"),
      Subdivision("Kǝngǝrli", "KAN", "rayon"),
      Subdivision("Kəlbəcər", "KAL", "rayon"),
      Subdivision("Laçın", "LAC", "rayon"),
      Subdivision("Lerik", "LER", "rayon"),
      Subdivision("Lənkəran", "LA", "municipality"),
      Subdivision("Lənkəran", "LAN", "rayon"),
      Subdivision("Masallı", "MAS", "rayon"),
      Subdivision("Mingəçevir", "MI", "municipality"),
      Subdivision("Naftalan", "NA", "municipality"),
      Subdivision("Naxçıvan", "NX", "autonomous republic"),
      Subdivision("Naxçıvan", "NV", "municipality"),
      Subdivision("Neftçala", "NEF", "rayon"),
      Subdivision("Ordubad", "ORD", "rayon"),
      Subdivision("Oğuz", "OGU", "rayon"),
      Subdivision("Qax", "QAX", "rayon"),
      Subdivision("Qazax", "QAZ", "rayon"),
      Subdivision("Qobustan", "QOB", "rayon"),
      Subdivision("Quba", "QBA", "rayon"),
      Subdivision("Qubadlı", "QBI", "rayon"),
      Subdivision("Qusar", "QUS", "rayon"),
      Subdivision("Qəbələ", "QAB", "rayon"),
      Subdivision("Saatlı", "SAT", "rayon"),
      Subdivision("Sabirabad", "SAB", "rayon"),
      Subdivision("Salyan", "SAL", "rayon"),
      Subdivision("Samux", "SMX", "rayon"),
      Subdivision("Siyəzən", "SIY", "rayon"),
      Subdivision("Sumqayıt", "SM", "municipality"),
      Subdivision("Sədərək", "SAD", "rayon"),
      Subdivision("Tovuz", "TOV", "rayon"),
      Subdivision("Tərtər", "TAR", "rayon"),
      Subdivision("Ucar", "UCA", "rayon"),
      Subdivision("Xankəndi", "XA", "municipality"),
      Subdivision("Xaçmaz", "XAC", "rayon"),
      Subdivision("Xocalı", "XCI", "rayon"),
      Subdivision("Xocavənd", "XVD", "rayon"),
      Subdivision("Xızı", "XIZ", "rayon"),
      Subdivision("Yardımlı", "YAR", "rayon"),
      Subdivision("Yevlax", "YE", "municipality"),
      Subdivision("Yevlax", "YEV", "rayon"),
      Subdivision("Zaqatala", "ZAQ", "rayon"),
      Subdivision("Zəngilan", "ZAN", "rayon"),
      Subdivision("Zərdab", "ZAR", "rayon"),
      Subdivision("İmişli", "IMI", "rayon"),
      Subdivision("İsmayıllı", "ISM", "rayon"),
      Subdivision("Şabran", "SBN", "rayon"),
      Subdivision("Şahbuz", "SAH", "rayon"),
      Subdivision("Şamaxı", "SMI", "rayon"),
      Subdivision("Şirvan", "SR", "municipality"),
      Subdivision("Şuşa", "SUS", "rayon"),
      Subdivision("Şəki", "SA", "municipality"),
      Subdivision("Şəki", "SAK", "rayon"),
      Subdivision("Şəmkir", "SKR", "rayon"),
      Subdivision("Şərur", "SAR", "rayon")
    )
  }

  case object BA extends Country("Bosnia and Herzegovina", "BA", "BIH") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Brčko distrikt", "BRC", "district with special status"),
      Subdivision("Federacija Bosne i Hercegovine", "BIH", "entity"),
      Subdivision("Republika Srpska", "SRP", "entity")
    )
  }

  case object BB extends Country("Barbados", "BB", "BRB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Christ Church", "01", "parish"),
      Subdivision("Saint Andrew", "02", "parish"),
      Subdivision("Saint George", "03", "parish"),
      Subdivision("Saint James", "04", "parish"),
      Subdivision("Saint John", "05", "parish"),
      Subdivision("Saint Joseph", "06", "parish"),
      Subdivision("Saint Lucy", "07", "parish"),
      Subdivision("Saint Michael", "08", "parish"),
      Subdivision("Saint Peter", "09", "parish"),
      Subdivision("Saint Philip", "10", "parish"),
      Subdivision("Saint Thomas", "11", "parish")
    )
  }

  case object BD extends Country("Bangladesh", "BD", "BGD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bagerhat", "05", "district"),
      Subdivision("Bandarban", "01", "district"),
      Subdivision("Barguna", "02", "district"),
      Subdivision("Barishal", "A", "division"),
      Subdivision("Barishal", "06", "district"),
      Subdivision("Bhola", "07", "district"),
      Subdivision("Bogura", "03", "district"),
      Subdivision("Brahmanbaria", "04", "district"),
      Subdivision("Chandpur", "09", "district"),
      Subdivision("Chapai Nawabganj", "45", "district"),
      Subdivision("Chattogram", "B", "division"),
      Subdivision("Chattogram", "10", "district"),
      Subdivision("Chuadanga", "12", "district"),
      Subdivision("Cox's Bazar", "11", "district"),
      Subdivision("Cumilla", "08", "district"),
      Subdivision("Dhaka", "C", "division"),
      Subdivision("Dhaka", "13", "district"),
      Subdivision("Dinajpur", "14", "district"),
      Subdivision("Faridpur", "15", "district"),
      Subdivision("Feni", "16", "district"),
      Subdivision("Gaibandha", "19", "district"),
      Subdivision("Gazipur", "18", "district"),
      Subdivision("Gopalganj", "17", "district"),
      Subdivision("Habiganj", "20", "district"),
      Subdivision("Jamalpur", "21", "district"),
      Subdivision("Jashore", "22", "district"),
      Subdivision("Jhalakathi", "25", "district"),
      Subdivision("Jhenaidah", "23", "district"),
      Subdivision("Joypurhat", "24", "district"),
      Subdivision("Khagrachhari", "29", "district"),
      Subdivision("Khulna", "D", "division"),
      Subdivision("Khulna", "27", "district"),
      Subdivision("Kishoreganj", "26", "district"),
      Subdivision("Kurigram", "28", "district"),
      Subdivision("Kushtia", "30", "district"),
      Subdivision("Lakshmipur", "31", "district"),
      Subdivision("Lalmonirhat", "32", "district"),
      Subdivision("Madaripur", "36", "district"),
      Subdivision("Magura", "37", "district"),
      Subdivision("Manikganj", "33", "district"),
      Subdivision("Meherpur", "39", "district"),
      Subdivision("Moulvibazar", "38", "district"),
      Subdivision("Munshiganj", "35", "district"),
      Subdivision("Mymensingh", "H", "division"),
      Subdivision("Mymensingh", "34", "district"),
      Subdivision("Naogaon", "48", "district"),
      Subdivision("Narail", "43", "district"),
      Subdivision("Narayanganj", "40", "district"),
      Subdivision("Narsingdi", "42", "district"),
      Subdivision("Natore", "44", "district"),
      Subdivision("Netrakona", "41", "district"),
      Subdivision("Nilphamari", "46", "district"),
      Subdivision("Noakhali", "47", "district"),
      Subdivision("Pabna", "49", "district"),
      Subdivision("Panchagarh", "52", "district"),
      Subdivision("Patuakhali", "51", "district"),
      Subdivision("Pirojpur", "50", "district"),
      Subdivision("Rajbari", "53", "district"),
      Subdivision("Rajshahi", "E", "division"),
      Subdivision("Rajshahi", "54", "district"),
      Subdivision("Rangamati", "56", "district"),
      Subdivision("Rangpur", "F", "division"),
      Subdivision("Rangpur", "55", "district"),
      Subdivision("Satkhira", "58", "district"),
      Subdivision("Shariatpur", "62", "district"),
      Subdivision("Sherpur", "57", "district"),
      Subdivision("Sirajganj", "59", "district"),
      Subdivision("Sunamganj", "61", "district"),
      Subdivision("Sylhet", "G", "division"),
      Subdivision("Sylhet", "60", "district"),
      Subdivision("Tangail", "63", "district"),
      Subdivision("Thakurgaon", "64", "district")
    )
  }

  case object BE extends Country("Belgium", "BE", "BEL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Antwerpen", "VAN", "province"),
      Subdivision("Brabant wallon", "WBR", "province"),
      Subdivision("Brussels Hoofdstedelijk Gewest", "BRU", "region"),
      Subdivision("Hainaut", "WHT", "province"),
      Subdivision("Limburg", "VLI", "province"),
      Subdivision("Liège", "WLG", "province"),
      Subdivision("Luxembourg", "WLX", "province"),
      Subdivision("Namur", "WNA", "province"),
      Subdivision("Oost-Vlaanderen", "VOV", "province"),
      Subdivision("Vlaams Gewest", "VLG", "region"),
      Subdivision("Vlaams-Brabant", "VBR", "province"),
      Subdivision("West-Vlaanderen", "VWV", "province"),
      Subdivision("wallonne, Région", "WAL", "region")
    )
  }

  case object BF extends Country("Burkina Faso", "BF", "BFA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balé", "BAL", "province"),
      Subdivision("Bam", "BAM", "province"),
      Subdivision("Banwa", "BAN", "province"),
      Subdivision("Bazèga", "BAZ", "province"),
      Subdivision("Boucle du Mouhoun", "01", "region"),
      Subdivision("Bougouriba", "BGR", "province"),
      Subdivision("Boulgou", "BLG", "province"),
      Subdivision("Boulkiemdé", "BLK", "province"),
      Subdivision("Cascades", "02", "region"),
      Subdivision("Centre", "03", "region"),
      Subdivision("Centre-Est", "04", "region"),
      Subdivision("Centre-Nord", "05", "region"),
      Subdivision("Centre-Ouest", "06", "region"),
      Subdivision("Centre-Sud", "07", "region"),
      Subdivision("Comoé", "COM", "province"),
      Subdivision("Est", "08", "region"),
      Subdivision("Ganzourgou", "GAN", "province"),
      Subdivision("Gnagna", "GNA", "province"),
      Subdivision("Gourma", "GOU", "province"),
      Subdivision("Hauts-Bassins", "09", "region"),
      Subdivision("Houet", "HOU", "province"),
      Subdivision("Ioba", "IOB", "province"),
      Subdivision("Kadiogo", "KAD", "province"),
      Subdivision("Komondjari", "KMD", "province"),
      Subdivision("Kompienga", "KMP", "province"),
      Subdivision("Kossi", "KOS", "province"),
      Subdivision("Koulpélogo", "KOP", "province"),
      Subdivision("Kouritenga", "KOT", "province"),
      Subdivision("Kourwéogo", "KOW", "province"),
      Subdivision("Kénédougou", "KEN", "province"),
      Subdivision("Loroum", "LOR", "province"),
      Subdivision("Léraba", "LER", "province"),
      Subdivision("Mouhoun", "MOU", "province"),
      Subdivision("Nahouri", "NAO", "province"),
      Subdivision("Namentenga", "NAM", "province"),
      Subdivision("Nayala", "NAY", "province"),
      Subdivision("Nord", "10", "region"),
      Subdivision("Noumbiel", "NOU", "province"),
      Subdivision("Oubritenga", "OUB", "province"),
      Subdivision("Oudalan", "OUD", "province"),
      Subdivision("Passoré", "PAS", "province"),
      Subdivision("Plateau-Central", "11", "region"),
      Subdivision("Poni", "PON", "province"),
      Subdivision("Sahel", "12", "region"),
      Subdivision("Sanguié", "SNG", "province"),
      Subdivision("Sanmatenga", "SMT", "province"),
      Subdivision("Sissili", "SIS", "province"),
      Subdivision("Soum", "SOM", "province"),
      Subdivision("Sourou", "SOR", "province"),
      Subdivision("Sud-Ouest", "13", "region"),
      Subdivision("Séno", "SEN", "province"),
      Subdivision("Tapoa", "TAP", "province"),
      Subdivision("Tuy", "TUI", "province"),
      Subdivision("Yagha", "YAG", "province"),
      Subdivision("Yatenga", "YAT", "province"),
      Subdivision("Ziro", "ZIR", "province"),
      Subdivision("Zondoma", "ZON", "province"),
      Subdivision("Zoundwéogo", "ZOU", "province")
    )
  }

  case object BG extends Country("Bulgaria", "BG", "BGR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Blagoevgrad", "01", "district"),
      Subdivision("Burgas", "02", "district"),
      Subdivision("Dobrich", "08", "district"),
      Subdivision("Gabrovo", "07", "district"),
      Subdivision("Haskovo", "26", "district"),
      Subdivision("Kardzhali", "09", "district"),
      Subdivision("Kyustendil", "10", "district"),
      Subdivision("Lovech", "11", "district"),
      Subdivision("Montana", "12", "district"),
      Subdivision("Pazardzhik", "13", "district"),
      Subdivision("Pernik", "14", "district"),
      Subdivision("Pleven", "15", "district"),
      Subdivision("Plovdiv", "16", "district"),
      Subdivision("Razgrad", "17", "district"),
      Subdivision("Ruse", "18", "district"),
      Subdivision("Shumen", "27", "district"),
      Subdivision("Silistra", "19", "district"),
      Subdivision("Sliven", "20", "district"),
      Subdivision("Smolyan", "21", "district"),
      Subdivision("Sofia", "23", "district"),
      Subdivision("Sofia", "22", "district"),
      Subdivision("Stara Zagora", "24", "district"),
      Subdivision("Targovishte", "25", "district"),
      Subdivision("Varna", "03", "district"),
      Subdivision("Veliko Tarnovo", "04", "district"),
      Subdivision("Vidin", "05", "district"),
      Subdivision("Vratsa", "06", "district"),
      Subdivision("Yambol", "28", "district")
    )
  }

  case object BH extends Country("Bahrain", "BH", "BHR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Janūbīyah", "14", "governorate"),
      Subdivision("Al Muḩarraq", "15", "governorate"),
      Subdivision("Al ‘Āşimah", "13", "governorate"),
      Subdivision("Ash Shamālīyah", "17", "governorate")
    )
  }

  case object BI extends Country("Burundi", "BI", "BDI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bubanza", "BB", "province"),
      Subdivision("Bujumbura Mairie", "BM", "province"),
      Subdivision("Bujumbura Rural", "BL", "province"),
      Subdivision("Bururi", "BR", "province"),
      Subdivision("Cankuzo", "CA", "province"),
      Subdivision("Cibitoke", "CI", "province"),
      Subdivision("Gitega", "GI", "province"),
      Subdivision("Karuzi", "KR", "province"),
      Subdivision("Kayanza", "KY", "province"),
      Subdivision("Kirundo", "KI", "province"),
      Subdivision("Makamba", "MA", "province"),
      Subdivision("Muramvya", "MU", "province"),
      Subdivision("Muyinga", "MY", "province"),
      Subdivision("Mwaro", "MW", "province"),
      Subdivision("Ngozi", "NG", "province"),
      Subdivision("Rumonge", "RM", "province"),
      Subdivision("Rutana", "RT", "province"),
      Subdivision("Ruyigi", "RY", "province")
    )
  }

  case object BJ extends Country("Benin", "BJ", "BEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alibori", "AL", "department"),
      Subdivision("Atacora", "AK", "department"),
      Subdivision("Atlantique", "AQ", "department"),
      Subdivision("Borgou", "BO", "department"),
      Subdivision("Collines", "CO", "department"),
      Subdivision("Couffo", "KO", "department"),
      Subdivision("Donga", "DO", "department"),
      Subdivision("Littoral", "LI", "department"),
      Subdivision("Mono", "MO", "department"),
      Subdivision("Ouémé", "OU", "department"),
      Subdivision("Plateau", "PL", "department"),
      Subdivision("Zou", "ZO", "department")
    )
  }

  case object BL extends Country("Saint Barthélemy", "BL", "BLM")

  case object BM extends Country("Bermuda", "BM", "BMU")

  case object BN extends Country("Brunei Darussalam", "BN", "BRN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Belait", "BE", "district"),
      Subdivision("Brunei dan Muara", "BM", "district"),
      Subdivision("Temburong", "TE", "district"),
      Subdivision("Tutong", "TU", "district")
    )
  }

  case object BO extends Country("Bolivia (Plurinational State of)", "BO", "BOL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chuquisaca", "H", "department"),
      Subdivision("Cochabamba", "C", "department"),
      Subdivision("El Beni", "B", "department"),
      Subdivision("La Paz", "L", "department"),
      Subdivision("Oruro", "O", "department"),
      Subdivision("Pando", "N", "department"),
      Subdivision("Potosí", "P", "department"),
      Subdivision("Santa Cruz", "S", "department"),
      Subdivision("Tarija", "T", "department")
    )
  }

  case object BQ extends Country("Bonaire, Sint Eustatius and Saba", "BQ", "BES") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bonaire", "BO", "special municipality"),
      Subdivision("Saba", "SA", "special municipality"),
      Subdivision("Sint Eustatius", "SE", "special municipality")
    )
  }

  case object BR extends Country("Brazil", "BR", "BRA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acre", "AC", "state"),
      Subdivision("Alagoas", "AL", "state"),
      Subdivision("Amapá", "AP", "state"),
      Subdivision("Amazonas", "AM", "state"),
      Subdivision("Bahia", "BA", "state"),
      Subdivision("Ceará", "CE", "state"),
      Subdivision("Distrito Federal", "DF", "federal district"),
      Subdivision("Espírito Santo", "ES", "state"),
      Subdivision("Goiás", "GO", "state"),
      Subdivision("Maranhão", "MA", "state"),
      Subdivision("Mato Grosso", "MT", "state"),
      Subdivision("Mato Grosso do Sul", "MS", "state"),
      Subdivision("Minas Gerais", "MG", "state"),
      Subdivision("Paraná", "PR", "state"),
      Subdivision("Paraíba", "PB", "state"),
      Subdivision("Pará", "PA", "state"),
      Subdivision("Pernambuco", "PE", "state"),
      Subdivision("Piauí", "PI", "state"),
      Subdivision("Rio Grande do Norte", "RN", "state"),
      Subdivision("Rio Grande do Sul", "RS", "state"),
      Subdivision("Rio de Janeiro", "RJ", "state"),
      Subdivision("Rondônia", "RO", "state"),
      Subdivision("Roraima", "RR", "state"),
      Subdivision("Santa Catarina", "SC", "state"),
      Subdivision("Sergipe", "SE", "state"),
      Subdivision("São Paulo", "SP", "state"),
      Subdivision("Tocantins", "TO", "state")
    )
  }

  case object BS extends Country("Bahamas (the)", "BS", "BHS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acklins", "AK", "district"),
      Subdivision("Berry Islands", "BY", "district"),
      Subdivision("Bimini", "BI", "district"),
      Subdivision("Black Point", "BP", "district"),
      Subdivision("Cat Island", "CI", "district"),
      Subdivision("Central Abaco", "CO", "district"),
      Subdivision("Central Andros", "CS", "district"),
      Subdivision("Central Eleuthera", "CE", "district"),
      Subdivision("City of Freeport", "FP", "district"),
      Subdivision("Crooked Island and Long Cay", "CK", "district"),
      Subdivision("East Grand Bahama", "EG", "district"),
      Subdivision("Exuma", "EX", "district"),
      Subdivision("Grand Cay", "GC", "district"),
      Subdivision("Harbour Island", "HI", "district"),
      Subdivision("Hope Town", "HT", "district"),
      Subdivision("Inagua", "IN", "district"),
      Subdivision("Long Island", "LI", "district"),
      Subdivision("Mangrove Cay", "MC", "district"),
      Subdivision("Mayaguana", "MG", "district"),
      Subdivision("Moore's Island", "MI", "district"),
      Subdivision("New Providence", "NP", "island"),
      Subdivision("North Abaco", "NO", "district"),
      Subdivision("North Andros", "NS", "district"),
      Subdivision("North Eleuthera", "NE", "district"),
      Subdivision("Ragged Island", "RI", "district"),
      Subdivision("Rum Cay", "RC", "district"),
      Subdivision("San Salvador", "SS", "district"),
      Subdivision("South Abaco", "SO", "district"),
      Subdivision("South Andros", "SA", "district"),
      Subdivision("South Eleuthera", "SE", "district"),
      Subdivision("Spanish Wells", "SW", "district"),
      Subdivision("West Grand Bahama", "WG", "district")
    )
  }

  case object BT extends Country("Bhutan", "BT", "BTN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bumthang", "33", "district"),
      Subdivision("Chhukha", "12", "district"),
      Subdivision("Dagana", "22", "district"),
      Subdivision("Gasa", "GA", "district"),
      Subdivision("Haa", "13", "district"),
      Subdivision("Lhuentse", "44", "district"),
      Subdivision("Monggar", "42", "district"),
      Subdivision("Paro", "11", "district"),
      Subdivision("Pema Gatshel", "43", "district"),
      Subdivision("Punakha", "23", "district"),
      Subdivision("Samdrup Jongkhar", "45", "district"),
      Subdivision("Samtse", "14", "district"),
      Subdivision("Sarpang", "31", "district"),
      Subdivision("Thimphu", "15", "district"),
      Subdivision("Trashi Yangtse", "TY", "district"),
      Subdivision("Trashigang", "41", "district"),
      Subdivision("Trongsa", "32", "district"),
      Subdivision("Tsirang", "21", "district"),
      Subdivision("Wangdue Phodrang", "24", "district"),
      Subdivision("Zhemgang", "34", "district")
    )
  }

  case object BV extends Country("Bouvet Island", "BV", "BVT")

  case object BW extends Country("Botswana", "BW", "BWA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central", "CE", "district"),
      Subdivision("Chobe", "CH", "district"),
      Subdivision("Francistown", "FR", "city"),
      Subdivision("Gaborone", "GA", "city"),
      Subdivision("Ghanzi", "GH", "district"),
      Subdivision("Jwaneng", "JW", "town"),
      Subdivision("Kgalagadi", "KG", "district"),
      Subdivision("Kgatleng", "KL", "district"),
      Subdivision("Kweneng", "KW", "district"),
      Subdivision("Lobatse", "LO", "town"),
      Subdivision("North East", "NE", "district"),
      Subdivision("North West", "NW", "district"),
      Subdivision("Selibe Phikwe", "SP", "town"),
      Subdivision("South East", "SE", "district"),
      Subdivision("Southern", "SO", "district"),
      Subdivision("Sowa Town", "ST", "town")
    )
  }

  case object BY extends Country("Belarus", "BY", "BLR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bresckaja voblasć", "BR", "oblast"),
      Subdivision("Gomel'skaja oblast'", "HO", "oblast"),
      Subdivision("Gorod Minsk", "HM", "city"),
      Subdivision("Grodnenskaja oblast'", "HR", "oblast"),
      Subdivision("Mahilioŭskaja voblasć", "MA", "oblast"),
      Subdivision("Minskaja oblast'", "MI", "oblast"),
      Subdivision("Viciebskaja voblasć", "VI", "oblast")
    )
  }

  case object BZ extends Country("Belize", "BZ", "BLZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Belize", "BZ", "district"),
      Subdivision("Cayo", "CY", "district"),
      Subdivision("Corozal", "CZL", "district"),
      Subdivision("Orange Walk", "OW", "district"),
      Subdivision("Stann Creek", "SC", "district"),
      Subdivision("Toledo", "TOL", "district")
    )
  }

  case object CA extends Country("Canada", "CA", "CAN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alberta", "AB", "province"),
      Subdivision("British Columbia", "BC", "province"),
      Subdivision("Manitoba", "MB", "province"),
      Subdivision("New Brunswick", "NB", "province"),
      Subdivision("Newfoundland and Labrador", "NL", "province"),
      Subdivision("Northwest Territories", "NT", "territory"),
      Subdivision("Nouvelle-Écosse", "NS", "province"),
      Subdivision("Nunavut", "NU", "territory"),
      Subdivision("Ontario", "ON", "province"),
      Subdivision("Prince Edward Island", "PE", "province"),
      Subdivision("Quebec", "QC", "province"),
      Subdivision("Saskatchewan", "SK", "province"),
      Subdivision("Yukon", "YT", "territory")
    )
  }

  case object CC extends Country("Cocos (Keeling) Islands (the)", "CC", "CCK")

  case object CD extends Country("Congo (the Democratic Republic of the)", "CD", "COD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bas-Uélé", "BU", "province"),
      Subdivision("Haut-Katanga", "HK", "province"),
      Subdivision("Haut-Lomami", "HL", "province"),
      Subdivision("Haut-Uélé", "HU", "province"),
      Subdivision("Ituri", "IT", "province"),
      Subdivision("Kasaï", "KS", "province"),
      Subdivision("Kasaï Central", "KC", "province"),
      Subdivision("Kasaï Oriental", "KE", "province"),
      Subdivision("Kinshasa", "KN", "city"),
      Subdivision("Kongo Central", "BC", "province"),
      Subdivision("Kwango", "KG", "province"),
      Subdivision("Kwilu", "KL", "province"),
      Subdivision("Lomami", "LO", "province"),
      Subdivision("Lualaba", "LU", "province"),
      Subdivision("Mai-Ndombe", "MN", "province"),
      Subdivision("Maniema", "MA", "province"),
      Subdivision("Mongala", "MO", "province"),
      Subdivision("Nord-Kivu", "NK", "province"),
      Subdivision("Nord-Ubangi", "NU", "province"),
      Subdivision("Sankuru", "SA", "province"),
      Subdivision("Sud-Kivu", "SK", "province"),
      Subdivision("Sud-Ubangi", "SU", "province"),
      Subdivision("Tanganyika", "TA", "province"),
      Subdivision("Tshopo", "TO", "province"),
      Subdivision("Tshuapa", "TU", "province"),
      Subdivision("Équateur", "EQ", "province")
    )
  }

  case object CF extends Country("Central African Republic (the)", "CF", "CAF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bamingui-Bangoran", "BB", "prefecture"),
      Subdivision("Bangui", "BGF", "commune"),
      Subdivision("Basse-Kotto", "BK", "prefecture"),
      Subdivision("Gribingui", "KB", "economic prefecture"),
      Subdivision("Haut-Mbomou", "HM", "prefecture"),
      Subdivision("Haute-Kotto", "HK", "prefecture"),
      Subdivision("Haute-Sangha / Mambéré-Kadéï", "HS", "prefecture"),
      Subdivision("Kemö-Gïrïbïngï", "KG", "prefecture"),
      Subdivision("Lobaye", "LB", "prefecture"),
      Subdivision("Mbomou", "MB", "prefecture"),
      Subdivision("Nana-Mambéré", "NM", "prefecture"),
      Subdivision("Ombella-Mpoko", "MP", "prefecture"),
      Subdivision("Ouaka", "UK", "prefecture"),
      Subdivision("Ouham", "AC", "prefecture"),
      Subdivision("Ouham-Pendé", "OP", "prefecture"),
      Subdivision("Sangha", "SE", "economic prefecture"),
      Subdivision("Vakaga", "VK", "prefecture")
    )
  }

  case object CG extends Country("Congo (the)", "CG", "COG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bouenza", "11", "department"),
      Subdivision("Brazzaville", "BZV", "department"),
      Subdivision("Cuvette", "8", "department"),
      Subdivision("Cuvette-Ouest", "15", "department"),
      Subdivision("Kouilou", "5", "department"),
      Subdivision("Likouala", "7", "department"),
      Subdivision("Lékoumou", "2", "department"),
      Subdivision("Niari", "9", "department"),
      Subdivision("Plateaux", "14", "department"),
      Subdivision("Pointe-Noire", "16", "department"),
      Subdivision("Pool", "12", "department"),
      Subdivision("Sangha", "13", "department")
    )
  }

  case object CH extends Country("Switzerland", "CH", "CHE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aargau", "AG", "canton"),
      Subdivision("Appenzell Ausserrhoden", "AR", "canton"),
      Subdivision("Appenzell Innerrhoden", "AI", "canton"),
      Subdivision("Basel-Landschaft", "BL", "canton"),
      Subdivision("Basel-Stadt", "BS", "canton"),
      Subdivision("Bern", "BE", "canton"),
      Subdivision("Freiburg", "FR", "canton"),
      Subdivision("Genève", "GE", "canton"),
      Subdivision("Glarus", "GL", "canton"),
      Subdivision("Graubünden", "GR", "canton"),
      Subdivision("Jura", "JU", "canton"),
      Subdivision("Luzern", "LU", "canton"),
      Subdivision("Neuchâtel", "NE", "canton"),
      Subdivision("Nidwalden", "NW", "canton"),
      Subdivision("Obwalden", "OW", "canton"),
      Subdivision("Sankt Gallen", "SG", "canton"),
      Subdivision("Schaffhausen", "SH", "canton"),
      Subdivision("Schwyz", "SZ", "canton"),
      Subdivision("Solothurn", "SO", "canton"),
      Subdivision("Thurgau", "TG", "canton"),
      Subdivision("Ticino", "TI", "canton"),
      Subdivision("Uri", "UR", "canton"),
      Subdivision("Valais", "VS", "canton"),
      Subdivision("Vaud", "VD", "canton"),
      Subdivision("Zug", "ZG", "canton"),
      Subdivision("Zürich", "ZH", "canton")
    )
  }

  case object CI extends Country("Côte d'Ivoire", "CI", "CIV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abidjan", "AB", "autonomous district"),
      Subdivision("Bas-Sassandra", "BS", "district"),
      Subdivision("Comoé", "CM", "district"),
      Subdivision("Denguélé", "DN", "district"),
      Subdivision("Gôh-Djiboua", "GD", "district"),
      Subdivision("Lacs", "LC", "district"),
      Subdivision("Lagunes", "LG", "district"),
      Subdivision("Montagnes", "MG", "district"),
      Subdivision("Sassandra-Marahoué", "SM", "district"),
      Subdivision("Savanes", "SV", "district"),
      Subdivision("Vallée du Bandama", "VB", "district"),
      Subdivision("Woroba", "WR", "district"),
      Subdivision("Yamoussoukro", "YM", "autonomous district"),
      Subdivision("Zanzan", "ZZ", "district")
    )
  }

  case object CK extends Country("Cook Islands (the)", "CK", "COK")

  case object CL extends Country("Chile", "CL", "CHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aisén del General Carlos Ibañez del Campo", "AI", "region"),
      Subdivision("Antofagasta", "AN", "region"),
      Subdivision("Arica y Parinacota", "AP", "region"),
      Subdivision("Atacama", "AT", "region"),
      Subdivision("Biobío", "BI", "region"),
      Subdivision("Coquimbo", "CO", "region"),
      Subdivision("La Araucanía", "AR", "region"),
      Subdivision("Libertador General Bernardo O'Higgins", "LI", "region"),
      Subdivision("Los Lagos", "LL", "region"),
      Subdivision("Los Ríos", "LR", "region"),
      Subdivision("Magallanes", "MA", "region"),
      Subdivision("Maule", "ML", "region"),
      Subdivision("Región Metropolitana de Santiago", "RM", "region"),
      Subdivision("Tarapacá", "TA", "region"),
      Subdivision("Valparaíso", "VS", "region"),
      Subdivision("Ñuble", "NB", "region")
    )
  }

  case object CM extends Country("Cameroon", "CM", "CMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adamaoua", "AD", "region"),
      Subdivision("Centre", "CE", "region"),
      Subdivision("East", "ES", "region"),
      Subdivision("Extrême-Nord", "EN", "region"),
      Subdivision("Littoral", "LT", "region"),
      Subdivision("Nord", "NO", "region"),
      Subdivision("Nord-Ouest", "NW", "region"),
      Subdivision("Ouest", "OU", "region"),
      Subdivision("South", "SU", "region"),
      Subdivision("South-West", "SW", "region")
    )
  }

  case object CN extends Country("China", "CN", "CHN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anhui Sheng", "AH", "province"),
      Subdivision("Aomen Tebiexingzhengqu", "MO", "special administrative region"),
      Subdivision("Beijing Shi", "BJ", "municipality"),
      Subdivision("Chongqing Shi", "CQ", "municipality"),
      Subdivision("Fujian Sheng", "FJ", "province"),
      Subdivision("Gansu Sheng", "GS", "province"),
      Subdivision("Guangdong Sheng", "GD", "province"),
      Subdivision("Guangxi Zhuangzu Zizhiqu", "GX", "autonomous region"),
      Subdivision("Guizhou Sheng", "GZ", "province"),
      Subdivision("Hainan Sheng", "HI", "province"),
      Subdivision("Hebei Sheng", "HE", "province"),
      Subdivision("Heilongjiang Sheng", "HL", "province"),
      Subdivision("Henan Sheng", "HA", "province"),
      Subdivision("Hong Kong SAR", "HK", "special administrative region"),
      Subdivision("Hubei Sheng", "HB", "province"),
      Subdivision("Hunan Sheng", "HN", "province"),
      Subdivision("Jiangsu Sheng", "JS", "province"),
      Subdivision("Jiangxi Sheng", "JX", "province"),
      Subdivision("Jilin Sheng", "JL", "province"),
      Subdivision("Liaoning Sheng", "LN", "province"),
      Subdivision("Nei Mongol Zizhiqu", "NM", "autonomous region"),
      Subdivision("Ningxia Huizu Zizhiqu", "NX", "autonomous region"),
      Subdivision("Qinghai Sheng", "QH", "province"),
      Subdivision("Shaanxi Sheng", "SN", "province"),
      Subdivision("Shandong Sheng", "SD", "province"),
      Subdivision("Shanghai Shi", "SH", "municipality"),
      Subdivision("Shanxi Sheng", "SX", "province"),
      Subdivision("Sichuan Sheng", "SC", "province"),
      Subdivision("Taiwan Sheng", "TW", "province"),
      Subdivision("Tianjin Shi", "TJ", "municipality"),
      Subdivision("Xinjiang Uygur Zizhiqu", "XJ", "autonomous region"),
      Subdivision("Xizang Zizhiqu", "XZ", "autonomous region"),
      Subdivision("Yunnan Sheng", "YN", "province"),
      Subdivision("Zhejiang Sheng", "ZJ", "province")
    )
  }

  case object CO extends Country("Colombia", "CO", "COL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amazonas", "AMA", "department"),
      Subdivision("Antioquia", "ANT", "department"),
      Subdivision("Arauca", "ARA", "department"),
      Subdivision("Atlántico", "ATL", "department"),
      Subdivision("Bolívar", "BOL", "department"),
      Subdivision("Boyacá", "BOY", "department"),
      Subdivision("Caldas", "CAL", "department"),
      Subdivision("Caquetá", "CAQ", "department"),
      Subdivision("Casanare", "CAS", "department"),
      Subdivision("Cauca", "CAU", "department"),
      Subdivision("Cesar", "CES", "department"),
      Subdivision("Chocó", "CHO", "department"),
      Subdivision("Cundinamarca", "CUN", "department"),
      Subdivision("Córdoba", "COR", "department"),
      Subdivision("Distrito Capital de Bogotá", "DC", "capital district"),
      Subdivision("Guainía", "GUA", "department"),
      Subdivision("Guaviare", "GUV", "department"),
      Subdivision("Huila", "HUI", "department"),
      Subdivision("La Guajira", "LAG", "department"),
      Subdivision("Magdalena", "MAG", "department"),
      Subdivision("Meta", "MET", "department"),
      Subdivision("Nariño", "NAR", "department"),
      Subdivision("Norte de Santander", "NSA", "department"),
      Subdivision("Putumayo", "PUT", "department"),
      Subdivision("Quindío", "QUI", "department"),
      Subdivision("Risaralda", "RIS", "department"),
      Subdivision("San Andrés, Providencia y Santa Catalina", "SAP", "department"),
      Subdivision("Santander", "SAN", "department"),
      Subdivision("Sucre", "SUC", "department"),
      Subdivision("Tolima", "TOL", "department"),
      Subdivision("Valle del Cauca", "VAC", "department"),
      Subdivision("Vaupés", "VAU", "department"),
      Subdivision("Vichada", "VID", "department")
    )
  }

  case object CR extends Country("Costa Rica", "CR", "CRI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alajuela", "A", "province"),
      Subdivision("Cartago", "C", "province"),
      Subdivision("Guanacaste", "G", "province"),
      Subdivision("Heredia", "H", "province"),
      Subdivision("Limón", "L", "province"),
      Subdivision("Puntarenas", "P", "province"),
      Subdivision("San José", "SJ", "province")
    )
  }

  case object CU extends Country("Cuba", "CU", "CUB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artemisa", "15", "province"),
      Subdivision("Camagüey", "09", "province"),
      Subdivision("Ciego de Ávila", "08", "province"),
      Subdivision("Cienfuegos", "06", "province"),
      Subdivision("Granma", "12", "province"),
      Subdivision("Guantánamo", "14", "province"),
      Subdivision("Holguín", "11", "province"),
      Subdivision("Isla de la Juventud", "99", "special municipality"),
      Subdivision("La Habana", "03", "province"),
      Subdivision("Las Tunas", "10", "province"),
      Subdivision("Matanzas", "04", "province"),
      Subdivision("Mayabeque", "16", "province"),
      Subdivision("Pinar del Río", "01", "province"),
      Subdivision("Sancti Spíritus", "07", "province"),
      Subdivision("Santiago de Cuba", "13", "province"),
      Subdivision("Villa Clara", "05", "province")
    )
  }

  case object CV extends Country("Cabo Verde", "CV", "CPV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Boa Vista", "BV", "municipality"),
      Subdivision("Brava", "BR", "municipality"),
      Subdivision("Ilhas de Barlavento", "B", "geographical region"),
      Subdivision("Ilhas de Sotavento", "S", "geographical region"),
      Subdivision("Maio", "MA", "municipality"),
      Subdivision("Mosteiros", "MO", "municipality"),
      Subdivision("Paul", "PA", "municipality"),
      Subdivision("Porto Novo", "PN", "municipality"),
      Subdivision("Praia", "PR", "municipality"),
      Subdivision("Ribeira Brava", "RB", "municipality"),
      Subdivision("Ribeira Grande", "RG", "municipality"),
      Subdivision("Ribeira Grande de Santiago", "RS", "municipality"),
      Subdivision("Sal", "SL", "municipality"),
      Subdivision("Santa Catarina", "CA", "municipality"),
      Subdivision("Santa Catarina do Fogo", "CF", "municipality"),
      Subdivision("Santa Cruz", "CR", "municipality"),
      Subdivision("São Domingos", "SD", "municipality"),
      Subdivision("São Filipe", "SF", "municipality"),
      Subdivision("São Lourenço dos Órgãos", "SO", "municipality"),
      Subdivision("São Miguel", "SM", "municipality"),
      Subdivision("São Salvador do Mundo", "SS", "municipality"),
      Subdivision("São Vicente", "SV", "municipality"),
      Subdivision("Tarrafal", "TA", "municipality"),
      Subdivision("Tarrafal de São Nicolau", "TS", "municipality")
    )
  }

  case object CW extends Country("Curaçao", "CW", "CUW")

  case object CX extends Country("Christmas Island", "CX", "CXR")

  case object CY extends Country("Cyprus", "CY", "CYP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ammochostos", "04", "district"),
      Subdivision("Baf", "05", "district"),
      Subdivision("Girne", "06", "district"),
      Subdivision("Larnaka", "03", "district"),
      Subdivision("Lefkosia", "01", "district"),
      Subdivision("Lemesos", "02", "district")
    )
  }

  case object CZ extends Country("Czechia", "CZ", "CZE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Benešov", "201", "district"),
      Subdivision("Beroun", "202", "district"),
      Subdivision("Blansko", "641", "district"),
      Subdivision("Brno-město", "642", "district"),
      Subdivision("Brno-venkov", "643", "district"),
      Subdivision("Bruntál", "801", "district"),
      Subdivision("Břeclav", "644", "district"),
      Subdivision("Cheb", "411", "district"),
      Subdivision("Chomutov", "422", "district"),
      Subdivision("Chrudim", "531", "district"),
      Subdivision("Domažlice", "321", "district"),
      Subdivision("Děčín", "421", "district"),
      Subdivision("Frýdek-Místek", "802", "district"),
      Subdivision("Havlíčkův Brod", "631", "district"),
      Subdivision("Hodonín", "645", "district"),
      Subdivision("Hradec Králové", "521", "district"),
      Subdivision("Jablonec nad Nisou", "512", "district"),
      Subdivision("Jeseník", "711", "district"),
      Subdivision("Jihlava", "632", "district"),
      Subdivision("Jihomoravský kraj", "64", "region"),
      Subdivision("Jihočeský kraj", "31", "region"),
      Subdivision("Jindřichův Hradec", "313", "district"),
      Subdivision("Jičín", "522", "district"),
      Subdivision("Karlovarský kraj", "41", "region"),
      Subdivision("Karlovy Vary", "412", "district"),
      Subdivision("Karviná", "803", "district"),
      Subdivision("Kladno", "203", "district"),
      Subdivision("Klatovy", "322", "district"),
      Subdivision("Kolín", "204", "district"),
      Subdivision("Kraj Vysočina", "63", "region"),
      Subdivision("Kroměříž", "721", "district"),
      Subdivision("Královéhradecký kraj", "52", "region"),
      Subdivision("Kutná Hora", "205", "district"),
      Subdivision("Liberec", "513", "district"),
      Subdivision("Liberecký kraj", "51", "region"),
      Subdivision("Litoměřice", "423", "district"),
      Subdivision("Louny", "424", "district"),
      Subdivision("Mladá Boleslav", "207", "district"),
      Subdivision("Moravskoslezský kraj", "80", "region"),
      Subdivision("Most", "425", "district"),
      Subdivision("Mělník", "206", "district"),
      Subdivision("Nový Jičín", "804", "district"),
      Subdivision("Nymburk", "208", "district"),
      Subdivision("Náchod", "523", "district"),
      Subdivision("Olomouc", "712", "district"),
      Subdivision("Olomoucký kraj", "71", "region"),
      Subdivision("Opava", "805", "district"),
      Subdivision("Ostrava-město", "806", "district"),
      Subdivision("Pardubice", "532", "district"),
      Subdivision("Pardubický kraj", "53", "region"),
      Subdivision("Pelhřimov", "633", "district"),
      Subdivision("Plzeň-jih", "324", "district"),
      Subdivision("Plzeň-město", "323", "district"),
      Subdivision("Plzeň-sever", "325", "district"),
      Subdivision("Plzeňský kraj", "32", "region"),
      Subdivision("Prachatice", "315", "district"),
      Subdivision("Praha, Hlavní město", "10", "capital city"),
      Subdivision("Praha-východ", "209", "district"),
      Subdivision("Praha-západ", "20A", "district"),
      Subdivision("Prostějov", "713", "district"),
      Subdivision("Písek", "314", "district"),
      Subdivision("Přerov", "714", "district"),
      Subdivision("Příbram", "20B", "district"),
      Subdivision("Rakovník", "20C", "district"),
      Subdivision("Rokycany", "326", "district"),
      Subdivision("Rychnov nad Kněžnou", "524", "district"),
      Subdivision("Semily", "514", "district"),
      Subdivision("Sokolov", "413", "district"),
      Subdivision("Strakonice", "316", "district"),
      Subdivision("Středočeský kraj", "20", "region"),
      Subdivision("Svitavy", "533", "district"),
      Subdivision("Tachov", "327", "district"),
      Subdivision("Teplice", "426", "district"),
      Subdivision("Trutnov", "525", "district"),
      Subdivision("Tábor", "317", "district"),
      Subdivision("Třebíč", "634", "district"),
      Subdivision("Uherské Hradiště", "722", "district"),
      Subdivision("Vsetín", "723", "district"),
      Subdivision("Vyškov", "646", "district"),
      Subdivision("Zlín", "724", "district"),
      Subdivision("Zlínský kraj", "72", "region"),
      Subdivision("Znojmo", "647", "district"),
      Subdivision("Ústecký kraj", "42", "region"),
      Subdivision("Ústí nad Labem", "427", "district"),
      Subdivision("Ústí nad Orlicí", "534", "district"),
      Subdivision("Česká Lípa", "511", "district"),
      Subdivision("České Budějovice", "311", "district"),
      Subdivision("Český Krumlov", "312", "district"),
      Subdivision("Šumperk", "715", "district"),
      Subdivision("Žďár nad Sázavou", "635", "district")
    )
  }

  case object DE extends Country("Germany", "DE", "DEU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baden-Württemberg", "BW", "Land"),
      Subdivision("Bayern", "BY", "Land"),
      Subdivision("Berlin", "BE", "Land"),
      Subdivision("Brandenburg", "BB", "Land"),
      Subdivision("Bremen", "HB", "Land"),
      Subdivision("Hamburg", "HH", "Land"),
      Subdivision("Hessen", "HE", "Land"),
      Subdivision("Mecklenburg-Vorpommern", "MV", "Land"),
      Subdivision("Niedersachsen", "NI", "Land"),
      Subdivision("Nordrhein-Westfalen", "NW", "Land"),
      Subdivision("Rheinland-Pfalz", "RP", "Land"),
      Subdivision("Saarland", "SL", "Land"),
      Subdivision("Sachsen", "SN", "Land"),
      Subdivision("Sachsen-Anhalt", "ST", "Land"),
      Subdivision("Schleswig-Holstein", "SH", "Land"),
      Subdivision("Thüringen", "TH", "Land")
    )
  }

  case object DJ extends Country("Djibouti", "DJ", "DJI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ali Sabieh", "AS", "region"),
      Subdivision("Arta", "AR", "region"),
      Subdivision("Awbūk", "OB", "region"),
      Subdivision("Dikhil", "DI", "region"),
      Subdivision("Djibouti", "DJ", "city"),
      Subdivision("Tadjourah", "TA", "region")
    )
  }

  case object DK extends Country("Denmark", "DK", "DNK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Hovedstaden", "84", "region"),
      Subdivision("Midtjylland", "82", "region"),
      Subdivision("Nordjylland", "81", "region"),
      Subdivision("Sjælland", "85", "region"),
      Subdivision("Syddanmark", "83", "region")
    )
  }

  case object DM extends Country("Dominica", "DM", "DMA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Saint Andrew", "02", "parish"),
      Subdivision("Saint David", "03", "parish"),
      Subdivision("Saint George", "04", "parish"),
      Subdivision("Saint John", "05", "parish"),
      Subdivision("Saint Joseph", "06", "parish"),
      Subdivision("Saint Luke", "07", "parish"),
      Subdivision("Saint Mark", "08", "parish"),
      Subdivision("Saint Patrick", "09", "parish"),
      Subdivision("Saint Paul", "10", "parish"),
      Subdivision("Saint Peter", "11", "parish")
    )
  }

  case object DO extends Country("Dominican Republic (the)", "DO", "DOM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azua", "02", "province"),
      Subdivision("Baoruco", "03", "province"),
      Subdivision("Barahona", "04", "province"),
      Subdivision("Cibao Nordeste", "33", "region"),
      Subdivision("Cibao Noroeste", "34", "region"),
      Subdivision("Cibao Norte", "35", "region"),
      Subdivision("Cibao Sur", "36", "region"),
      Subdivision("Dajabón", "05", "province"),
      Subdivision("Distrito Nacional", "01", "district"),
      Subdivision("Duarte", "06", "province"),
      Subdivision("El Seibo", "08", "province"),
      Subdivision("El Valle", "37", "region"),
      Subdivision("Elías Piña", "07", "province"),
      Subdivision("Enriquillo", "38", "region"),
      Subdivision("Espaillat", "09", "province"),
      Subdivision("Hato Mayor", "30", "province"),
      Subdivision("Hermanas Mirabal", "19", "province"),
      Subdivision("Higuamo", "39", "region"),
      Subdivision("Independencia", "10", "province"),
      Subdivision("La Altagracia", "11", "province"),
      Subdivision("La Romana", "12", "province"),
      Subdivision("La Vega", "13", "province"),
      Subdivision("María Trinidad Sánchez", "14", "province"),
      Subdivision("Monseñor Nouel", "28", "province"),
      Subdivision("Monte Cristi", "15", "province"),
      Subdivision("Monte Plata", "29", "province"),
      Subdivision("Ozama", "40", "region"),
      Subdivision("Pedernales", "16", "province"),
      Subdivision("Peravia", "17", "province"),
      Subdivision("Puerto Plata", "18", "province"),
      Subdivision("Samaná", "20", "province"),
      Subdivision("San Cristóbal", "21", "province"),
      Subdivision("San José de Ocoa", "31", "province"),
      Subdivision("San Juan", "22", "province"),
      Subdivision("San Pedro de Macorís", "23", "province"),
      Subdivision("Santiago", "25", "province"),
      Subdivision("Santiago Rodríguez", "26", "province"),
      Subdivision("Santo Domingo", "32", "province"),
      Subdivision("Sánchez Ramírez", "24", "province"),
      Subdivision("Valdesia", "41", "region"),
      Subdivision("Valverde", "27", "province"),
      Subdivision("Yuma", "42", "region")
    )
  }

  case object DZ extends Country("Algeria", "DZ", "DZA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adrar", "01", "province"),
      Subdivision("Alger", "16", "province"),
      Subdivision("Annaba", "23", "province"),
      Subdivision("Aïn Defla", "44", "province"),
      Subdivision("Aïn Témouchent", "46", "province"),
      Subdivision("Batna", "05", "province"),
      Subdivision("Biskra", "07", "province"),
      Subdivision("Blida", "09", "province"),
      Subdivision("Bordj Bou Arréridj", "34", "province"),
      Subdivision("Bouira", "10", "province"),
      Subdivision("Boumerdès", "35", "province"),
      Subdivision("Béchar", "08", "province"),
      Subdivision("Béjaïa", "06", "province"),
      Subdivision("Chlef", "02", "province"),
      Subdivision("Constantine", "25", "province"),
      Subdivision("Djelfa", "17", "province"),
      Subdivision("El Bayadh", "32", "province"),
      Subdivision("El Oued", "39", "province"),
      Subdivision("El Tarf", "36", "province"),
      Subdivision("Ghardaïa", "47", "province"),
      Subdivision("Guelma", "24", "province"),
      Subdivision("Illizi", "33", "province"),
      Subdivision("Jijel", "18", "province"),
      Subdivision("Khenchela", "40", "province"),
      Subdivision("Laghouat", "03", "province"),
      Subdivision("M'sila", "28", "province"),
      Subdivision("Mascara", "29", "province"),
      Subdivision("Mila", "43", "province"),
      Subdivision("Mostaganem", "27", "province"),
      Subdivision("Médéa", "26", "province"),
      Subdivision("Naama", "45", "province"),
      Subdivision("Oran", "31", "province"),
      Subdivision("Ouargla", "30", "province"),
      Subdivision("Oum el Bouaghi", "04", "province"),
      Subdivision("Relizane", "48", "province"),
      Subdivision("Saïda", "20", "province"),
      Subdivision("Sidi Bel Abbès", "22", "province"),
      Subdivision("Skikda", "21", "province"),
      Subdivision("Souk Ahras", "41", "province"),
      Subdivision("Sétif", "19", "province"),
      Subdivision("Tamanrasset", "11", "province"),
      Subdivision("Tiaret", "14", "province"),
      Subdivision("Tindouf", "37", "province"),
      Subdivision("Tipaza", "42", "province"),
      Subdivision("Tissemsilt", "38", "province"),
      Subdivision("Tizi Ouzou", "15", "province"),
      Subdivision("Tlemcen", "13", "province"),
      Subdivision("Tébessa", "12", "province")
    )
  }

  case object EC extends Country("Ecuador", "EC", "ECU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azuay", "A", "province"),
      Subdivision("Bolívar", "B", "province"),
      Subdivision("Carchi", "C", "province"),
      Subdivision("Cañar", "F", "province"),
      Subdivision("Chimborazo", "H", "province"),
      Subdivision("Cotopaxi", "X", "province"),
      Subdivision("El Oro", "O", "province"),
      Subdivision("Esmeraldas", "E", "province"),
      Subdivision("Galápagos", "W", "province"),
      Subdivision("Guayas", "G", "province"),
      Subdivision("Imbabura", "I", "province"),
      Subdivision("Loja", "L", "province"),
      Subdivision("Los Ríos", "R", "province"),
      Subdivision("Manabí", "M", "province"),
      Subdivision("Morona Santiago", "S", "province"),
      Subdivision("Napo", "N", "province"),
      Subdivision("Orellana", "D", "province"),
      Subdivision("Pastaza", "Y", "province"),
      Subdivision("Pichincha", "P", "province"),
      Subdivision("Santa Elena", "SE", "province"),
      Subdivision("Santo Domingo de los Tsáchilas", "SD", "province"),
      Subdivision("Sucumbíos", "U", "province"),
      Subdivision("Tungurahua", "T", "province"),
      Subdivision("Zamora Chinchipe", "Z", "province")
    )
  }

  case object EE extends Country("Estonia", "EE", "EST") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alutaguse", "130", "rural municipality"),
      Subdivision("Anija", "141", "rural municipality"),
      Subdivision("Antsla", "142", "rural municipality"),
      Subdivision("Elva", "171", "rural municipality"),
      Subdivision("Haapsalu", "184", "urban municipality"),
      Subdivision("Haljala", "191", "rural municipality"),
      Subdivision("Harjumaa", "37", "county"),
      Subdivision("Harku", "198", "rural municipality"),
      Subdivision("Hiiumaa", "39", "county"),
      Subdivision("Hiiumaa", "205", "rural municipality"),
      Subdivision("Häädemeeste", "214", "rural municipality"),
      Subdivision("Ida-Virumaa", "45", "county"),
      Subdivision("Järva", "255", "rural municipality"),
      Subdivision("Järvamaa", "52", "county"),
      Subdivision("Jõelähtme", "245", "rural municipality"),
      Subdivision("Jõgeva", "247", "rural municipality"),
      Subdivision("Jõgevamaa", "50", "county"),
      Subdivision("Jõhvi", "251", "rural municipality"),
      Subdivision("Kadrina", "272", "rural municipality"),
      Subdivision("Kambja", "283", "rural municipality"),
      Subdivision("Kanepi", "284", "rural municipality"),
      Subdivision("Kastre", "291", "rural municipality"),
      Subdivision("Kehtna", "293", "rural municipality"),
      Subdivision("Keila", "296", "urban municipality"),
      Subdivision("Kihnu", "303", "rural municipality"),
      Subdivision("Kiili", "305", "rural municipality"),
      Subdivision("Kohila", "317", "rural municipality"),
      Subdivision("Kohtla-Järve", "321", "urban municipality"),
      Subdivision("Kose", "338", "rural municipality"),
      Subdivision("Kuusalu", "353", "rural municipality"),
      Subdivision("Loksa", "424", "urban municipality"),
      Subdivision("Luunja", "432", "rural municipality"),
      Subdivision("Lääne-Harju", "431", "rural municipality"),
      Subdivision("Lääne-Nigula", "441", "rural municipality"),
      Subdivision("Lääne-Virumaa", "60", "county"),
      Subdivision("Läänemaa", "56", "county"),
      Subdivision("Lääneranna", "430", "rural municipality"),
      Subdivision("Lüganuse", "442", "rural municipality"),
      Subdivision("Maardu", "446", "urban municipality"),
      Subdivision("Muhu", "478", "rural municipality"),
      Subdivision("Mulgi", "480", "rural municipality"),
      Subdivision("Mustvee", "486", "rural municipality"),
      Subdivision("Märjamaa", "503", "rural municipality"),
      Subdivision("Narva", "511", "urban municipality"),
      Subdivision("Narva-Jõesuu", "514", "urban municipality"),
      Subdivision("Nõo", "528", "rural municipality"),
      Subdivision("Otepää", "557", "rural municipality"),
      Subdivision("Paide", "567", "urban municipality"),
      Subdivision("Peipsiääre", "586", "rural municipality"),
      Subdivision("Pärnu", "624", "urban municipality"),
      Subdivision("Pärnumaa", "68", "county"),
      Subdivision("Põhja-Pärnumaa", "638", "rural municipality"),
      Subdivision("Põhja-Sakala", "615", "rural municipality"),
      Subdivision("Põltsamaa", "618", "rural municipality"),
      Subdivision("Põlva", "622", "rural municipality"),
      Subdivision("Põlvamaa", "64", "county"),
      Subdivision("Raasiku", "651", "rural municipality"),
      Subdivision("Rae", "653", "rural municipality"),
      Subdivision("Rakvere", "663", "urban municipality"),
      Subdivision("Rakvere", "661", "rural municipality"),
      Subdivision("Rapla", "668", "rural municipality"),
      Subdivision("Raplamaa", "71", "county"),
      Subdivision("Ruhnu", "689", "rural municipality"),
      Subdivision("Räpina", "708", "rural municipality"),
      Subdivision("Rõuge", "698", "rural municipality"),
      Subdivision("Saarde", "712", "rural municipality"),
      Subdivision("Saaremaa", "74", "county"),
      Subdivision("Saaremaa", "714", "rural municipality"),
      Subdivision("Saku", "719", "rural municipality"),
      Subdivision("Saue", "726", "rural municipality"),
      Subdivision("Setomaa", "732", "rural municipality"),
      Subdivision("Sillamäe", "735", "urban municipality"),
      Subdivision("Tallinn", "784", "urban municipality"),
      Subdivision("Tapa", "792", "rural municipality"),
      Subdivision("Tartu", "793", "urban municipality"),
      Subdivision("Tartu", "796", "rural municipality"),
      Subdivision("Tartumaa", "79", "county"),
      Subdivision("Toila", "803", "rural municipality"),
      Subdivision("Tori", "809", "rural municipality"),
      Subdivision("Tõrva", "824", "rural municipality"),
      Subdivision("Türi", "834", "rural municipality"),
      Subdivision("Valga", "855", "rural municipality"),
      Subdivision("Valgamaa", "81", "county"),
      Subdivision("Viimsi", "890", "rural municipality"),
      Subdivision("Viljandi", "897", "urban municipality"),
      Subdivision("Viljandi", "899", "rural municipality"),
      Subdivision("Viljandimaa", "84", "county"),
      Subdivision("Vinni", "901", "rural municipality"),
      Subdivision("Viru-Nigula", "903", "rural municipality"),
      Subdivision("Vormsi", "907", "rural municipality"),
      Subdivision("Väike-Maarja", "928", "rural municipality"),
      Subdivision("Võru", "919", "urban municipality"),
      Subdivision("Võru", "917", "rural municipality"),
      Subdivision("Võrumaa", "87", "county")
    )
  }

  case object EG extends Country("Egypt", "EG", "EGY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Daqahlīyah", "DK", "governorate"),
      Subdivision("Al Baḩr al Aḩmar", "BA", "governorate"),
      Subdivision("Al Buḩayrah", "BH", "governorate"),
      Subdivision("Al Fayyūm", "FYM", "governorate"),
      Subdivision("Al Gharbīyah", "GH", "governorate"),
      Subdivision("Al Iskandarīyah", "ALX", "governorate"),
      Subdivision("Al Ismā'īlīyah", "IS", "governorate"),
      Subdivision("Al Jīzah", "GZ", "governorate"),
      Subdivision("Al Minyā", "MN", "governorate"),
      Subdivision("Al Minūfīyah", "MNF", "governorate"),
      Subdivision("Al Qalyūbīyah", "KB", "governorate"),
      Subdivision("Al Qāhirah", "C", "governorate"),
      Subdivision("Al Uqşur", "LX", "governorate"),
      Subdivision("Al Wādī al Jadīd", "WAD", "governorate"),
      Subdivision("As Suways", "SUZ", "governorate"),
      Subdivision("Ash Sharqīyah", "SHR", "governorate"),
      Subdivision("Aswān", "ASN", "governorate"),
      Subdivision("Asyūţ", "AST", "governorate"),
      Subdivision("Banī Suwayf", "BNS", "governorate"),
      Subdivision("Būr Sa‘īd", "PTS", "governorate"),
      Subdivision("Dumyāţ", "DT", "governorate"),
      Subdivision("Janūb Sīnā'", "JS", "governorate"),
      Subdivision("Kafr ash Shaykh", "KFS", "governorate"),
      Subdivision("Maţrūḩ", "MT", "governorate"),
      Subdivision("Qinā", "KN", "governorate"),
      Subdivision("Shamāl Sīnā'", "SIN", "governorate"),
      Subdivision("Sūhāj", "SHG", "governorate")
    )
  }

  case object EH extends Country("Western Sahara", "EH", "ESH")

  case object ER extends Country("Eritrea", "ER", "ERI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Awsaţ", "MA", "region"),
      Subdivision("Al Janūbī", "DU", "region"),
      Subdivision("Ansabā", "AN", "region"),
      Subdivision("Debubawi K’eyyĭḥ Baḥri", "DK", "region"),
      Subdivision("Gash-Barka", "GB", "region"),
      Subdivision("Semienawi K’eyyĭḥ Baḥri", "SK", "region")
    )
  }

  case object ES extends Country("Spain", "ES", "ESP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("A Coruña", "C", "province"),
      Subdivision("Alacant", "A", "province"),
      Subdivision("Albacete", "AB", "province"),
      Subdivision("Almería", "AL", "province"),
      Subdivision("Andalucía", "AN", "autonomous community"),
      Subdivision("Araba", "VI", "province"),
      Subdivision("Aragón", "AR", "autonomous community"),
      Subdivision("Asturias", "O", "province"),
      Subdivision("Asturias, Principado de", "AS", "autonomous community"),
      Subdivision("Badajoz", "BA", "province"),
      Subdivision("Barcelona", "B", "province"),
      Subdivision("Bizkaia", "BI", "province"),
      Subdivision("Burgos", "BU", "province"),
      Subdivision("Canarias", "CN", "autonomous community"),
      Subdivision("Cantabria", "CB", "autonomous community"),
      Subdivision("Cantabria", "S", "province"),
      Subdivision("Castelló", "CS", "province"),
      Subdivision("Castilla y León", "CL", "autonomous community"),
      Subdivision("Castilla-La Mancha", "CM", "autonomous community"),
      Subdivision("Catalunya", "CT", "autonomous community"),
      Subdivision("Ceuta", "CE", "autonomous city in North Africa"),
      Subdivision("Ciudad Real", "CR", "province"),
      Subdivision("Cuenca", "CU", "province"),
      Subdivision("Cáceres", "CC", "province"),
      Subdivision("Cádiz", "CA", "province"),
      Subdivision("Córdoba", "CO", "province"),
      Subdivision("Euskal Herria", "PV", "autonomous community"),
      Subdivision("Extremadura", "EX", "autonomous community"),
      Subdivision("Galicia", "GA", "autonomous community"),
      Subdivision("Gipuzkoa", "SS", "province"),
      Subdivision("Girona", "GI", "province"),
      Subdivision("Granada", "GR", "province"),
      Subdivision("Guadalajara", "GU", "province"),
      Subdivision("Huelva", "H", "province"),
      Subdivision("Huesca", "HU", "province"),
      Subdivision("Illes Balears", "IB", "autonomous community"),
      Subdivision("Illes Balears", "PM", "province"),
      Subdivision("Jaén", "J", "province"),
      Subdivision("La Rioja", "RI", "autonomous community"),
      Subdivision("La Rioja", "LO", "province"),
      Subdivision("Las Palmas", "GC", "province"),
      Subdivision("León", "LE", "province"),
      Subdivision("Lleida", "L", "province"),
      Subdivision("Lugo", "LU", "province"),
      Subdivision("Madrid", "M", "province"),
      Subdivision("Madrid, Comunidad de", "MD", "autonomous community"),
      Subdivision("Melilla", "ML", "autonomous city in North Africa"),
      Subdivision("Murcia", "MU", "province"),
      Subdivision("Murcia, Región de", "MC", "autonomous community"),
      Subdivision("Málaga", "MA", "province"),
      Subdivision("Nafarroa", "NA", "province"),
      Subdivision("Nafarroako Foru Komunitatea", "NC", "autonomous community"),
      Subdivision("Ourense", "OR", "province"),
      Subdivision("Palencia", "P", "province"),
      Subdivision("Pontevedra", "PO", "province"),
      Subdivision("Salamanca", "SA", "province"),
      Subdivision("Santa Cruz de Tenerife", "TF", "province"),
      Subdivision("Segovia", "SG", "province"),
      Subdivision("Sevilla", "SE", "province"),
      Subdivision("Soria", "SO", "province"),
      Subdivision("Tarragona", "T", "province"),
      Subdivision("Teruel", "TE", "province"),
      Subdivision("Toledo", "TO", "province"),
      Subdivision("Valencia", "V", "province"),
      Subdivision("Valenciana, Comunidad", "VC", "autonomous community"),
      Subdivision("Valladolid", "VA", "province"),
      Subdivision("Zamora", "ZA", "province"),
      Subdivision("Zaragoza", "Z", "province"),
      Subdivision("Ávila", "AV", "province")
    )
  }

  case object ET extends Country("Ethiopia", "ET", "ETH") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Addis Ababa", "AA", "administration"),
      Subdivision("Afar", "AF", "regional state"),
      Subdivision("Amara", "AM", "regional state"),
      Subdivision("Benshangul-Gumaz", "BE", "regional state"),
      Subdivision("Dire Dawa", "DD", "administration"),
      Subdivision("Gambela Peoples", "GA", "regional state"),
      Subdivision("Harari People", "HA", "regional state"),
      Subdivision("Oromia", "OR", "regional state"),
      Subdivision("Sidama", "SI", "regional state"),
      Subdivision("Somali", "SO", "regional state"),
      Subdivision("Southern Nations, Nationalities and Peoples", "SN", "regional state"),
      Subdivision("Tigrai", "TI", "regional state")
    )
  }

  case object FI extends Country("Finland", "FI", "FIN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahvenanmaan maakunta", "01", "region"),
      Subdivision("Birkaland", "11", "region"),
      Subdivision("Egentliga Finland", "19", "region"),
      Subdivision("Egentliga Tavastland", "06", "region"),
      Subdivision("Etelä-Karjala", "02", "region"),
      Subdivision("Etelä-Pohjanmaa", "03", "region"),
      Subdivision("Etelä-Savo", "04", "region"),
      Subdivision("Kainuu", "05", "region"),
      Subdivision("Keski-Pohjanmaa", "07", "region"),
      Subdivision("Keski-Suomi", "08", "region"),
      Subdivision("Kymenlaakso", "09", "region"),
      Subdivision("Lappi", "10", "region"),
      Subdivision("Norra Karelen", "13", "region"),
      Subdivision("Norra Savolax", "15", "region"),
      Subdivision("Norra Österbotten", "14", "region"),
      Subdivision("Nyland", "18", "region"),
      Subdivision("Pohjanmaa", "12", "region"),
      Subdivision("Päijänne-Tavastland", "16", "region"),
      Subdivision("Satakunda", "17", "region")
    )
  }

  case object FJ extends Country("Fiji", "FJ", "FJI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ba", "01", "province"),
      Subdivision("Bua", "02", "province"),
      Subdivision("Cakaudrove", "03", "province"),
      Subdivision("Central", "C", "division"),
      Subdivision("Eastern", "E", "division"),
      Subdivision("Kadavu", "04", "province"),
      Subdivision("Lau", "05", "province"),
      Subdivision("Lomaiviti", "06", "province"),
      Subdivision("Macuata", "07", "province"),
      Subdivision("Nadroga and Navosa", "08", "province"),
      Subdivision("Naitasiri", "09", "province"),
      Subdivision("Namosi", "10", "province"),
      Subdivision("Northern", "N", "division"),
      Subdivision("Ra", "11", "province"),
      Subdivision("Rewa", "12", "province"),
      Subdivision("Rotuma", "R", "dependency"),
      Subdivision("Serua", "13", "province"),
      Subdivision("Tailevu", "14", "province"),
      Subdivision("Western", "W", "division")
    )
  }

  case object FK extends Country("Falkland Islands (the)", "FK", "FLK")

  case object FM extends Country("Micronesia (Federated States of)", "FM", "FSM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chuuk", "TRK", "state"),
      Subdivision("Kosrae", "KSA", "state"),
      Subdivision("Pohnpei", "PNI", "state"),
      Subdivision("Yap", "YAP", "state")
    )
  }

  case object FO extends Country("Faroe Islands (the)", "FO", "FRO")

  case object FR extends Country("France", "FR", "FRA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ain", "01", "metropolitan department"),
      Subdivision("Aisne", "02", "metropolitan department"),
      Subdivision("Allier", "03", "metropolitan department"),
      Subdivision("Alpes-Maritimes", "06", "metropolitan department"),
      Subdivision("Alpes-de-Haute-Provence", "04", "metropolitan department"),
      Subdivision("Alsace", "6AE", "European collectivity"),
      Subdivision("Ardennes", "08", "metropolitan department"),
      Subdivision("Ardèche", "07", "metropolitan department"),
      Subdivision("Ariège", "09", "metropolitan department"),
      Subdivision("Aube", "10", "metropolitan department"),
      Subdivision("Aude", "11", "metropolitan department"),
      Subdivision("Auvergne-Rhône-Alpes", "ARA", "metropolitan region"),
      Subdivision("Aveyron", "12", "metropolitan department"),
      Subdivision("Bas-Rhin", "67", "metropolitan department"),
      Subdivision("Bouches-du-Rhône", "13", "metropolitan department"),
      Subdivision("Bourgogne-Franche-Comté", "BFC", "metropolitan region"),
      Subdivision("Bretagne", "BRE", "metropolitan region"),
      Subdivision("Calvados", "14", "metropolitan department"),
      Subdivision("Cantal", "15", "metropolitan department"),
      Subdivision("Centre-Val de Loire", "CVL", "metropolitan region"),
      Subdivision("Charente", "16", "metropolitan department"),
      Subdivision("Charente-Maritime", "17", "metropolitan department"),
      Subdivision("Cher", "18", "metropolitan department"),
      Subdivision("Clipperton", "CP", "dependency"),
      Subdivision("Corrèze", "19", "metropolitan department"),
      Subdivision("Corse", "20R", "metropolitan collectivity with special status"),
      Subdivision("Corse-du-Sud", "2A", "metropolitan department"),
      Subdivision("Creuse", "23", "metropolitan department"),
      Subdivision("Côte-d'Or", "21", "metropolitan department"),
      Subdivision("Côtes-d'Armor", "22", "metropolitan department"),
      Subdivision("Deux-Sèvres", "79", "metropolitan department"),
      Subdivision("Dordogne", "24", "metropolitan department"),
      Subdivision("Doubs", "25", "metropolitan department"),
      Subdivision("Drôme", "26", "metropolitan department"),
      Subdivision("Essonne", "91", "metropolitan department"),
      Subdivision("Eure", "27", "metropolitan department"),
      Subdivision("Eure-et-Loir", "28", "metropolitan department"),
      Subdivision("Finistère", "29", "metropolitan department"),
      Subdivision("Gard", "30", "metropolitan department"),
      Subdivision("Gers", "32", "metropolitan department"),
      Subdivision("Gironde", "33", "metropolitan department"),
      Subdivision("Grand-Est", "GES", "metropolitan region"),
      Subdivision("Guadeloupe", "971", "overseas departmental collectivity"),
      Subdivision("Guyane", "973", "overseas unique territorial collectivity"),
      Subdivision("Haut-Rhin", "68", "metropolitan department"),
      Subdivision("Haute-Corse", "2B", "metropolitan department"),
      Subdivision("Haute-Garonne", "31", "metropolitan department"),
      Subdivision("Haute-Loire", "43", "metropolitan department"),
      Subdivision("Haute-Marne", "52", "metropolitan department"),
      Subdivision("Haute-Savoie", "74", "metropolitan department"),
      Subdivision("Haute-Saône", "70", "metropolitan department"),
      Subdivision("Haute-Vienne", "87", "metropolitan department"),
      Subdivision("Hautes-Alpes", "05", "metropolitan department"),
      Subdivision("Hautes-Pyrénées", "65", "metropolitan department"),
      Subdivision("Hauts-de-France", "HDF", "metropolitan region"),
      Subdivision("Hauts-de-Seine", "92", "metropolitan department"),
      Subdivision("Hérault", "34", "metropolitan department"),
      Subdivision("Ille-et-Vilaine", "35", "metropolitan department"),
      Subdivision("Indre", "36", "metropolitan department"),
      Subdivision("Indre-et-Loire", "37", "metropolitan department"),
      Subdivision("Isère", "38", "metropolitan department"),
      Subdivision("Jura", "39", "metropolitan department"),
      Subdivision("La Réunion", "974", "overseas departmental collectivity"),
      Subdivision("Landes", "40", "metropolitan department"),
      Subdivision("Loir-et-Cher", "41", "metropolitan department"),
      Subdivision("Loire", "42", "metropolitan department"),
      Subdivision("Loire-Atlantique", "44", "metropolitan department"),
      Subdivision("Loiret", "45", "metropolitan department"),
      Subdivision("Lot", "46", "metropolitan department"),
      Subdivision("Lot-et-Garonne", "47", "metropolitan department"),
      Subdivision("Lozère", "48", "metropolitan department"),
      Subdivision("Maine-et-Loire", "49", "metropolitan department"),
      Subdivision("Manche", "50", "metropolitan department"),
      Subdivision("Marne", "51", "metropolitan department"),
      Subdivision("Martinique", "972", "overseas unique territorial collectivity"),
      Subdivision("Mayenne", "53", "metropolitan department"),
      Subdivision("Mayotte", "976", "overseas departmental collectivity"),
      Subdivision("Meurthe-et-Moselle", "54", "metropolitan department"),
      Subdivision("Meuse", "55", "metropolitan department"),
      Subdivision("Morbihan", "56", "metropolitan department"),
      Subdivision("Moselle", "57", "metropolitan department"),
      Subdivision("Métropole de Lyon", "69M", "metropolitan collectivity with special status"),
      Subdivision("Nièvre", "58", "metropolitan department"),
      Subdivision("Nord", "59", "metropolitan department"),
      Subdivision("Normandie", "NOR", "metropolitan region"),
      Subdivision("Nouvelle-Aquitaine", "NAQ", "metropolitan region"),
      Subdivision("Nouvelle-Calédonie", "NC", "overseas collectivity with special status"),
      Subdivision("Occitanie", "OCC", "metropolitan region"),
      Subdivision("Oise", "60", "metropolitan department"),
      Subdivision("Orne", "61", "metropolitan department"),
      Subdivision("Paris", "75C", "metropolitan collectivity with special status"),
      Subdivision("Pas-de-Calais", "62", "metropolitan department"),
      Subdivision("Pays-de-la-Loire", "PDL", "metropolitan region"),
      Subdivision("Polynésie française", "PF", "overseas collectivity"),
      Subdivision("Provence-Alpes-Côte-d’Azur", "PAC", "metropolitan region"),
      Subdivision("Puy-de-Dôme", "63", "metropolitan department"),
      Subdivision("Pyrénées-Atlantiques", "64", "metropolitan department"),
      Subdivision("Pyrénées-Orientales", "66", "metropolitan department"),
      Subdivision("Rhône", "69", "metropolitan department"),
      Subdivision("Saint-Barthélemy", "BL", "overseas collectivity"),
      Subdivision("Saint-Martin", "MF", "overseas collectivity"),
      Subdivision("Saint-Pierre-et-Miquelon", "PM", "overseas collectivity"),
      Subdivision("Sarthe", "72", "metropolitan department"),
      Subdivision("Savoie", "73", "metropolitan department"),
      Subdivision("Saône-et-Loire", "71", "metropolitan department"),
      Subdivision("Seine-Maritime", "76", "metropolitan department"),
      Subdivision("Seine-Saint-Denis", "93", "metropolitan department"),
      Subdivision("Seine-et-Marne", "77", "metropolitan department"),
      Subdivision("Somme", "80", "metropolitan department"),
      Subdivision("Tarn", "81", "metropolitan department"),
      Subdivision("Tarn-et-Garonne", "82", "metropolitan department"),
      Subdivision("Terres australes françaises", "TF", "overseas territory"),
      Subdivision("Territoire de Belfort", "90", "metropolitan department"),
      Subdivision("Val-d'Oise", "95", "metropolitan department"),
      Subdivision("Val-de-Marne", "94", "metropolitan department"),
      Subdivision("Var", "83", "metropolitan department"),
      Subdivision("Vaucluse", "84", "metropolitan department"),
      Subdivision("Vendée", "85", "metropolitan department"),
      Subdivision("Vienne", "86", "metropolitan department"),
      Subdivision("Vosges", "88", "metropolitan department"),
      Subdivision("Wallis-et-Futuna", "WF", "overseas collectivity"),
      Subdivision("Yonne", "89", "metropolitan department"),
      Subdivision("Yvelines", "78", "metropolitan department"),
      Subdivision("Île-de-France", "IDF", "metropolitan region")
    )
  }

  case object GA extends Country("Gabon", "GA", "GAB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Estuaire", "1", "province"),
      Subdivision("Haut-Ogooué", "2", "province"),
      Subdivision("Moyen-Ogooué", "3", "province"),
      Subdivision("Ngounié", "4", "province"),
      Subdivision("Nyanga", "5", "province"),
      Subdivision("Ogooué-Ivindo", "6", "province"),
      Subdivision("Ogooué-Lolo", "7", "province"),
      Subdivision("Ogooué-Maritime", "8", "province"),
      Subdivision("Woleu-Ntem", "9", "province")
    )
  }

  case object GB extends Country("United Kingdom of Great Britain and Northern Ireland (the)", "GB", "GBR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aberdeen City", "ABE", "council area"),
      Subdivision("Aberdeenshire", "ABD", "council area"),
      Subdivision("Angus", "ANS", "council area"),
      Subdivision("Antrim and Newtownabbey", "ANN", "district"),
      Subdivision("Ards and North Down", "AND", "district"),
      Subdivision("Argyll and Bute", "AGB", "council area"),
      Subdivision("Armagh City, Banbridge and Craigavon", "ABC", "district"),
      Subdivision("Barking and Dagenham", "BDG", "London borough"),
      Subdivision("Barnet", "BNE", "London borough"),
      Subdivision("Barnsley", "BNS", "metropolitan district"),
      Subdivision("Bath and North East Somerset", "BAS", "unitary authority"),
      Subdivision("Bedford", "BDF", "unitary authority"),
      Subdivision("Belfast City", "BFS", "district"),
      Subdivision("Bexley", "BEX", "London borough"),
      Subdivision("Birmingham", "BIR", "metropolitan district"),
      Subdivision("Blackburn with Darwen", "BBD", "unitary authority"),
      Subdivision("Blackpool", "BPL", "unitary authority"),
      Subdivision("Blaenau Gwent", "BGW", "unitary authority"),
      Subdivision("Bolton", "BOL", "metropolitan district"),
      Subdivision("Bournemouth, Christchurch and Poole", "BCP", "unitary authority"),
      Subdivision("Bracknell Forest", "BRC", "unitary authority"),
      Subdivision("Bradford", "BRD", "metropolitan district"),
      Subdivision("Brent", "BEN", "London borough"),
      Subdivision("Bridgend", "BGE", "unitary authority"),
      Subdivision("Brighton and Hove", "BNH", "unitary authority"),
      Subdivision("Bristol, City of", "BST", "unitary authority"),
      Subdivision("Bromley", "BRY", "London borough"),
      Subdivision("Buckinghamshire", "BKM", "two-tier county"),
      Subdivision("Bury", "BUR", "metropolitan district"),
      Subdivision("Caerphilly", "CAY", "unitary authority"),
      Subdivision("Calderdale", "CLD", "metropolitan district"),
      Subdivision("Cambridgeshire", "CAM", "two-tier county"),
      Subdivision("Camden", "CMD", "London borough"),
      Subdivision("Cardiff", "CRF", "unitary authority"),
      Subdivision("Carmarthenshire", "CMN", "unitary authority"),
      Subdivision("Causeway Coast and Glens", "CCG", "district"),
      Subdivision("Central Bedfordshire", "CBF", "unitary authority"),
      Subdivision("Ceredigion", "CGN", "unitary authority"),
      Subdivision("Cheshire East", "CHE", "unitary authority"),
      Subdivision("Cheshire West and Chester", "CHW", "unitary authority"),
      Subdivision("Clackmannanshire", "CLK", "council area"),
      Subdivision("Conwy", "CWY", "unitary authority"),
      Subdivision("Cornwall", "CON", "unitary authority"),
      Subdivision("Coventry", "COV", "metropolitan district"),
      Subdivision("Croydon", "CRY", "London borough"),
      Subdivision("Cumbria", "CMA", "two-tier county"),
      Subdivision("Darlington", "DAL", "unitary authority"),
      Subdivision("Denbighshire", "DEN", "unitary authority"),
      Subdivision("Derby", "DER", "unitary authority"),
      Subdivision("Derbyshire", "DBY", "two-tier county"),
      Subdivision("Derry and Strabane", "DRS", "district"),
      Subdivision("Devon", "DEV", "two-tier county"),
      Subdivision("Doncaster", "DNC", "metropolitan district"),
      Subdivision("Dorset", "DOR", "two-tier county"),
      Subdivision("Dudley", "DUD", "metropolitan district"),
      Subdivision("Dumfries and Galloway", "DGY", "council area"),
      Subdivision("Dundee City", "DND", "council area"),
      Subdivision("Durham, County", "DUR", "unitary authority"),
      Subdivision("Ealing", "EAL", "London borough"),
      Subdivision("East Ayrshire", "EAY", "council area"),
      Subdivision("East Dunbartonshire", "EDU", "council area"),
      Subdivision("East Lothian", "ELN", "council area"),
      Subdivision("East Renfrewshire", "ERW", "council area"),
      Subdivision("East Riding of Yorkshire", "ERY", "unitary authority"),
      Subdivision("East Sussex", "ESX", "two-tier county"),
      Subdivision("Edinburgh, City of", "EDH", "council area"),
      Subdivision("Eilean Siar", "ELS", "council area"),
      Subdivision("Enfield", "ENF", "London borough"),
      Subdivision("England", "ENG", "country"),
      Subdivision("Essex", "ESS", "two-tier county"),
      Subdivision("Falkirk", "FAL", "council area"),
      Subdivision("Fermanagh and Omagh", "FMO", "district"),
      Subdivision("Fife", "FIF", "council area"),
      Subdivision("Flintshire", "FLN", "unitary authority"),
      Subdivision("Gateshead", "GAT", "metropolitan district"),
      Subdivision("Glasgow City", "GLG", "council area"),
      Subdivision("Gloucestershire", "GLS", "two-tier county"),
      Subdivision("Greenwich", "GRE", "London borough"),
      Subdivision("Gwynedd", "GWN", "unitary authority"),
      Subdivision("Hackney", "HCK", "London borough"),
      Subdivision("Halton", "HAL", "unitary authority"),
      Subdivision("Hammersmith and Fulham", "HMF", "London borough"),
      Subdivision("Hampshire", "HAM", "two-tier county"),
      Subdivision("Haringey", "HRY", "London borough"),
      Subdivision("Harrow", "HRW", "London borough"),
      Subdivision("Hartlepool", "HPL", "unitary authority"),
      Subdivision("Havering", "HAV", "London borough"),
      Subdivision("Herefordshire", "HEF", "unitary authority"),
      Subdivision("Hertfordshire", "HRT", "two-tier county"),
      Subdivision("Highland", "HLD", "council area"),
      Subdivision("Hillingdon", "HIL", "London borough"),
      Subdivision("Hounslow", "HNS", "London borough"),
      Subdivision("Inverclyde", "IVC", "council area"),
      Subdivision("Isle of Anglesey", "AGY", "unitary authority"),
      Subdivision("Isle of Wight", "IOW", "unitary authority"),
      Subdivision("Isles of Scilly", "IOS", "unitary authority"),
      Subdivision("Islington", "ISL", "London borough"),
      Subdivision("Kensington and Chelsea", "KEC", "London borough"),
      Subdivision("Kent", "KEN", "two-tier county"),
      Subdivision("Kingston upon Hull", "KHL", "unitary authority"),
      Subdivision("Kingston upon Thames", "KTT", "London borough"),
      Subdivision("Kirklees", "KIR", "metropolitan district"),
      Subdivision("Knowsley", "KWL", "metropolitan district"),
      Subdivision("Lambeth", "LBH", "London borough"),
      Subdivision("Lancashire", "LAN", "two-tier county"),
      Subdivision("Leeds", "LDS", "metropolitan district"),
      Subdivision("Leicester", "LCE", "unitary authority"),
      Subdivision("Leicestershire", "LEC", "two-tier county"),
      Subdivision("Lewisham", "LEW", "London borough"),
      Subdivision("Lincolnshire", "LIN", "two-tier county"),
      Subdivision("Lisburn and Castlereagh", "LBC", "district"),
      Subdivision("Liverpool", "LIV", "metropolitan district"),
      Subdivision("London, City of", "LND", "city corporation"),
      Subdivision("Luton", "LUT", "unitary authority"),
      Subdivision("Manchester", "MAN", "metropolitan district"),
      Subdivision("Medway", "MDW", "unitary authority"),
      Subdivision("Merthyr Tydfil", "MTY", "unitary authority"),
      Subdivision("Merton", "MRT", "London borough"),
      Subdivision("Mid and East Antrim", "MEA", "district"),
      Subdivision("Mid-Ulster", "MUL", "district"),
      Subdivision("Middlesbrough", "MDB", "unitary authority"),
      Subdivision("Midlothian", "MLN", "council area"),
      Subdivision("Milton Keynes", "MIK", "unitary authority"),
      Subdivision("Monmouthshire", "MON", "unitary authority"),
      Subdivision("Moray", "MRY", "council area"),
      Subdivision("Neath Port Talbot", "NTL", "unitary authority"),
      Subdivision("Newcastle upon Tyne", "NET", "metropolitan district"),
      Subdivision("Newham", "NWM", "London borough"),
      Subdivision("Newport", "NWP", "unitary authority"),
      Subdivision("Newry, Mourne and Down", "NMD", "district"),
      Subdivision("Norfolk", "NFK", "two-tier county"),
      Subdivision("North Ayrshire", "NAY", "council area"),
      Subdivision("North East Lincolnshire", "NEL", "unitary authority"),
      Subdivision("North Lanarkshire", "NLK", "council area"),
      Subdivision("North Lincolnshire", "NLN", "unitary authority"),
      Subdivision("North Somerset", "NSM", "unitary authority"),
      Subdivision("North Tyneside", "NTY", "metropolitan district"),
      Subdivision("North Yorkshire", "NYK", "two-tier county"),
      Subdivision("Northamptonshire", "NTH", "two-tier county"),
      Subdivision("Northern Ireland", "NIR", "province"),
      Subdivision("Northumberland", "NBL", "unitary authority"),
      Subdivision("Nottingham", "NGM", "unitary authority"),
      Subdivision("Nottinghamshire", "NTT", "two-tier county"),
      Subdivision("Oldham", "OLD", "metropolitan district"),
      Subdivision("Orkney Islands", "ORK", "council area"),
      Subdivision("Oxfordshire", "OXF", "two-tier county"),
      Subdivision("Pembrokeshire", "PEM", "unitary authority"),
      Subdivision("Perth and Kinross", "PKN", "council area"),
      Subdivision("Peterborough", "PTE", "unitary authority"),
      Subdivision("Plymouth", "PLY", "unitary authority"),
      Subdivision("Portsmouth", "POR", "unitary authority"),
      Subdivision("Powys", "POW", "unitary authority"),
      Subdivision("Reading", "RDG", "unitary authority"),
      Subdivision("Redbridge", "RDB", "London borough"),
      Subdivision("Redcar and Cleveland", "RCC", "unitary authority"),
      Subdivision("Renfrewshire", "RFW", "council area"),
      Subdivision("Rhondda Cynon Taff", "RCT", "unitary authority"),
      Subdivision("Richmond upon Thames", "RIC", "London borough"),
      Subdivision("Rochdale", "RCH", "metropolitan district"),
      Subdivision("Rotherham", "ROT", "metropolitan district"),
      Subdivision("Rutland", "RUT", "unitary authority"),
      Subdivision("Salford", "SLF", "metropolitan district"),
      Subdivision("Sandwell", "SAW", "metropolitan district"),
      Subdivision("Scotland", "SCT", "country"),
      Subdivision("Scottish Borders", "SCB", "council area"),
      Subdivision("Sefton", "SFT", "metropolitan district"),
      Subdivision("Sheffield", "SHF", "metropolitan district"),
      Subdivision("Shetland Islands", "ZET", "council area"),
      Subdivision("Shropshire", "SHR", "unitary authority"),
      Subdivision("Slough", "SLG", "unitary authority"),
      Subdivision("Solihull", "SOL", "metropolitan district"),
      Subdivision("Somerset", "SOM", "two-tier county"),
      Subdivision("South Ayrshire", "SAY", "council area"),
      Subdivision("South Gloucestershire", "SGC", "unitary authority"),
      Subdivision("South Lanarkshire", "SLK", "council area"),
      Subdivision("South Tyneside", "STY", "metropolitan district"),
      Subdivision("Southampton", "STH", "unitary authority"),
      Subdivision("Southend-on-Sea", "SOS", "unitary authority"),
      Subdivision("Southwark", "SWK", "London borough"),
      Subdivision("St. Helens", "SHN", "metropolitan district"),
      Subdivision("Staffordshire", "STS", "two-tier county"),
      Subdivision("Stirling", "STG", "council area"),
      Subdivision("Stockport", "SKP", "metropolitan district"),
      Subdivision("Stockton-on-Tees", "STT", "unitary authority"),
      Subdivision("Stoke-on-Trent", "STE", "unitary authority"),
      Subdivision("Suffolk", "SFK", "two-tier county"),
      Subdivision("Sunderland", "SND", "metropolitan district"),
      Subdivision("Surrey", "SRY", "two-tier county"),
      Subdivision("Sutton", "STN", "London borough"),
      Subdivision("Swansea", "SWA", "unitary authority"),
      Subdivision("Swindon", "SWD", "unitary authority"),
      Subdivision("Tameside", "TAM", "metropolitan district"),
      Subdivision("Telford and Wrekin", "TFW", "unitary authority"),
      Subdivision("Thurrock", "THR", "unitary authority"),
      Subdivision("Torbay", "TOB", "unitary authority"),
      Subdivision("Torfaen", "TOF", "unitary authority"),
      Subdivision("Tower Hamlets", "TWH", "London borough"),
      Subdivision("Trafford", "TRF", "metropolitan district"),
      Subdivision("Vale of Glamorgan, The", "VGL", "unitary authority"),
      Subdivision("Wakefield", "WKF", "metropolitan district"),
      Subdivision("Wales", "WLS", "country"),
      Subdivision("Walsall", "WLL", "metropolitan district"),
      Subdivision("Waltham Forest", "WFT", "London borough"),
      Subdivision("Wandsworth", "WND", "London borough"),
      Subdivision("Warrington", "WRT", "unitary authority"),
      Subdivision("Warwickshire", "WAR", "two-tier county"),
      Subdivision("West Berkshire", "WBK", "unitary authority"),
      Subdivision("West Dunbartonshire", "WDU", "council area"),
      Subdivision("West Lothian", "WLN", "council area"),
      Subdivision("West Sussex", "WSX", "two-tier county"),
      Subdivision("Westminster", "WSM", "London borough"),
      Subdivision("Wigan", "WGN", "metropolitan district"),
      Subdivision("Wiltshire", "WIL", "unitary authority"),
      Subdivision("Windsor and Maidenhead", "WNM", "unitary authority"),
      Subdivision("Wirral", "WRL", "metropolitan district"),
      Subdivision("Wokingham", "WOK", "unitary authority"),
      Subdivision("Wolverhampton", "WLV", "metropolitan district"),
      Subdivision("Worcestershire", "WOR", "two-tier county"),
      Subdivision("Wrexham", "WRX", "unitary authority"),
      Subdivision("York", "YOR", "unitary authority")
    )
  }

  case object GD extends Country("Grenada", "GD", "GRD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Saint Andrew", "01", "parish"),
      Subdivision("Saint David", "02", "parish"),
      Subdivision("Saint George", "03", "parish"),
      Subdivision("Saint John", "04", "parish"),
      Subdivision("Saint Mark", "05", "parish"),
      Subdivision("Saint Patrick", "06", "parish"),
      Subdivision("Southern Grenadine Islands", "10", "dependency")
    )
  }

  case object GE extends Country("Georgia", "GE", "GEO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abkhazia", "AB", "autonomous republic"),
      Subdivision("Ajaria", "AJ", "autonomous republic"),
      Subdivision("Guria", "GU", "region"),
      Subdivision("Imereti", "IM", "region"),
      Subdivision("K'akheti", "KA", "region"),
      Subdivision("Kvemo Kartli", "KK", "region"),
      Subdivision("Mtskheta-Mtianeti", "MM", "region"),
      Subdivision("Rach'a-Lechkhumi-Kvemo Svaneti", "RL", "region"),
      Subdivision("Samegrelo-Zemo Svaneti", "SZ", "region"),
      Subdivision("Samtskhe-Javakheti", "SJ", "region"),
      Subdivision("Shida Kartli", "SK", "region"),
      Subdivision("Tbilisi", "TB", "city")
    )
  }

  case object GF extends Country("French Guiana", "GF", "GUF")

  case object GG extends Country("Guernsey", "GG", "GGY")

  case object GH extends Country("Ghana", "GH", "GHA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahafo", "AF", "region"),
      Subdivision("Ashanti", "AH", "region"),
      Subdivision("Bono", "BO", "region"),
      Subdivision("Bono East", "BE", "region"),
      Subdivision("Central", "CP", "region"),
      Subdivision("Eastern", "EP", "region"),
      Subdivision("Greater Accra", "AA", "region"),
      Subdivision("North East", "NE", "region"),
      Subdivision("Northern", "NP", "region"),
      Subdivision("Oti", "OT", "region"),
      Subdivision("Savannah", "SV", "region"),
      Subdivision("Upper East", "UE", "region"),
      Subdivision("Upper West", "UW", "region"),
      Subdivision("Volta", "TV", "region"),
      Subdivision("Western", "WP", "region"),
      Subdivision("Western North", "WN", "region")
    )
  }

  case object GI extends Country("Gibraltar", "GI", "GIB")

  case object GL extends Country("Greenland", "GL", "GRL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Avannaata Kommunia", "AV", "municipality"),
      Subdivision("Kommune Kujalleq", "KU", "municipality"),
      Subdivision("Kommune Qeqertalik", "QT", "municipality"),
      Subdivision("Kommuneqarfik Sermersooq", "SM", "municipality"),
      Subdivision("Qeqqata Kommunia", "QE", "municipality")
    )
  }

  case object GM extends Country("Gambia (the)", "GM", "GMB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Banjul", "B", "city"),
      Subdivision("Central River", "M", "division"),
      Subdivision("Lower River", "L", "division"),
      Subdivision("North Bank", "N", "division"),
      Subdivision("Upper River", "U", "division"),
      Subdivision("Western", "W", "division")
    )
  }

  case object GN extends Country("Guinea", "GN", "GIN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Beyla", "BE", "prefecture"),
      Subdivision("Boffa", "BF", "prefecture"),
      Subdivision("Boké", "B", "administrative region"),
      Subdivision("Boké", "BK", "prefecture"),
      Subdivision("Conakry", "C", "governorate"),
      Subdivision("Coyah", "CO", "prefecture"),
      Subdivision("Dabola", "DB", "prefecture"),
      Subdivision("Dalaba", "DL", "prefecture"),
      Subdivision("Dinguiraye", "DI", "prefecture"),
      Subdivision("Dubréka", "DU", "prefecture"),
      Subdivision("Faranah", "F", "administrative region"),
      Subdivision("Faranah", "FA", "prefecture"),
      Subdivision("Forécariah", "FO", "prefecture"),
      Subdivision("Fria", "FR", "prefecture"),
      Subdivision("Gaoual", "GA", "prefecture"),
      Subdivision("Guékédou", "GU", "prefecture"),
      Subdivision("Kankan", "K", "administrative region"),
      Subdivision("Kankan", "KA", "prefecture"),
      Subdivision("Kindia", "D", "administrative region"),
      Subdivision("Kindia", "KD", "prefecture"),
      Subdivision("Kissidougou", "KS", "prefecture"),
      Subdivision("Koubia", "KB", "prefecture"),
      Subdivision("Koundara", "KN", "prefecture"),
      Subdivision("Kouroussa", "KO", "prefecture"),
      Subdivision("Kérouané", "KE", "prefecture"),
      Subdivision("Labé", "L", "administrative region"),
      Subdivision("Labé", "LA", "prefecture"),
      Subdivision("Lola", "LO", "prefecture"),
      Subdivision("Lélouma", "LE", "prefecture"),
      Subdivision("Macenta", "MC", "prefecture"),
      Subdivision("Mali", "ML", "prefecture"),
      Subdivision("Mamou", "M", "administrative region"),
      Subdivision("Mamou", "MM", "prefecture"),
      Subdivision("Mandiana", "MD", "prefecture"),
      Subdivision("Nzérékoré", "N", "administrative region"),
      Subdivision("Nzérékoré", "NZ", "prefecture"),
      Subdivision("Pita", "PI", "prefecture"),
      Subdivision("Siguiri", "SI", "prefecture"),
      Subdivision("Tougué", "TO", "prefecture"),
      Subdivision("Télimélé", "TE", "prefecture"),
      Subdivision("Yomou", "YO", "prefecture")
    )
  }

  case object GP extends Country("Guadeloupe", "GP", "GLP")

  case object GQ extends Country("Equatorial Guinea", "GQ", "GNQ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Annobon", "AN", "province"),
      Subdivision("Bioko Nord", "BN", "province"),
      Subdivision("Bioko Sud", "BS", "province"),
      Subdivision("Centro Sud", "CS", "province"),
      Subdivision("Djibloho", "DJ", "province"),
      Subdivision("Kié-Ntem", "KN", "province"),
      Subdivision("Litoral", "LI", "province"),
      Subdivision("Região Continental", "C", "region"),
      Subdivision("Região Insular", "I", "region"),
      Subdivision("Wele-Nzas", "WN", "province")
    )
  }

  case object GR extends Country("Greece", "GR", "GRC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anatolikí Makedonía kai Thráki", "A", "administrative region"),
      Subdivision("Attikí", "I", "administrative region"),
      Subdivision("Dytikí Elláda", "G", "administrative region"),
      Subdivision("Dytikí Makedonía", "C", "administrative region"),
      Subdivision("Ionía Nísia", "F", "administrative region"),
      Subdivision("Kentrikí Makedonía", "B", "administrative region"),
      Subdivision("Kríti", "M", "administrative region"),
      Subdivision("Nótio Aigaío", "L", "administrative region"),
      Subdivision("Pelopónnisos", "J", "administrative region"),
      Subdivision("Stereá Elláda", "H", "administrative region"),
      Subdivision("Thessalía", "E", "administrative region"),
      Subdivision("Vóreio Aigaío", "K", "administrative region"),
      Subdivision("Ágion Óros", "69", "self-governed part"),
      Subdivision("Ípeiros", "D", "administrative region")
    )
  }

  case object GS extends Country("South Georgia and the South Sandwich Islands", "GS", "SGS")

  case object GT extends Country("Guatemala", "GT", "GTM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alta Verapaz", "16", "department"),
      Subdivision("Baja Verapaz", "15", "department"),
      Subdivision("Chimaltenango", "04", "department"),
      Subdivision("Chiquimula", "20", "department"),
      Subdivision("El Progreso", "02", "department"),
      Subdivision("Escuintla", "05", "department"),
      Subdivision("Guatemala", "01", "department"),
      Subdivision("Huehuetenango", "13", "department"),
      Subdivision("Izabal", "18", "department"),
      Subdivision("Jalapa", "21", "department"),
      Subdivision("Jutiapa", "22", "department"),
      Subdivision("Petén", "17", "department"),
      Subdivision("Quetzaltenango", "09", "department"),
      Subdivision("Quiché", "14", "department"),
      Subdivision("Retalhuleu", "11", "department"),
      Subdivision("Sacatepéquez", "03", "department"),
      Subdivision("San Marcos", "12", "department"),
      Subdivision("Santa Rosa", "06", "department"),
      Subdivision("Sololá", "07", "department"),
      Subdivision("Suchitepéquez", "10", "department"),
      Subdivision("Totonicapán", "08", "department"),
      Subdivision("Zacapa", "19", "department")
    )
  }

  case object GU extends Country("Guam", "GU", "GUM")

  case object GW extends Country("Guinea-Bissau", "GW", "GNB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bafatá", "BA", "region"),
      Subdivision("Biombo", "BM", "region"),
      Subdivision("Bissau", "BS", "autonomous sector"),
      Subdivision("Bolama / Bijagós", "BL", "region"),
      Subdivision("Cacheu", "CA", "region"),
      Subdivision("Gabú", "GA", "region"),
      Subdivision("Leste", "L", "province"),
      Subdivision("Norte", "N", "province"),
      Subdivision("Oio", "OI", "region"),
      Subdivision("Quinara", "QU", "region"),
      Subdivision("Sul", "S", "province"),
      Subdivision("Tombali", "TO", "region")
    )
  }

  case object GY extends Country("Guyana", "GY", "GUY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Barima-Waini", "BA", "region"),
      Subdivision("Cuyuni-Mazaruni", "CU", "region"),
      Subdivision("Demerara-Mahaica", "DE", "region"),
      Subdivision("East Berbice-Corentyne", "EB", "region"),
      Subdivision("Essequibo Islands-West Demerara", "ES", "region"),
      Subdivision("Mahaica-Berbice", "MA", "region"),
      Subdivision("Pomeroon-Supenaam", "PM", "region"),
      Subdivision("Potaro-Siparuni", "PT", "region"),
      Subdivision("Upper Demerara-Berbice", "UD", "region"),
      Subdivision("Upper Takutu-Upper Essequibo", "UT", "region")
    )
  }

  case object HK extends Country("Hong Kong", "HK", "HKG")

  case object HM extends Country("Heard Island and McDonald Islands", "HM", "HMD")

  case object HN extends Country("Honduras", "HN", "HND") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Atlántida", "AT", "department"),
      Subdivision("Choluteca", "CH", "department"),
      Subdivision("Colón", "CL", "department"),
      Subdivision("Comayagua", "CM", "department"),
      Subdivision("Copán", "CP", "department"),
      Subdivision("Cortés", "CR", "department"),
      Subdivision("El Paraíso", "EP", "department"),
      Subdivision("Francisco Morazán", "FM", "department"),
      Subdivision("Gracias a Dios", "GD", "department"),
      Subdivision("Intibucá", "IN", "department"),
      Subdivision("Islas de la Bahía", "IB", "department"),
      Subdivision("La Paz", "LP", "department"),
      Subdivision("Lempira", "LE", "department"),
      Subdivision("Ocotepeque", "OC", "department"),
      Subdivision("Olancho", "OL", "department"),
      Subdivision("Santa Bárbara", "SB", "department"),
      Subdivision("Valle", "VA", "department"),
      Subdivision("Yoro", "YO", "department")
    )
  }

  case object HR extends Country("Croatia", "HR", "HRV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bjelovarsko-bilogorska županija", "07", "county"),
      Subdivision("Brodsko-posavska županija", "12", "county"),
      Subdivision("Dubrovačko-neretvanska županija", "19", "county"),
      Subdivision("Grad Zagreb", "21", "city"),
      Subdivision("Istarska županija", "18", "county"),
      Subdivision("Karlovačka županija", "04", "county"),
      Subdivision("Koprivničko-križevačka županija", "06", "county"),
      Subdivision("Krapinsko-zagorska županija", "02", "county"),
      Subdivision("Ličko-senjska županija", "09", "county"),
      Subdivision("Međimurska županija", "20", "county"),
      Subdivision("Osječko-baranjska županija", "14", "county"),
      Subdivision("Požeško-slavonska županija", "11", "county"),
      Subdivision("Primorsko-goranska županija", "08", "county"),
      Subdivision("Sisačko-moslavačka županija", "03", "county"),
      Subdivision("Splitsko-dalmatinska županija", "17", "county"),
      Subdivision("Varaždinska županija", "05", "county"),
      Subdivision("Virovitičko-podravska županija", "10", "county"),
      Subdivision("Vukovarsko-srijemska županija", "16", "county"),
      Subdivision("Zadarska županija", "13", "county"),
      Subdivision("Zagrebačka županija", "01", "county"),
      Subdivision("Šibensko-kninska županija", "15", "county")
    )
  }

  case object HT extends Country("Haiti", "HT", "HTI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artibonite", "AR", "department"),
      Subdivision("Centre", "CE", "department"),
      Subdivision("Grandans", "GA", "department"),
      Subdivision("Lwès", "OU", "department"),
      Subdivision("Nip", "NI", "department"),
      Subdivision("Nord", "ND", "department"),
      Subdivision("Nord-Est", "NE", "department"),
      Subdivision("Nord-Ouest", "NO", "department"),
      Subdivision("Sid", "SD", "department"),
      Subdivision("Sidès", "SE", "department")
    )
  }

  case object HU extends Country("Hungary", "HU", "HUN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baranya", "BA", "county"),
      Subdivision("Borsod-Abaúj-Zemplén", "BZ", "county"),
      Subdivision("Budapest", "BU", "capital city"),
      Subdivision("Bács-Kiskun", "BK", "county"),
      Subdivision("Békés", "BE", "county"),
      Subdivision("Békéscsaba", "BC", "city with county rights"),
      Subdivision("Csongrád-Csanád", "CS", "county"),
      Subdivision("Debrecen", "DE", "city with county rights"),
      Subdivision("Dunaújváros", "DU", "city with county rights"),
      Subdivision("Eger", "EG", "city with county rights"),
      Subdivision("Fejér", "FE", "county"),
      Subdivision("Győr", "GY", "city with county rights"),
      Subdivision("Győr-Moson-Sopron", "GS", "county"),
      Subdivision("Hajdú-Bihar", "HB", "county"),
      Subdivision("Heves", "HE", "county"),
      Subdivision("Hódmezővásárhely", "HV", "city with county rights"),
      Subdivision("Jász-Nagykun-Szolnok", "JN", "county"),
      Subdivision("Kaposvár", "KV", "city with county rights"),
      Subdivision("Kecskemét", "KM", "city with county rights"),
      Subdivision("Komárom-Esztergom", "KE", "county"),
      Subdivision("Miskolc", "MI", "city with county rights"),
      Subdivision("Nagykanizsa", "NK", "city with county rights"),
      Subdivision("Nyíregyháza", "NY", "city with county rights"),
      Subdivision("Nógrád", "NO", "county"),
      Subdivision("Pest", "PE", "county"),
      Subdivision("Pécs", "PS", "city with county rights"),
      Subdivision("Salgótarján", "ST", "city with county rights"),
      Subdivision("Somogy", "SO", "county"),
      Subdivision("Sopron", "SN", "city with county rights"),
      Subdivision("Szabolcs-Szatmár-Bereg", "SZ", "county"),
      Subdivision("Szeged", "SD", "city with county rights"),
      Subdivision("Szekszárd", "SS", "city with county rights"),
      Subdivision("Szolnok", "SK", "city with county rights"),
      Subdivision("Szombathely", "SH", "city with county rights"),
      Subdivision("Székesfehérvár", "SF", "city with county rights"),
      Subdivision("Tatabánya", "TB", "city with county rights"),
      Subdivision("Tolna", "TO", "county"),
      Subdivision("Vas", "VA", "county"),
      Subdivision("Veszprém", "VE", "county"),
      Subdivision("Veszprém", "VM", "city with county rights"),
      Subdivision("Zala", "ZA", "county"),
      Subdivision("Zalaegerszeg", "ZE", "city with county rights"),
      Subdivision("Érd", "ER", "city with county rights")
    )
  }

  case object ID extends Country("Indonesia", "ID", "IDN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aceh", "AC", "province"),
      Subdivision("Bali", "BA", "province"),
      Subdivision("Banten", "BT", "province"),
      Subdivision("Bengkulu", "BE", "province"),
      Subdivision("Gorontalo", "GO", "province"),
      Subdivision("Jakarta Raya", "JK", "capital district"),
      Subdivision("Jambi", "JA", "province"),
      Subdivision("Jawa", "JW", "geographical unit"),
      Subdivision("Jawa Barat", "JB", "province"),
      Subdivision("Jawa Tengah", "JT", "province"),
      Subdivision("Jawa Timur", "JI", "province"),
      Subdivision("Kalimantan", "KA", "geographical unit"),
      Subdivision("Kalimantan Barat", "KB", "province"),
      Subdivision("Kalimantan Selatan", "KS", "province"),
      Subdivision("Kalimantan Tengah", "KT", "province"),
      Subdivision("Kalimantan Timur", "KI", "province"),
      Subdivision("Kalimantan Utara", "KU", "province"),
      Subdivision("Kepulauan Bangka Belitung", "BB", "province"),
      Subdivision("Kepulauan Riau", "KR", "province"),
      Subdivision("Lampung", "LA", "province"),
      Subdivision("Maluku", "ML", "geographical unit"),
      Subdivision("Maluku", "MA", "province"),
      Subdivision("Maluku Utara", "MU", "province"),
      Subdivision("Nusa Tenggara", "NU", "geographical unit"),
      Subdivision("Nusa Tenggara Barat", "NB", "province"),
      Subdivision("Nusa Tenggara Timur", "NT", "province"),
      Subdivision("Papua", "PP", "geographical unit"),
      Subdivision("Papua", "PA", "province"),
      Subdivision("Papua Barat", "PB", "province"),
      Subdivision("Riau", "RI", "province"),
      Subdivision("Sulawesi", "SL", "geographical unit"),
      Subdivision("Sulawesi Barat", "SR", "province"),
      Subdivision("Sulawesi Selatan", "SN", "province"),
      Subdivision("Sulawesi Tengah", "ST", "province"),
      Subdivision("Sulawesi Tenggara", "SG", "province"),
      Subdivision("Sulawesi Utara", "SA", "province"),
      Subdivision("Sumatera", "SM", "geographical unit"),
      Subdivision("Sumatera Barat", "SB", "province"),
      Subdivision("Sumatera Selatan", "SS", "province"),
      Subdivision("Sumatera Utara", "SU", "province"),
      Subdivision("Yogyakarta", "YO", "special region")
    )
  }

  case object IE extends Country("Ireland", "IE", "IRL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("An Cabhán", "CN", "county"),
      Subdivision("An Clár", "CE", "county"),
      Subdivision("An Iarmhí", "WH", "county"),
      Subdivision("An Longfort", "LD", "county"),
      Subdivision("An Mhumhain", "M", "province"),
      Subdivision("An Mhí", "MH", "county"),
      Subdivision("Baile Átha Cliath", "D", "county"),
      Subdivision("Carlow", "CW", "county"),
      Subdivision("Ciarraí", "KY", "county"),
      Subdivision("Cill Chainnigh", "KK", "county"),
      Subdivision("Cill Dara", "KE", "county"),
      Subdivision("Cill Mhantáin", "WW", "county"),
      Subdivision("Connacht", "C", "province"),
      Subdivision("Corcaigh", "CO", "county"),
      Subdivision("Donegal", "DL", "county"),
      Subdivision("Gaillimh", "G", "county"),
      Subdivision("Laighin", "L", "province"),
      Subdivision("Laois", "LS", "county"),
      Subdivision("Leitrim", "LM", "county"),
      Subdivision("Limerick", "LK", "county"),
      Subdivision("Loch Garman", "WX", "county"),
      Subdivision("Louth", "LH", "county"),
      Subdivision("Maigh Eo", "MO", "county"),
      Subdivision("Monaghan", "MN", "county"),
      Subdivision("Offaly", "OY", "county"),
      Subdivision("Port Láirge", "WD", "county"),
      Subdivision("Ros Comáin", "RN", "county"),
      Subdivision("Sligeach", "SO", "county"),
      Subdivision("Tiobraid Árann", "TA", "county"),
      Subdivision("Ulaidh", "U", "province")
    )
  }

  case object IL extends Country("Israel", "IL", "ISR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Awsaţ", "M", "district"),
      Subdivision("Al Janūbī", "D", "district"),
      Subdivision("Al Quds", "JM", "district"),
      Subdivision("Ash Shamālī", "Z", "district"),
      Subdivision("H̱efa", "HA", "district"),
      Subdivision("Tall Abīb", "TA", "district")
    )
  }

  case object IM extends Country("Isle of Man", "IM", "IMN")

  case object IN extends Country("India", "IN", "IND") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andaman and Nicobar Islands", "AN", "Union territory"),
      Subdivision("Andhra Pradesh", "AP", "state"),
      Subdivision("Arunāchal Pradesh", "AR", "state"),
      Subdivision("Assam", "AS", "state"),
      Subdivision("Bihār", "BR", "state"),
      Subdivision("Chandīgarh", "CH", "Union territory"),
      Subdivision("Chhattīsgarh", "CT", "state"),
      Subdivision("Delhi", "DL", "Union territory"),
      Subdivision("Dādra and Nagar Haveli and Damān and Diu", "DH", "Union territory"),
      Subdivision("Goa", "GA", "state"),
      Subdivision("Gujarāt", "GJ", "state"),
      Subdivision("Haryāna", "HR", "state"),
      Subdivision("Himāchal Pradesh", "HP", "state"),
      Subdivision("Jammu and Kashmīr", "JK", "Union territory"),
      Subdivision("Jhārkhand", "JH", "state"),
      Subdivision("Karnātaka", "KA", "state"),
      Subdivision("Kerala", "KL", "state"),
      Subdivision("Ladākh", "LA", "Union territory"),
      Subdivision("Lakshadweep", "LD", "Union territory"),
      Subdivision("Madhya Pradesh", "MP", "state"),
      Subdivision("Mahārāshtra", "MH", "state"),
      Subdivision("Manipur", "MN", "state"),
      Subdivision("Meghālaya", "ML", "state"),
      Subdivision("Mizoram", "MZ", "state"),
      Subdivision("Nāgāland", "NL", "state"),
      Subdivision("Odisha", "OR", "state"),
      Subdivision("Puducherry", "PY", "Union territory"),
      Subdivision("Punjab", "PB", "state"),
      Subdivision("Rājasthān", "RJ", "state"),
      Subdivision("Sikkim", "SK", "state"),
      Subdivision("Tamil Nādu", "TN", "state"),
      Subdivision("Telangāna", "TG", "state"),
      Subdivision("Tripura", "TR", "state"),
      Subdivision("Uttar Pradesh", "UP", "state"),
      Subdivision("Uttarākhand", "UT", "state"),
      Subdivision("West Bengal", "WB", "state")
    )
  }

  case object IO extends Country("British Indian Ocean Territory (the)", "IO", "IOT")

  case object IQ extends Country("Iraq", "IQ", "IRQ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Anbār", "AN", "governorate"),
      Subdivision("Al Başrah", "BA", "governorate"),
      Subdivision("Al Muthanná", "MU", "governorate"),
      Subdivision("Al Qādisīyah", "QA", "governorate"),
      Subdivision("An Najaf", "NA", "governorate"),
      Subdivision("Arbīl", "AR", "governorate"),
      Subdivision("As Sulaymānīyah", "SU", "governorate"),
      Subdivision("Baghdād", "BG", "governorate"),
      Subdivision("Bābil", "BB", "governorate"),
      Subdivision("Dahūk", "DA", "governorate"),
      Subdivision("Dhī Qār", "DQ", "governorate"),
      Subdivision("Diyālá", "DI", "governorate"),
      Subdivision("Herêm-î Kurdistan", "KR", "region"),
      Subdivision("Karbalā’", "KA", "governorate"),
      Subdivision("Kirkūk", "KI", "governorate"),
      Subdivision("Maysān", "MA", "governorate"),
      Subdivision("Nīnawá", "NI", "governorate"),
      Subdivision("Wāsiţ", "WA", "governorate"),
      Subdivision("Şalāḩ ad Dīn", "SD", "governorate")
    )
  }

  case object IR extends Country("Iran (Islamic Republic of)", "IR", "IRN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alborz", "30", "province"),
      Subdivision("Ardabīl", "24", "province"),
      Subdivision("Būshehr", "18", "province"),
      Subdivision("Chahār Maḩāl va Bakhtīārī", "14", "province"),
      Subdivision("Eşfahān", "10", "province"),
      Subdivision("Fārs", "07", "province"),
      Subdivision("Golestān", "27", "province"),
      Subdivision("Gīlān", "01", "province"),
      Subdivision("Hamadān", "13", "province"),
      Subdivision("Hormozgān", "22", "province"),
      Subdivision("Kermān", "08", "province"),
      Subdivision("Kermānshāh", "05", "province"),
      Subdivision("Khorāsān-e Jonūbī", "29", "province"),
      Subdivision("Khorāsān-e Raẕavī", "09", "province"),
      Subdivision("Khorāsān-e Shomālī", "28", "province"),
      Subdivision("Khūzestān", "06", "province"),
      Subdivision("Kohgīlūyeh va Bowyer Aḩmad", "17", "province"),
      Subdivision("Kordestān", "12", "province"),
      Subdivision("Lorestān", "15", "province"),
      Subdivision("Markazī", "00", "province"),
      Subdivision("Māzandarān", "02", "province"),
      Subdivision("Qazvīn", "26", "province"),
      Subdivision("Qom", "25", "province"),
      Subdivision("Semnān", "20", "province"),
      Subdivision("Sīstān va Balūchestān", "11", "province"),
      Subdivision("Tehrān", "23", "province"),
      Subdivision("Yazd", "21", "province"),
      Subdivision("Zanjān", "19", "province"),
      Subdivision("Āz̄ārbāyjān-e Ghārbī", "04", "province"),
      Subdivision("Āz̄ārbāyjān-e Shārqī", "03", "province"),
      Subdivision("Īlām", "16", "province")
    )
  }

  case object IS extends Country("Iceland", "IS", "ISL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akrahreppur", "AKH", "municipality"),
      Subdivision("Akraneskaupstaður", "AKN", "municipality"),
      Subdivision("Akureyrarbær", "AKU", "municipality"),
      Subdivision("Austurland", "7", "region"),
      Subdivision("Bláskógabyggð", "BLA", "municipality"),
      Subdivision("Blönduósbær", "BLO", "municipality"),
      Subdivision("Bolungarvíkurkaupstaður", "BOL", "municipality"),
      Subdivision("Borgarbyggð", "BOG", "municipality"),
      Subdivision("Dalabyggð", "DAB", "municipality"),
      Subdivision("Dalvíkurbyggð", "DAV", "municipality"),
      Subdivision("Eyja- og Miklaholtshreppur", "EOM", "municipality"),
      Subdivision("Eyjafjarðarsveit", "EYF", "municipality"),
      Subdivision("Fjallabyggð", "FJL", "municipality"),
      Subdivision("Fjarðabyggð", "FJD", "municipality"),
      Subdivision("Fljótsdalshreppur", "FLR", "municipality"),
      Subdivision("Flóahreppur", "FLA", "municipality"),
      Subdivision("Garðabær", "GAR", "municipality"),
      Subdivision("Grindavíkurbær", "GRN", "municipality"),
      Subdivision("Grundarfjarðarbær", "GRU", "municipality"),
      Subdivision("Grímsnes- og Grafningshreppur", "GOG", "municipality"),
      Subdivision("Grýtubakkahreppur", "GRY", "municipality"),
      Subdivision("Hafnarfjarðarkaupstaður", "HAF", "municipality"),
      Subdivision("Helgafellssveit", "HEL", "municipality"),
      Subdivision("Hrunamannahreppur", "HRU", "municipality"),
      Subdivision("Hvalfjarðarsveit", "HVA", "municipality"),
      Subdivision("Hveragerðisbær", "HVE", "municipality"),
      Subdivision("Höfuðborgarsvæði", "1", "region"),
      Subdivision("Hörgársveit", "HRG", "municipality"),
      Subdivision("Húnavatnshreppur", "HUT", "municipality"),
      Subdivision("Húnaþing vestra", "HUV", "municipality"),
      Subdivision("Kaldrananeshreppur", "KAL", "municipality"),
      Subdivision("Kjósarhreppur", "KJO", "municipality"),
      Subdivision("Kópavogsbær", "KOP", "municipality"),
      Subdivision("Langanesbyggð", "LAN", "municipality"),
      Subdivision("Mosfellsbær", "MOS", "municipality"),
      Subdivision("Múlaþing", "MUL", "municipality"),
      Subdivision("Mýrdalshreppur", "MYR", "municipality"),
      Subdivision("Norðurland eystra", "6", "region"),
      Subdivision("Norðurland vestra", "5", "region"),
      Subdivision("Norðurþing", "NOR", "municipality"),
      Subdivision("Rangárþing eystra", "RGE", "municipality"),
      Subdivision("Rangárþing ytra", "RGY", "municipality"),
      Subdivision("Reykhólahreppur", "RHH", "municipality"),
      Subdivision("Reykjanesbær", "RKN", "municipality"),
      Subdivision("Reykjavíkurborg", "RKV", "municipality"),
      Subdivision("Seltjarnarnesbær", "SEL", "municipality"),
      Subdivision("Skaftárhreppur", "SKF", "municipality"),
      Subdivision("Skagabyggð", "SKG", "municipality"),
      Subdivision("Skeiða- og Gnúpverjahreppur", "SOG", "municipality"),
      Subdivision("Skorradalshreppur", "SKO", "municipality"),
      Subdivision("Skútustaðahreppur", "SKU", "municipality"),
      Subdivision("Snæfellsbær", "SNF", "municipality"),
      Subdivision("Strandabyggð", "STR", "municipality"),
      Subdivision("Stykkishólmsbær", "STY", "municipality"),
      Subdivision("Suðurland", "8", "region"),
      Subdivision("Suðurnes", "2", "region"),
      Subdivision("Suðurnesjabær", "SDN", "municipality"),
      Subdivision("Svalbarðshreppur", "SBH", "municipality"),
      Subdivision("Svalbarðsstrandarhreppur", "SBT", "municipality"),
      Subdivision("Sveitarfélagið Hornafjörður", "SHF", "municipality"),
      Subdivision("Sveitarfélagið Skagafjörður", "SSF", "municipality"),
      Subdivision("Sveitarfélagið Skagaströnd", "SSS", "municipality"),
      Subdivision("Sveitarfélagið Vogar", "SVG", "municipality"),
      Subdivision("Sveitarfélagið Árborg", "SFA", "municipality"),
      Subdivision("Sveitarfélagið Ölfus", "SOL", "municipality"),
      Subdivision("Súðavíkurhreppur", "SDV", "municipality"),
      Subdivision("Tjörneshreppur", "TJO", "municipality"),
      Subdivision("Tálknafjarðarhreppur", "TAL", "municipality"),
      Subdivision("Vestfirðir", "4", "region"),
      Subdivision("Vestmannaeyjabær", "VEM", "municipality"),
      Subdivision("Vesturbyggð", "VER", "municipality"),
      Subdivision("Vesturland", "3", "region"),
      Subdivision("Vopnafjarðarhreppur", "VOP", "municipality"),
      Subdivision("Árneshreppur", "ARN", "municipality"),
      Subdivision("Ásahreppur", "ASA", "municipality"),
      Subdivision("Ísafjarðarbær", "ISA", "municipality"),
      Subdivision("Þingeyjarsveit", "THG", "municipality")
    )
  }

  case object IT extends Country("Italy", "IT", "ITA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abruzzo", "65", "region"),
      Subdivision("Agrigento", "AG", "free municipal consortium"),
      Subdivision("Alessandria", "AL", "province"),
      Subdivision("Ancona", "AN", "province"),
      Subdivision("Arezzo", "AR", "province"),
      Subdivision("Ascoli Piceno", "AP", "province"),
      Subdivision("Asti", "AT", "province"),
      Subdivision("Avellino", "AV", "province"),
      Subdivision("Bari", "BA", "metropolitan city"),
      Subdivision("Barletta-Andria-Trani", "BT", "province"),
      Subdivision("Basilicata", "77", "region"),
      Subdivision("Belluno", "BL", "province"),
      Subdivision("Benevento", "BN", "province"),
      Subdivision("Bergamo", "BG", "province"),
      Subdivision("Biella", "BI", "province"),
      Subdivision("Bologna", "BO", "metropolitan city"),
      Subdivision("Bolzano", "BZ", "autonomous province"),
      Subdivision("Brescia", "BS", "province"),
      Subdivision("Brindisi", "BR", "province"),
      Subdivision("Cagliari", "CA", "metropolitan city"),
      Subdivision("Calabria", "78", "region"),
      Subdivision("Caltanissetta", "CL", "free municipal consortium"),
      Subdivision("Campania", "72", "region"),
      Subdivision("Campobasso", "CB", "province"),
      Subdivision("Caserta", "CE", "province"),
      Subdivision("Catania", "CT", "metropolitan city"),
      Subdivision("Catanzaro", "CZ", "province"),
      Subdivision("Chieti", "CH", "province"),
      Subdivision("Como", "CO", "province"),
      Subdivision("Cosenza", "CS", "province"),
      Subdivision("Cremona", "CR", "province"),
      Subdivision("Crotone", "KR", "province"),
      Subdivision("Cuneo", "CN", "province"),
      Subdivision("Emilia-Romagna", "45", "region"),
      Subdivision("Enna", "EN", "free municipal consortium"),
      Subdivision("Fermo", "FM", "province"),
      Subdivision("Ferrara", "FE", "province"),
      Subdivision("Firenze", "FI", "metropolitan city"),
      Subdivision("Foggia", "FG", "province"),
      Subdivision("Forlì-Cesena", "FC", "province"),
      Subdivision("Friuli Venezia Giulia", "36", "autonomous region"),
      Subdivision("Frosinone", "FR", "province"),
      Subdivision("Genova", "GE", "metropolitan city"),
      Subdivision("Gorizia", "GO", "decentralized regional entity"),
      Subdivision("Grosseto", "GR", "province"),
      Subdivision("Imperia", "IM", "province"),
      Subdivision("Isernia", "IS", "province"),
      Subdivision("L'Aquila", "AQ", "province"),
      Subdivision("La Spezia", "SP", "province"),
      Subdivision("Latina", "LT", "province"),
      Subdivision("Lazio", "62", "region"),
      Subdivision("Lecce", "LE", "province"),
      Subdivision("Lecco", "LC", "province"),
      Subdivision("Liguria", "42", "region"),
      Subdivision("Livorno", "LI", "province"),
      Subdivision("Lodi", "LO", "province"),
      Subdivision("Lombardia", "25", "region"),
      Subdivision("Lucca", "LU", "province"),
      Subdivision("Macerata", "MC", "province"),
      Subdivision("Mantova", "MN", "province"),
      Subdivision("Marche", "57", "region"),
      Subdivision("Massa-Carrara", "MS", "province"),
      Subdivision("Matera", "MT", "province"),
      Subdivision("Messina", "ME", "metropolitan city"),
      Subdivision("Milano", "MI", "metropolitan city"),
      Subdivision("Modena", "MO", "province"),
      Subdivision("Molise", "67", "region"),
      Subdivision("Monza e Brianza", "MB", "province"),
      Subdivision("Napoli", "NA", "metropolitan city"),
      Subdivision("Novara", "NO", "province"),
      Subdivision("Nuoro", "NU", "province"),
      Subdivision("Oristano", "OR", "province"),
      Subdivision("Padova", "PD", "province"),
      Subdivision("Palermo", "PA", "metropolitan city"),
      Subdivision("Parma", "PR", "province"),
      Subdivision("Pavia", "PV", "province"),
      Subdivision("Perugia", "PG", "province"),
      Subdivision("Pesaro e Urbino", "PU", "province"),
      Subdivision("Pescara", "PE", "province"),
      Subdivision("Piacenza", "PC", "province"),
      Subdivision("Piemonte", "21", "region"),
      Subdivision("Pisa", "PI", "province"),
      Subdivision("Pistoia", "PT", "province"),
      Subdivision("Pordenone", "PN", "decentralized regional entity"),
      Subdivision("Potenza", "PZ", "province"),
      Subdivision("Prato", "PO", "province"),
      Subdivision("Puglia", "75", "region"),
      Subdivision("Ragusa", "RG", "free municipal consortium"),
      Subdivision("Ravenna", "RA", "province"),
      Subdivision("Reggio Calabria", "RC", "metropolitan city"),
      Subdivision("Reggio Emilia", "RE", "province"),
      Subdivision("Rieti", "RI", "province"),
      Subdivision("Rimini", "RN", "province"),
      Subdivision("Roma", "RM", "metropolitan city"),
      Subdivision("Rovigo", "RO", "province"),
      Subdivision("Salerno", "SA", "province"),
      Subdivision("Sardegna", "88", "autonomous region"),
      Subdivision("Sassari", "SS", "province"),
      Subdivision("Savona", "SV", "province"),
      Subdivision("Sicilia", "82", "autonomous region"),
      Subdivision("Siena", "SI", "province"),
      Subdivision("Siracusa", "SR", "free municipal consortium"),
      Subdivision("Sondrio", "SO", "province"),
      Subdivision("Sud Sardegna", "SU", "province"),
      Subdivision("Taranto", "TA", "province"),
      Subdivision("Teramo", "TE", "province"),
      Subdivision("Terni", "TR", "province"),
      Subdivision("Torino", "TO", "metropolitan city"),
      Subdivision("Toscana", "52", "region"),
      Subdivision("Trapani", "TP", "free municipal consortium"),
      Subdivision("Trentino-Alto Adige", "32", "autonomous region"),
      Subdivision("Trento", "TN", "autonomous province"),
      Subdivision("Treviso", "TV", "province"),
      Subdivision("Trieste", "TS", "decentralized regional entity"),
      Subdivision("Udine", "UD", "decentralized regional entity"),
      Subdivision("Umbria", "55", "region"),
      Subdivision("Val d'Aoste", "23", "autonomous region"),
      Subdivision("Varese", "VA", "province"),
      Subdivision("Veneto", "34", "region"),
      Subdivision("Venezia", "VE", "metropolitan city"),
      Subdivision("Verbano-Cusio-Ossola", "VB", "province"),
      Subdivision("Vercelli", "VC", "province"),
      Subdivision("Verona", "VR", "province"),
      Subdivision("Vibo Valentia", "VV", "province"),
      Subdivision("Vicenza", "VI", "province"),
      Subdivision("Viterbo", "VT", "province")
    )
  }

  case object JE extends Country("Jersey", "JE", "JEY")

  case object JM extends Country("Jamaica", "JM", "JAM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Clarendon", "13", "parish"),
      Subdivision("Hanover", "09", "parish"),
      Subdivision("Kingston", "01", "parish"),
      Subdivision("Manchester", "12", "parish"),
      Subdivision("Portland", "04", "parish"),
      Subdivision("Saint Andrew", "02", "parish"),
      Subdivision("Saint Ann", "06", "parish"),
      Subdivision("Saint Catherine", "14", "parish"),
      Subdivision("Saint Elizabeth", "11", "parish"),
      Subdivision("Saint James", "08", "parish"),
      Subdivision("Saint Mary", "05", "parish"),
      Subdivision("Saint Thomas", "03", "parish"),
      Subdivision("Trelawny", "07", "parish"),
      Subdivision("Westmoreland", "10", "parish")
    )
  }

  case object JO extends Country("Jordan", "JO", "JOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Balqā’", "BA", "governorate"),
      Subdivision("Al Karak", "KA", "governorate"),
      Subdivision("Al Mafraq", "MA", "governorate"),
      Subdivision("Al ‘Aqabah", "AQ", "governorate"),
      Subdivision("Al ‘A̅şimah", "AM", "governorate"),
      Subdivision("Az Zarqā’", "AZ", "governorate"),
      Subdivision("Aţ Ţafīlah", "AT", "governorate"),
      Subdivision("Irbid", "IR", "governorate"),
      Subdivision("Jarash", "JA", "governorate"),
      Subdivision("Ma‘ān", "MN", "governorate"),
      Subdivision("Mādabā", "MD", "governorate"),
      Subdivision("‘Ajlūn", "AJ", "governorate")
    )
  }

  case object JP extends Country("Japan", "JP", "JPN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aichi", "23", "prefecture"),
      Subdivision("Akita", "05", "prefecture"),
      Subdivision("Aomori", "02", "prefecture"),
      Subdivision("Chiba", "12", "prefecture"),
      Subdivision("Ehime", "38", "prefecture"),
      Subdivision("Fukui", "18", "prefecture"),
      Subdivision("Fukuoka", "40", "prefecture"),
      Subdivision("Fukushima", "07", "prefecture"),
      Subdivision("Gifu", "21", "prefecture"),
      Subdivision("Gunma", "10", "prefecture"),
      Subdivision("Hiroshima", "34", "prefecture"),
      Subdivision("Hokkaido", "01", "prefecture"),
      Subdivision("Hyogo", "28", "prefecture"),
      Subdivision("Ibaraki", "08", "prefecture"),
      Subdivision("Ishikawa", "17", "prefecture"),
      Subdivision("Iwate", "03", "prefecture"),
      Subdivision("Kagawa", "37", "prefecture"),
      Subdivision("Kagoshima", "46", "prefecture"),
      Subdivision("Kanagawa", "14", "prefecture"),
      Subdivision("Kochi", "39", "prefecture"),
      Subdivision("Kumamoto", "43", "prefecture"),
      Subdivision("Kyoto", "26", "prefecture"),
      Subdivision("Mie", "24", "prefecture"),
      Subdivision("Miyagi", "04", "prefecture"),
      Subdivision("Miyazaki", "45", "prefecture"),
      Subdivision("Nagano", "20", "prefecture"),
      Subdivision("Nagasaki", "42", "prefecture"),
      Subdivision("Nara", "29", "prefecture"),
      Subdivision("Niigata", "15", "prefecture"),
      Subdivision("Oita", "44", "prefecture"),
      Subdivision("Okayama", "33", "prefecture"),
      Subdivision("Okinawa", "47", "prefecture"),
      Subdivision("Osaka", "27", "prefecture"),
      Subdivision("Saga", "41", "prefecture"),
      Subdivision("Saitama", "11", "prefecture"),
      Subdivision("Shiga", "25", "prefecture"),
      Subdivision("Shimane", "32", "prefecture"),
      Subdivision("Shizuoka", "22", "prefecture"),
      Subdivision("Tochigi", "09", "prefecture"),
      Subdivision("Tokushima", "36", "prefecture"),
      Subdivision("Tokyo", "13", "prefecture"),
      Subdivision("Tottori", "31", "prefecture"),
      Subdivision("Toyama", "16", "prefecture"),
      Subdivision("Wakayama", "30", "prefecture"),
      Subdivision("Yamagata", "06", "prefecture"),
      Subdivision("Yamaguchi", "35", "prefecture"),
      Subdivision("Yamanashi", "19", "prefecture")
    )
  }

  case object KE extends Country("Kenya", "KE", "KEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baringo", "01", "county"),
      Subdivision("Bomet", "02", "county"),
      Subdivision("Bungoma", "03", "county"),
      Subdivision("Busia", "04", "county"),
      Subdivision("Elgeyo/Marakwet", "05", "county"),
      Subdivision("Embu", "06", "county"),
      Subdivision("Garissa", "07", "county"),
      Subdivision("Homa Bay", "08", "county"),
      Subdivision("Isiolo", "09", "county"),
      Subdivision("Kajiado", "10", "county"),
      Subdivision("Kakamega", "11", "county"),
      Subdivision("Kericho", "12", "county"),
      Subdivision("Kiambu", "13", "county"),
      Subdivision("Kilifi", "14", "county"),
      Subdivision("Kirinyaga", "15", "county"),
      Subdivision("Kisii", "16", "county"),
      Subdivision("Kisumu", "17", "county"),
      Subdivision("Kitui", "18", "county"),
      Subdivision("Kwale", "19", "county"),
      Subdivision("Laikipia", "20", "county"),
      Subdivision("Lamu", "21", "county"),
      Subdivision("Machakos", "22", "county"),
      Subdivision("Makueni", "23", "county"),
      Subdivision("Mandera", "24", "county"),
      Subdivision("Marsabit", "25", "county"),
      Subdivision("Meru", "26", "county"),
      Subdivision("Migori", "27", "county"),
      Subdivision("Mombasa", "28", "county"),
      Subdivision("Murang'a", "29", "county"),
      Subdivision("Nairobi City", "30", "county"),
      Subdivision("Nakuru", "31", "county"),
      Subdivision("Nandi", "32", "county"),
      Subdivision("Narok", "33", "county"),
      Subdivision("Nyamira", "34", "county"),
      Subdivision("Nyandarua", "35", "county"),
      Subdivision("Nyeri", "36", "county"),
      Subdivision("Samburu", "37", "county"),
      Subdivision("Siaya", "38", "county"),
      Subdivision("Taita/Taveta", "39", "county"),
      Subdivision("Tana River", "40", "county"),
      Subdivision("Tharaka-Nithi", "41", "county"),
      Subdivision("Trans Nzoia", "42", "county"),
      Subdivision("Turkana", "43", "county"),
      Subdivision("Uasin Gishu", "44", "county"),
      Subdivision("Vihiga", "45", "county"),
      Subdivision("Wajir", "46", "county"),
      Subdivision("West Pokot", "47", "county")
    )
  }

  case object KG extends Country("Kyrgyzstan", "KG", "KGZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Batken", "B", "region"),
      Subdivision("Bishkek Shaary", "GB", "city"),
      Subdivision("Chuyskaya oblast'", "C", "region"),
      Subdivision("Dzhalal-Abadskaya oblast'", "J", "region"),
      Subdivision("Gorod Osh", "GO", "city"),
      Subdivision("Issyk-Kul'skaja oblast'", "Y", "region"),
      Subdivision("Naryn", "N", "region"),
      Subdivision("Osh", "O", "region"),
      Subdivision("Talas", "T", "region")
    )
  }

  case object KH extends Country("Cambodia", "KH", "KHM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baat Dambang", "2", "province"),
      Subdivision("Banteay Mean Choăy", "1", "province"),
      Subdivision("Kaeb", "23", "province"),
      Subdivision("Kampong Chaam", "3", "province"),
      Subdivision("Kampong Chhnang", "4", "province"),
      Subdivision("Kampong Spueu", "5", "province"),
      Subdivision("Kampong Thum", "6", "province"),
      Subdivision("Kampot", "7", "province"),
      Subdivision("Kandaal", "8", "province"),
      Subdivision("Kaoh Kong", "9", "province"),
      Subdivision("Kracheh", "10", "province"),
      Subdivision("Mondol Kiri", "11", "province"),
      Subdivision("Otdar Mean Chey", "22", "province"),
      Subdivision("Pailin", "24", "province"),
      Subdivision("Phnom Penh", "12", "autonomous municipality"),
      Subdivision("Pousaat", "15", "province"),
      Subdivision("Preah Sihanouk", "18", "province"),
      Subdivision("Preah Vihear", "13", "province"),
      Subdivision("Prey Veaeng", "14", "province"),
      Subdivision("Rotanak Kiri", "16", "province"),
      Subdivision("Siem Reab", "17", "province"),
      Subdivision("Stoĕng Trêng", "19", "province"),
      Subdivision("Svaay Rieng", "20", "province"),
      Subdivision("Taakaev", "21", "province"),
      Subdivision("Tbong Khmum", "25", "province")
    )
  }

  case object KI extends Country("Kiribati", "KI", "KIR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Gilbert Islands", "G", "group of islands (20 inhabited islands)"),
      Subdivision("Line Islands", "L", "group of islands (20 inhabited islands)"),
      Subdivision("Phoenix Islands", "P", "group of islands (20 inhabited islands)")
    )
  }

  case object KM extends Country("Comoros (the)", "KM", "COM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andjazîdja", "G", "island"),
      Subdivision("Andjouân", "A", "island"),
      Subdivision("Mohéli", "M", "island")
    )
  }

  case object KN extends Country("Saint Kitts and Nevis", "KN", "KNA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Christ Church Nichola Town", "01", "parish"),
      Subdivision("Nevis", "N", "state"),
      Subdivision("Saint Anne Sandy Point", "02", "parish"),
      Subdivision("Saint George Basseterre", "03", "parish"),
      Subdivision("Saint George Gingerland", "04", "parish"),
      Subdivision("Saint James Windward", "05", "parish"),
      Subdivision("Saint John Capisterre", "06", "parish"),
      Subdivision("Saint John Figtree", "07", "parish"),
      Subdivision("Saint Kitts", "K", "state"),
      Subdivision("Saint Mary Cayon", "08", "parish"),
      Subdivision("Saint Paul Capisterre", "09", "parish"),
      Subdivision("Saint Paul Charlestown", "10", "parish"),
      Subdivision("Saint Peter Basseterre", "11", "parish"),
      Subdivision("Saint Thomas Lowland", "12", "parish"),
      Subdivision("Saint Thomas Middle Island", "13", "parish"),
      Subdivision("Trinity Palmetto Point", "15", "parish")
    )
  }

  case object KP extends Country("Korea (the Democratic People's Republic of)", "KP", "PRK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Chagang-do", "04", "province"),
      Subdivision("Hamgyǒng-bukto", "09", "province"),
      Subdivision("Hamgyǒng-namdo", "08", "province"),
      Subdivision("Hwanghae-bukto", "06", "province"),
      Subdivision("Hwanghae-namdo", "05", "province"),
      Subdivision("Kangweonto", "07", "province"),
      Subdivision("Nampho", "14", "metropolitan city"),
      Subdivision("P'yǒngan-bukto", "03", "province"),
      Subdivision("P'yǒngan-namdo", "02", "province"),
      Subdivision("P'yǒngyang", "01", "capital city"),
      Subdivision("Raseon", "13", "special city"),
      Subdivision("Ryanggang-do", "10", "province")
    )
  }

  case object KR extends Country("Korea (the Republic of)", "KR", "KOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Busan-gwangyeoksi", "26", "metropolitan city"),
      Subdivision("Chungcheongbuk-do", "43", "province"),
      Subdivision("Chungcheongnam-do", "44", "province"),
      Subdivision("Daegu-gwangyeoksi", "27", "metropolitan city"),
      Subdivision("Daejeon-gwangyeoksi", "30", "metropolitan city"),
      Subdivision("Gangwon-do", "42", "province"),
      Subdivision("Gwangju-gwangyeoksi", "29", "metropolitan city"),
      Subdivision("Gyeonggi-do", "41", "province"),
      Subdivision("Gyeongsangbuk-do", "47", "province"),
      Subdivision("Gyeongsangnam-do", "48", "province"),
      Subdivision("Incheon-gwangyeoksi", "28", "metropolitan city"),
      Subdivision("Jeju-teukbyeoljachido", "49", "special self-governing province"),
      Subdivision("Jeollabuk-do", "45", "province"),
      Subdivision("Jeollanam-do", "46", "province"),
      Subdivision("Sejong", "50", "special self-governing city"),
      Subdivision("Seoul-teukbyeolsi", "11", "special city"),
      Subdivision("Ulsan-gwangyeoksi", "31", "metropolitan city")
    )
  }

  case object KW extends Country("Kuwait", "KW", "KWT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Aḩmadī", "AH", "governorate"),
      Subdivision("Al Farwānīyah", "FA", "governorate"),
      Subdivision("Al Jahrā’", "JA", "governorate"),
      Subdivision("Al ‘Āşimah", "KU", "governorate"),
      Subdivision("Mubārak al Kabīr", "MU", "governorate"),
      Subdivision("Ḩawallī", "HA", "governorate")
    )
  }

  case object KY extends Country("Cayman Islands (the)", "KY", "CYM")

  case object KZ extends Country("Kazakhstan", "KZ", "KAZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akmolinskaja oblast'", "AKM", "region"),
      Subdivision("Aktjubinskaja oblast'", "AKT", "region"),
      Subdivision("Almatinskaja oblast'", "ALM", "region"),
      Subdivision("Almaty", "ALA", "city"),
      Subdivision("Atyrauskaja oblast'", "ATY", "region"),
      Subdivision("Batys Qazaqstan oblysy", "ZAP", "region"),
      Subdivision("Karagandinskaja oblast'", "KAR", "region"),
      Subdivision("Kostanajskaja oblast'", "KUS", "region"),
      Subdivision("Kyzylordinskaja oblast'", "KZY", "region"),
      Subdivision("Mangghystaū oblysy", "MAN", "region"),
      Subdivision("Nur-Sultan", "AST", "city"),
      Subdivision("Pavlodar oblysy", "PAV", "region"),
      Subdivision("Severo-Kazahstanskaja oblast'", "SEV", "region"),
      Subdivision("Shyghys Qazaqstan oblysy", "VOS", "region"),
      Subdivision("Shymkent", "SHY", "city"),
      Subdivision("Turkestankaya oblast'", "YUZ", "region"),
      Subdivision("Zhambyl oblysy", "ZHA", "region")
    )
  }

  case object LA extends Country("Lao People's Democratic Republic (the)", "LA", "LAO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Attapu", "AT", "province"),
      Subdivision("Bokèo", "BK", "province"),
      Subdivision("Bolikhamxai", "BL", "province"),
      Subdivision("Champasak", "CH", "province"),
      Subdivision("Houaphan", "HO", "province"),
      Subdivision("Khammouan", "KH", "province"),
      Subdivision("Louang Namtha", "LM", "province"),
      Subdivision("Louangphabang", "LP", "province"),
      Subdivision("Oudômxai", "OU", "province"),
      Subdivision("Phôngsali", "PH", "province"),
      Subdivision("Salavan", "SL", "province"),
      Subdivision("Savannakhét", "SV", "province"),
      Subdivision("Viangchan", "VT", "prefecture"),
      Subdivision("Viangchan", "VI", "province"),
      Subdivision("Xaignabouli", "XA", "province"),
      Subdivision("Xaisômboun", "XS", "province"),
      Subdivision("Xiangkhouang", "XI", "province"),
      Subdivision("Xékong", "XE", "province")
    )
  }

  case object LB extends Country("Lebanon", "LB", "LBN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aakkâr", "AK", "governorate"),
      Subdivision("Al Biqā‘", "BI", "governorate"),
      Subdivision("Al Janūb", "JA", "governorate"),
      Subdivision("An Nabaţīyah", "NA", "governorate"),
      Subdivision("Ash Shimāl", "AS", "governorate"),
      Subdivision("Baalbek-Hermel", "BH", "governorate"),
      Subdivision("Bayrūt", "BA", "governorate"),
      Subdivision("Jabal Lubnān", "JL", "governorate")
    )
  }

  case object LC extends Country("Saint Lucia", "LC", "LCA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anse la Raye", "01", "district"),
      Subdivision("Canaries", "12", "district"),
      Subdivision("Castries", "02", "district"),
      Subdivision("Choiseul", "03", "district"),
      Subdivision("Dennery", "05", "district"),
      Subdivision("Gros Islet", "06", "district"),
      Subdivision("Laborie", "07", "district"),
      Subdivision("Micoud", "08", "district"),
      Subdivision("Soufrière", "10", "district"),
      Subdivision("Vieux Fort", "11", "district")
    )
  }

  case object LI extends Country("Liechtenstein", "LI", "LIE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balzers", "01", "commune"),
      Subdivision("Eschen", "02", "commune"),
      Subdivision("Gamprin", "03", "commune"),
      Subdivision("Mauren", "04", "commune"),
      Subdivision("Planken", "05", "commune"),
      Subdivision("Ruggell", "06", "commune"),
      Subdivision("Schaan", "07", "commune"),
      Subdivision("Schellenberg", "08", "commune"),
      Subdivision("Triesen", "09", "commune"),
      Subdivision("Triesenberg", "10", "commune"),
      Subdivision("Vaduz", "11", "commune")
    )
  }

  case object LK extends Country("Sri Lanka", "LK", "LKA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ampara", "52", "district"),
      Subdivision("Ampāntōṭṭai", "33", "district"),
      Subdivision("Anuradhapura", "71", "district"),
      Subdivision("Badulla", "81", "district"),
      Subdivision("Basnāhira paḷāta", "1", "province"),
      Subdivision("Batticaloa", "51", "district"),
      Subdivision("Central Province", "2", "province"),
      Subdivision("Chappirakamuva mākāṇam", "9", "province"),
      Subdivision("Colombo", "11", "district"),
      Subdivision("Dakuṇu paḷāta", "3", "province"),
      Subdivision("Eastern Province", "5", "province"),
      Subdivision("Galle", "31", "district"),
      Subdivision("Gampaha", "12", "district"),
      Subdivision("Irattiṉapuri", "91", "district"),
      Subdivision("Jaffna", "41", "district"),
      Subdivision("Kalutara", "13", "district"),
      Subdivision("Kandy", "21", "district"),
      Subdivision("Kegalla", "92", "district"),
      Subdivision("Kilinochchi", "42", "district"),
      Subdivision("Kurunegala", "61", "district"),
      Subdivision("Mannar", "43", "district"),
      Subdivision("Matale", "22", "district"),
      Subdivision("Matara", "32", "district"),
      Subdivision("Monaragala", "82", "district"),
      Subdivision("Mulativ", "45", "district"),
      Subdivision("North Central Province", "7", "province"),
      Subdivision("North Western Province", "6", "province"),
      Subdivision("Northern Province", "4", "province"),
      Subdivision("Nuvara Ĕliya", "23", "district"),
      Subdivision("Polonnaruwa", "72", "district"),
      Subdivision("Puttalam", "62", "district"),
      Subdivision("Tirukŏṇamalai", "53", "district"),
      Subdivision("Uva Province", "8", "province"),
      Subdivision("Vavuniya", "44", "district")
    )
  }

  case object LR extends Country("Liberia", "LR", "LBR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bomi", "BM", "county"),
      Subdivision("Bong", "BG", "county"),
      Subdivision("Gbarpolu", "GP", "county"),
      Subdivision("Grand Bassa", "GB", "county"),
      Subdivision("Grand Cape Mount", "CM", "county"),
      Subdivision("Grand Gedeh", "GG", "county"),
      Subdivision("Grand Kru", "GK", "county"),
      Subdivision("Lofa", "LO", "county"),
      Subdivision("Margibi", "MG", "county"),
      Subdivision("Maryland", "MY", "county"),
      Subdivision("Montserrado", "MO", "county"),
      Subdivision("Nimba", "NI", "county"),
      Subdivision("River Cess", "RI", "county"),
      Subdivision("River Gee", "RG", "county"),
      Subdivision("Sinoe", "SI", "county")
    )
  }

  case object LS extends Country("Lesotho", "LS", "LSO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Berea", "D", "district"),
      Subdivision("Botha-Bothe", "B", "district"),
      Subdivision("Leribe", "C", "district"),
      Subdivision("Mafeteng", "E", "district"),
      Subdivision("Maseru", "A", "district"),
      Subdivision("Mohale's Hoek", "F", "district"),
      Subdivision("Mokhotlong", "J", "district"),
      Subdivision("Qacha's Nek", "H", "district"),
      Subdivision("Quthing", "G", "district"),
      Subdivision("Thaba-Tseka", "K", "district")
    )
  }

  case object LT extends Country("Lithuania", "LT", "LTU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Akmenė", "01", "district municipality"),
      Subdivision("Alytaus apskritis", "AL", "county"),
      Subdivision("Alytaus miestas", "02", "city municipality"),
      Subdivision("Alytus", "03", "district municipality"),
      Subdivision("Anykščiai", "04", "district municipality"),
      Subdivision("Birštonas", "05", "municipality"),
      Subdivision("Biržai", "06", "district municipality"),
      Subdivision("Druskininkai", "07", "municipality"),
      Subdivision("Elektrėnai", "08", "municipality"),
      Subdivision("Ignalina", "09", "district municipality"),
      Subdivision("Jonava", "10", "district municipality"),
      Subdivision("Joniškis", "11", "district municipality"),
      Subdivision("Jurbarkas", "12", "district municipality"),
      Subdivision("Kaišiadorys", "13", "district municipality"),
      Subdivision("Kalvarija", "14", "municipality"),
      Subdivision("Kaunas", "16", "district municipality"),
      Subdivision("Kauno apskritis", "KU", "county"),
      Subdivision("Kauno miestas", "15", "city municipality"),
      Subdivision("Kazlų Rūdos", "17", "municipality"),
      Subdivision("Kelmė", "19", "district municipality"),
      Subdivision("Klaipėda", "21", "district municipality"),
      Subdivision("Klaipėdos apskritis", "KL", "county"),
      Subdivision("Klaipėdos miestas", "20", "city municipality"),
      Subdivision("Kretinga", "22", "district municipality"),
      Subdivision("Kupiškis", "23", "district municipality"),
      Subdivision("Kėdainiai", "18", "district municipality"),
      Subdivision("Lazdijai", "24", "district municipality"),
      Subdivision("Marijampolė", "25", "district municipality"),
      Subdivision("Marijampolės apskritis", "MR", "county"),
      Subdivision("Mažeikiai", "26", "district municipality"),
      Subdivision("Molėtai", "27", "district municipality"),
      Subdivision("Neringa", "28", "municipality"),
      Subdivision("Pagėgiai", "29", "municipality"),
      Subdivision("Pakruojis", "30", "district municipality"),
      Subdivision("Palangos miestas", "31", "city municipality"),
      Subdivision("Panevėžio apskritis", "PN", "county"),
      Subdivision("Panevėžio miestas", "32", "city municipality"),
      Subdivision("Panevėžys", "33", "district municipality"),
      Subdivision("Pasvalys", "34", "district municipality"),
      Subdivision("Plungė", "35", "district municipality"),
      Subdivision("Prienai", "36", "district municipality"),
      Subdivision("Radviliškis", "37", "district municipality"),
      Subdivision("Raseiniai", "38", "district municipality"),
      Subdivision("Rietavas", "39", "municipality"),
      Subdivision("Rokiškis", "40", "district municipality"),
      Subdivision("Skuodas", "48", "district municipality"),
      Subdivision("Tauragė", "50", "district municipality"),
      Subdivision("Tauragės apskritis", "TA", "county"),
      Subdivision("Telšiai", "51", "district municipality"),
      Subdivision("Telšių apskritis", "TE", "county"),
      Subdivision("Trakai", "52", "district municipality"),
      Subdivision("Ukmergė", "53", "district municipality"),
      Subdivision("Utena", "54", "district municipality"),
      Subdivision("Utenos apskritis", "UT", "county"),
      Subdivision("Varėna", "55", "district municipality"),
      Subdivision("Vilkaviškis", "56", "district municipality"),
      Subdivision("Vilniaus apskritis", "VL", "county"),
      Subdivision("Vilniaus miestas", "57", "city municipality"),
      Subdivision("Vilnius", "58", "district municipality"),
      Subdivision("Visaginas", "59", "municipality"),
      Subdivision("Zarasai", "60", "district municipality"),
      Subdivision("Šakiai", "41", "district municipality"),
      Subdivision("Šalčininkai", "42", "district municipality"),
      Subdivision("Šiauliai", "44", "district municipality"),
      Subdivision("Šiaulių apskritis", "SA", "county"),
      Subdivision("Šiaulių miestas", "43", "city municipality"),
      Subdivision("Šilalė", "45", "district municipality"),
      Subdivision("Šilutė", "46", "district municipality"),
      Subdivision("Širvintos", "47", "district municipality"),
      Subdivision("Švenčionys", "49", "district municipality")
    )
  }

  case object LU extends Country("Luxembourg", "LU", "LUX") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Capellen", "CA", "canton"),
      Subdivision("Clerf", "CL", "canton"),
      Subdivision("Diekirch", "DI", "canton"),
      Subdivision("Echternach", "EC", "canton"),
      Subdivision("Esch an der Alzette", "ES", "canton"),
      Subdivision("Grevenmacher", "GR", "canton"),
      Subdivision("Luxembourg", "LU", "canton"),
      Subdivision("Mersch", "ME", "canton"),
      Subdivision("Redange", "RD", "canton"),
      Subdivision("Remich", "RM", "canton"),
      Subdivision("Veianen", "VD", "canton"),
      Subdivision("Wiltz", "WI", "canton")
    )
  }

  case object LV extends Country("Latvia", "LV", "LVA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aizkraukles novads", "002", "municipality"),
      Subdivision("Alūksnes novads", "007", "municipality"),
      Subdivision("Augšdaugavas novads", "111", "municipality"),
      Subdivision("Balvu novads", "015", "municipality"),
      Subdivision("Bauskas novads", "016", "municipality"),
      Subdivision("Cēsu novads", "022", "municipality"),
      Subdivision("Daugavpils", "DGV", "state city"),
      Subdivision("Dienvidkurzemes Novads", "112", "municipality"),
      Subdivision("Dobeles novads", "026", "municipality"),
      Subdivision("Gulbenes novads", "033", "municipality"),
      Subdivision("Jelgava", "JEL", "state city"),
      Subdivision("Jelgavas novads", "041", "municipality"),
      Subdivision("Jēkabpils novads", "042", "municipality"),
      Subdivision("Jūrmala", "JUR", "state city"),
      Subdivision("Krāslavas novads", "047", "municipality"),
      Subdivision("Kuldīgas novads", "050", "municipality"),
      Subdivision("Liepāja", "LPX", "state city"),
      Subdivision("Limbažu novads", "054", "municipality"),
      Subdivision("Ludzas novads", "058", "municipality"),
      Subdivision("Līvānu novads", "056", "municipality"),
      Subdivision("Madonas novads", "059", "municipality"),
      Subdivision("Mārupes novads", "062", "municipality"),
      Subdivision("Ogres novads", "067", "municipality"),
      Subdivision("Olaines novads", "068", "municipality"),
      Subdivision("Preiļu novads", "073", "municipality"),
      Subdivision("Ropažu novads", "080", "municipality"),
      Subdivision("Rēzekne", "REZ", "state city"),
      Subdivision("Rēzeknes novads", "077", "municipality"),
      Subdivision("Rīga", "RIX", "state city"),
      Subdivision("Salaspils novads", "087", "municipality"),
      Subdivision("Saldus novads", "088", "municipality"),
      Subdivision("Saulkrastu novads", "089", "municipality"),
      Subdivision("Siguldas novads", "091", "municipality"),
      Subdivision("Smiltenes novads", "094", "municipality"),
      Subdivision("Talsu novads", "097", "municipality"),
      Subdivision("Tukuma novads", "099", "municipality"),
      Subdivision("Valkas novads", "101", "municipality"),
      Subdivision("Valmieras Novads", "113", "municipality"),
      Subdivision("Varakļānu novads", "102", "municipality"),
      Subdivision("Ventspils", "VEN", "state city"),
      Subdivision("Ventspils novads", "106", "municipality"),
      Subdivision("Ādažu novads", "011", "municipality"),
      Subdivision("Ķekavas novads", "052", "municipality")
    )
  }

  case object LY extends Country("Libya", "LY", "LBY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Buţnān", "BU", "popularate"),
      Subdivision("Al Jabal al Akhḑar", "JA", "popularate"),
      Subdivision("Al Jabal al Gharbī", "JG", "popularate"),
      Subdivision("Al Jafārah", "JI", "popularate"),
      Subdivision("Al Jufrah", "JU", "popularate"),
      Subdivision("Al Kufrah", "KF", "popularate"),
      Subdivision("Al Marj", "MJ", "popularate"),
      Subdivision("Al Marqab", "MB", "popularate"),
      Subdivision("Al Wāḩāt", "WA", "popularate"),
      Subdivision("An Nuqāţ al Khams", "NQ", "popularate"),
      Subdivision("Az Zāwiyah", "ZA", "popularate"),
      Subdivision("Banghāzī", "BA", "popularate"),
      Subdivision("Darnah", "DR", "popularate"),
      Subdivision("Ghāt", "GT", "popularate"),
      Subdivision("Mişrātah", "MI", "popularate"),
      Subdivision("Murzuq", "MQ", "popularate"),
      Subdivision("Nālūt", "NL", "popularate"),
      Subdivision("Sabhā", "SB", "popularate"),
      Subdivision("Surt", "SR", "popularate"),
      Subdivision("Wādī al Ḩayāt", "WD", "popularate"),
      Subdivision("Wādī ash Shāţi’", "WS", "popularate"),
      Subdivision("Ţarābulus", "TB", "popularate")
    )
  }

  case object MA extends Country("Morocco", "MA", "MAR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agadir-Ida-Ou-Tanane", "AGD", "prefecture"),
      Subdivision("Al Haouz", "HAO", "province"),
      Subdivision("Al Hoceïma", "HOC", "province"),
      Subdivision("Aousserd", "AOU", "province"),
      Subdivision("Assa-Zag", "ASZ", "province"),
      Subdivision("Azilal", "AZI", "province"),
      Subdivision("Benslimane", "BES", "province"),
      Subdivision("Berkane", "BER", "province"),
      Subdivision("Berrechid", "BRR", "province"),
      Subdivision("Boujdour", "BOD", "province"),
      Subdivision("Boulemane", "BOM", "province"),
      Subdivision("Béni Mellal", "BEM", "province"),
      Subdivision("Béni Mellal-Khénifra", "05", "region"),
      Subdivision("Casablanca", "CAS", "prefecture"),
      Subdivision("Casablanca-Settat", "06", "region"),
      Subdivision("Chefchaouen", "CHE", "province"),
      Subdivision("Chichaoua", "CHI", "province"),
      Subdivision("Chtouka-Ait Baha", "CHT", "province"),
      Subdivision("Dakhla-Oued Ed-Dahab", "12", "region"),
      Subdivision("Driouch", "DRI", "province"),
      Subdivision("Drâa-Tafilalet", "08", "region"),
      Subdivision("El Hajeb", "HAJ", "province"),
      Subdivision("El Jadida", "JDI", "province"),
      Subdivision("El Kelâa des Sraghna", "KES", "province"),
      Subdivision("Errachidia", "ERR", "province"),
      Subdivision("Es-Semara", "ESM", "province"),
      Subdivision("Essaouira", "ESI", "province"),
      Subdivision("Fahs-Anjra", "FAH", "province"),
      Subdivision("Figuig", "FIG", "province"),
      Subdivision("Fquih Ben Salah", "FQH", "province"),
      Subdivision("Fès", "FES", "prefecture"),
      Subdivision("Fès-Meknès", "03", "region"),
      Subdivision("Guelmim", "GUE", "province"),
      Subdivision("Guelmim-Oued Noun", "10", "region"),
      Subdivision("Guercif", "GUF", "province"),
      Subdivision("Ifrane", "IFR", "province"),
      Subdivision("Inezgane-Ait Melloul", "INE", "prefecture"),
      Subdivision("Jerada", "JRA", "province"),
      Subdivision("Khouribga", "KHO", "province"),
      Subdivision("Khémisset", "KHE", "province"),
      Subdivision("Khénifra", "KHN", "province"),
      Subdivision("Kénitra", "KEN", "province"),
      Subdivision("L'Oriental", "02", "region"),
      Subdivision("Larache", "LAR", "province"),
      Subdivision("Laâyoune", "LAA", "province"),
      Subdivision("Laâyoune-Sakia El Hamra", "11", "region"),
      Subdivision("Marrakech", "MAR", "prefecture"),
      Subdivision("Marrakech-Safi", "07", "region"),
      Subdivision("Meknès", "MEK", "prefecture"),
      Subdivision("Midelt", "MID", "province"),
      Subdivision("Mohammadia", "MOH", "prefecture"),
      Subdivision("Moulay Yacoub", "MOU", "province"),
      Subdivision("Médiouna", "MED", "province"),
      Subdivision("M’diq-Fnideq", "MDF", "prefecture"),
      Subdivision("Nador", "NAD", "province"),
      Subdivision("Nouaceur", "NOU", "province"),
      Subdivision("Ouarzazate", "OUA", "province"),
      Subdivision("Oued Ed-Dahab", "OUD", "province"),
      Subdivision("Ouezzane", "OUZ", "province"),
      Subdivision("Oujda-Angad", "OUJ", "prefecture"),
      Subdivision("Rabat", "RAB", "prefecture"),
      Subdivision("Rabat-Salé-Kénitra", "04", "region"),
      Subdivision("Rehamna", "REH", "province"),
      Subdivision("Safi", "SAF", "province"),
      Subdivision("Salé", "SAL", "prefecture"),
      Subdivision("Sefrou", "SEF", "province"),
      Subdivision("Settat", "SET", "province"),
      Subdivision("Sidi Bennour", "SIB", "province"),
      Subdivision("Sidi Ifni", "SIF", "province"),
      Subdivision("Sidi Kacem", "SIK", "province"),
      Subdivision("Sidi Slimane", "SIL", "province"),
      Subdivision("Skhirate-Témara", "SKH", "prefecture"),
      Subdivision("Souss-Massa", "09", "region"),
      Subdivision("Tan-Tan", "TNT", "province"),
      Subdivision("Tanger-Assilah", "TNG", "prefecture"),
      Subdivision("Tanger-Tétouan-Al Hoceïma", "01", "region"),
      Subdivision("Taounate", "TAO", "province"),
      Subdivision("Taourirt", "TAI", "province"),
      Subdivision("Tarfaya", "TAF", "province"),
      Subdivision("Taroudannt", "TAR", "province"),
      Subdivision("Tata", "TAT", "province"),
      Subdivision("Taza", "TAZ", "province"),
      Subdivision("Tinghir", "TIN", "province"),
      Subdivision("Tiznit", "TIZ", "province"),
      Subdivision("Tétouan", "TET", "province"),
      Subdivision("Youssoufia", "YUS", "province"),
      Subdivision("Zagora", "ZAG", "province")
    )
  }

  case object MC extends Country("Monaco", "MC", "MCO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Fontvieille", "FO", "quarter"),
      Subdivision("Jardin Exotique", "JE", "quarter"),
      Subdivision("La Colle", "CL", "quarter"),
      Subdivision("La Condamine", "CO", "quarter"),
      Subdivision("La Gare", "GA", "quarter"),
      Subdivision("La Source", "SO", "quarter"),
      Subdivision("Larvotto", "LA", "quarter"),
      Subdivision("Malbousquet", "MA", "quarter"),
      Subdivision("Monaco-Ville", "MO", "quarter"),
      Subdivision("Moneghetti", "MG", "quarter"),
      Subdivision("Monte-Carlo", "MC", "quarter"),
      Subdivision("Moulins", "MU", "quarter"),
      Subdivision("Port-Hercule", "PH", "quarter"),
      Subdivision("Saint-Roman", "SR", "quarter"),
      Subdivision("Sainte-Dévote", "SD", "quarter"),
      Subdivision("Spélugues", "SP", "quarter"),
      Subdivision("Vallon de la Rousse", "VR", "quarter")
    )
  }

  case object MD extends Country("Moldova (the Republic of)", "MD", "MDA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Anenii Noi", "AN", "district"),
      Subdivision("Basarabeasca", "BS", "district"),
      Subdivision("Bender", "BD", "city"),
      Subdivision("Briceni", "BR", "district"),
      Subdivision("Bălți", "BA", "city"),
      Subdivision("Cahul", "CA", "district"),
      Subdivision("Cantemir", "CT", "district"),
      Subdivision("Chișinău", "CU", "city"),
      Subdivision("Cimișlia", "CM", "district"),
      Subdivision("Criuleni", "CR", "district"),
      Subdivision("Călărași", "CL", "district"),
      Subdivision("Căușeni", "CS", "district"),
      Subdivision("Dondușeni", "DO", "district"),
      Subdivision("Drochia", "DR", "district"),
      Subdivision("Dubăsari", "DU", "district"),
      Subdivision("Edineț", "ED", "district"),
      Subdivision("Florești", "FL", "district"),
      Subdivision("Fălești", "FA", "district"),
      Subdivision("Glodeni", "GL", "district"),
      Subdivision("Găgăuzia, Unitatea teritorială autonomă", "GA", "autonomous territorial unit"),
      Subdivision("Hîncești", "HI", "district"),
      Subdivision("Ialoveni", "IA", "district"),
      Subdivision("Leova", "LE", "district"),
      Subdivision("Nisporeni", "NI", "district"),
      Subdivision("Ocnița", "OC", "district"),
      Subdivision("Orhei", "OR", "district"),
      Subdivision("Rezina", "RE", "district"),
      Subdivision("Rîșcani", "RI", "district"),
      Subdivision("Soroca", "SO", "district"),
      Subdivision("Strășeni", "ST", "district"),
      Subdivision("Stînga Nistrului, unitatea teritorială din", "SN", "territorial unit"),
      Subdivision("Sîngerei", "SI", "district"),
      Subdivision("Taraclia", "TA", "district"),
      Subdivision("Telenești", "TE", "district"),
      Subdivision("Ungheni", "UN", "district"),
      Subdivision("Șoldănești", "SD", "district"),
      Subdivision("Ștefan Vodă", "SV", "district")
    )
  }

  case object ME extends Country("Montenegro", "ME", "MNE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andrijevica", "01", "municipality"),
      Subdivision("Bar", "02", "municipality"),
      Subdivision("Berane", "03", "municipality"),
      Subdivision("Bijelo Polje", "04", "municipality"),
      Subdivision("Budva", "05", "municipality"),
      Subdivision("Cetinje", "06", "municipality"),
      Subdivision("Danilovgrad", "07", "municipality"),
      Subdivision("Gusinje", "22", "municipality"),
      Subdivision("Herceg-Novi", "08", "municipality"),
      Subdivision("Kolašin", "09", "municipality"),
      Subdivision("Kotor", "10", "municipality"),
      Subdivision("Mojkovac", "11", "municipality"),
      Subdivision("Nikšić", "12", "municipality"),
      Subdivision("Petnjica", "23", "municipality"),
      Subdivision("Plav", "13", "municipality"),
      Subdivision("Pljevlja", "14", "municipality"),
      Subdivision("Plužine", "15", "municipality"),
      Subdivision("Podgorica", "16", "municipality"),
      Subdivision("Rožaje", "17", "municipality"),
      Subdivision("Tivat", "19", "municipality"),
      Subdivision("Tuzi", "24", "municipality"),
      Subdivision("Ulcinj", "20", "municipality"),
      Subdivision("Šavnik", "18", "municipality"),
      Subdivision("Žabljak", "21", "municipality")
    )
  }

  case object MF extends Country("Saint Martin (French part)", "MF", "MAF")

  case object MG extends Country("Madagascar", "MG", "MDG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Antananarivo", "T", "province"),
      Subdivision("Antsiranana", "D", "province"),
      Subdivision("Fianarantsoa", "F", "province"),
      Subdivision("Mahajanga", "M", "province"),
      Subdivision("Toamasina", "A", "province"),
      Subdivision("Toliara", "U", "province")
    )
  }

  case object MH extends Country("Marshall Islands (the)", "MH", "MHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aelok", "ALK", "municipality"),
      Subdivision("Aelōn̄ḷapḷap", "ALL", "municipality"),
      Subdivision("Arno", "ARN", "municipality"),
      Subdivision("Aur", "AUR", "municipality"),
      Subdivision("Bikini & Kili", "KIL", "municipality"),
      Subdivision("Ebon", "EBO", "municipality"),
      Subdivision("Ellep", "LIB", "municipality"),
      Subdivision("Enewetak & Ujelang", "ENI", "municipality"),
      Subdivision("Jabat", "JAB", "municipality"),
      Subdivision("Jaluit", "JAL", "municipality"),
      Subdivision("Kuwajleen", "KWA", "municipality"),
      Subdivision("Lae", "LAE", "municipality"),
      Subdivision("Likiep", "LIK", "municipality"),
      Subdivision("Majuro", "MAJ", "municipality"),
      Subdivision("Maloelap", "MAL", "municipality"),
      Subdivision("Mejit", "MEJ", "municipality"),
      Subdivision("Mile", "MIL", "municipality"),
      Subdivision("Namdrik", "NMK", "municipality"),
      Subdivision("Namu", "NMU", "municipality"),
      Subdivision("Ralik chain", "L", "chain (of islands)"),
      Subdivision("Ratak chain", "T", "chain (of islands)"),
      Subdivision("Rongelap", "RON", "municipality"),
      Subdivision("Ujae", "UJA", "municipality"),
      Subdivision("Utrik", "UTI", "municipality"),
      Subdivision("Wotho", "WTH", "municipality"),
      Subdivision("Wotje", "WTJ", "municipality")
    )
  }

  case object MK extends Country("North Macedonia", "MK", "MKD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aerodrom †", "801", "municipality"),
      Subdivision("Aračinovo", "802", "municipality"),
      Subdivision("Berovo", "201", "municipality"),
      Subdivision("Bitola", "501", "municipality"),
      Subdivision("Bogdanci", "401", "municipality"),
      Subdivision("Bogovinje", "601", "municipality"),
      Subdivision("Bosilovo", "402", "municipality"),
      Subdivision("Brvenica", "602", "municipality"),
      Subdivision("Butel †", "803", "municipality"),
      Subdivision("Centar Župa", "313", "municipality"),
      Subdivision("Centar †", "814", "municipality"),
      Subdivision("Debar", "303", "municipality"),
      Subdivision("Debrca", "304", "municipality"),
      Subdivision("Delčevo", "203", "municipality"),
      Subdivision("Demir Hisar", "502", "municipality"),
      Subdivision("Demir Kapija", "103", "municipality"),
      Subdivision("Dojran", "406", "municipality"),
      Subdivision("Dolneni", "503", "municipality"),
      Subdivision("Gazi Baba †", "804", "municipality"),
      Subdivision("Gevgelija", "405", "municipality"),
      Subdivision("Gjorče Petrov †", "805", "municipality"),
      Subdivision("Gostivar", "604", "municipality"),
      Subdivision("Gradsko", "102", "municipality"),
      Subdivision("Ilinden", "807", "municipality"),
      Subdivision("Jegunovce", "606", "municipality"),
      Subdivision("Karbinci", "205", "municipality"),
      Subdivision("Karpoš †", "808", "municipality"),
      Subdivision("Kavadarci", "104", "municipality"),
      Subdivision("Kisela Voda †", "809", "municipality"),
      Subdivision("Kičevo", "307", "municipality"),
      Subdivision("Konče", "407", "municipality"),
      Subdivision("Kočani", "206", "municipality"),
      Subdivision("Kratovo", "701", "municipality"),
      Subdivision("Kriva Palanka", "702", "municipality"),
      Subdivision("Krivogaštani", "504", "municipality"),
      Subdivision("Kruševo", "505", "municipality"),
      Subdivision("Kumanovo", "703", "municipality"),
      Subdivision("Lipkovo", "704", "municipality"),
      Subdivision("Lozovo", "105", "municipality"),
      Subdivision("Makedonska Kamenica", "207", "municipality"),
      Subdivision("Makedonski Brod", "308", "municipality"),
      Subdivision("Mavrovo i Rostuše", "607", "municipality"),
      Subdivision("Mogila", "506", "municipality"),
      Subdivision("Negotino", "106", "municipality"),
      Subdivision("Novaci", "507", "municipality"),
      Subdivision("Novo Selo", "408", "municipality"),
      Subdivision("Ohrid", "310", "municipality"),
      Subdivision("Pehčevo", "208", "municipality"),
      Subdivision("Petrovec", "810", "municipality"),
      Subdivision("Plasnica", "311", "municipality"),
      Subdivision("Prilep", "508", "municipality"),
      Subdivision("Probištip", "209", "municipality"),
      Subdivision("Radoviš", "409", "municipality"),
      Subdivision("Rankovce", "705", "municipality"),
      Subdivision("Resen", "509", "municipality"),
      Subdivision("Rosoman", "107", "municipality"),
      Subdivision("Saraj †", "811", "municipality"),
      Subdivision("Sopište", "812", "municipality"),
      Subdivision("Staro Nagoričane", "706", "municipality"),
      Subdivision("Struga", "312", "municipality"),
      Subdivision("Strumica", "410", "municipality"),
      Subdivision("Studeničani", "813", "municipality"),
      Subdivision("Sveti Nikole", "108", "municipality"),
      Subdivision("Tearce", "608", "municipality"),
      Subdivision("Tetovo", "609", "municipality"),
      Subdivision("Valandovo", "403", "municipality"),
      Subdivision("Vasilevo", "404", "municipality"),
      Subdivision("Veles", "101", "municipality"),
      Subdivision("Vevčani", "301", "municipality"),
      Subdivision("Vinica", "202", "municipality"),
      Subdivision("Vrapčište", "603", "municipality"),
      Subdivision("Zelenikovo", "806", "municipality"),
      Subdivision("Zrnovci", "204", "municipality"),
      Subdivision("Čair †", "815", "municipality"),
      Subdivision("Čaška", "109", "municipality"),
      Subdivision("Češinovo-Obleševo", "210", "municipality"),
      Subdivision("Čučer-Sandevo", "816", "municipality"),
      Subdivision("Štip", "211", "municipality"),
      Subdivision("Šuto Orizari †", "817", "municipality"),
      Subdivision("Želino", "605", "municipality")
    )
  }

  case object ML extends Country("Mali", "ML", "MLI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bamako", "BKO", "district"),
      Subdivision("Gao", "7", "region"),
      Subdivision("Kayes", "1", "region"),
      Subdivision("Kidal", "8", "region"),
      Subdivision("Koulikoro", "2", "region"),
      Subdivision("Mopti", "5", "region"),
      Subdivision("Ménaka", "9", "region"),
      Subdivision("Sikasso", "3", "region"),
      Subdivision("Ségou", "4", "region"),
      Subdivision("Taoudénit", "10", "region"),
      Subdivision("Tombouctou", "6", "region")
    )
  }

  case object MM extends Country("Myanmar", "MM", "MMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ayeyarwady", "07", "region"),
      Subdivision("Bago", "02", "region"),
      Subdivision("Chin", "14", "state"),
      Subdivision("Kachin", "11", "state"),
      Subdivision("Kayah", "12", "state"),
      Subdivision("Kayin", "13", "state"),
      Subdivision("Magway", "03", "region"),
      Subdivision("Mandalay", "04", "region"),
      Subdivision("Mon", "15", "state"),
      Subdivision("Nay Pyi Taw", "18", "union territory"),
      Subdivision("Rakhine", "16", "state"),
      Subdivision("Sagaing", "01", "region"),
      Subdivision("Shan", "17", "state"),
      Subdivision("Tanintharyi", "05", "region"),
      Subdivision("Yangon", "06", "region")
    )
  }

  case object MN extends Country("Mongolia", "MN", "MNG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arhangay", "073", "province"),
      Subdivision("Bayan-Ölgiy", "071", "province"),
      Subdivision("Bayanhongor", "069", "province"),
      Subdivision("Bulgan", "067", "province"),
      Subdivision("Darhan uul", "037", "province"),
      Subdivision("Dornod", "061", "province"),
      Subdivision("Dornogovĭ", "063", "province"),
      Subdivision("Dundgovĭ", "059", "province"),
      Subdivision("Dzavhan", "057", "province"),
      Subdivision("Govĭ-Altay", "065", "province"),
      Subdivision("Govĭ-Sümber", "064", "province"),
      Subdivision("Hentiy", "039", "province"),
      Subdivision("Hovd", "043", "province"),
      Subdivision("Hövsgöl", "041", "province"),
      Subdivision("Orhon", "035", "province"),
      Subdivision("Selenge", "049", "province"),
      Subdivision("Sühbaatar", "051", "province"),
      Subdivision("Töv", "047", "province"),
      Subdivision("Ulaanbaatar", "1", "capital city"),
      Subdivision("Uvs", "046", "province"),
      Subdivision("Ömnögovĭ", "053", "province"),
      Subdivision("Övörhangay", "055", "province")
    )
  }

  case object MO extends Country("Macao", "MO", "MAC")

  case object MP extends Country("Northern Mariana Islands (the)", "MP", "MNP")

  case object MQ extends Country("Martinique", "MQ", "MTQ")

  case object MR extends Country("Mauritania", "MR", "MRT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adrar", "07", "region"),
      Subdivision("Assaba", "03", "region"),
      Subdivision("Brakna", "05", "region"),
      Subdivision("Dakhlet Nouâdhibou", "08", "region"),
      Subdivision("Gorgol", "04", "region"),
      Subdivision("Guidimaka", "10", "region"),
      Subdivision("Hodh ech Chargui", "01", "region"),
      Subdivision("Hodh el Gharbi", "02", "region"),
      Subdivision("Inchiri", "12", "region"),
      Subdivision("Nouakchott Nord", "14", "region"),
      Subdivision("Nouakchott Ouest", "13", "region"),
      Subdivision("Nouakchott Sud", "15", "region"),
      Subdivision("Tagant", "09", "region"),
      Subdivision("Tiris Zemmour", "11", "region"),
      Subdivision("Trarza", "06", "region")
    )
  }

  case object MS extends Country("Montserrat", "MS", "MSR")

  case object MT extends Country("Malta", "MT", "MLT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Attard", "01", "local council"),
      Subdivision("Balzan", "02", "local council"),
      Subdivision("Birgu", "03", "local council"),
      Subdivision("Birkirkara", "04", "local council"),
      Subdivision("Birżebbuġa", "05", "local council"),
      Subdivision("Bormla", "06", "local council"),
      Subdivision("Dingli", "07", "local council"),
      Subdivision("Fgura", "08", "local council"),
      Subdivision("Floriana", "09", "local council"),
      Subdivision("Fontana", "10", "local council"),
      Subdivision("Gudja", "11", "local council"),
      Subdivision("Għajnsielem", "13", "local council"),
      Subdivision("Għarb", "14", "local council"),
      Subdivision("Għargħur", "15", "local council"),
      Subdivision("Għasri", "16", "local council"),
      Subdivision("Għaxaq", "17", "local council"),
      Subdivision("Gżira", "12", "local council"),
      Subdivision("Iklin", "19", "local council"),
      Subdivision("Isla", "20", "local council"),
      Subdivision("Kalkara", "21", "local council"),
      Subdivision("Kerċem", "22", "local council"),
      Subdivision("Kirkop", "23", "local council"),
      Subdivision("Lija", "24", "local council"),
      Subdivision("Luqa", "25", "local council"),
      Subdivision("Marsa", "26", "local council"),
      Subdivision("Marsaskala", "27", "local council"),
      Subdivision("Marsaxlokk", "28", "local council"),
      Subdivision("Mdina", "29", "local council"),
      Subdivision("Mellieħa", "30", "local council"),
      Subdivision("Mosta", "32", "local council"),
      Subdivision("Mqabba", "33", "local council"),
      Subdivision("Msida", "34", "local council"),
      Subdivision("Mtarfa", "35", "local council"),
      Subdivision("Munxar", "36", "local council"),
      Subdivision("Mġarr", "31", "local council"),
      Subdivision("Nadur", "37", "local council"),
      Subdivision("Naxxar", "38", "local council"),
      Subdivision("Paola", "39", "local council"),
      Subdivision("Pembroke", "40", "local council"),
      Subdivision("Pietà", "41", "local council"),
      Subdivision("Qala", "42", "local council"),
      Subdivision("Qormi", "43", "local council"),
      Subdivision("Qrendi", "44", "local council"),
      Subdivision("Rabat Gozo", "45", "local council"),
      Subdivision("Rabat Malta", "46", "local council"),
      Subdivision("Safi", "47", "local council"),
      Subdivision("Saint John", "49", "local council"),
      Subdivision("Saint Julian's", "48", "local council"),
      Subdivision("Saint Lawrence", "50", "local council"),
      Subdivision("Saint Lucia's", "53", "local council"),
      Subdivision("Saint Paul's Bay", "51", "local council"),
      Subdivision("Sannat", "52", "local council"),
      Subdivision("Santa Venera", "54", "local council"),
      Subdivision("Siġġiewi", "55", "local council"),
      Subdivision("Sliema", "56", "local council"),
      Subdivision("Swieqi", "57", "local council"),
      Subdivision("Ta' Xbiex", "58", "local council"),
      Subdivision("Tarxien", "59", "local council"),
      Subdivision("Valletta", "60", "local council"),
      Subdivision("Xagħra", "61", "local council"),
      Subdivision("Xewkija", "62", "local council"),
      Subdivision("Xgħajra", "63", "local council"),
      Subdivision("Ħamrun", "18", "local council"),
      Subdivision("Żabbar", "64", "local council"),
      Subdivision("Żebbuġ Gozo", "65", "local council"),
      Subdivision("Żebbuġ Malta", "66", "local council"),
      Subdivision("Żejtun", "67", "local council"),
      Subdivision("Żurrieq", "68", "local council")
    )
  }

  case object MU extends Country("Mauritius", "MU", "MUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agalega Islands", "AG", "dependency"),
      Subdivision("Black River", "BL", "district"),
      Subdivision("Cargados Carajos Shoals", "CC", "dependency"),
      Subdivision("Flacq", "FL", "district"),
      Subdivision("Grand Port", "GP", "district"),
      Subdivision("Moka", "MO", "district"),
      Subdivision("Pamplemousses", "PA", "district"),
      Subdivision("Plaines Wilhems", "PW", "district"),
      Subdivision("Port Louis", "PL", "district"),
      Subdivision("Rivière du Rempart", "RR", "district"),
      Subdivision("Rodrigues Island", "RO", "dependency"),
      Subdivision("Savanne", "SA", "district")
    )
  }

  case object MV extends Country("Maldives", "MV", "MDV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Addu", "01", "city"),
      Subdivision("Ariatholhu Dhekunuburi", "00", "administrative atoll"),
      Subdivision("Ariatholhu Uthuruburi", "02", "administrative atoll"),
      Subdivision("Faadhippolhu", "03", "administrative atoll"),
      Subdivision("Felidheatholhu", "04", "administrative atoll"),
      Subdivision("Fuvammulah", "29", "administrative atoll"),
      Subdivision("Hahdhunmathi", "05", "administrative atoll"),
      Subdivision("Huvadhuatholhu Dhekunuburi", "28", "administrative atoll"),
      Subdivision("Huvadhuatholhu Uthuruburi", "27", "administrative atoll"),
      Subdivision("Kolhumadulu", "08", "administrative atoll"),
      Subdivision("Maale", "MLE", "city"),
      Subdivision("Maaleatholhu", "26", "administrative atoll"),
      Subdivision("Maalhosmadulu Dhekunuburi", "20", "administrative atoll"),
      Subdivision("Maalhosmadulu Uthuruburi", "13", "administrative atoll"),
      Subdivision("Miladhunmadulu Dhekunuburi", "25", "administrative atoll"),
      Subdivision("Miladhunmadulu Uthuruburi", "24", "administrative atoll"),
      Subdivision("Mulakatholhu", "12", "administrative atoll"),
      Subdivision("Nilandheatholhu Dhekunuburi", "17", "administrative atoll"),
      Subdivision("Nilandheatholhu Uthuruburi", "14", "administrative atoll"),
      Subdivision("North Thiladhunmathi", "07", "administrative atoll"),
      Subdivision("South Thiladhunmathi", "23", "administrative atoll")
    )
  }

  case object MW extends Country("Malawi", "MW", "MWI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Balaka", "BA", "district"),
      Subdivision("Blantyre", "BL", "district"),
      Subdivision("Central Region", "C", "region"),
      Subdivision("Chakumpoto", "N", "region"),
      Subdivision("Chakumwera", "S", "region"),
      Subdivision("Chikwawa", "CK", "district"),
      Subdivision("Chiradzulu", "CR", "district"),
      Subdivision("Chitipa", "CT", "district"),
      Subdivision("Dedza", "DE", "district"),
      Subdivision("Dowa", "DO", "district"),
      Subdivision("Karonga", "KR", "district"),
      Subdivision("Kasungu", "KS", "district"),
      Subdivision("Likoma", "LK", "district"),
      Subdivision("Lilongwe", "LI", "district"),
      Subdivision("Machinga", "MH", "district"),
      Subdivision("Mangochi", "MG", "district"),
      Subdivision("Mchinji", "MC", "district"),
      Subdivision("Mulanje", "MU", "district"),
      Subdivision("Mwanza", "MW", "district"),
      Subdivision("Mzimba", "MZ", "district"),
      Subdivision("Neno", "NE", "district"),
      Subdivision("Nkhata Bay", "NB", "district"),
      Subdivision("Nkhotakota", "NK", "district"),
      Subdivision("Nsanje", "NS", "district"),
      Subdivision("Ntcheu", "NU", "district"),
      Subdivision("Ntchisi", "NI", "district"),
      Subdivision("Phalombe", "PH", "district"),
      Subdivision("Rumphi", "RU", "district"),
      Subdivision("Salima", "SA", "district"),
      Subdivision("Thyolo", "TH", "district"),
      Subdivision("Zomba", "ZO", "district")
    )
  }

  case object MX extends Country("Mexico", "MX", "MEX") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aguascalientes", "AGU", "state"),
      Subdivision("Baja California", "BCN", "state"),
      Subdivision("Baja California Sur", "BCS", "state"),
      Subdivision("Campeche", "CAM", "state"),
      Subdivision("Chiapas", "CHP", "state"),
      Subdivision("Chihuahua", "CHH", "state"),
      Subdivision("Ciudad de México", "CMX", "federal district"),
      Subdivision("Coahuila de Zaragoza", "COA", "state"),
      Subdivision("Colima", "COL", "state"),
      Subdivision("Durango", "DUR", "state"),
      Subdivision("Guanajuato", "GUA", "state"),
      Subdivision("Guerrero", "GRO", "state"),
      Subdivision("Hidalgo", "HID", "state"),
      Subdivision("Jalisco", "JAL", "state"),
      Subdivision("Michoacán de Ocampo", "MIC", "state"),
      Subdivision("Morelos", "MOR", "state"),
      Subdivision("México", "MEX", "state"),
      Subdivision("Nayarit", "NAY", "state"),
      Subdivision("Nuevo León", "NLE", "state"),
      Subdivision("Oaxaca", "OAX", "state"),
      Subdivision("Puebla", "PUE", "state"),
      Subdivision("Querétaro", "QUE", "state"),
      Subdivision("Quintana Roo", "ROO", "state"),
      Subdivision("San Luis Potosí", "SLP", "state"),
      Subdivision("Sinaloa", "SIN", "state"),
      Subdivision("Sonora", "SON", "state"),
      Subdivision("Tabasco", "TAB", "state"),
      Subdivision("Tamaulipas", "TAM", "state"),
      Subdivision("Tlaxcala", "TLA", "state"),
      Subdivision("Veracruz de Ignacio de la Llave", "VER", "state"),
      Subdivision("Yucatán", "YUC", "state"),
      Subdivision("Zacatecas", "ZAC", "state")
    )
  }

  case object MY extends Country("Malaysia", "MY", "MYS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Johor", "01", "state"),
      Subdivision("Kedah", "02", "state"),
      Subdivision("Kelantan", "03", "state"),
      Subdivision("Melaka", "04", "state"),
      Subdivision("Negeri Sembilan", "05", "state"),
      Subdivision("Pahang", "06", "state"),
      Subdivision("Perak", "08", "state"),
      Subdivision("Perlis", "09", "state"),
      Subdivision("Pulau Pinang", "07", "state"),
      Subdivision("Sabah", "12", "state"),
      Subdivision("Sarawak", "13", "state"),
      Subdivision("Selangor", "10", "state"),
      Subdivision("Terengganu", "11", "state"),
      Subdivision("Wilayah Persekutuan Kuala Lumpur", "14", "federal territory"),
      Subdivision("Wilayah Persekutuan Labuan", "15", "federal territory"),
      Subdivision("Wilayah Persekutuan Putrajaya", "16", "federal territory")
    )
  }

  case object MZ extends Country("Mozambique", "MZ", "MOZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Cabo Delgado", "P", "province"),
      Subdivision("Gaza", "G", "province"),
      Subdivision("Inhambane", "I", "province"),
      Subdivision("Manica", "B", "province"),
      Subdivision("Maputo", "MPM", "city"),
      Subdivision("Maputo", "L", "province"),
      Subdivision("Nampula", "N", "province"),
      Subdivision("Niassa", "A", "province"),
      Subdivision("Sofala", "S", "province"),
      Subdivision("Tete", "T", "province"),
      Subdivision("Zambézia", "Q", "province")
    )
  }

  case object NA extends Country("Namibia", "NA", "NAM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("//Karas", "KA", "region"),
      Subdivision("Erongo", "ER", "region"),
      Subdivision("Hardap", "HA", "region"),
      Subdivision("Kavango East", "KE", "region"),
      Subdivision("Kavango West", "KW", "region"),
      Subdivision("Khomas", "KH", "region"),
      Subdivision("Kunene", "KU", "region"),
      Subdivision("Ohangwena", "OW", "region"),
      Subdivision("Omaheke", "OH", "region"),
      Subdivision("Omusati", "OS", "region"),
      Subdivision("Oshana", "ON", "region"),
      Subdivision("Oshikoto", "OT", "region"),
      Subdivision("Otjozondjupa", "OD", "region"),
      Subdivision("Zambezi", "CA", "region")
    )
  }

  case object NC extends Country("New Caledonia", "NC", "NCL")

  case object NE extends Country("Niger (the)", "NE", "NER") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agadez", "1", "region"),
      Subdivision("Diffa", "2", "region"),
      Subdivision("Dosso", "3", "region"),
      Subdivision("Maradi", "4", "region"),
      Subdivision("Niamey", "8", "urban community"),
      Subdivision("Tahoua", "5", "region"),
      Subdivision("Tillabéri", "6", "region"),
      Subdivision("Zinder", "7", "region")
    )
  }

  case object NF extends Country("Norfolk Island", "NF", "NFK")

  case object NG extends Country("Nigeria", "NG", "NGA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abia", "AB", "state"),
      Subdivision("Abuja Federal Capital Territory", "FC", "capital territory"),
      Subdivision("Adamawa", "AD", "state"),
      Subdivision("Akwa Ibom", "AK", "state"),
      Subdivision("Anambra", "AN", "state"),
      Subdivision("Bauchi", "BA", "state"),
      Subdivision("Bayelsa", "BY", "state"),
      Subdivision("Benue", "BE", "state"),
      Subdivision("Borno", "BO", "state"),
      Subdivision("Cross River", "CR", "state"),
      Subdivision("Delta", "DE", "state"),
      Subdivision("Ebonyi", "EB", "state"),
      Subdivision("Edo", "ED", "state"),
      Subdivision("Ekiti", "EK", "state"),
      Subdivision("Enugu", "EN", "state"),
      Subdivision("Gombe", "GO", "state"),
      Subdivision("Imo", "IM", "state"),
      Subdivision("Jigawa", "JI", "state"),
      Subdivision("Kaduna", "KD", "state"),
      Subdivision("Kano", "KN", "state"),
      Subdivision("Katsina", "KT", "state"),
      Subdivision("Kebbi", "KE", "state"),
      Subdivision("Kogi", "KO", "state"),
      Subdivision("Kwara", "KW", "state"),
      Subdivision("Lagos", "LA", "state"),
      Subdivision("Nasarawa", "NA", "state"),
      Subdivision("Niger", "NI", "state"),
      Subdivision("Ogun", "OG", "state"),
      Subdivision("Ondo", "ON", "state"),
      Subdivision("Osun", "OS", "state"),
      Subdivision("Oyo", "OY", "state"),
      Subdivision("Plateau", "PL", "state"),
      Subdivision("Rivers", "RI", "state"),
      Subdivision("Sokoto", "SO", "state"),
      Subdivision("Taraba", "TA", "state"),
      Subdivision("Yobe", "YO", "state"),
      Subdivision("Zamfara", "ZA", "state")
    )
  }

  case object NI extends Country("Nicaragua", "NI", "NIC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Boaco", "BO", "department"),
      Subdivision("Carazo", "CA", "department"),
      Subdivision("Chinandega", "CI", "department"),
      Subdivision("Chontales", "CO", "department"),
      Subdivision("Costa Caribe Norte", "AN", "autonomous region"),
      Subdivision("Costa Caribe Sur", "AS", "autonomous region"),
      Subdivision("Estelí", "ES", "department"),
      Subdivision("Granada", "GR", "department"),
      Subdivision("Jinotega", "JI", "department"),
      Subdivision("León", "LE", "department"),
      Subdivision("Madriz", "MD", "department"),
      Subdivision("Managua", "MN", "department"),
      Subdivision("Masaya", "MS", "department"),
      Subdivision("Matagalpa", "MT", "department"),
      Subdivision("Nueva Segovia", "NS", "department"),
      Subdivision("Rivas", "RI", "department"),
      Subdivision("Río San Juan", "SJ", "department")
    )
  }

  case object NL extends Country("Netherlands (the)", "NL", "NLD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aruba", "AW", "country"),
      Subdivision("Bonaire", "BQ1", "special municipality"),
      Subdivision("Curaçao", "CW", "country"),
      Subdivision("Drenthe", "DR", "province"),
      Subdivision("Flevoland", "FL", "province"),
      Subdivision("Fryslân", "FR", "province"),
      Subdivision("Gelderland", "GE", "province"),
      Subdivision("Groningen", "GR", "province"),
      Subdivision("Limburg", "LI", "province"),
      Subdivision("Noord-Brabant", "NB", "province"),
      Subdivision("Noord-Holland", "NH", "province"),
      Subdivision("Overijssel", "OV", "province"),
      Subdivision("Saba", "BQ2", "special municipality"),
      Subdivision("Sint Eustatius", "BQ3", "special municipality"),
      Subdivision("Sint Maarten", "SX", "country"),
      Subdivision("Utrecht", "UT", "province"),
      Subdivision("Zeeland", "ZE", "province"),
      Subdivision("Zuid-Holland", "ZH", "province")
    )
  }

  case object NO extends Country("Norway", "NO", "NOR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Agder", "42", "county"),
      Subdivision("Innlandet", "34", "county"),
      Subdivision("Jan Mayen", "22", "arctic region"),
      Subdivision("Møre og Romsdal", "15", "county"),
      Subdivision("Nordland", "18", "county"),
      Subdivision("Oslo", "03", "county"),
      Subdivision("Rogaland", "11", "county"),
      Subdivision("Romssa ja Finnmárkku", "54", "county"),
      Subdivision("Svalbard", "21", "arctic region"),
      Subdivision("Trööndelage", "50", "county"),
      Subdivision("Vestfold og Telemark", "38", "county"),
      Subdivision("Vestland", "46", "county"),
      Subdivision("Viken", "30", "county")
    )
  }

  case object NP extends Country("Nepal", "NP", "NPL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bagmati", "BA", "zone"),
      Subdivision("Bheri", "BH", "zone"),
      Subdivision("Bāgmatī", "P3", "province"),
      Subdivision("Central", "1", "development region"),
      Subdivision("Dhawalagiri", "DH", "zone"),
      Subdivision("Eastern", "4", "development region"),
      Subdivision("Far Western", "5", "development region"),
      Subdivision("Gandaki", "GA", "zone"),
      Subdivision("Gandaki", "P4", "province"),
      Subdivision("Janakpur", "JA", "zone"),
      Subdivision("Karnali", "KA", "zone"),
      Subdivision("Karnali", "P6", "province"),
      Subdivision("Kosi", "KO", "zone"),
      Subdivision("Lumbini", "LU", "zone"),
      Subdivision("Lumbini", "P5", "province"),
      Subdivision("Madhya Pashchimanchal", "2", "development region"),
      Subdivision("Mahakali", "MA", "zone"),
      Subdivision("Mechi", "ME", "zone"),
      Subdivision("Narayani", "NA", "zone"),
      Subdivision("Pashchimanchal", "3", "development region"),
      Subdivision("Pradesh 1", "P1", "province"),
      Subdivision("Pradesh 2", "P2", "province"),
      Subdivision("Rapti", "RA", "zone"),
      Subdivision("Sagarmatha", "SA", "zone"),
      Subdivision("Seti", "SE", "zone"),
      Subdivision("Sudūr Pashchim", "P7", "province")
    )
  }

  case object NR extends Country("Nauru", "NR", "NRU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aiwo", "01", "district"),
      Subdivision("Anabar", "02", "district"),
      Subdivision("Anetan", "03", "district"),
      Subdivision("Anibare", "04", "district"),
      Subdivision("Baitsi", "05", "district"),
      Subdivision("Boe", "06", "district"),
      Subdivision("Buada", "07", "district"),
      Subdivision("Denigomodu", "08", "district"),
      Subdivision("Ewa", "09", "district"),
      Subdivision("Ijuw", "10", "district"),
      Subdivision("Meneng", "11", "district"),
      Subdivision("Nibok", "12", "district"),
      Subdivision("Uaboe", "13", "district"),
      Subdivision("Yaren", "14", "district")
    )
  }

  case object NU extends Country("Niue", "NU", "NIU")

  case object NZ extends Country("New Zealand", "NZ", "NZL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Auckland", "AUK", "region"),
      Subdivision("Bay of Plenty", "BOP", "region"),
      Subdivision("Canterbury", "CAN", "region"),
      Subdivision("Chatham Islands Territory", "CIT", "special island authority"),
      Subdivision("Gisborne", "GIS", "region"),
      Subdivision("Hawke's Bay", "HKB", "region"),
      Subdivision("Manawatu Whanganui", "MWT", "region"),
      Subdivision("Marlborough", "MBH", "region"),
      Subdivision("Murihiku", "STL", "region"),
      Subdivision("Nelson", "NSN", "region"),
      Subdivision("Northland", "NTL", "region"),
      Subdivision("Otago", "OTA", "region"),
      Subdivision("Taranaki", "TKI", "region"),
      Subdivision("Tasman", "TAS", "region"),
      Subdivision("Te Taihau ā uru", "WTC", "region"),
      Subdivision("Te Whanga-nui-a-Tara", "WGN", "region"),
      Subdivision("Waikato", "WKO", "region")
    )
  }

  case object OM extends Country("Oman", "OM", "OMN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Dākhilīyah", "DA", "governorate"),
      Subdivision("Al Buraymī", "BU", "governorate"),
      Subdivision("Al Wusţá", "WU", "governorate"),
      Subdivision("Az̧ Z̧āhirah", "ZA", "governorate"),
      Subdivision("Janūb al Bāţinah", "BJ", "governorate"),
      Subdivision("Janūb ash Sharqīyah", "SJ", "governorate"),
      Subdivision("Masqaţ", "MA", "governorate"),
      Subdivision("Musandam", "MU", "governorate"),
      Subdivision("Shamāl al Bāţinah", "BS", "governorate"),
      Subdivision("Shamāl ash Sharqīyah", "SS", "governorate"),
      Subdivision("Z̧ufār", "ZU", "governorate")
    )
  }

  case object PA extends Country("Panama", "PA", "PAN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bocas del Toro", "1", "province"),
      Subdivision("Chiriquí", "4", "province"),
      Subdivision("Coclé", "2", "province"),
      Subdivision("Colón", "3", "province"),
      Subdivision("Darién", "5", "province"),
      Subdivision("Emberá", "EM", "indigenous region"),
      Subdivision("Guna Yala", "KY", "indigenous region"),
      Subdivision("Herrera", "6", "province"),
      Subdivision("Los Santos", "7", "province"),
      Subdivision("Naso Tjër Di", "NT", "indigenous region"),
      Subdivision("Ngöbe-Buglé", "NB", "indigenous region"),
      Subdivision("Panamá", "8", "province"),
      Subdivision("Panamá Oeste", "10", "province"),
      Subdivision("Veraguas", "9", "province")
    )
  }

  case object PE extends Country("Peru", "PE", "PER") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amarumayu", "AMA", "region"),
      Subdivision("Ancash", "ANC", "region"),
      Subdivision("Apurimaq", "APU", "region"),
      Subdivision("Arequipa", "ARE", "region"),
      Subdivision("Ayacucho", "AYA", "region"),
      Subdivision("Cajamarca", "CAJ", "region"),
      Subdivision("Cusco", "CUS", "region"),
      Subdivision("El Callao", "CAL", "region"),
      Subdivision("Huancavelica", "HUV", "region"),
      Subdivision("Hunin", "JUN", "region"),
      Subdivision("Huánuco", "HUC", "region"),
      Subdivision("Ica", "ICA", "region"),
      Subdivision("La Libertad", "LAL", "region"),
      Subdivision("Lambayeque", "LAM", "region"),
      Subdivision("Lima", "LIM", "region"),
      Subdivision("Lima hatun llaqta", "LMA", "municipality"),
      Subdivision("Loreto", "LOR", "region"),
      Subdivision("Madre de Dios", "MDD", "region"),
      Subdivision("Moquegua", "MOQ", "region"),
      Subdivision("Pasco", "PAS", "region"),
      Subdivision("Piura", "PIU", "region"),
      Subdivision("Puno", "PUN", "region"),
      Subdivision("San Martin", "SAM", "region"),
      Subdivision("Tacna", "TAC", "region"),
      Subdivision("Tumbes", "TUM", "region"),
      Subdivision("Ucayali", "UCA", "region")
    )
  }

  case object PF extends Country("French Polynesia", "PF", "PYF")

  case object PG extends Country("Papua New Guinea", "PG", "PNG") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bougainville", "NSB", "autonomous region"),
      Subdivision("Central", "CPM", "province"),
      Subdivision("Chimbu", "CPK", "province"),
      Subdivision("East New Britain", "EBR", "province"),
      Subdivision("East Sepik", "ESW", "province"),
      Subdivision("Eastern Highlands", "EHG", "province"),
      Subdivision("Enga", "EPW", "province"),
      Subdivision("Gulf", "GPK", "province"),
      Subdivision("Hela", "HLA", "province"),
      Subdivision("Jiwaka", "JWK", "province"),
      Subdivision("Madang", "MPM", "province"),
      Subdivision("Manus", "MRL", "province"),
      Subdivision("Milne Bay", "MBA", "province"),
      Subdivision("Morobe", "MPL", "province"),
      Subdivision("National Capital District", "NCD", "district"),
      Subdivision("New Ireland", "NIK", "province"),
      Subdivision("Northern", "NPP", "province"),
      Subdivision("Southern Highlands", "SHM", "province"),
      Subdivision("West New Britain", "WBK", "province"),
      Subdivision("West Sepik", "SAN", "province"),
      Subdivision("Western", "WPD", "province"),
      Subdivision("Western Highlands", "WHM", "province")
    )
  }

  case object PH extends Country("Philippines (the)", "PH", "PHL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abra", "ABR", "province"),
      Subdivision("Agusan del Norte", "AGN", "province"),
      Subdivision("Agusan del Sur", "AGS", "province"),
      Subdivision("Aklan", "AKL", "province"),
      Subdivision("Albay", "ALB", "province"),
      Subdivision("Antike", "ANT", "province"),
      Subdivision("Apayao", "APA", "province"),
      Subdivision("Aurora", "AUR", "province"),
      Subdivision("Autonomous Region in Muslim Mindanao", "14", "region"),
      Subdivision("Basilan", "BAS", "province"),
      Subdivision("Bataan", "BAN", "province"),
      Subdivision("Batanes", "BTN", "province"),
      Subdivision("Batangas", "BTG", "province"),
      Subdivision("Benget", "BEN", "province"),
      Subdivision("Bicol", "05", "region"),
      Subdivision("Biliran", "BIL", "province"),
      Subdivision("Bohol", "BOH", "province"),
      Subdivision("Bukidnon", "BUK", "province"),
      Subdivision("Bulacan", "BUL", "province"),
      Subdivision("Cagayan", "CAG", "province"),
      Subdivision("Cagayan Valley", "02", "region"),
      Subdivision("Calabarzon", "40", "region"),
      Subdivision("Camarines Norte", "CAN", "province"),
      Subdivision("Camarines Sur", "CAS", "province"),
      Subdivision("Camiguin", "CAM", "province"),
      Subdivision("Capiz", "CAP", "province"),
      Subdivision("Caraga", "13", "region"),
      Subdivision("Catanduanes", "CAT", "province"),
      Subdivision("Cavite", "CAV", "province"),
      Subdivision("Cebu", "CEB", "province"),
      Subdivision("Central Luzon", "03", "region"),
      Subdivision("Central Visayas", "07", "region"),
      Subdivision("Cordillera Administrative Region", "15", "region"),
      Subdivision("Cotabato", "NCO", "province"),
      Subdivision("Davao", "11", "region"),
      Subdivision("Davao Occidental", "DVO", "province"),
      Subdivision("Davao Oriental", "DAO", "province"),
      Subdivision("Davao de Oro", "COM", "province"),
      Subdivision("Davao del Norte", "DAV", "province"),
      Subdivision("Davao del Sur", "DAS", "province"),
      Subdivision("Dinagat Islands", "DIN", "province"),
      Subdivision("Eastern Samar", "EAS", "province"),
      Subdivision("Eastern Visayas", "08", "region"),
      Subdivision("Gimaras", "GUI", "province"),
      Subdivision("Hilagang Iloko", "ILN", "province"),
      Subdivision("Hilagang Lanaw", "LAN", "province"),
      Subdivision("Hilagang Samar", "NSA", "province"),
      Subdivision("Hilagang Sambuwangga", "ZAN", "province"),
      Subdivision("Hilagang Surigaw", "SUN", "province"),
      Subdivision("Ifugao", "IFU", "province"),
      Subdivision("Ilocos", "01", "region"),
      Subdivision("Ilocos Sur", "ILS", "province"),
      Subdivision("Iloilo", "ILI", "province"),
      Subdivision("Isabela", "ISA", "province"),
      Subdivision("Kalinga", "KAL", "province"),
      Subdivision("Kanlurang Mindoro", "MDC", "province"),
      Subdivision("Kanlurang Misamis", "MSC", "province"),
      Subdivision("Kanlurang Negros", "NEC", "province"),
      Subdivision("Katimogang Leyte", "SLE", "province"),
      Subdivision("Keson", "QUE", "province"),
      Subdivision("Kirino", "QUI", "province"),
      Subdivision("La Union", "LUN", "province"),
      Subdivision("Laguna", "LAG", "province"),
      Subdivision("Lalawigang Bulubundukin", "MOU", "province"),
      Subdivision("Lanao del Sur", "LAS", "province"),
      Subdivision("Leyte", "LEY", "province"),
      Subdivision("Magindanaw", "MAG", "province"),
      Subdivision("Marinduke", "MAD", "province"),
      Subdivision("Masbate", "MAS", "province"),
      Subdivision("Mimaropa", "41", "region"),
      Subdivision("Mindoro Oriental", "MDR", "province"),
      Subdivision("Misamis Oriental", "MSR", "province"),
      Subdivision("National Capital Region", "00", "region"),
      Subdivision("Negros Oriental", "NER", "province"),
      Subdivision("Northern Mindanao", "10", "region"),
      Subdivision("Nueva Ecija", "NUE", "province"),
      Subdivision("Nueva Vizcaya", "NUV", "province"),
      Subdivision("Palawan", "PLW", "province"),
      Subdivision("Pampanga", "PAM", "province"),
      Subdivision("Pangasinan", "PAN", "province"),
      Subdivision("Rehiyon ng Kanlurang Bisaya", "06", "region"),
      Subdivision("Rehiyon ng Soccsksargen", "12", "region"),
      Subdivision("Rehiyon ng Tangway ng Sambuwangga", "09", "region"),
      Subdivision("Risal", "RIZ", "province"),
      Subdivision("Romblon", "ROM", "province"),
      Subdivision("Samar", "WSA", "province"),
      Subdivision("Sambales", "ZMB", "province"),
      Subdivision("Sambuwangga Sibugay", "ZSI", "province"),
      Subdivision("Sarangani", "SAR", "province"),
      Subdivision("Sikihor", "SIG", "province"),
      Subdivision("Sorsogon", "SOR", "province"),
      Subdivision("South Cotabato", "SCO", "province"),
      Subdivision("Sultan Kudarat", "SUK", "province"),
      Subdivision("Sulu", "SLU", "province"),
      Subdivision("Surigao del Sur", "SUR", "province"),
      Subdivision("Tarlac", "TAR", "province"),
      Subdivision("Tawi-Tawi", "TAW", "province"),
      Subdivision("Timog Sambuwangga", "ZAS", "province")
    )
  }

  case object PK extends Country("Pakistan", "PK", "PAK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Azad Jammu and Kashmir", "JK", "Pakistan administered area"),
      Subdivision("Balochistan", "BA", "province"),
      Subdivision("Gilgit-Baltistan", "GB", "Pakistan administered area"),
      Subdivision("Islamabad", "IS", "federal capital territory"),
      Subdivision("Khaībar Pakhtūnkhwā", "KP", "province"),
      Subdivision("Panjāb", "PB", "province"),
      Subdivision("Sindh", "SD", "province")
    )
  }

  case object PL extends Country("Poland", "PL", "POL") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dolnośląskie", "02", "voivodship"),
      Subdivision("Kujawsko-pomorskie", "04", "voivodship"),
      Subdivision("Lubelskie", "06", "voivodship"),
      Subdivision("Lubuskie", "08", "voivodship"),
      Subdivision("Mazowieckie", "14", "voivodship"),
      Subdivision("Małopolskie", "12", "voivodship"),
      Subdivision("Opolskie", "16", "voivodship"),
      Subdivision("Podkarpackie", "18", "voivodship"),
      Subdivision("Podlaskie", "20", "voivodship"),
      Subdivision("Pomorskie", "22", "voivodship"),
      Subdivision("Warmińsko-mazurskie", "28", "voivodship"),
      Subdivision("Wielkopolskie", "30", "voivodship"),
      Subdivision("Zachodniopomorskie", "32", "voivodship"),
      Subdivision("Łódzkie", "10", "voivodship"),
      Subdivision("Śląskie", "24", "voivodship"),
      Subdivision("Świętokrzyskie", "26", "voivodship")
    )
  }

  case object PM extends Country("Saint Pierre and Miquelon", "PM", "SPM")

  case object PN extends Country("Pitcairn", "PN", "PCN")

  case object PR extends Country("Puerto Rico", "PR", "PRI")

  case object PS extends Country("Palestine, State of", "PS", "PSE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Khalīl", "HBN", "governorate"),
      Subdivision("Al Quds", "JEM", "governorate"),
      Subdivision("Arīḩā wal Aghwār", "JRH", "governorate"),
      Subdivision("Bayt Laḩm", "BTH", "governorate"),
      Subdivision("Dayr al Balaḩ", "DEB", "governorate"),
      Subdivision("Gaza", "GZA", "governorate"),
      Subdivision("Janīn", "JEN", "governorate"),
      Subdivision("Khan Yunis", "KYS", "governorate"),
      Subdivision("Nablus", "NBS", "governorate"),
      Subdivision("North Gaza", "NGZ", "governorate"),
      Subdivision("Qalqilya", "QQA", "governorate"),
      Subdivision("Rafah", "RFH", "governorate"),
      Subdivision("Ramallah", "RBH", "governorate"),
      Subdivision("Salfit", "SLT", "governorate"),
      Subdivision("Tubas", "TBS", "governorate"),
      Subdivision("Tulkarm", "TKM", "governorate")
    )
  }

  case object PT extends Country("Portugal", "PT", "PRT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aveiro", "01", "district"),
      Subdivision("Beja", "02", "district"),
      Subdivision("Braga", "03", "district"),
      Subdivision("Bragança", "04", "district"),
      Subdivision("Castelo Branco", "05", "district"),
      Subdivision("Coimbra", "06", "district"),
      Subdivision("Faro", "08", "district"),
      Subdivision("Guarda", "09", "district"),
      Subdivision("Leiria", "10", "district"),
      Subdivision("Lisboa", "11", "district"),
      Subdivision("Portalegre", "12", "district"),
      Subdivision("Porto", "13", "district"),
      Subdivision("Região Autónoma da Madeira", "30", "autonomous region"),
      Subdivision("Região Autónoma dos Açores", "20", "autonomous region"),
      Subdivision("Santarém", "14", "district"),
      Subdivision("Setúbal", "15", "district"),
      Subdivision("Viana do Castelo", "16", "district"),
      Subdivision("Vila Real", "17", "district"),
      Subdivision("Viseu", "18", "district"),
      Subdivision("Évora", "07", "district")
    )
  }

  case object PW extends Country("Palau", "PW", "PLW") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aimeliik", "002", "state"),
      Subdivision("Airai", "004", "state"),
      Subdivision("Angaur", "010", "state"),
      Subdivision("Hatohobei", "050", "state"),
      Subdivision("Kayangel", "100", "state"),
      Subdivision("Koror", "150", "state"),
      Subdivision("Melekeok", "212", "state"),
      Subdivision("Ngaraard", "214", "state"),
      Subdivision("Ngarchelong", "218", "state"),
      Subdivision("Ngardmau", "222", "state"),
      Subdivision("Ngatpang", "224", "state"),
      Subdivision("Ngchesar", "226", "state"),
      Subdivision("Ngeremlengui", "227", "state"),
      Subdivision("Ngiwal", "228", "state"),
      Subdivision("Peleliu", "350", "state"),
      Subdivision("Sonsorol", "370", "state")
    )
  }

  case object PY extends Country("Paraguay", "PY", "PRY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alto Paraguay", "16", "department"),
      Subdivision("Alto Paraná", "10", "department"),
      Subdivision("Amambay", "13", "department"),
      Subdivision("Asunción", "ASU", "capital"),
      Subdivision("Boquerón", "19", "department"),
      Subdivision("Caaguazú", "5", "department"),
      Subdivision("Caazapá", "6", "department"),
      Subdivision("Canindeyú", "14", "department"),
      Subdivision("Central", "11", "department"),
      Subdivision("Concepción", "1", "department"),
      Subdivision("Cordillera", "3", "department"),
      Subdivision("Guairá", "4", "department"),
      Subdivision("Itapúa", "7", "department"),
      Subdivision("Misiones", "8", "department"),
      Subdivision("Paraguarí", "9", "department"),
      Subdivision("Presidente Hayes", "15", "department"),
      Subdivision("San Pedro", "2", "department"),
      Subdivision("Ñeembucú", "12", "department")
    )
  }

  case object QA extends Country("Qatar", "QA", "QAT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ad Dawḩah", "DA", "municipality"),
      Subdivision("Al Khawr wa adh Dhakhīrah", "KH", "municipality"),
      Subdivision("Al Wakrah", "WA", "municipality"),
      Subdivision("Ar Rayyān", "RA", "municipality"),
      Subdivision("Ash Shamāl", "MS", "municipality"),
      Subdivision("Ash Shīḩānīyah", "SH", "municipality"),
      Subdivision("Az̧ Z̧a‘āyin", "ZA", "municipality"),
      Subdivision("Umm Şalāl", "US", "municipality")
    )
  }

  case object RE extends Country("Réunion", "RE", "REU")

  case object RO extends Country("Romania", "RO", "ROU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alba", "AB", "department"),
      Subdivision("Arad", "AR", "department"),
      Subdivision("Argeș", "AG", "department"),
      Subdivision("Bacău", "BC", "department"),
      Subdivision("Bihor", "BH", "department"),
      Subdivision("Bistrița-Năsăud", "BN", "department"),
      Subdivision("Botoșani", "BT", "department"),
      Subdivision("Brașov", "BV", "department"),
      Subdivision("Brăila", "BR", "department"),
      Subdivision("București", "B", "municipality"),
      Subdivision("Buzău", "BZ", "department"),
      Subdivision("Caraș-Severin", "CS", "department"),
      Subdivision("Cluj", "CJ", "department"),
      Subdivision("Constanța", "CT", "department"),
      Subdivision("Covasna", "CV", "department"),
      Subdivision("Călărași", "CL", "department"),
      Subdivision("Dolj", "DJ", "department"),
      Subdivision("Dâmbovița", "DB", "department"),
      Subdivision("Galați", "GL", "department"),
      Subdivision("Giurgiu", "GR", "department"),
      Subdivision("Gorj", "GJ", "department"),
      Subdivision("Harghita", "HR", "department"),
      Subdivision("Hunedoara", "HD", "department"),
      Subdivision("Ialomița", "IL", "department"),
      Subdivision("Iași", "IS", "department"),
      Subdivision("Ilfov", "IF", "department"),
      Subdivision("Maramureș", "MM", "department"),
      Subdivision("Mehedinți", "MH", "department"),
      Subdivision("Mureș", "MS", "department"),
      Subdivision("Neamț", "NT", "department"),
      Subdivision("Olt", "OT", "department"),
      Subdivision("Prahova", "PH", "department"),
      Subdivision("Satu Mare", "SM", "department"),
      Subdivision("Sibiu", "SB", "department"),
      Subdivision("Suceava", "SV", "department"),
      Subdivision("Sălaj", "SJ", "department"),
      Subdivision("Teleorman", "TR", "department"),
      Subdivision("Timiș", "TM", "department"),
      Subdivision("Tulcea", "TL", "department"),
      Subdivision("Vaslui", "VS", "department"),
      Subdivision("Vrancea", "VN", "department"),
      Subdivision("Vâlcea", "VL", "department")
    )
  }

  case object RS extends Country("Serbia", "RS", "SRB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Beograd", "00", "city"),
      Subdivision("Borski okrug", "14", "district"),
      Subdivision("Braničevski okrug", "11", "district"),
      Subdivision("Jablanički okrug", "23", "district"),
      Subdivision("Južnobanatski okrug", "04", "district"),
      Subdivision("Južnobački okrug", "06", "district"),
      Subdivision("Kolubarski okrug", "09", "district"),
      Subdivision("Kosovo-Metohija", "KM", "autonomous province"),
      Subdivision("Kosovski okrug", "25", "district"),
      Subdivision("Kosovsko-Mitrovački okrug", "28", "district"),
      Subdivision("Kosovsko-Pomoravski okrug", "29", "district"),
      Subdivision("Mačvanski okrug", "08", "district"),
      Subdivision("Moravički okrug", "17", "district"),
      Subdivision("Nišavski okrug", "20", "district"),
      Subdivision("Pećki okrug", "26", "district"),
      Subdivision("Pirotski okrug", "22", "district"),
      Subdivision("Podunavski okrug", "10", "district"),
      Subdivision("Pomoravski okrug", "13", "district"),
      Subdivision("Prizrenski okrug", "27", "district"),
      Subdivision("Pčinjski okrug", "24", "district"),
      Subdivision("Rasinski okrug", "19", "district"),
      Subdivision("Raški okrug", "18", "district"),
      Subdivision("Severnobanatski okrug", "03", "district"),
      Subdivision("Severnobački okrug", "01", "district"),
      Subdivision("Srednjebanatski okrug", "02", "district"),
      Subdivision("Sremski okrug", "07", "district"),
      Subdivision("Toplički okrug", "21", "district"),
      Subdivision("Vojvodina", "VO", "autonomous province"),
      Subdivision("Zaječarski okrug", "15", "district"),
      Subdivision("Zapadnobački okrug", "05", "district"),
      Subdivision("Zlatiborski okrug", "16", "district"),
      Subdivision("Šumadijski okrug", "12", "district")
    )
  }

  case object RU extends Country("Russian Federation (the)", "RU", "RUS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adygeja, Respublika", "AD", "republic"),
      Subdivision("Altaj, Respublika", "AL", "republic"),
      Subdivision("Altajskij kraj", "ALT", "administrative territory"),
      Subdivision("Amurskaja oblast'", "AMU", "administrative region"),
      Subdivision("Arhangel'skaja oblast'", "ARK", "administrative region"),
      Subdivision("Astrahanskaja oblast'", "AST", "administrative region"),
      Subdivision("Bashkortostan, Respublika", "BA", "republic"),
      Subdivision("Belgorodskaja oblast'", "BEL", "administrative region"),
      Subdivision("Brjanskaja oblast'", "BRY", "administrative region"),
      Subdivision("Burjatija, Respublika", "BU", "republic"),
      Subdivision("Chechenskaya Respublika", "CE", "republic"),
      Subdivision("Chelyabinskaya oblast'", "CHE", "administrative region"),
      Subdivision("Chukotskiy avtonomnyy okrug", "CHU", "autonomous district"),
      Subdivision("Chuvashskaya Respublika", "CU", "republic"),
      Subdivision("Dagestan, Respublika", "DA", "republic"),
      Subdivision("Evrejskaja avtonomnaja oblast'", "YEV", "autonomous region"),
      Subdivision("Habarovskij kraj", "KHA", "administrative territory"),
      Subdivision("Hakasija, Respublika", "KK", "republic"),
      Subdivision("Hanty-Mansijskij avtonomnyj okrug", "KHM", "autonomous district"),
      Subdivision("Ingushetiya, Respublika", "IN", "republic"),
      Subdivision("Irkutskaja oblast'", "IRK", "administrative region"),
      Subdivision("Ivanovskaja oblast'", "IVA", "administrative region"),
      Subdivision("Jamalo-Neneckij avtonomnyj okrug", "YAN", "autonomous district"),
      Subdivision("Jaroslavskaja oblast'", "YAR", "administrative region"),
      Subdivision("Kabardino-Balkarskaja Respublika", "KB", "republic"),
      Subdivision("Kaliningradskaja oblast'", "KGD", "administrative region"),
      Subdivision("Kalmykija, Respublika", "KL", "republic"),
      Subdivision("Kaluzhskaya oblast'", "KLU", "administrative region"),
      Subdivision("Kamchatskiy kray", "KAM", "administrative territory"),
      Subdivision("Karachayevo-Cherkesskaya Respublika", "KC", "republic"),
      Subdivision("Karelija, Respublika", "KR", "republic"),
      Subdivision("Kemerovskaja oblast'", "KEM", "administrative region"),
      Subdivision("Kirovskaja oblast'", "KIR", "administrative region"),
      Subdivision("Komi, Respublika", "KO", "republic"),
      Subdivision("Kostromskaja oblast'", "KOS", "administrative region"),
      Subdivision("Krasnodarskij kraj", "KDA", "administrative territory"),
      Subdivision("Krasnojarskij kraj", "KYA", "administrative territory"),
      Subdivision("Kurganskaja oblast'", "KGN", "administrative region"),
      Subdivision("Kurskaja oblast'", "KRS", "administrative region"),
      Subdivision("Leningradskaja oblast'", "LEN", "administrative region"),
      Subdivision("Lipeckaja oblast'", "LIP", "administrative region"),
      Subdivision("Magadanskaja oblast'", "MAG", "administrative region"),
      Subdivision("Marij Èl, Respublika", "ME", "republic"),
      Subdivision("Mordovija, Respublika", "MO", "republic"),
      Subdivision("Moskovskaja oblast'", "MOS", "administrative region"),
      Subdivision("Moskva", "MOW", "autonomous city"),
      Subdivision("Murmanskaja oblast'", "MUR", "administrative region"),
      Subdivision("Neneckij avtonomnyj okrug", "NEN", "autonomous district"),
      Subdivision("Nizhegorodskaya oblast'", "NIZ", "administrative region"),
      Subdivision("Novgorodskaja oblast'", "NGR", "administrative region"),
      Subdivision("Novosibirskaja oblast'", "NVS", "administrative region"),
      Subdivision("Omskaja oblast'", "OMS", "administrative region"),
      Subdivision("Orenburgskaja oblast'", "ORE", "administrative region"),
      Subdivision("Orlovskaja oblast'", "ORL", "administrative region"),
      Subdivision("Penzenskaja oblast'", "PNZ", "administrative region"),
      Subdivision("Permskij kraj", "PER", "administrative territory"),
      Subdivision("Primorskij kraj", "PRI", "administrative territory"),
      Subdivision("Pskovskaja oblast'", "PSK", "administrative region"),
      Subdivision("Rjazanskaja oblast'", "RYA", "administrative region"),
      Subdivision("Rostovskaja oblast'", "ROS", "administrative region"),
      Subdivision("Saha, Respublika", "SA", "republic"),
      Subdivision("Sahalinskaja oblast'", "SAK", "administrative region"),
      Subdivision("Samarskaja oblast'", "SAM", "administrative region"),
      Subdivision("Sankt-Peterburg", "SPE", "autonomous city"),
      Subdivision("Saratovskaja oblast'", "SAR", "administrative region"),
      Subdivision("Severnaja Osetija, Respublika", "SE", "republic"),
      Subdivision("Smolenskaja oblast'", "SMO", "administrative region"),
      Subdivision("Stavropol'skij kraj", "STA", "administrative territory"),
      Subdivision("Sverdlovskaja oblast'", "SVE", "administrative region"),
      Subdivision("Tambovskaja oblast'", "TAM", "administrative region"),
      Subdivision("Tatarstan, Respublika", "TA", "republic"),
      Subdivision("Tjumenskaja oblast'", "TYU", "administrative region"),
      Subdivision("Tomskaja oblast'", "TOM", "administrative region"),
      Subdivision("Tul'skaja oblast'", "TUL", "administrative region"),
      Subdivision("Tverskaja oblast'", "TVE", "administrative region"),
      Subdivision("Tyva, Respublika", "TY", "republic"),
      Subdivision("Udmurtskaja Respublika", "UD", "republic"),
      Subdivision("Ul'janovskaja oblast'", "ULY", "administrative region"),
      Subdivision("Vladimirskaja oblast'", "VLA", "administrative region"),
      Subdivision("Volgogradskaja oblast'", "VGG", "administrative region"),
      Subdivision("Vologodskaja oblast'", "VLG", "administrative region"),
      Subdivision("Voronezhskaya oblast'", "VOR", "administrative region"),
      Subdivision("Zabajkal'skij kraj", "ZAB", "administrative territory")
    )
  }

  case object RW extends Country("Rwanda", "RW", "RWA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amajyaruguru", "03", "province"),
      Subdivision("Amajyepfo", "05", "province"),
      Subdivision("City of Kigali", "01", "city"),
      Subdivision("Eastern", "02", "province"),
      Subdivision("Iburengerazuba", "04", "province")
    )
  }

  case object SA extends Country("Saudi Arabia", "SA", "SAU") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("'Asīr", "14", "region"),
      Subdivision("Al Bāḩah", "11", "region"),
      Subdivision("Al Jawf", "12", "region"),
      Subdivision("Al Madīnah al Munawwarah", "03", "region"),
      Subdivision("Al Qaşīm", "05", "region"),
      Subdivision("Al Ḩudūd ash Shamālīyah", "08", "region"),
      Subdivision("Ar Riyāḑ", "01", "region"),
      Subdivision("Ash Sharqīyah", "04", "region"),
      Subdivision("Jāzān", "09", "region"),
      Subdivision("Makkah al Mukarramah", "02", "region"),
      Subdivision("Najrān", "10", "region"),
      Subdivision("Tabūk", "07", "region"),
      Subdivision("Ḩā'il", "06", "region")
    )
  }

  case object SB extends Country("Solomon Islands", "SB", "SLB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Capital Territory", "CT", "capital territory"),
      Subdivision("Central", "CE", "province"),
      Subdivision("Choiseul", "CH", "province"),
      Subdivision("Guadalcanal", "GU", "province"),
      Subdivision("Isabel", "IS", "province"),
      Subdivision("Makira-Ulawa", "MK", "province"),
      Subdivision("Malaita", "ML", "province"),
      Subdivision("Rennell and Bellona", "RB", "province"),
      Subdivision("Temotu", "TE", "province"),
      Subdivision("Western", "WE", "province")
    )
  }

  case object SC extends Country("Seychelles", "SC", "SYC") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ans Bwalo", "02", "district"),
      Subdivision("Ans Etwal", "03", "district"),
      Subdivision("Ans Royal", "05", "district"),
      Subdivision("Ans o Pen", "01", "district"),
      Subdivision("Au Cap", "04", "district"),
      Subdivision("Baie Lazare", "06", "district"),
      Subdivision("Baie Sainte Anne", "07", "district"),
      Subdivision("Beau Vallon", "08", "district"),
      Subdivision("Bel Air", "09", "district"),
      Subdivision("Bel Ombre", "10", "district"),
      Subdivision("Cascade", "11", "district"),
      Subdivision("English River", "16", "district"),
      Subdivision("Glacis", "12", "district"),
      Subdivision("Grand Ans Mae", "13", "district"),
      Subdivision("Grand Ans Pralen", "14", "district"),
      Subdivision("Ile Perseverance I", "26", "district"),
      Subdivision("Ile Perseverance II", "27", "district"),
      Subdivision("La Digue", "15", "district"),
      Subdivision("Lemamel", "24", "district"),
      Subdivision("Mon Bikston", "17", "district"),
      Subdivision("Mon Fleri", "18", "district"),
      Subdivision("Plaisance", "19", "district"),
      Subdivision("Pointe La Rue", "20", "district"),
      Subdivision("Porglo", "21", "district"),
      Subdivision("Roche Caiman", "25", "district"),
      Subdivision("Saint Louis", "22", "district"),
      Subdivision("Takamaka", "23", "district")
    )
  }

  case object SD extends Country("Sudan (the)", "SD", "SDN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Baḩr al Aḩmar", "RS", "state"),
      Subdivision("Al Jazīrah", "GZ", "state"),
      Subdivision("Al Kharţūm", "KH", "state"),
      Subdivision("Al Qaḑārif", "GD", "state"),
      Subdivision("An Nīl al Abyaḑ", "NW", "state"),
      Subdivision("An Nīl al Azraq", "NB", "state"),
      Subdivision("Ash Shamālīyah", "NO", "state"),
      Subdivision("Central Darfur", "DC", "state"),
      Subdivision("East Darfur", "DE", "state"),
      Subdivision("Gharb Dārfūr", "DW", "state"),
      Subdivision("Gharb Kurdufān", "GK", "state"),
      Subdivision("Janūb Dārfūr", "DS", "state"),
      Subdivision("Janūb Kurdufān", "KS", "state"),
      Subdivision("Kassala", "KA", "state"),
      Subdivision("Nahr an Nīl", "NR", "state"),
      Subdivision("North Darfur", "DN", "state"),
      Subdivision("North Kordofan", "KN", "state"),
      Subdivision("Sennar", "SI", "state")
    )
  }

  case object SE extends Country("Sweden", "SE", "SWE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Blekinge län", "K", "county"),
      Subdivision("Dalarnas län", "W", "county"),
      Subdivision("Gotlands län", "I", "county"),
      Subdivision("Gävleborgs län", "X", "county"),
      Subdivision("Hallands län", "N", "county"),
      Subdivision("Jämtlands län", "Z", "county"),
      Subdivision("Jönköpings län", "F", "county"),
      Subdivision("Kalmar län", "H", "county"),
      Subdivision("Kronobergs län", "G", "county"),
      Subdivision("Norrbottens län", "BD", "county"),
      Subdivision("Skåne län", "M", "county"),
      Subdivision("Stockholms län", "AB", "county"),
      Subdivision("Södermanlands län", "D", "county"),
      Subdivision("Uppsala län", "C", "county"),
      Subdivision("Värmlands län", "S", "county"),
      Subdivision("Västerbottens län", "AC", "county"),
      Subdivision("Västernorrlands län", "Y", "county"),
      Subdivision("Västmanlands län", "U", "county"),
      Subdivision("Västra Götalands län", "O", "county"),
      Subdivision("Örebro län", "T", "county"),
      Subdivision("Östergötlands län", "E", "county")
    )
  }

  case object SG extends Country("Singapore", "SG", "SGP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central Singapore", "01", "district"),
      Subdivision("North East", "02", "district"),
      Subdivision("North West", "03", "district"),
      Subdivision("South East", "04", "district"),
      Subdivision("South West", "05", "district")
    )
  }

  case object SH extends Country("Saint Helena, Ascension and Tristan da Cunha", "SH", "SHN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ascension", "AC", "geographical entity"),
      Subdivision("Saint Helena", "HL", "geographical entity"),
      Subdivision("Tristan da Cunha", "TA", "geographical entity")
    )
  }

  case object SI extends Country("Slovenia", "SI", "SVN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ajdovščina", "001", "municipality"),
      Subdivision("Ankaran", "213", "municipality"),
      Subdivision("Apače", "195", "municipality"),
      Subdivision("Beltinci", "002", "municipality"),
      Subdivision("Benedikt", "148", "municipality"),
      Subdivision("Bistrica ob Sotli", "149", "municipality"),
      Subdivision("Bled", "003", "municipality"),
      Subdivision("Bloke", "150", "municipality"),
      Subdivision("Bohinj", "004", "municipality"),
      Subdivision("Borovnica", "005", "municipality"),
      Subdivision("Bovec", "006", "municipality"),
      Subdivision("Braslovče", "151", "municipality"),
      Subdivision("Brda", "007", "municipality"),
      Subdivision("Brezovica", "008", "municipality"),
      Subdivision("Brežice", "009", "municipality"),
      Subdivision("Cankova", "152", "municipality"),
      Subdivision("Celje", "011", "municipality"),
      Subdivision("Cerklje na Gorenjskem", "012", "municipality"),
      Subdivision("Cerknica", "013", "municipality"),
      Subdivision("Cerkno", "014", "municipality"),
      Subdivision("Cerkvenjak", "153", "municipality"),
      Subdivision("Cirkulane", "196", "municipality"),
      Subdivision("Destrnik", "018", "municipality"),
      Subdivision("Divača", "019", "municipality"),
      Subdivision("Dobje", "154", "municipality"),
      Subdivision("Dobrepolje", "020", "municipality"),
      Subdivision("Dobrna", "155", "municipality"),
      Subdivision("Dobrova-Polhov Gradec", "021", "municipality"),
      Subdivision("Dobrovnik", "156", "municipality"),
      Subdivision("Dol pri Ljubljani", "022", "municipality"),
      Subdivision("Dolenjske Toplice", "157", "municipality"),
      Subdivision("Domžale", "023", "municipality"),
      Subdivision("Dornava", "024", "municipality"),
      Subdivision("Dravograd", "025", "municipality"),
      Subdivision("Duplek", "026", "municipality"),
      Subdivision("Gorenja vas-Poljane", "027", "municipality"),
      Subdivision("Gorišnica", "028", "municipality"),
      Subdivision("Gorje", "207", "municipality"),
      Subdivision("Gornja Radgona", "029", "municipality"),
      Subdivision("Gornji Grad", "030", "municipality"),
      Subdivision("Gornji Petrovci", "031", "municipality"),
      Subdivision("Grad", "158", "municipality"),
      Subdivision("Grosuplje", "032", "municipality"),
      Subdivision("Hajdina", "159", "municipality"),
      Subdivision("Hodoš", "161", "municipality"),
      Subdivision("Horjul", "162", "municipality"),
      Subdivision("Hoče-Slivnica", "160", "municipality"),
      Subdivision("Hrastnik", "034", "municipality"),
      Subdivision("Hrpelje-Kozina", "035", "municipality"),
      Subdivision("Idrija", "036", "municipality"),
      Subdivision("Ig", "037", "municipality"),
      Subdivision("Ilirska Bistrica", "038", "municipality"),
      Subdivision("Ivančna Gorica", "039", "municipality"),
      Subdivision("Izola", "040", "municipality"),
      Subdivision("Jesenice", "041", "municipality"),
      Subdivision("Jezersko", "163", "municipality"),
      Subdivision("Juršinci", "042", "municipality"),
      Subdivision("Kamnik", "043", "municipality"),
      Subdivision("Kanal", "044", "municipality"),
      Subdivision("Kidričevo", "045", "municipality"),
      Subdivision("Kobarid", "046", "municipality"),
      Subdivision("Kobilje", "047", "municipality"),
      Subdivision("Komen", "049", "municipality"),
      Subdivision("Komenda", "164", "municipality"),
      Subdivision("Koper", "050", "municipality"),
      Subdivision("Kosanjevica na Krki", "197", "municipality"),
      Subdivision("Kostel", "165", "municipality"),
      Subdivision("Kozje", "051", "municipality"),
      Subdivision("Kočevje", "048", "municipality"),
      Subdivision("Kranj", "052", "municipality"),
      Subdivision("Kranjska Gora", "053", "municipality"),
      Subdivision("Križevci", "166", "municipality"),
      Subdivision("Krško", "054", "municipality"),
      Subdivision("Kungota", "055", "municipality"),
      Subdivision("Kuzma", "056", "municipality"),
      Subdivision("Laško", "057", "municipality"),
      Subdivision("Lenart", "058", "municipality"),
      Subdivision("Lendava", "059", "municipality"),
      Subdivision("Litija", "060", "municipality"),
      Subdivision("Ljubljana", "061", "municipality"),
      Subdivision("Ljubno", "062", "municipality"),
      Subdivision("Ljutomer", "063", "municipality"),
      Subdivision("Log-Dragomer", "208", "municipality"),
      Subdivision("Logatec", "064", "municipality"),
      Subdivision("Lovrenc na Pohorju", "167", "municipality"),
      Subdivision("Loška dolina", "065", "municipality"),
      Subdivision("Loški Potok", "066", "municipality"),
      Subdivision("Lukovica", "068", "municipality"),
      Subdivision("Luče", "067", "municipality"),
      Subdivision("Majšperk", "069", "municipality"),
      Subdivision("Makole", "198", "municipality"),
      Subdivision("Maribor", "070", "municipality"),
      Subdivision("Markovci", "168", "municipality"),
      Subdivision("Medvode", "071", "municipality"),
      Subdivision("Mengeš", "072", "municipality"),
      Subdivision("Metlika", "073", "municipality"),
      Subdivision("Mežica", "074", "municipality"),
      Subdivision("Miklavž na Dravskem polju", "169", "municipality"),
      Subdivision("Miren-Kostanjevica", "075", "municipality"),
      Subdivision("Mirna", "212", "municipality"),
      Subdivision("Mirna Peč", "170", "municipality"),
      Subdivision("Mislinja", "076", "municipality"),
      Subdivision("Mokronog-Trebelno", "199", "municipality"),
      Subdivision("Moravske Toplice", "078", "municipality"),
      Subdivision("Moravče", "077", "municipality"),
      Subdivision("Mozirje", "079", "municipality"),
      Subdivision("Murska Sobota", "080", "municipality"),
      Subdivision("Muta", "081", "municipality"),
      Subdivision("Naklo", "082", "municipality"),
      Subdivision("Nazarje", "083", "municipality"),
      Subdivision("Nova Gorica", "084", "municipality"),
      Subdivision("Novo Mesto", "085", "municipality"),
      Subdivision("Odranci", "086", "municipality"),
      Subdivision("Oplotnica", "171", "municipality"),
      Subdivision("Ormož", "087", "municipality"),
      Subdivision("Osilnica", "088", "municipality"),
      Subdivision("Pesnica", "089", "municipality"),
      Subdivision("Piran", "090", "municipality"),
      Subdivision("Pivka", "091", "municipality"),
      Subdivision("Podlehnik", "172", "municipality"),
      Subdivision("Podvelka", "093", "municipality"),
      Subdivision("Podčetrtek", "092", "municipality"),
      Subdivision("Poljčane", "200", "municipality"),
      Subdivision("Polzela", "173", "municipality"),
      Subdivision("Postojna", "094", "municipality"),
      Subdivision("Prebold", "174", "municipality"),
      Subdivision("Preddvor", "095", "municipality"),
      Subdivision("Prevalje", "175", "municipality"),
      Subdivision("Ptuj", "096", "municipality"),
      Subdivision("Puconci", "097", "municipality"),
      Subdivision("Radenci", "100", "municipality"),
      Subdivision("Radeče", "099", "municipality"),
      Subdivision("Radlje ob Dravi", "101", "municipality"),
      Subdivision("Radovljica", "102", "municipality"),
      Subdivision("Ravne na Koroškem", "103", "municipality"),
      Subdivision("Razkrižje", "176", "municipality"),
      Subdivision("Rače-Fram", "098", "municipality"),
      Subdivision("Renče-Vogrsko", "201", "municipality"),
      Subdivision("Rečica ob Savinji", "209", "municipality"),
      Subdivision("Ribnica", "104", "municipality"),
      Subdivision("Ribnica na Pohorju", "177", "municipality"),
      Subdivision("Rogatec", "107", "municipality"),
      Subdivision("Rogaška Slatina", "106", "municipality"),
      Subdivision("Rogašovci", "105", "municipality"),
      Subdivision("Ruše", "108", "municipality"),
      Subdivision("Selnica ob Dravi", "178", "municipality"),
      Subdivision("Semič", "109", "municipality"),
      Subdivision("Sevnica", "110", "municipality"),
      Subdivision("Sežana", "111", "municipality"),
      Subdivision("Slovenj Gradec", "112", "municipality"),
      Subdivision("Slovenska Bistrica", "113", "municipality"),
      Subdivision("Slovenske Konjice", "114", "municipality"),
      Subdivision("Sodražica", "179", "municipality"),
      Subdivision("Solčava", "180", "municipality"),
      Subdivision("Središče ob Dravi", "202", "municipality"),
      Subdivision("Starše", "115", "municipality"),
      Subdivision("Straža", "203", "municipality"),
      Subdivision("Sveta Ana", "181", "municipality"),
      Subdivision("Sveta Trojica v Slovenskih goricah", "204", "municipality"),
      Subdivision("Sveti Andraž v Slovenskih goricah", "182", "municipality"),
      Subdivision("Sveti Jurij ob Ščavnici", "116", "municipality"),
      Subdivision("Sveti Jurij v Slovenskih goricah", "210", "municipality"),
      Subdivision("Sveti Tomaž", "205", "municipality"),
      Subdivision("Tabor", "184", "municipality"),
      Subdivision("Tišina", "010", "municipality"),
      Subdivision("Tolmin", "128", "municipality"),
      Subdivision("Trbovlje", "129", "municipality"),
      Subdivision("Trebnje", "130", "municipality"),
      Subdivision("Trnovska Vas", "185", "municipality"),
      Subdivision("Trzin", "186", "municipality"),
      Subdivision("Tržič", "131", "municipality"),
      Subdivision("Turnišče", "132", "municipality"),
      Subdivision("Velenje", "133", "municipality"),
      Subdivision("Velika Polana", "187", "municipality"),
      Subdivision("Velike Lašče", "134", "municipality"),
      Subdivision("Veržej", "188", "municipality"),
      Subdivision("Videm", "135", "municipality"),
      Subdivision("Vipava", "136", "municipality"),
      Subdivision("Vitanje", "137", "municipality"),
      Subdivision("Vodice", "138", "municipality"),
      Subdivision("Vojnik", "139", "municipality"),
      Subdivision("Vransko", "189", "municipality"),
      Subdivision("Vrhnika", "140", "municipality"),
      Subdivision("Vuzenica", "141", "municipality"),
      Subdivision("Zagorje ob Savi", "142", "municipality"),
      Subdivision("Zavrč", "143", "municipality"),
      Subdivision("Zreče", "144", "municipality"),
      Subdivision("Črenšovci", "015", "municipality"),
      Subdivision("Črna na Koroškem", "016", "municipality"),
      Subdivision("Črnomelj", "017", "municipality"),
      Subdivision("Šalovci", "033", "municipality"),
      Subdivision("Šempeter-Vrtojba", "183", "municipality"),
      Subdivision("Šentilj", "118", "municipality"),
      Subdivision("Šentjernej", "119", "municipality"),
      Subdivision("Šentjur", "120", "municipality"),
      Subdivision("Šentrupert", "211", "municipality"),
      Subdivision("Šenčur", "117", "municipality"),
      Subdivision("Škocjan", "121", "municipality"),
      Subdivision("Škofja Loka", "122", "municipality"),
      Subdivision("Škofljica", "123", "municipality"),
      Subdivision("Šmarje pri Jelšah", "124", "municipality"),
      Subdivision("Šmarješke Toplice", "206", "municipality"),
      Subdivision("Šmartno ob Paki", "125", "municipality"),
      Subdivision("Šmartno pri Litiji", "194", "municipality"),
      Subdivision("Šoštanj", "126", "municipality"),
      Subdivision("Štore", "127", "municipality"),
      Subdivision("Žalec", "190", "municipality"),
      Subdivision("Železniki", "146", "municipality"),
      Subdivision("Žetale", "191", "municipality"),
      Subdivision("Žiri", "147", "municipality"),
      Subdivision("Žirovnica", "192", "municipality"),
      Subdivision("Žužemberk", "193", "municipality")
    )
  }

  case object SJ extends Country("Svalbard and Jan Mayen", "SJ", "SJM")

  case object SK extends Country("Slovakia", "SK", "SVK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Banskobystrický kraj", "BC", "region"),
      Subdivision("Bratislavský kraj", "BL", "region"),
      Subdivision("Košický kraj", "KI", "region"),
      Subdivision("Nitriansky kraj", "NI", "region"),
      Subdivision("Prešovský kraj", "PV", "region"),
      Subdivision("Trenčiansky kraj", "TC", "region"),
      Subdivision("Trnavský kraj", "TA", "region"),
      Subdivision("Žilinský kraj", "ZI", "region")
    )
  }

  case object SL extends Country("Sierra Leone", "SL", "SLE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Eastern", "E", "province"),
      Subdivision("North Western", "NW", "province"),
      Subdivision("Northern", "N", "province"),
      Subdivision("Southern", "S", "province"),
      Subdivision("Western Area", "W", "area")
    )
  }

  case object SM extends Country("San Marino", "SM", "SMR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Acquaviva", "01", "municipality"),
      Subdivision("Borgo Maggiore", "06", "municipality"),
      Subdivision("Chiesanuova", "02", "municipality"),
      Subdivision("Città di San Marino", "07", "municipality"),
      Subdivision("Domagnano", "03", "municipality"),
      Subdivision("Faetano", "04", "municipality"),
      Subdivision("Fiorentino", "05", "municipality"),
      Subdivision("Montegiardino", "08", "municipality"),
      Subdivision("Serravalle", "09", "municipality")
    )
  }

  case object SN extends Country("Senegal", "SN", "SEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dakar", "DK", "region"),
      Subdivision("Diourbel", "DB", "region"),
      Subdivision("Fatick", "FK", "region"),
      Subdivision("Kaffrine", "KA", "region"),
      Subdivision("Kaolack", "KL", "region"),
      Subdivision("Kolda", "KD", "region"),
      Subdivision("Kédougou", "KE", "region"),
      Subdivision("Louga", "LG", "region"),
      Subdivision("Matam", "MT", "region"),
      Subdivision("Saint-Louis", "SL", "region"),
      Subdivision("Sédhiou", "SE", "region"),
      Subdivision("Tambacounda", "TC", "region"),
      Subdivision("Thiès", "TH", "region"),
      Subdivision("Ziguinchor", "ZG", "region")
    )
  }

  case object SO extends Country("Somalia", "SO", "SOM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Awdal", "AW", "region"),
      Subdivision("Bakool", "BK", "region"),
      Subdivision("Banaadir", "BN", "region"),
      Subdivision("Bari", "BR", "region"),
      Subdivision("Bay", "BY", "region"),
      Subdivision("Galguduud", "GA", "region"),
      Subdivision("Gedo", "GE", "region"),
      Subdivision("Hiiraan", "HI", "region"),
      Subdivision("Jubbada Dhexe", "JD", "region"),
      Subdivision("Jubbada Hoose", "JH", "region"),
      Subdivision("Mudug", "MU", "region"),
      Subdivision("Nugaal", "NU", "region"),
      Subdivision("Sanaag", "SA", "region"),
      Subdivision("Shabeellaha Dhexe", "SD", "region"),
      Subdivision("Shabeellaha Hoose", "SH", "region"),
      Subdivision("Sool", "SO", "region"),
      Subdivision("Togdheer", "TO", "region"),
      Subdivision("Woqooyi Galbeed", "WO", "region")
    )
  }

  case object SR extends Country("Suriname", "SR", "SUR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Brokopondo", "BR", "district"),
      Subdivision("Commewijne", "CM", "district"),
      Subdivision("Coronie", "CR", "district"),
      Subdivision("Marowijne", "MA", "district"),
      Subdivision("Nickerie", "NI", "district"),
      Subdivision("Para", "PR", "district"),
      Subdivision("Paramaribo", "PM", "district"),
      Subdivision("Saramacca", "SA", "district"),
      Subdivision("Sipaliwini", "SI", "district"),
      Subdivision("Wanica", "WA", "district")
    )
  }

  case object SS extends Country("South Sudan", "SS", "SSD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central Equatoria", "EC", "state"),
      Subdivision("Eastern Equatoria", "EE", "state"),
      Subdivision("Jonglei", "JG", "state"),
      Subdivision("Lakes", "LK", "state"),
      Subdivision("Northern Bahr el Ghazal", "BN", "state"),
      Subdivision("Unity", "UY", "state"),
      Subdivision("Upper Nile", "NU", "state"),
      Subdivision("Warrap", "WR", "state"),
      Subdivision("Western Bahr el Ghazal", "BW", "state"),
      Subdivision("Western Equatoria", "EW", "state")
    )
  }

  case object ST extends Country("Sao Tome and Principe", "ST", "STP") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Cantagalo", "02", "district"),
      Subdivision("Caué", "03", "district"),
      Subdivision("Lembá", "04", "district"),
      Subdivision("Lobata", "05", "district"),
      Subdivision("Mé-Zóchi", "06", "district"),
      Subdivision("Príncipe", "P", "autonomous region"),
      Subdivision("Água Grande", "01", "district")
    )
  }

  case object SV extends Country("El Salvador", "SV", "SLV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahuachapán", "AH", "department"),
      Subdivision("Cabañas", "CA", "department"),
      Subdivision("Chalatenango", "CH", "department"),
      Subdivision("Cuscatlán", "CU", "department"),
      Subdivision("La Libertad", "LI", "department"),
      Subdivision("La Paz", "PA", "department"),
      Subdivision("La Unión", "UN", "department"),
      Subdivision("Morazán", "MO", "department"),
      Subdivision("San Miguel", "SM", "department"),
      Subdivision("San Salvador", "SS", "department"),
      Subdivision("San Vicente", "SV", "department"),
      Subdivision("Santa Ana", "SA", "department"),
      Subdivision("Sonsonate", "SO", "department"),
      Subdivision("Usulután", "US", "department")
    )
  }

  case object SX extends Country("Sint Maarten (Dutch part)", "SX", "SXM")

  case object SY extends Country("Syrian Arab Republic (the)", "SY", "SYR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Lādhiqīyah", "LA", "province"),
      Subdivision("Al Qunayţirah", "QU", "province"),
      Subdivision("Al Ḩasakah", "HA", "province"),
      Subdivision("Ar Raqqah", "RA", "province"),
      Subdivision("As Suwaydā'", "SU", "province"),
      Subdivision("Dar'ā", "DR", "province"),
      Subdivision("Dayr az Zawr", "DY", "province"),
      Subdivision("Dimashq", "DI", "province"),
      Subdivision("Idlib", "ID", "province"),
      Subdivision("Rīf Dimashq", "RD", "province"),
      Subdivision("Ţarţūs", "TA", "province"),
      Subdivision("Ḩalab", "HL", "province"),
      Subdivision("Ḩamāh", "HM", "province"),
      Subdivision("Ḩimş", "HI", "province")
    )
  }

  case object SZ extends Country("Eswatini", "SZ", "SWZ") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Hhohho", "HH", "region"),
      Subdivision("Lubombo", "LU", "region"),
      Subdivision("Manzini", "MA", "region"),
      Subdivision("Shiselweni", "SH", "region")
    )
  }

  case object TC extends Country("Turks and Caicos Islands (the)", "TC", "TCA")

  case object TD extends Country("Chad", "TD", "TCD") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Al Baţḩā’", "BA", "province"),
      Subdivision("Al Buḩayrah", "LC", "province"),
      Subdivision("Bahr el Ghazal", "BG", "province"),
      Subdivision("Borkou", "BO", "province"),
      Subdivision("Chari-Baguirmi", "CB", "province"),
      Subdivision("Ennedi-Est", "EE", "province"),
      Subdivision("Ennedi-Ouest", "EO", "province"),
      Subdivision("Guéra", "GR", "province"),
      Subdivision("Hadjer Lamis", "HL", "province"),
      Subdivision("Kanem", "KA", "province"),
      Subdivision("Logone-Occidental", "LO", "province"),
      Subdivision("Logone-Oriental", "LR", "province"),
      Subdivision("Madīnat Injamīnā", "ND", "province"),
      Subdivision("Mandoul", "MA", "province"),
      Subdivision("Mayo-Kebbi-Est", "ME", "province"),
      Subdivision("Mayo-Kebbi-Ouest", "MO", "province"),
      Subdivision("Moyen-Chari", "MC", "province"),
      Subdivision("Ouaddaï", "OD", "province"),
      Subdivision("Salamat", "SA", "province"),
      Subdivision("Sila", "SI", "province"),
      Subdivision("Tandjilé", "TA", "province"),
      Subdivision("Tibastī", "TI", "province"),
      Subdivision("Wadi Fira", "WF", "province")
    )
  }

  case object TF extends Country("French Southern Territories (the)", "TF", "ATF")

  case object TG extends Country("Togo", "TG", "TGO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Centrale", "C", "region"),
      Subdivision("Kara", "K", "region"),
      Subdivision("Maritime", "M", "region"),
      Subdivision("Plateaux", "P", "region"),
      Subdivision("Savanes", "S", "region")
    )
  }

  case object TH extends Country("Thailand", "TH", "THA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amnat Charoen", "37", "province"),
      Subdivision("Ang Thong", "15", "province"),
      Subdivision("Bueng Kan", "38", "province"),
      Subdivision("Buri Ram", "31", "province"),
      Subdivision("Chachoengsao", "24", "province"),
      Subdivision("Chai Nat", "18", "province"),
      Subdivision("Chaiyaphum", "36", "province"),
      Subdivision("Chanthaburi", "22", "province"),
      Subdivision("Chiang Mai", "50", "province"),
      Subdivision("Chiang Rai", "57", "province"),
      Subdivision("Chon Buri", "20", "province"),
      Subdivision("Chumphon", "86", "province"),
      Subdivision("Kalasin", "46", "province"),
      Subdivision("Kamphaeng Phet", "62", "province"),
      Subdivision("Kanchanaburi", "71", "province"),
      Subdivision("Khon Kaen", "40", "province"),
      Subdivision("Krabi", "81", "province"),
      Subdivision("Krung Thep Maha Nakhon", "10", "metropolitan administration"),
      Subdivision("Lampang", "52", "province"),
      Subdivision("Lamphun", "51", "province"),
      Subdivision("Loei", "42", "province"),
      Subdivision("Lop Buri", "16", "province"),
      Subdivision("Mae Hong Son", "58", "province"),
      Subdivision("Maha Sarakham", "44", "province"),
      Subdivision("Mukdahan", "49", "province"),
      Subdivision("Nakhon Nayok", "26", "province"),
      Subdivision("Nakhon Pathom", "73", "province"),
      Subdivision("Nakhon Phanom", "48", "province"),
      Subdivision("Nakhon Ratchasima", "30", "province"),
      Subdivision("Nakhon Sawan", "60", "province"),
      Subdivision("Nakhon Si Thammarat", "80", "province"),
      Subdivision("Nan", "55", "province"),
      Subdivision("Narathiwat", "96", "province"),
      Subdivision("Nong Bua Lam Phu", "39", "province"),
      Subdivision("Nong Khai", "43", "province"),
      Subdivision("Nonthaburi", "12", "province"),
      Subdivision("Pathum Thani", "13", "province"),
      Subdivision("Pattani", "94", "province"),
      Subdivision("Phangnga", "82", "province"),
      Subdivision("Phatthalung", "93", "province"),
      Subdivision("Phatthaya", "S", "special administrative city"),
      Subdivision("Phayao", "56", "province"),
      Subdivision("Phetchabun", "67", "province"),
      Subdivision("Phetchaburi", "76", "province"),
      Subdivision("Phichit", "66", "province"),
      Subdivision("Phitsanulok", "65", "province"),
      Subdivision("Phra Nakhon Si Ayutthaya", "14", "province"),
      Subdivision("Phrae", "54", "province"),
      Subdivision("Phuket", "83", "province"),
      Subdivision("Prachin Buri", "25", "province"),
      Subdivision("Prachuap Khiri Khan", "77", "province"),
      Subdivision("Ranong", "85", "province"),
      Subdivision("Ratchaburi", "70", "province"),
      Subdivision("Rayong", "21", "province"),
      Subdivision("Roi Et", "45", "province"),
      Subdivision("Sa Kaeo", "27", "province"),
      Subdivision("Sakon Nakhon", "47", "province"),
      Subdivision("Samut Prakan", "11", "province"),
      Subdivision("Samut Sakhon", "74", "province"),
      Subdivision("Samut Songkhram", "75", "province"),
      Subdivision("Saraburi", "19", "province"),
      Subdivision("Satun", "91", "province"),
      Subdivision("Si Sa Ket", "33", "province"),
      Subdivision("Sing Buri", "17", "province"),
      Subdivision("Songkhla", "90", "province"),
      Subdivision("Sukhothai", "64", "province"),
      Subdivision("Suphan Buri", "72", "province"),
      Subdivision("Surat Thani", "84", "province"),
      Subdivision("Surin", "32", "province"),
      Subdivision("Tak", "63", "province"),
      Subdivision("Trang", "92", "province"),
      Subdivision("Trat", "23", "province"),
      Subdivision("Ubon Ratchathani", "34", "province"),
      Subdivision("Udon Thani", "41", "province"),
      Subdivision("Uthai Thani", "61", "province"),
      Subdivision("Uttaradit", "53", "province"),
      Subdivision("Yala", "95", "province"),
      Subdivision("Yasothon", "35", "province")
    )
  }

  case object TJ extends Country("Tajikistan", "TJ", "TJK") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Dushanbe", "DU", "capital territory"),
      Subdivision("Khatlon", "KT", "region"),
      Subdivision("Kŭhistoni Badakhshon", "GB", "autonomous region"),
      Subdivision("Sughd", "SU", "region"),
      Subdivision("nohiyahoi tobei jumhurí", "RA", "districts under republic administration")
    )
  }

  case object TK extends Country("Tokelau", "TK", "TKL")

  case object TL extends Country("Timor-Leste", "TL", "TLS") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Aileu", "AL", "municipality"),
      Subdivision("Ainaro", "AN", "municipality"),
      Subdivision("Baucau", "BA", "municipality"),
      Subdivision("Bobonaro", "BO", "municipality"),
      Subdivision("Cova Lima", "CO", "municipality"),
      Subdivision("Díli", "DI", "municipality"),
      Subdivision("Ermera", "ER", "municipality"),
      Subdivision("Lautein", "LA", "municipality"),
      Subdivision("Likisá", "LI", "municipality"),
      Subdivision("Manatuto", "MT", "municipality"),
      Subdivision("Manufahi", "MF", "municipality"),
      Subdivision("Oekusi-Ambenu", "OE", "special administrative region"),
      Subdivision("Vikeke", "VI", "municipality")
    )
  }

  case object TM extends Country("Turkmenistan", "TM", "TKM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ahal", "A", "region"),
      Subdivision("Aşgabat", "S", "city"),
      Subdivision("Balkan", "B", "region"),
      Subdivision("Daşoguz", "D", "region"),
      Subdivision("Lebap", "L", "region"),
      Subdivision("Mary", "M", "region")
    )
  }

  case object TN extends Country("Tunisia", "TN", "TUN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Ben Arous", "13", "governorate"),
      Subdivision("Bizerte", "23", "governorate"),
      Subdivision("Béja", "31", "governorate"),
      Subdivision("Gabès", "81", "governorate"),
      Subdivision("Gafsa", "71", "governorate"),
      Subdivision("Jendouba", "32", "governorate"),
      Subdivision("Kairouan", "41", "governorate"),
      Subdivision("Kasserine", "42", "governorate"),
      Subdivision("Kébili", "73", "governorate"),
      Subdivision("L'Ariana", "12", "governorate"),
      Subdivision("La Manouba", "14", "governorate"),
      Subdivision("Le Kef", "33", "governorate"),
      Subdivision("Mahdia", "53", "governorate"),
      Subdivision("Monastir", "52", "governorate"),
      Subdivision("Médenine", "82", "governorate"),
      Subdivision("Nabeul", "21", "governorate"),
      Subdivision("Sfax", "61", "governorate"),
      Subdivision("Sidi Bouzid", "43", "governorate"),
      Subdivision("Siliana", "34", "governorate"),
      Subdivision("Sousse", "51", "governorate"),
      Subdivision("Tataouine", "83", "governorate"),
      Subdivision("Tozeur", "72", "governorate"),
      Subdivision("Tunis", "11", "governorate"),
      Subdivision("Zaghouan", "22", "governorate")
    )
  }

  case object TO extends Country("Tonga", "TO", "TON") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("'Eua", "01", "division"),
      Subdivision("Ha'apai", "02", "division"),
      Subdivision("Niuas", "03", "division"),
      Subdivision("Tongatapu", "04", "division"),
      Subdivision("Vava'u", "05", "division")
    )
  }

  case object TR extends Country("Türkiye", "TR", "TUR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Adana", "01", "province"),
      Subdivision("Adıyaman", "02", "province"),
      Subdivision("Afyonkarahisar", "03", "province"),
      Subdivision("Aksaray", "68", "province"),
      Subdivision("Amasya", "05", "province"),
      Subdivision("Ankara", "06", "province"),
      Subdivision("Antalya", "07", "province"),
      Subdivision("Ardahan", "75", "province"),
      Subdivision("Artvin", "08", "province"),
      Subdivision("Aydın", "09", "province"),
      Subdivision("Ağrı", "04", "province"),
      Subdivision("Balıkesir", "10", "province"),
      Subdivision("Bartın", "74", "province"),
      Subdivision("Batman", "72", "province"),
      Subdivision("Bayburt", "69", "province"),
      Subdivision("Bilecik", "11", "province"),
      Subdivision("Bingöl", "12", "province"),
      Subdivision("Bitlis", "13", "province"),
      Subdivision("Bolu", "14", "province"),
      Subdivision("Burdur", "15", "province"),
      Subdivision("Bursa", "16", "province"),
      Subdivision("Denizli", "20", "province"),
      Subdivision("Diyarbakır", "21", "province"),
      Subdivision("Düzce", "81", "province"),
      Subdivision("Edirne", "22", "province"),
      Subdivision("Elazığ", "23", "province"),
      Subdivision("Erzincan", "24", "province"),
      Subdivision("Erzurum", "25", "province"),
      Subdivision("Eskişehir", "26", "province"),
      Subdivision("Gaziantep", "27", "province"),
      Subdivision("Giresun", "28", "province"),
      Subdivision("Gümüşhane", "29", "province"),
      Subdivision("Hakkâri", "30", "province"),
      Subdivision("Hatay", "31", "province"),
      Subdivision("Isparta", "32", "province"),
      Subdivision("Iğdır", "76", "province"),
      Subdivision("Kahramanmaraş", "46", "province"),
      Subdivision("Karabük", "78", "province"),
      Subdivision("Karaman", "70", "province"),
      Subdivision("Kars", "36", "province"),
      Subdivision("Kastamonu", "37", "province"),
      Subdivision("Kayseri", "38", "province"),
      Subdivision("Kilis", "79", "province"),
      Subdivision("Kocaeli", "41", "province"),
      Subdivision("Konya", "42", "province"),
      Subdivision("Kütahya", "43", "province"),
      Subdivision("Kırklareli", "39", "province"),
      Subdivision("Kırıkkale", "71", "province"),
      Subdivision("Kırşehir", "40", "province"),
      Subdivision("Malatya", "44", "province"),
      Subdivision("Manisa", "45", "province"),
      Subdivision("Mardin", "47", "province"),
      Subdivision("Mersin", "33", "province"),
      Subdivision("Muğla", "48", "province"),
      Subdivision("Muş", "49", "province"),
      Subdivision("Nevşehir", "50", "province"),
      Subdivision("Niğde", "51", "province"),
      Subdivision("Ordu", "52", "province"),
      Subdivision("Osmaniye", "80", "province"),
      Subdivision("Rize", "53", "province"),
      Subdivision("Sakarya", "54", "province"),
      Subdivision("Samsun", "55", "province"),
      Subdivision("Siirt", "56", "province"),
      Subdivision("Sinop", "57", "province"),
      Subdivision("Sivas", "58", "province"),
      Subdivision("Tekirdağ", "59", "province"),
      Subdivision("Tokat", "60", "province"),
      Subdivision("Trabzon", "61", "province"),
      Subdivision("Tunceli", "62", "province"),
      Subdivision("Uşak", "64", "province"),
      Subdivision("Van", "65", "province"),
      Subdivision("Yalova", "77", "province"),
      Subdivision("Yozgat", "66", "province"),
      Subdivision("Zonguldak", "67", "province"),
      Subdivision("Çanakkale", "17", "province"),
      Subdivision("Çankırı", "18", "province"),
      Subdivision("Çorum", "19", "province"),
      Subdivision("İstanbul", "34", "province"),
      Subdivision("İzmir", "35", "province"),
      Subdivision("Şanlıurfa", "63", "province"),
      Subdivision("Şırnak", "73", "province")
    )
  }

  case object TT extends Country("Trinidad and Tobago", "TT", "TTO") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arima", "ARI", "borough"),
      Subdivision("Chaguanas", "CHA", "borough"),
      Subdivision("Couva-Tabaquite-Talparo", "CTT", "region"),
      Subdivision("Diego Martin", "DMN", "region"),
      Subdivision("Mayaro-Rio Claro", "MRC", "region"),
      Subdivision("Penal-Debe", "PED", "region"),
      Subdivision("Point Fortin", "PTF", "borough"),
      Subdivision("Port of Spain", "POS", "city"),
      Subdivision("Princes Town", "PRT", "region"),
      Subdivision("San Fernando", "SFO", "city"),
      Subdivision("San Juan-Laventille", "SJL", "region"),
      Subdivision("Sangre Grande", "SGE", "region"),
      Subdivision("Siparia", "SIP", "region"),
      Subdivision("Tobago", "TOB", "ward"),
      Subdivision("Tunapuna-Piarco", "TUP", "region")
    )
  }

  case object TV extends Country("Tuvalu", "TV", "TUV") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Funafuti", "FUN", "town council"),
      Subdivision("Nanumaga", "NMG", "island council"),
      Subdivision("Nanumea", "NMA", "island council"),
      Subdivision("Niutao", "NIT", "island council"),
      Subdivision("Nui", "NUI", "island council"),
      Subdivision("Nukufetau", "NKF", "island council"),
      Subdivision("Nukulaelae", "NKL", "island council"),
      Subdivision("Vaitupu", "VAI", "island council")
    )
  }

  case object TW extends Country("Taiwan (Province of China)", "TW", "TWN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Changhua", "CHA", "county"),
      Subdivision("Chiayi", "CYI", "city"),
      Subdivision("Chiayi", "CYQ", "county"),
      Subdivision("Hsinchu", "HSZ", "city"),
      Subdivision("Hsinchu", "HSQ", "county"),
      Subdivision("Hualien", "HUA", "county"),
      Subdivision("Kaohsiung", "KHH", "special municipality"),
      Subdivision("Keelung", "KEE", "city"),
      Subdivision("Kinmen", "KIN", "county"),
      Subdivision("Lienchiang", "LIE", "county"),
      Subdivision("Miaoli", "MIA", "county"),
      Subdivision("Nantou", "NAN", "county"),
      Subdivision("New Taipei", "NWT", "special municipality"),
      Subdivision("Penghu", "PEN", "county"),
      Subdivision("Pingtung", "PIF", "county"),
      Subdivision("Taichung", "TXG", "special municipality"),
      Subdivision("Tainan", "TNN", "special municipality"),
      Subdivision("Taipei", "TPE", "special municipality"),
      Subdivision("Taitung", "TTT", "county"),
      Subdivision("Taoyuan", "TAO", "special municipality"),
      Subdivision("Yilan", "ILA", "county"),
      Subdivision("Yunlin", "YUN", "county")
    )
  }

  case object TZ extends Country("Tanzania, the United Republic of", "TZ", "TZA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Arusha", "01", "region"),
      Subdivision("Coast", "19", "region"),
      Subdivision("Dar es Salaam", "02", "region"),
      Subdivision("Dodoma", "03", "region"),
      Subdivision("Geita", "27", "region"),
      Subdivision("Iringa", "04", "region"),
      Subdivision("Kagera", "05", "region"),
      Subdivision("Kaskazini Pemba", "06", "region"),
      Subdivision("Kaskazini Unguja", "07", "region"),
      Subdivision("Katavi", "28", "region"),
      Subdivision("Kigoma", "08", "region"),
      Subdivision("Kilimanjaro", "09", "region"),
      Subdivision("Kusini Pemba", "10", "region"),
      Subdivision("Kusini Unguja", "11", "region"),
      Subdivision("Lindi", "12", "region"),
      Subdivision("Manyara", "26", "region"),
      Subdivision("Mara", "13", "region"),
      Subdivision("Mbeya", "14", "region"),
      Subdivision("Mjini Magharibi", "15", "region"),
      Subdivision("Morogoro", "16", "region"),
      Subdivision("Mtwara", "17", "region"),
      Subdivision("Mwanza", "18", "region"),
      Subdivision("Njombe", "29", "region"),
      Subdivision("Rukwa", "20", "region"),
      Subdivision("Ruvuma", "21", "region"),
      Subdivision("Shinyanga", "22", "region"),
      Subdivision("Simiyu", "30", "region"),
      Subdivision("Singida", "23", "region"),
      Subdivision("Songwe", "31", "region"),
      Subdivision("Tabora", "24", "region"),
      Subdivision("Tanga", "25", "region")
    )
  }

  case object UA extends Country("Ukraine", "UA", "UKR") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Avtonomna Respublika Krym", "43", "republic"),
      Subdivision("Cherkaska oblast", "71", "region"),
      Subdivision("Chernihivska oblast", "74", "region"),
      Subdivision("Chernivetska oblast", "77", "region"),
      Subdivision("Dnipropetrovska oblast", "12", "region"),
      Subdivision("Donetska oblast", "14", "region"),
      Subdivision("Ivano-Frankivska oblast", "26", "region"),
      Subdivision("Kharkivska oblast", "63", "region"),
      Subdivision("Khersonska oblast", "65", "region"),
      Subdivision("Khmelnytska oblast", "68", "region"),
      Subdivision("Kirovohradska oblast", "35", "region"),
      Subdivision("Kyiv", "30", "city"),
      Subdivision("Kyivska oblast", "32", "region"),
      Subdivision("Luhanska oblast", "09", "region"),
      Subdivision("Lvivska oblast", "46", "region"),
      Subdivision("Mykolaivska oblast", "48", "region"),
      Subdivision("Odeska oblast", "51", "region"),
      Subdivision("Poltavska oblast", "53", "region"),
      Subdivision("Rivnenska oblast", "56", "region"),
      Subdivision("Sevastopol", "40", "city"),
      Subdivision("Sumska oblast", "59", "region"),
      Subdivision("Ternopilska oblast", "61", "region"),
      Subdivision("Vinnytska oblast", "05", "region"),
      Subdivision("Volynska oblast", "07", "region"),
      Subdivision("Zakarpatska oblast", "21", "region"),
      Subdivision("Zaporizka oblast", "23", "region"),
      Subdivision("Zhytomyrska oblast", "18", "region")
    )
  }

  case object UG extends Country("Uganda", "UG", "UGA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abim", "314", "district"),
      Subdivision("Adjumani", "301", "district"),
      Subdivision("Agago", "322", "district"),
      Subdivision("Alebtong", "323", "district"),
      Subdivision("Amolatar", "315", "district"),
      Subdivision("Amudat", "324", "district"),
      Subdivision("Amuria", "216", "district"),
      Subdivision("Amuru", "316", "district"),
      Subdivision("Apac", "302", "district"),
      Subdivision("Arua", "303", "district"),
      Subdivision("Budaka", "217", "district"),
      Subdivision("Bududa", "218", "district"),
      Subdivision("Bugiri", "201", "district"),
      Subdivision("Bugweri", "235", "district"),
      Subdivision("Buhweju", "420", "district"),
      Subdivision("Buikwe", "117", "district"),
      Subdivision("Bukedea", "219", "district"),
      Subdivision("Bukomansibi", "118", "district"),
      Subdivision("Bukwo", "220", "district"),
      Subdivision("Bulambuli", "225", "district"),
      Subdivision("Buliisa", "416", "district"),
      Subdivision("Bundibugyo", "401", "district"),
      Subdivision("Bunyangabu", "430", "district"),
      Subdivision("Bushenyi", "402", "district"),
      Subdivision("Busia", "202", "district"),
      Subdivision("Butaleja", "221", "district"),
      Subdivision("Butambala", "119", "district"),
      Subdivision("Butebo", "233", "district"),
      Subdivision("Buvuma", "120", "district"),
      Subdivision("Buyende", "226", "district"),
      Subdivision("Central", "C", "geographical region"),
      Subdivision("Dokolo", "317", "district"),
      Subdivision("Eastern", "E", "geographical region"),
      Subdivision("Gomba", "121", "district"),
      Subdivision("Gulu", "304", "district"),
      Subdivision("Hoima", "403", "district"),
      Subdivision("Ibanda", "417", "district"),
      Subdivision("Iganga", "203", "district"),
      Subdivision("Isingiro", "418", "district"),
      Subdivision("Jinja", "204", "district"),
      Subdivision("Kaabong", "318", "district"),
      Subdivision("Kabale", "404", "district"),
      Subdivision("Kabarole", "405", "district"),
      Subdivision("Kaberamaido", "213", "district"),
      Subdivision("Kagadi", "427", "district"),
      Subdivision("Kakumiro", "428", "district"),
      Subdivision("Kalaki", "237", "district"),
      Subdivision("Kalangala", "101", "district"),
      Subdivision("Kaliro", "222", "district"),
      Subdivision("Kalungu", "122", "district"),
      Subdivision("Kampala", "102", "city"),
      Subdivision("Kamuli", "205", "district"),
      Subdivision("Kamwenge", "413", "district"),
      Subdivision("Kanungu", "414", "district"),
      Subdivision("Kapchorwa", "206", "district"),
      Subdivision("Kapelebyong", "236", "district"),
      Subdivision("Karenga", "335", "district"),
      Subdivision("Kasanda", "126", "district"),
      Subdivision("Kasese", "406", "district"),
      Subdivision("Katakwi", "207", "district"),
      Subdivision("Kayunga", "112", "district"),
      Subdivision("Kazo", "433", "district"),
      Subdivision("Kibaale", "407", "district"),
      Subdivision("Kiboga", "103", "district"),
      Subdivision("Kibuku", "227", "district"),
      Subdivision("Kikuube", "432", "district"),
      Subdivision("Kiruhura", "419", "district"),
      Subdivision("Kiryandongo", "421", "district"),
      Subdivision("Kisoro", "408", "district"),
      Subdivision("Kitagwenda", "434", "district"),
      Subdivision("Kitgum", "305", "district"),
      Subdivision("Koboko", "319", "district"),
      Subdivision("Kole", "325", "district"),
      Subdivision("Kotido", "306", "district"),
      Subdivision("Kumi", "208", "district"),
      Subdivision("Kwania", "333", "district"),
      Subdivision("Kween", "228", "district"),
      Subdivision("Kyankwanzi", "123", "district"),
      Subdivision("Kyegegwa", "422", "district"),
      Subdivision("Kyenjojo", "415", "district"),
      Subdivision("Kyotera", "125", "district"),
      Subdivision("Lamwo", "326", "district"),
      Subdivision("Lira", "307", "district"),
      Subdivision("Luuka", "229", "district"),
      Subdivision("Luwero", "104", "district"),
      Subdivision("Lwengo", "124", "district"),
      Subdivision("Lyantonde", "114", "district"),
      Subdivision("Madi-Okollo", "336", "district"),
      Subdivision("Manafwa", "223", "district"),
      Subdivision("Maracha", "320", "district"),
      Subdivision("Masaka", "105", "district"),
      Subdivision("Masindi", "409", "district"),
      Subdivision("Mayuge", "214", "district"),
      Subdivision("Mbale", "209", "district"),
      Subdivision("Mbarara", "410", "district"),
      Subdivision("Mitooma", "423", "district"),
      Subdivision("Mityana", "115", "district"),
      Subdivision("Moroto", "308", "district"),
      Subdivision("Moyo", "309", "district"),
      Subdivision("Mpigi", "106", "district"),
      Subdivision("Mubende", "107", "district"),
      Subdivision("Mukono", "108", "district"),
      Subdivision("Nabilatuk", "334", "district"),
      Subdivision("Nakapiripirit", "311", "district"),
      Subdivision("Nakaseke", "116", "district"),
      Subdivision("Nakasongola", "109", "district"),
      Subdivision("Namayingo", "230", "district"),
      Subdivision("Namisindwa", "234", "district"),
      Subdivision("Namutumba", "224", "district"),
      Subdivision("Napak", "327", "district"),
      Subdivision("Nebbi", "310", "district"),
      Subdivision("Ngora", "231", "district"),
      Subdivision("Northern", "N", "geographical region"),
      Subdivision("Ntoroko", "424", "district"),
      Subdivision("Ntungamo", "411", "district"),
      Subdivision("Nwoya", "328", "district"),
      Subdivision("Obongi", "337", "district"),
      Subdivision("Omoro", "331", "district"),
      Subdivision("Otuke", "329", "district"),
      Subdivision("Oyam", "321", "district"),
      Subdivision("Pader", "312", "district"),
      Subdivision("Pakwach", "332", "district"),
      Subdivision("Pallisa", "210", "district"),
      Subdivision("Rakai", "110", "district"),
      Subdivision("Rubanda", "429", "district"),
      Subdivision("Rubirizi", "425", "district"),
      Subdivision("Rukiga", "431", "district"),
      Subdivision("Rukungiri", "412", "district"),
      Subdivision("Rwampara", "435", "district"),
      Subdivision("Sembabule", "111", "district"),
      Subdivision("Serere", "232", "district"),
      Subdivision("Sheema", "426", "district"),
      Subdivision("Sironko", "215", "district"),
      Subdivision("Soroti", "211", "district"),
      Subdivision("Tororo", "212", "district"),
      Subdivision("Wakiso", "113", "district"),
      Subdivision("Western", "W", "geographical region"),
      Subdivision("Yumbe", "313", "district"),
      Subdivision("Zombo", "330", "district")
    )
  }

  case object UM extends Country("United States Minor Outlying Islands (the)", "UM", "UMI") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Baker Island", "81", "islands, groups of islands"),
      Subdivision("Howland Island", "84", "islands, groups of islands"),
      Subdivision("Jarvis Island", "86", "islands, groups of islands"),
      Subdivision("Johnston Atoll", "67", "islands, groups of islands"),
      Subdivision("Kingman Reef", "89", "islands, groups of islands"),
      Subdivision("Midway Islands", "71", "islands, groups of islands"),
      Subdivision("Navassa Island", "76", "islands, groups of islands"),
      Subdivision("Palmyra Atoll", "95", "islands, groups of islands"),
      Subdivision("Wake Island", "79", "islands, groups of islands")
    )
  }

  case object US extends Country("United States of America (the)", "US", "USA") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alabama", "AL", "state"),
      Subdivision("Alaska", "AK", "state"),
      Subdivision("American Samoa", "AS", "outlying area"),
      Subdivision("Arizona", "AZ", "state"),
      Subdivision("Arkansas", "AR", "state"),
      Subdivision("California", "CA", "state"),
      Subdivision("Colorado", "CO", "state"),
      Subdivision("Connecticut", "CT", "state"),
      Subdivision("Delaware", "DE", "state"),
      Subdivision("District of Columbia", "DC", "district"),
      Subdivision("Florida", "FL", "state"),
      Subdivision("Georgia", "GA", "state"),
      Subdivision("Guam", "GU", "outlying area"),
      Subdivision("Hawaii", "HI", "state"),
      Subdivision("Idaho", "ID", "state"),
      Subdivision("Illinois", "IL", "state"),
      Subdivision("Indiana", "IN", "state"),
      Subdivision("Iowa", "IA", "state"),
      Subdivision("Kansas", "KS", "state"),
      Subdivision("Kentucky", "KY", "state"),
      Subdivision("Louisiana", "LA", "state"),
      Subdivision("Maine", "ME", "state"),
      Subdivision("Maryland", "MD", "state"),
      Subdivision("Massachusetts", "MA", "state"),
      Subdivision("Michigan", "MI", "state"),
      Subdivision("Minnesota", "MN", "state"),
      Subdivision("Mississippi", "MS", "state"),
      Subdivision("Missouri", "MO", "state"),
      Subdivision("Montana", "MT", "state"),
      Subdivision("Nebraska", "NE", "state"),
      Subdivision("Nevada", "NV", "state"),
      Subdivision("New Hampshire", "NH", "state"),
      Subdivision("New Jersey", "NJ", "state"),
      Subdivision("New Mexico", "NM", "state"),
      Subdivision("New York", "NY", "state"),
      Subdivision("North Carolina", "NC", "state"),
      Subdivision("North Dakota", "ND", "state"),
      Subdivision("Northern Mariana Islands", "MP", "outlying area"),
      Subdivision("Ohio", "OH", "state"),
      Subdivision("Oklahoma", "OK", "state"),
      Subdivision("Oregon", "OR", "state"),
      Subdivision("Pennsylvania", "PA", "state"),
      Subdivision("Puerto Rico", "PR", "outlying area"),
      Subdivision("Rhode Island", "RI", "state"),
      Subdivision("South Carolina", "SC", "state"),
      Subdivision("South Dakota", "SD", "state"),
      Subdivision("Tennessee", "TN", "state"),
      Subdivision("Texas", "TX", "state"),
      Subdivision("United States Minor Outlying Islands", "UM", "outlying area"),
      Subdivision("Utah", "UT", "state"),
      Subdivision("Vermont", "VT", "state"),
      Subdivision("Virgin Islands, U.S.", "VI", "outlying area"),
      Subdivision("Virginia", "VA", "state"),
      Subdivision("Washington", "WA", "state"),
      Subdivision("West Virginia", "WV", "state"),
      Subdivision("Wisconsin", "WI", "state"),
      Subdivision("Wyoming", "WY", "state")
    )
  }

  case object UY extends Country("Uruguay", "UY", "URY") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Artigas", "AR", "department"),
      Subdivision("Canelones", "CA", "department"),
      Subdivision("Cerro Largo", "CL", "department"),
      Subdivision("Colonia", "CO", "department"),
      Subdivision("Durazno", "DU", "department"),
      Subdivision("Flores", "FS", "department"),
      Subdivision("Florida", "FD", "department"),
      Subdivision("Lavalleja", "LA", "department"),
      Subdivision("Maldonado", "MA", "department"),
      Subdivision("Montevideo", "MO", "department"),
      Subdivision("Paysandú", "PA", "department"),
      Subdivision("Rivera", "RV", "department"),
      Subdivision("Rocha", "RO", "department"),
      Subdivision("Río Negro", "RN", "department"),
      Subdivision("Salto", "SA", "department"),
      Subdivision("San José", "SJ", "department"),
      Subdivision("Soriano", "SO", "department"),
      Subdivision("Tacuarembó", "TA", "department"),
      Subdivision("Treinta y Tres", "TT", "department")
    )
  }

  case object UZ extends Country("Uzbekistan", "UZ", "UZB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Andijon", "AN", "region"),
      Subdivision("Buxoro", "BU", "region"),
      Subdivision("Farg‘ona", "FA", "region"),
      Subdivision("Jizzax", "JI", "region"),
      Subdivision("Namangan", "NG", "region"),
      Subdivision("Navoiy", "NW", "region"),
      Subdivision("Qashqadaryo", "QA", "region"),
      Subdivision("Qoraqalpog‘iston Respublikasi", "QR", "republic"),
      Subdivision("Samarqand", "SA", "region"),
      Subdivision("Sirdaryo", "SI", "region"),
      Subdivision("Surxondaryo", "SU", "region"),
      Subdivision("Toshkent", "TO", "region"),
      Subdivision("Toshkent", "TK", "city"),
      Subdivision("Xorazm", "XO", "region")
    )
  }

  case object VA extends Country("Holy See (the)", "VA", "VAT")

  case object VC extends Country("Saint Vincent and the Grenadines", "VC", "VCT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Charlotte", "01", "parish"),
      Subdivision("Grenadines", "06", "parish"),
      Subdivision("Saint Andrew", "02", "parish"),
      Subdivision("Saint David", "03", "parish"),
      Subdivision("Saint George", "04", "parish"),
      Subdivision("Saint Patrick", "05", "parish")
    )
  }

  case object VE extends Country("Venezuela (Bolivarian Republic of)", "VE", "VEN") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Amazonas", "Z", "state"),
      Subdivision("Anzoátegui", "B", "state"),
      Subdivision("Apure", "C", "state"),
      Subdivision("Aragua", "D", "state"),
      Subdivision("Barinas", "E", "state"),
      Subdivision("Bolívar", "F", "state"),
      Subdivision("Carabobo", "G", "state"),
      Subdivision("Cojedes", "H", "state"),
      Subdivision("Delta Amacuro", "Y", "state"),
      Subdivision("Dependencias Federales", "W", "federal dependency"),
      Subdivision("Distrito Capital", "A", "capital district"),
      Subdivision("Falcón", "I", "state"),
      Subdivision("Guárico", "J", "state"),
      Subdivision("La Guaira", "X", "state"),
      Subdivision("Lara", "K", "state"),
      Subdivision("Miranda", "M", "state"),
      Subdivision("Monagas", "N", "state"),
      Subdivision("Mérida", "L", "state"),
      Subdivision("Nueva Esparta", "O", "state"),
      Subdivision("Portuguesa", "P", "state"),
      Subdivision("Sucre", "R", "state"),
      Subdivision("Trujillo", "T", "state"),
      Subdivision("Táchira", "S", "state"),
      Subdivision("Yaracuy", "U", "state"),
      Subdivision("Zulia", "V", "state")
    )
  }

  case object VG extends Country("Virgin Islands (British)", "VG", "VGB")

  case object VI extends Country("Virgin Islands (U.S.)", "VI", "VIR")

  case object VN extends Country("Viet Nam", "VN", "VNM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("An Giang", "44", "province"),
      Subdivision("Bà Rịa - Vũng Tàu", "43", "province"),
      Subdivision("Bình Dương", "57", "province"),
      Subdivision("Bình Phước", "58", "province"),
      Subdivision("Bình Thuận", "40", "province"),
      Subdivision("Bình Định", "31", "province"),
      Subdivision("Bạc Liêu", "55", "province"),
      Subdivision("Bắc Giang", "54", "province"),
      Subdivision("Bắc Kạn", "53", "province"),
      Subdivision("Bắc Ninh", "56", "province"),
      Subdivision("Bến Tre", "50", "province"),
      Subdivision("Cao Bằng", "04", "province"),
      Subdivision("Cà Mau", "59", "province"),
      Subdivision("Cần Thơ", "CT", "municipality"),
      Subdivision("Gia Lai", "30", "province"),
      Subdivision("Hà Giang", "03", "province"),
      Subdivision("Hà Nam", "63", "province"),
      Subdivision("Hà Nội", "HN", "municipality"),
      Subdivision("Hà Tĩnh", "23", "province"),
      Subdivision("Hòa Bình", "14", "province"),
      Subdivision("Hưng Yên", "66", "province"),
      Subdivision("Hải Dương", "61", "province"),
      Subdivision("Hải Phòng", "HP", "municipality"),
      Subdivision("Hậu Giang", "73", "province"),
      Subdivision("Hồ Chí Minh", "SG", "municipality"),
      Subdivision("Khánh Hòa", "34", "province"),
      Subdivision("Kiến Giang", "47", "province"),
      Subdivision("Kon Tum", "28", "province"),
      Subdivision("Lai Châu", "01", "province"),
      Subdivision("Long An", "41", "province"),
      Subdivision("Lào Cai", "02", "province"),
      Subdivision("Lâm Đồng", "35", "province"),
      Subdivision("Lạng Sơn", "09", "province"),
      Subdivision("Nam Định", "67", "province"),
      Subdivision("Nghệ An", "22", "province"),
      Subdivision("Ninh Bình", "18", "province"),
      Subdivision("Ninh Thuận", "36", "province"),
      Subdivision("Phú Thọ", "68", "province"),
      Subdivision("Phú Yên", "32", "province"),
      Subdivision("Quảng Bình", "24", "province"),
      Subdivision("Quảng Nam", "27", "province"),
      Subdivision("Quảng Ngãi", "29", "province"),
      Subdivision("Quảng Ninh", "13", "province"),
      Subdivision("Quảng Trị", "25", "province"),
      Subdivision("Sóc Trăng", "52", "province"),
      Subdivision("Sơn La", "05", "province"),
      Subdivision("Thanh Hóa", "21", "province"),
      Subdivision("Thái Bình", "20", "province"),
      Subdivision("Thái Nguyên", "69", "province"),
      Subdivision("Thừa Thiên-Huế", "26", "province"),
      Subdivision("Tiền Giang", "46", "province"),
      Subdivision("Trà Vinh", "51", "province"),
      Subdivision("Tuyên Quang", "07", "province"),
      Subdivision("Tây Ninh", "37", "province"),
      Subdivision("Vĩnh Long", "49", "province"),
      Subdivision("Vĩnh Phúc", "70", "province"),
      Subdivision("Yên Bái", "06", "province"),
      Subdivision("Điện Biên", "71", "province"),
      Subdivision("Đà Nẵng", "DN", "municipality"),
      Subdivision("Đắk Lắk", "33", "province"),
      Subdivision("Đắk Nông", "72", "province"),
      Subdivision("Đồng Nai", "39", "province"),
      Subdivision("Đồng Tháp", "45", "province")
    )
  }

  case object VU extends Country("Vanuatu", "VU", "VUT") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Malampa", "MAP", "province"),
      Subdivision("Pénama", "PAM", "province"),
      Subdivision("Sanma", "SAM", "province"),
      Subdivision("Shéfa", "SEE", "province"),
      Subdivision("Taféa", "TAE", "province"),
      Subdivision("Torba", "TOB", "province")
    )
  }

  case object WF extends Country("Wallis and Futuna", "WF", "WLF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Alo", "AL", "administrative precinct"),
      Subdivision("Sigave", "SG", "administrative precinct"),
      Subdivision("Uvea", "UV", "administrative precinct")
    )
  }

  case object WS extends Country("Samoa", "WS", "WSM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("A'ana", "AA", "district"),
      Subdivision("Aiga-i-le-Tai", "AL", "district"),
      Subdivision("Atua", "AT", "district"),
      Subdivision("Fa'asaleleaga", "FA", "district"),
      Subdivision("Gaga'emauga", "GE", "district"),
      Subdivision("Gagaifomauga", "GI", "district"),
      Subdivision("Palauli", "PA", "district"),
      Subdivision("Satupa'itea", "SA", "district"),
      Subdivision("Tuamasaga", "TU", "district"),
      Subdivision("Va'a-o-Fonoti", "VF", "district"),
      Subdivision("Vaisigano", "VS", "district")
    )
  }

  case object YE extends Country("Yemen", "YE", "YEM") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Abyan", "AB", "governorate"),
      Subdivision("Al Bayḑā’", "BA", "governorate"),
      Subdivision("Al Jawf", "JA", "governorate"),
      Subdivision("Al Mahrah", "MR", "governorate"),
      Subdivision("Al Maḩwīt", "MW", "governorate"),
      Subdivision("Al Ḩudaydah", "HU", "governorate"),
      Subdivision("Amānat al ‘Āşimah", "SA", "municipality"),
      Subdivision("Arkhabīl Suquţrá", "SU", "governorate"),
      Subdivision("Aḑ Ḑāli‘", "DA", "governorate"),
      Subdivision("Dhamār", "DH", "governorate"),
      Subdivision("Ibb", "IB", "governorate"),
      Subdivision("Laḩij", "LA", "governorate"),
      Subdivision("Ma’rib", "MA", "governorate"),
      Subdivision("Raymah", "RA", "governorate"),
      Subdivision("Shabwah", "SH", "governorate"),
      Subdivision("Tāʻizz", "TA", "governorate"),
      Subdivision("Şanʻā’", "SN", "governorate"),
      Subdivision("Şāʻdah", "SD", "governorate"),
      Subdivision("Ḩajjah", "HJ", "governorate"),
      Subdivision("Ḩaḑramawt", "HD", "governorate"),
      Subdivision("‘Adan", "AD", "governorate"),
      Subdivision("‘Amrān", "AM", "governorate")
    )
  }

  case object YT extends Country("Mayotte", "YT", "MYT")

  case object ZA extends Country("South Africa", "ZA", "ZAF") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bokone Bophirima", "NW", "province"),
      Subdivision("Eastern Cape", "EC", "province"),
      Subdivision("Foreisetata", "FS", "province"),
      Subdivision("GaZulu-Natala", "KZN", "province"),
      Subdivision("Gauteng", "GP", "province"),
      Subdivision("Kapa Bodikela", "WC", "province"),
      Subdivision("Kapa Bokone", "NC", "province"),
      Subdivision("Limpopo", "LP", "province"),
      Subdivision("Mpumalanga", "MP", "province")
    )
  }

  case object ZM extends Country("Zambia", "ZM", "ZMB") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Central", "02", "province"),
      Subdivision("Copperbelt", "08", "province"),
      Subdivision("Eastern", "03", "province"),
      Subdivision("Luapula", "04", "province"),
      Subdivision("Lusaka", "09", "province"),
      Subdivision("Muchinga", "10", "province"),
      Subdivision("North-Western", "06", "province"),
      Subdivision("Northern", "05", "province"),
      Subdivision("Southern", "07", "province"),
      Subdivision("Western", "01", "province")
    )
  }

  case object ZW extends Country("Zimbabwe", "ZW", "ZWE") {
    override val subdivisions: List[Subdivision] = List(
      Subdivision("Bulawayo", "BU", "province"),
      Subdivision("Harare", "HA", "province"),
      Subdivision("Manicaland", "MA", "province"),
      Subdivision("Mashonaland Central", "MC", "province"),
      Subdivision("Mashonaland East", "ME", "province"),
      Subdivision("Mashonaland West", "MW", "province"),
      Subdivision("Masvingo", "MV", "province"),
      Subdivision("Matabeleland North", "MN", "province"),
      Subdivision("Matabeleland South", "MS", "province"),
      Subdivision("Midlands", "MI", "province")
    )
  }

}
