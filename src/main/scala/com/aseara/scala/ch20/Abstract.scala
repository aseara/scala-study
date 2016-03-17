package com.aseara.scala.ch20

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/28
 * Time: 14:44
 */
trait Abstract {

  type T
  def transform(x: T): T
  val initial: T
  var current: T

}

class Concrete extends Abstract {
  type T = String
  def transform(x: String) = x + x
  val initial = "hi"
  var current = initial
}
