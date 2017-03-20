import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

// the implicit import above gives the future an Execution Context
val f1 = Future { Thread.sleep(1000); 50 }
// the future result is like a collection
f1.foreach(n => println(n))

// when an exception
val f2 = Future { Thread.sleep(1000); 3/0 }
// returns nothing
f2.foreach(n => println(n))
// value contains an option with the error
f2.value
val ff = f2.failed
ff.foreach(n => println(n))

val f3 = Future { Thread.sleep(1000); 50 }
// f4 is a future that executes after future f3 executes
val f4 = f3.map(n => n * 2)
f4.value
// multiple futures waiting for f3 to complete
val f5 = f3.filter(n => n > 20)
f5.value

val p1 = Promise[Int]
val p2 = Promise[Int]
val pf1 = p1.future
val pf2 = p2.future

val result = for {
  a <- pf1
  b <- pf2
} yield a+b
result.value // is None as both promises haven't completed

p1.success(3)
p2.success(5)
result.value