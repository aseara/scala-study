package com.aseara.scala.ch12

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/15
 * Time: 20:09
 */

class Animal
trait HasLegs

class Frog extends Animal with Philosophical with HasLegs {
  override def toString = "green"

  override def philosophize(): Unit = {
    println("It ain't easy being " + toString + "!")
  }
}
