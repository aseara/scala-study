package com.aseara.scala.ch18

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/23
 * Time: 11:17
 */
class Thermometer {

  var celsius: Float = _

  def fahrenheit = celsius * 9 / 5 + 32
  def fahrenheit_= (f: Float): Unit = {
    celsius = (f - 32) * 5 / 9
  }

  override def toString = fahrenheit +"F/"+ celsius +"C"

}
