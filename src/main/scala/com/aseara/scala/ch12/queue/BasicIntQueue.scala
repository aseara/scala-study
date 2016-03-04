package com.aseara.scala.ch12.queue

import scala.collection.mutable.ArrayBuffer

/**
  * Created with IntelliJ IDEA.
  * User: 境德
  * Date: 2015/7/16
  * Time: 16:27
  * Listing 12.7 · A BasicIntQueue implemented with an ArrayBuffer.
  */

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}
