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
  override type T = String

  override def transform(x: String) = x + x

  override val initial = "hi"
  override var current = initial
}
