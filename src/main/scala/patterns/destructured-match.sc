import java.time.LocalDateTime

case class CashFlow2(amount: Double, currency: String, due: LocalDateTime)

// destructuring match
val c1 = CashFlow2(3000.0, "GBP", LocalDateTime.now)
c1 match {
  case CashFlow2(v, "USD",_) => println("US cash flow")
  case CashFlow2(v, "GBP",_) => println(s"Us cash flow $v")
}


