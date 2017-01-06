// DEFAULT ARGUMENTS
def foo(a: Int=0, b: String="abc", c: Int=10) = {
  println(s"a: $a, b: $b, c $c")
}
// foo doesn't work

// does a: 0, b: abc, c 10
foo()

// a: 3, b: hello, c 10
foo(3, "hello")

// foo(4,,3) doesn't work
// using a default means you must use all defaults to the right

// VAR ARGUMENTS (the *)
def sum(nums: Int*) = {
  var total = 0
  for(n <- nums)
    total = total + n
  total
}