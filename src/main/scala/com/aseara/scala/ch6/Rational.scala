package com.aseara.scala.ch6

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/12
 * Time: 17:43
 */
class Rational(n: Int, d: Int) {
  require(d != 0)
  val numer = n
  val denom = d
  override def toString = n +"/"+ d
  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
}