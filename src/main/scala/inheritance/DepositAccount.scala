

/**
  * Created by sheamusohalloran on 17/03/2017.
  */
case class DepositAccount(balance: Double, currency: String = "EUR") extends Account(balance, currency) {

  def withdraw(cashflow: Cashflow) = {
    if (balance > 0)
      DepositAccount(balance - cashflow.amount, cashflow.currency)
    else
      throw new IllegalArgumentException("account overdrawn");
  }

  def deposit(amount: Double) = {
    DepositAccount(balance + amount)
  }

  def deposit(cashflow: Cashflow) = {
    DepositAccount(balance + cashflow.amount, cashflow.currency)
  }

  def withdraw(amount: Double) = {
    DepositAccount(balance - amount)
  }

}
