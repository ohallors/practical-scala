
/**
  * Created by sheamusohalloran on 17/03/2017.
  */
abstract class Account(balance: Double, currency: String = "EUR") {

  def deposit(amount: Double);

  def deposit(cashflow: Cashflow);

  def withdraw(amount: Double);

  def withdraw(cashflow: Cashflow);
}
