import java.time.LocalDateTime

class Pet {
  def feed() = {
    "Feeding at: " + LocalDateTime.now
  }
}

class Cat extends Pet {
  def hunt() = {
    println("The cat hunts")
  }
}

val c = new Cat
println(c.feed())
c.hunt()

var p : Pet = new Cat

// need to explicitly override
class Dog extends Pet {
  override def feed() = {
    "Dog eating..."
  }
}

var d = new Dog
d.feed()

// override defined function with fixed value
class Bird extends Pet {
  override val feed = {
    "Bird eating..."
  }
}

var b = new Bird
b.feed
