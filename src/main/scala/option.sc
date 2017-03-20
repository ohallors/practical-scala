// the type Option[T] will either return Some or None

val opt = Some(1)
val none = None

opt.get

case class User(val name: String, val city: Option[String])

val user1 = new User("fred", Some("London"))
val user2 = new User("Jill", None)

user1.city.get
user2.city.getOrElse("Sydney")

def getCity(u: User) = u.city match {
  case Some(c) => c
  case None => "No City"
}
getCity(user1)
getCity(user2)

val users = List(
  User("fred", Some("London")),
  User("Jill", Some("Sydney")),
  User("Peter", None),
  User("Paul", Some("Melbourne"))
)
// flatMap returns a list of cities where it isn't none
val cities = users.flatMap(x => x.city)
