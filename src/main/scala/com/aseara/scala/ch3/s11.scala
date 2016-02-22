/**
  * Created by 邱境德 on 2016/2/22.
  * Listing 3.11 · Printing formatted character counts for the lines of a file.
  */

import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.nonEmpty) {

  val lines = Source.fromFile(args(0), "UTF-8").getLines().toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLine)
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length +" | "+ line)
  }

} else
  Console.err.println("Please enter filename")