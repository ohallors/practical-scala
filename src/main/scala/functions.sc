def cube(n: Int):Int = n*n*n

def fact(n: Int):Int = fact(n)

def square(n: Int) = {
  n*n
}

class IntVal(val i: Int) {
  def + (j : IntVal) = new IntVal(i + j.i)
}

val v1 = new IntVal(2)
val v2 = new IntVal(3)
// same as line below but without extra syntax
val v3 = v1 + v2
v3.i
var res1 = v1.+(v2)
res1.i

// returns Unit - kind of equivalent to void
def printIt(n: Int) = println(n)

// Type inferencer figures out supertype of both return values
// Any in this case
def foo(n: Int) = {
  if (n > 0)
    3
  else
    "zero"
}


// returns Unit, the expression sets the retval variable
def bar() = {
  val retval = 2*3
}

// this returns Int, retval expression on its own
def bar2() = {
  val retval = 2*3
  retval
}

// Only use var inside a function, never return a variable
def sum(nums: Int*) = {
  var total = 0
  for(n <- nums)
    total = total + n
  total
}
sum(1, 2, 3, 4)
