package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/27
 * Time: 9:25
 */

trait Queue[+T] {
  def head: T
  def tail: Queue[T]
  def enqueue[U >: T](x: U): Queue[U]
}

object Queue {

  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private class QueueImpl[T](
    private[this] var leading: List[T],
    private[this] var trailing: List[T]
  ) extends Queue[T] {

    def mirror() =
      if (leading.isEmpty) {
        while (trailing.nonEmpty) {
          leading = trailing.head :: leading
          trailing = trailing.tail
        }
      }

    override def head = {
      mirror()
      leading.head
    }

    override def tail = {
      mirror()
      new QueueImpl(leading.tail, trailing)
    }

    override def enqueue[U >: T](x: U) =
      new QueueImpl[U](leading, x :: trailing)

  }

}
