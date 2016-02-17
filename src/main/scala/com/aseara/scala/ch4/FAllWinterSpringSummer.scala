package com.aseara.scala.ch4

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/11
 * Time: 18:38
 */

import ChecksumAccumulator.calculate

object FAllWinterSpringSummer extends App {
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
