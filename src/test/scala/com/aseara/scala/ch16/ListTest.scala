package com.aseara.scala.ch16

/**
  * Created by 邱境德 on 2016/3/9.
  */
object ListTest extends App {

  println(List(10, 20) zip List(3, 4, 5))
  println((List(10, 20), List(3, 4, 5)).zipped)

}
