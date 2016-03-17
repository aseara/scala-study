package com.aseara.scala.ch19

/**
  * Created by 邱境德 on 2016/3/16.
  */
class Person(val firstName: String, val lastName: String)
  extends Ordered[Person]{
  override def compare(that: Person): Int = {
    val lastNameComparison = lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }

  override def toString: String = firstName +" "+ lastName
}
