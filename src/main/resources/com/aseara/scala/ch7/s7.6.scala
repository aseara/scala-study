import java.io.File

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.6 · Finding .scala files using a for with a filter.
  */

val filesHere = new File(".").listFiles()
for (file <- filesHere if file.getName.endsWith(".scala"))
  println(file)