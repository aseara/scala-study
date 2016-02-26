import java.io.{IOException, FileNotFoundException, FileReader}

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.11 · A try-catch clause in Scala.
  */

try {
  val f = new FileReader("input.txt")
  // Use and close file
} catch {
  case ex: FileNotFoundException => // Handle missing file
  case ex: IOException => // Handle other I/O error
}
