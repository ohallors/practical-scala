// this is a range object.. bizarre
1 to 5

// for comprehension - why is it called comprehension?
for (i <- 1 to 5)
  println(i)

for (x <- 1 to 4; y <- 2 to 3)
  println(x+y)

// is equivalent to
(1 to 4).foreach(x => (2 to 3).foreach(y => println(x+y)))

val prices = List(
  List(1000, 700, 900),
  List(),
  List(500, 2100)
)
// iterate through items in nested lists and return those greater
// than 1000, increased by 10% as a new list
// bizarre syntax :-(
for {
  pr <- prices
  p <- pr
  if p >= 1000
} yield p + p * 0.1

prices.flatMap(pr => pr.filter(p => p >= 1000).map(p => p + p*0.1))
