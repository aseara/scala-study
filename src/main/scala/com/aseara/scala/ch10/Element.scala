package com.aseara.scala.ch10

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/14
 * Time: 10:46
 */

import Element.elm

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element = {

    val this1 = this widen that.width
    val that1 = that widen width
    assert(this1.width == that1.width)
    elm(this1.contents ++ that1.contents)

  }

  def beside(that: Element): Element = {

    val this1 = this heighten that.height
    val that1 = that heighten height

    elm(
      for (
        (line1, line2) <- this1.contents zip that1.contents
      ) yield line1 + line2
    )
  }

  def widen(w: Int): Element =
    if (w <= width) this
    else {
      val left = elm(' ', (w - width) / 2, height)
      val right = elm(' ', w - width - left.width, height)
      left beside this beside right
    } ensuring(w <= _.width)

  def heighten(h: Int): Element =
    if (h <= height) this
    else {
      val top = elm(' ', width, (h - height) / 2)
      val bot = elm(' ', width, h - height - top.height)

      top above this above bot

    }

  override def toString: String = contents mkString "\n"
}

object Element {

  private class ArrayElement(
    val contents: Array[String]
  ) extends Element

  private class LineElement(s: String) extends Element {
    override val contents = Array(s)
    override def width: Int = s.length
    override def height: Int = 1
  }

  private class UniformElement(
    ch: Char,
    override val width: Int,
    override val height: Int
  ) extends Element {
    private val line = ch.toString * width
    def contents: Array[String] = Array.fill(height)(line)
  }

  def elm(contents: Array[String]): Element =
    new ArrayElement(contents)

  def elm(ch: Char, width: Int, height: Int): Element =
    new UniformElement(ch, width, height)

  def elm(line: String): Element =
    new LineElement(line)
}