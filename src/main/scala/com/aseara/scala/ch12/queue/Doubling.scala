package com.aseara.scala.ch12.queue

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 16:31
 */
trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}
