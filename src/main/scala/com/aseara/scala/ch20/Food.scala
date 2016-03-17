package com.aseara.scala.ch20

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 15:49
 */
class Food

abstract class Animal[SuitableFood <: Food] {
  def eat(food: SuitableFood)
}

class Grass extends Food

class Cow extends Animal[Grass] {
  override def eat(food: Grass) {}
}

