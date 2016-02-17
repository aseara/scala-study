/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/11
 * Time: 17:06
 */

import scala.io.Source

if (args.nonEmpty) {
  for (line <- Source.fromFile(args(0)).getLines())
    println(line.length + " " + line)
} else
  Console.err.println("Please enter filename")