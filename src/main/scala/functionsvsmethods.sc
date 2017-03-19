// a function, is an object unto itself and is not
// connected with any other entity
// a function or lambda has a type
val square = (n: Int) => n*n

// a method is always part of something else
// a method has a signature
object Test {
  def f(n: Int) = n*n
}
val f1 = (n: Int) => Test.f(n)
f1(2)

// partial function application, use a method elsewhere
val f2 = Test.f _
f2(2)