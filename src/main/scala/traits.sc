trait Vehicle {
  def launch
}

trait Boat extends Vehicle {
  override def launch = println("I'm a boat")
}

trait Boat2 extends Vehicle {
  override def launch = println("I'm another boat")
}

trait Plane extends Vehicle {
  override def launch = println("I'm a plane")
}

class Seaplane extends Plane with Boat {
}

val s = new Seaplane
s.launch

val s1 = new Seaplane with Boat2
