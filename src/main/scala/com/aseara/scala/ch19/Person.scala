package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/28
 * Time: 14:11
 */
class Person(val firstName: String, val lastName: String)
  extends Ordered[Person] {

  override def compare(that: Person): Int = {
    val lastNameComparison =
      lastName.compareToIgnoreCase(that.lastName)
    if (lastNameComparison != 0)
      lastNameComparison
    else
      firstName.compareToIgnoreCase(that.firstName)
  }


  override def toString = s"$firstName $lastName"
}
