package com.aseara.scala.ch12.queue

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 16:37
 */
trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}
