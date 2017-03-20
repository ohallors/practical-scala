import scala.annotation.tailrec

// standard way
val lst = List(1, 2, 3)

// shorthand way , concatenation operator
// Nil represents an empty list
val lst2 = 0 :: 1 :: 2 :: Nil

// List[Nothing], nothing has no value and cannot be assigned like null
val empty = List()

// add value to end of list
val lst3 = lst :+ 4
val lst4 = List(5, 6, 7)
val lst5 = lst3 ::: lst4
val lst6 = List("ab", "cd")

// produces list of Any, the commmon ancestor of both
val lst7 = lst3 ::: lst6
// produces new list
val lst8 = lst ::: lst
lst.head // first element
lst.tail // all except first

def matchList[T](lst: List[T]) = lst match {
  case List() => println("empty")
  case List(_) => println("single element")
  case List(_, _) => println("two elements")
}

val l = List(1)
matchList(l)

@tailrec
def printlist[T](lst: List[T]): Unit = lst match {
  case Nil => println("done")
  case h :: t =>
    println(s"$h")
    printlist(t)
}

printlist(lst4)

