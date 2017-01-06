import java.util
import java.util.ArrayList

val l = new util.ArrayList[String]
l.add("Hello")
l

// wildcard import
import java.util.concurrent._

// multiple
import java.util.{Map, HashMap}

val m = new HashMap

// alias types on the way in
import java.util.{Date=>UDate}
val d = new UDate
d.getTime

import java.time.LocalDate

def leapYear() = {
  LocalDate.now().isLeapYear
}
leapYear()