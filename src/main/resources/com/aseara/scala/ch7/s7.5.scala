import java.io.File

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.5 · Listing files in a directory with a for expression.
  */

var filesHere = new File(".").listFiles()
for (file <- filesHere)
  println(file)
