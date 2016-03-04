package com.aseara.scala.ch12.queue

/**
  * Created with IntelliJ IDEA.
  * User: 境德
  * Date: 2015/7/16
  * Time: 16:26
  * Listing 12.6 · Abstract class IntQueue.
  */
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}
