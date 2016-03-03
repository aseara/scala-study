package com.aseara.scala.ch12

/**
  * Created by 邱境德 on 2016/3/3.
  *
  */
object PhilosophicalTest extends App {
  val frog = new Frog
  frog.philosophize()

  val phil: Philosophical = frog
  phil.philosophize()
}
