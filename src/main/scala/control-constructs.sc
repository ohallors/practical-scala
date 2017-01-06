// 1 to 5 generates collection of type Int
// 1 to 5 is an example of indirect object syntax which can be written as 1.to(5)
// to() is a method on the scala Int class
for(n <- 1 to 5)
  println(n)

for(n <- 1.to(5))
  println(n)
