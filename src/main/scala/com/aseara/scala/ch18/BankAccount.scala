package com.aseara.scala.ch18

import java.time.temporal.TemporalAmount

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/23
 * Time: 10:46
 */
class BankAccount {

  private var bal: Int = 0
  def balance: Int = bal
  def deposit(amount: Int) {
    require(amount > 0)
    bal += amount
  }

  def withdraw(amount: Int) =
    if (amount > bal) false
    else {
      bal -= amount
      true
    }

}
