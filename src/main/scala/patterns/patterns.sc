
val n = 4

// case statement don't need to match a compile time constant like in java
val m = 2

// Unit is returned, output from println()
// no need to break! it doesn't fall through
n match {
  case 1 | 3 | 5 => println("It is odd")
  case 2 | 4 | 6 => println("It is even")
  case m => println("It is two")
  case _ => println("Something else")
}

// underscore and type in this case means you don't care about value
// but you want to match on type
def doIt(x: Any) = x match {
  case _: Int => println("It's an int")
  case _: String => println("It's a string")
  case _ => println("It's something else")
}

doIt(n)
doIt("abc")
doIt(32.0)

// if it's an int then bind the value to the variable n
def doIt2(x: Any) = x match {
  case n: Int => println(s"It's an int $n")
  case s: String => println(s"It's a string $s")
  case default => println(s"It's something else $default")
}

doIt2(n)
doIt2("abc")
doIt2(32.0)

// body of the function is a match statement
def doIt3(a: Int, b:Int) = (a, b) match {
  case (1, 1) => println("1,1")
  case (1, _) => println("1, _")
  case (_, 2) => println("_, 2")
  case (_, _) => println("_, _")
}

doIt3(1, 4)
doIt3(5, 2)

