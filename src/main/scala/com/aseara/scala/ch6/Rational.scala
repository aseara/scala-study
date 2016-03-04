package com.aseara.scala.ch6

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/12
 * Time: 17:43
 */
class Rational(n: Int, d: Int) extends Ordered[Rational] {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def +(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )
  def *(that: Rational) =
    new Rational(numer * that.numer, denom * that.denom)
  override def toString = numer +"/"+ denom


  override def compare(that: Rational) =
    (numer * that.denom) - (that.numer * denom)

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}