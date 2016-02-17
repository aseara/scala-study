package com.aseara.scala.ch6

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/12
 * Time: 17:43
 */
class Rational(n: Int, d: Int) extends Ordered[Rational] {

  require(d != 0)

  def this(n: Int) = this(n, 1)

  private val g = gcd(n.abs, d.abs)

  private val numer: Int = n / g
  private val denom: Int = d / g

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)

  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)

  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  def * (i: Int): Rational =
    new Rational(numer * i, denom)

  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)

  def / (i: Int): Rational =
    new Rational(numer, denom * i)

  def lessThan(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if (lessThan(that)) that else this

  override def toString = numer +"/"+ denom

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)

  override def compare(that: Rational) =
    (numer * that.denom) - (that.numer * denom)

}