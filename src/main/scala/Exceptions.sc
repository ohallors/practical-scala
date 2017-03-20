import scala.util.{Failure, Success, Try}

val s = "a123"
// possible but not very Scala way to catch exceptions
try {
  val n = s.toInt
} catch {
  case ex: NumberFormatException => println(ex.getMessage)
}

// instead use Try which will return a Success or Failure
// with the result or exception inside
val v1 = Try { s.toInt }

v1 match {
  case Success(n) => println(n)
  case Failure(ex) => println(ex.getMessage)
}

val s1 = "123x"
val s2 = "456"

// result: scala.util.Try[Int] = Failure(java.lang.NumberFormatException: For input string: "123x")
val result = for {
  n <- Try {s1.toInt}
  m <- Try {s2.toInt}
} yield n+m