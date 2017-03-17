package inheritance

import java.time.LocalDateTime

// primary constructor should contain all the necessary parameters for this object to perform
// you can chain auxillary constructors but the primary constructor must be called at some point
class Cashflow(val amount: Double, val currency: String, val due: LocalDateTime) {

  // adding an auxillary constructor and calling the primary constructor : def this
  def this(amount: Double, due: LocalDateTime) = this(amount, "USD", due)

  // we are able to put in computation in the call to the primary constructor .now()
  def this(amount: Double) = this(amount, "GBP", LocalDateTime.now())

  val settle = due.toLocalDate.plusDays(2)

  // lazy keyword means that processedAt is only evaluated when it is accessed
  private lazy val processedAt = LocalDateTime.now

  def rollForward() = {
    val retval = new Cashflow(amount, currency, due.plusDays(1))
    retval.processedAt
    retval
  }
}

object Cashflow {
  def main(args: Array[String]): Unit = {
    val c1 = new Cashflow(100.0)
    println(c1.settle)

    val c2 = c1.rollForward()
    Thread.sleep(1000)
    println(c2.settle)
    println(c1.processedAt)
    println(c2.processedAt)
  }
}