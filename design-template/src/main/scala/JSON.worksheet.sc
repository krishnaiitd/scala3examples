enum JSON:
    case Seq (elems: List[JSON])
    case Obj (bindigs: Map[String, JSON])
    case Num (num: Double)
    case Str (str: String)
    case Bool (b: Boolean)
    case Null

val jsData = JSON.Obj(Map(
    "firstName" -> JSON.Str("Krisha"),
    "lastName" -> JSON.Str("Prasad"),
    "address" -> JSON.Obj(Map(
        "streetAddeess" -> JSON.Str("12"),
        "state" -> JSON.Str("Jharkhand")
    )),
    "PhoneNumber" -> JSON.Seq(List(
        JSON.Obj(Map(
            "type"-> JSON.Str("home"),
            "number" -> JSON.Str("+91 9891370585")))
    ))
))

def inQuotes(str: String) : String = "\"" + str + "\""

// inQuotes(jsData)

def show(json: JSON):String = json match
    case JSON.Seq(elems) => elems.map(show).mkString("[", ", ", "]")
    case JSON.Obj(bindigs) => 
        val assocs = bindigs.map {
            (key, value) => s"${inQuotes(key)}: ${show(value)}"
        }
        assocs.mkString("{", ",\n", "}")
    case JSON.Num(num) => num.toString
    case JSON.Str(str) => inQuotes(str)
    case JSON.Bool(b) => b.toString()
    case JSON.Null => "null"

show(jsData)


// Collections Methods:
    // Core Methods:
        // map
        // flatMap
        // filter
    // and also
        // foldLeft
        // foldRight

