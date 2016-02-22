/**
  * Created by 邱境德 on 2016/2/22.
  * Listing 3.10 Reading lines from a file.
  */
import scala.io.Source

if (args.length > 0)
  for (line <- Source.fromFile(args(0), "UTF-8").getLines())
    println(line.length +" "+ line)
else
  Console.err.println("Please enter filename")
