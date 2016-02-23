package com.aseara.scala.ch4

/**
  * Created with IntelliJ IDEA.
  * User: 境德
  * Date: 2015/7/11
  * Time: 18:20
  */

import ChecksumAccumulator.calculate

object Summer {
  def main(args: Array[String]) {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
