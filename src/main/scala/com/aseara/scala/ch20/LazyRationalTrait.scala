package com.aseara.scala.ch20

/**
  * Created by 邱境德 on 2016/3/16.
  */
trait LazyRationalTrait {

  val numerArg: Int
  val denomArg: Int

  lazy val numer = numerArg / g
  lazy val denom = denomArg / g

  override def toString: String = numer +"/"+ denom

  private lazy val g = {
    require(denomArg != 0)
    gcd(numerArg, denomArg)
  }
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
