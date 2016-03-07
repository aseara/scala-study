package com.aseara.scala.ch12

import com.aseara.scala.ch12.queue._

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 15:33
 */
object TraitTest extends App {

  val queue1 = new MyQueue
  queue1.put(2)
  queue1.put(3)
  println(queue1.get())
  println(queue1.get())

  val queue2 = new BasicIntQueue with Doubling
  queue2.put(2)
  queue2.put(3)
  println(queue2.get())
  println(queue2.get())

  val queue = new BasicIntQueue with Incrementing with Filtering

  queue.put(-1); queue.put(0); queue.put(1)

  println(queue.get())
  println(queue.get())



}
