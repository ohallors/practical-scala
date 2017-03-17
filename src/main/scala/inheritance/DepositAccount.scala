package inheritance

/**
  * Created by sheamusohalloran on 17/03/2017.
  */
class DepositAccount(balance: Double, currency: String = "EUR") extends Account(balance, currency) {

  override def withdraw(cashflow: Cashflow) = {
    if (balance > 0)
      new Account(balance - cashflow.amount, cashflow.currency)
    else
      throw new IllegalArgumentException("account overdrawn");
  }

}
