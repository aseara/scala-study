package com.aseara.scala.ch12.geo

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/16
 * Time: 16:10
 */
trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
}
