// type is Int
val n = 3
// type is String
val s = "abc"
// type is Int => Int = <function1>
// function literal (function object
(n: Int) => n*n

//square: Int => Int = lambdas.A$A11$A$A11$$Lambda$3772/146997161@7399e538
val square = (n: Int) => n*n
// res1: Int = 4
square(2)
// every time a () is used, it is calling apply
square.apply(2)

val cube = (n: Int) => n * n * n
def doIt(n: Int, f: Int => Int) = f(n)
doIt(3, cube)