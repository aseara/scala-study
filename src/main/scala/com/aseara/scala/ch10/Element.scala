package com.aseara.scala.ch10

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/14
 * Time: 10:46
 */

abstract class Element {
  def contents: Array[String]
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
  def contents: Array[String] = conts
}