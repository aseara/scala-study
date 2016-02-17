package com.aseara.scala.ch20

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 15:58
 */
object AbstractTest extends App {

  class Fish extends Food

  val bessy: Animal = new Cow
  val grass = new Grass
  // bessy eat new bessy.SuitableFood


  type eatGrassAnimal = Animal { type SuitableFood = Grass }

  var animals: List[eatGrassAnimal] = Nil

  bessy :: animals
}
