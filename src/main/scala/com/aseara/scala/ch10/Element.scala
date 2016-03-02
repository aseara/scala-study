package com.aseara.scala.ch10

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/14
 * Time: 10:46
 */

abstract class Element {
  def contents: Array[String]
  def height = contents.length
  def width = if (height == 0) 0 else contents(0).length

  def above(that: Element) =
    new ArrayElement(contents ++ that.contents)

  def beside(that: Element) =
    new ArrayElement(
      for ((line1, line2) <- contents zip that.contents)
        yield line1 + line2
    )

  override def toString = contents mkString "\n"

}

class ArrayElement(val contents: Array[String]) extends Element

class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}