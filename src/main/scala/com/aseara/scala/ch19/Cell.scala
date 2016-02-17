package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/27
 * Time: 14:28
 */
class Cell[-T](init: T) {
  private[this] var current = init
  def get: Any = current
  def set(x: T) { current = x }
}
