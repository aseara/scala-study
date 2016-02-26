import java.io.{InputStreamReader, BufferedReader}

import scala.util.control.Breaks._

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.17 · A recursive alternative to looping with vars.
  */

def searchFrom(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)

val i = searchFrom(0)


val in = new BufferedReader(new InputStreamReader(System.in))
breakable {
  while (true) {
    println("? ")
    if (in.readLine() == "") break
  }
}