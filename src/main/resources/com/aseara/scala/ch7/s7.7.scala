import java.io.File

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.7 · Using multiple filters in a for expression.
  */
val filesHere = new File(".").listFiles
for (
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println(file)