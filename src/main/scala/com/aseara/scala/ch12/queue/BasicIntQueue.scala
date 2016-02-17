package com.aseara.scala.ch12.queue

import scala.collection.mutable.ArrayBuffer

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 16:27
 */
class BasicIntQueue extends IntQueue {

  private val buf = new ArrayBuffer[Int]

  override def get() = buf.remove(0)

  override def put(x: Int) { buf += x }
}
