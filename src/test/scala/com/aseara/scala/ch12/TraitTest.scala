package com.aseara.scala.ch12

import com.aseara.scala.ch12.queue.{Filtering, Incrementing, BasicIntQueue}

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 15:33
 */
object TraitTest extends App {

  val queue = new BasicIntQueue with Incrementing with Filtering

  queue.put(-1); queue.put(0); queue.put(1)

  println(queue.get())
  println(queue.get())

}
