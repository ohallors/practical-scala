package cashflow.scala

import java.time.LocalDateTime

// primary constructor should contain all the necessary parameters for this object to perform
// you can chain auxillary constructors but the primary constructor must be called at some point
class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime) {

  // adding an auxillary constructor and calling the primary constructor : def this
  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)

  // we are able to put in computation in the call to the primary constructor .now()
  def this(amount: Double) = this(amount, "GBP", LocalDateTime.now())

}
