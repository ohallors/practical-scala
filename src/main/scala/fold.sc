val lst = List(1, 2, 3, 4)

// fold is same as java 8's reduce
val result = lst.fold(1)(
  (acc, nxt) => acc * nxt
)

val str = List("ab", "cd", "ef")
val concat = str.foldLeft("")((acc, nxt) => acc + nxt)
// reduce doesn't need a starting value
val concat2 = str.reduce((acc, nxt) => acc + nxt)
// this can be replace with _+_ first argument and second argument
// very idiomatic
val concat3 = str.reduce(_+_)

// find an item, returning the accumulator if true
// or the value of b == item
def contains[A](lst: List[A], item: A) =
  lst.foldLeft(false)((a,b) => a || b == item)
contains(lst, 2)

// genericised empty list as accumulator and reverse concating
def reverse[A](lst: List[A]) : List[A] =
  lst.foldLeft(List[A]())((a,b) => b :: a)

lst.reverse