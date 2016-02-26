import java.io.File

import scala.io.Source

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.8 · Using multiple generators in a for expression.
  */
val filesHere = new File(".").listFiles()
def fileLines(file: File) =
  Source.fromFile(file).getLines().toList

def grep(pattern: String) =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file +": "+ line.trim)
grep(".*gcd.*")