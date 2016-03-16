package com.aseara.scala.ch19

/**
  * Created by 邱境德 on 2016/3/14.
  */

trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def enqueue[U >: T](x: U): Queue[U]
}

object Queue {

  def apply[T](xs: T*): Queue[T] =
    new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[+T](
    private val leading: List[T],
    private val trailing: List[T]
  ) extends Queue[T] {
    def mirror =
      if (leading.isEmpty)
        new QueueImpl(trailing.reverse, Nil)
      else
        this

    def head = mirror.leading.head
    def tail = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }
    def enqueue[U >: T](x: U) =
      new QueueImpl[U](leading, x :: trailing)
  }
}
