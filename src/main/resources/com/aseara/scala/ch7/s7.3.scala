/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.3 · Reading from the standard input with dowhile.
  */
import scala.io.StdIn.readLine

var line = ""
do {
  line = readLine()
  println("Read: "+ line)
} while (line != "")