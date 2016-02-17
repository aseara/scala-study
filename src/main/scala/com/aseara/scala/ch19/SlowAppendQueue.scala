package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/27
 * Time: 9:19
 */
class SlowAppendQueue[T](elems: List[T]) {
  def head = elems.last
  def tail = new SlowAppendQueue(elems.init)
  def enqueue(x: T) = new SlowAppendQueue(x :: elems)
}
