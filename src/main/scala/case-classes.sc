import java.time.LocalDateTime

case class CashFlow(amount: Double, currency: String, due: LocalDateTime)

val cf = CashFlow(1000.0, "USD", LocalDateTime.now)

