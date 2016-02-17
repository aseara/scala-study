package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/28
 * Time: 14:23
 */
object TypeParameterTest extends App {

  val people = List(
    new Person("Larry", "Wall"),
    new Person("Anders", "Hejlsberg"),
    new Person("Guido", "van Rossum"),
    new Person("Alan", "Kay"),
    new Person("Yukihiro", "Matsumoto")
  )

  val sortedPeople = orderedMergeSort(people)

  println(people)
  println(sortedPeople)
}

