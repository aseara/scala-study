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
  private class QueueImpl[+T](
    private[this] var leading: List[T],
    private[this] var trailing: List[T]
  ) extends Queue[T] {
    def head = {
      mirror()
      leading.head
    }
    def tail = {
      mirror()
      new QueueImpl(leading.tail, trailing)
    }
    def enqueue[U >: T](x: U) =
      new QueueImpl[U](leading, x :: trailing)

    def mirror() {
      if (leading.isEmpty) {
        leading = trailing.reverse
        trailing = Nil
      }
    }
  }

  def apply[T](xs: T*): Queue[T] =
    new QueueImpl[T](xs.toList, Nil)
}
