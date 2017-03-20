val people = List(
  List("dave", "paul"),
  List(),
  List("jane"),
  List("liz", "bill")
)

val lst = List(1, 2, 3, 4)
lst.filter(n => n%2 == 0 )
lst.map(n => n+2)
// the underscore can be used if you only use it once
lst.map(_+2)
//put every item into one list and capitalise
val people2 = people.flatten.map(s => s.capitalize)
val people3 = people.flatMap(c => c.map(s => s.capitalize))

val strings = List("ab", "cd", "ef")
val caps = strings.map(s => s.capitalize)
val strings2 = List("ab", 45, "cd", "ef")
//will only match the strings, an 'entire' function
val caps2 = strings2.collect(
  {
    case s: String => s.capitalize
  }
)
