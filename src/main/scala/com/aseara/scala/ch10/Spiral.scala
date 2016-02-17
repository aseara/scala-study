package com.aseara.scala.ch10

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/14
 * Time: 16:10
 */

import Element.elm

object Spiral {

  val space = elm(" ")
  val corner = elm("+")

  def spiral(nEdges: Int, direction: Int): Element = {

    if (nEdges == 1)
      elm("+")
    else {

      val sp = spiral(nEdges - 1, (direction + 3) % 4)
      def verticalBar = elm('|', 1, sp.height)
      def horizontalBar = elm('-', sp.width, 1)

      if (direction == 0)
        (corner beside horizontalBar) above (sp beside space)
      else if (direction == 1)
        (sp above space) beside (corner above verticalBar)
      else if (direction == 2)
        (space beside sp) above (horizontalBar beside corner)
      else
        (verticalBar above corner) beside (space above sp)

    }

  }

  def main(args: Array[String]) {
    val nSides = args(0).toInt
    println(spiral(nSides, 0))
  }

}
