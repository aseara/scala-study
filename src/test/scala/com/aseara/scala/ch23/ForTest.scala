package com.aseara.scala.ch23

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/31
 * Time: 19:44
 */
object ForTest extends App {

  val list = queens(5)

  list.foreach (qs => {
    println()
    println(qs)
    println()
  })

}
