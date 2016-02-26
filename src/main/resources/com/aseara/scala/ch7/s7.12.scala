import java.io.FileReader

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.12 · A try-finally clause in Scala.
  */
val file = new FileReader("input.txt")

try {
  // Use the file
} finally {
  file.close() // Be sure to close the file
}
