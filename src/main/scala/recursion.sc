import scala.annotation.tailrec

// recursion - requires return type
// cannot be optimised as multiply must be executed as frames are popped off the stack
def fact(n: Int): Int = {
  if (n == 0)
    1
  else
    n*fact(n-1)
}
fact(3)

// better.. with match
def fact2(n: Int): Int = n match {
  case 0 => 1
  case m => m * fact2(m-1)
}
fact2(3)

// best! tail recursion, scala turns it into a loop
// if no computation is done when popping items off the call stack
// scala is fine with nested functions!
// n is the value that is matched on
// @tailrec indicates that the programmer believes ths is a tail
// recursive function
def factorial(n: Int): Int = {
  @tailrec def fact3(n: Int, acc: Int): Int = n match {
    case 0 => acc
    case m => fact3(m - 1, m * acc)
  }
  fact3(n, 1)
}
factorial(4)
