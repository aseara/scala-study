package com.aseara.scala.ch20

import java.io.PrintWriter
import java.util.Date

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 15:58
 */
object AbstractTest extends App {

  val X = 20

  new {
    val numerArg = 1 * X
    val denomArg = 2 * X
  } with RationalTrait

  object twoThirds extends {
    val numerArg = 2
    val denomArg = 3
  } with RationalTrait


  using(new PrintWriter("date.txt")) { writer =>
    writer.println(new Date)
  }
}
