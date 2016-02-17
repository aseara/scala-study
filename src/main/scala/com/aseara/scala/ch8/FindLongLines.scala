package com.aseara.scala.ch8

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/13
 * Time: 11:41
 */
object FindLongLines {

  def main (args: Array[String]) {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }

}
