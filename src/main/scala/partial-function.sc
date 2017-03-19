// if a function does not cover all cases then it
// said to be partial (it's not entire in it's domain)
// The 'domain' is the inputs/incoming values to a function (Int in this case)
// The 'target' is the return type (String in this case)

// adding the _ catchall makes this method an 'entire' function
def f(n: Int) = n match {
  case 1 => "one"
  case 2 => "two"
}

f(3)

val p:PartialFunction[Int, String] = {
  case 1 => "one"
  case 2 => "two"
}