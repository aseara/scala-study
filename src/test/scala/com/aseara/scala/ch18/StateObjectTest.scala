package com.aseara.scala.ch18

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/23
 * Time: 10:51
 */
object StateObjectTest extends App {

  val t = new Thermometer

  println(t)

  t.celsius = 100

  println(t)

  t.fahrenheit = -40

  println(t)

}
