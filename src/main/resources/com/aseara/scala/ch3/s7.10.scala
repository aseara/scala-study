import java.io.File

import scala.io.Source

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.10 · Transforming an Array[File] to Array[Int] with a for.
  */

val filesHere = new File(".").listFiles()
def fileLines(file: File) =
  Source.fromFile(file).getLines().toList

val forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length