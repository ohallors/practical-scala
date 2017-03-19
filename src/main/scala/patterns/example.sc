case class Address(city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val a1 = Address("London", "UK")
val a2 = Address("New York", "USA")

val p1 = Person("Fred", 41, a1)
val p2 = Person("Jane", 32, a2)

p1 match {
  case Person(n,_, Address("London", _)) => println(s"$n lives in london")
}

// guards
p2 match {
  case Person(n, a, _) if a > 30 => println(s"$n lives in london and is $a")
  case Person(n, a, _) if a <=30 => println(s"$n is a youngster")
}