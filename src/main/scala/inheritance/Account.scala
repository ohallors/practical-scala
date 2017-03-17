package inheritance

/**
  * Created by sheamusohalloran on 17/03/2017.
  */
class Account(val balance: Double, val currency: String = "EUR") {

  def deposit(amount: Double) = {
    new Account(balance + amount)
  }

  def deposit(cashflow: Cashflow) = {
    new Account(balance + cashflow.amount, cashflow.currency)
  }

  def withdraw(amount: Double) = {
    new Account(balance - amount)
  }

  def withdraw(cashflow: Cashflow) = {
    new Account(balance - cashflow.amount, cashflow.currency)
  }
}
