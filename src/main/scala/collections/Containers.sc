// by default lists are immutable
val lst = List(1, 2, 3)

// add an element to the list on the front of the list
// special rule!
// because the operator ends in colon it operates on the right operand (on lst, not on the 0)
// if it was a dot it would act on the left operand (the 0)
val lst2 = 0 :: lst


class Holder[T](val value: T) {
  def printIt = println(value)
}
val h1 = new Holder(3)
h1.printIt

class Person
class Employee extends Person

val h2 = new Holder(new Employee)

// no inheritance in scala type generics - invariance of container types
// error
// val h3 : Holder[Person] = h2

// + symbol allows sub-types
class HolderPlus[+T](val value: T) {
  def printIt = println(value)
}

val h3 = new HolderPlus()(new Employee)
val h4: HolderPlus[Person] = h3
