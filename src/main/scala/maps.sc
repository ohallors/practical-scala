// syntactic sugar way
val people =  Map("dave" -> 42, "paul" -> 41)
// or as pair
val people2 =  Map(("mary", 48), ("siobhan", 32))
val d = people("dave")
// throws exception
// val b = people("brian")
// returns option instead of throwing
val b2 = people.get("brian")
val j = people.getOrElse("jill", 0)

people.contains("dave")
// similar to partial functions (not typically used)
people.isDefinedAt("dave")

val people3 = people + ("bill" -> 55, "jane" -> 30)
val people4 = people ++ people2

// destructured into key value mappings, can have nested generators
for ((name,age) <- people;i <- 1 to 4;j <- 99 to 100)
  println(s"$name $i $j")
// guard condition on loop
for ((name,age) <- people4 if age > 45)
  println(s"$name $age")
