package com.aseara.scala.ch12.queue

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 16:37
 */
trait Incrementing extends IntQueue {
  abstract override def put(x: Int) { super.put(x + 1) }
}
