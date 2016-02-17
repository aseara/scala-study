package com.aseara.scala.ch20

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 15:49
 */
class Food

abstract class Animal {
  type SuitableFood <: Food
  def eat(food: SuitableFood)
}

class Grass extends Food

class Cow extends Animal {
  override type SuitableFood = Grass
  override def eat(food: Grass) {}
}

