package com.aseara.scala.ch8

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/13
 * Time: 11:33
 */

import scala.io.Source

object LongLines {

  def processFile(filename: String, width: Int) {

    def processLine(line: String) {
      if (line.length > width)
        println(filename +": "+ line.trim)
    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(line)
  }

}
