val n = 4

// case statement don't need to match a compile time constant like in java
val m = 2

// Unit is returned, output from println()
n match {
  case 1 => println("It is one")
  case m => println("It is two")
  case _ => println("Something else")
}
