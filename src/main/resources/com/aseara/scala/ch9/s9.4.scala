import java.io.{PrintWriter, File}
import java.util.Date

/**
  * Created by 邱境德 on 2016/3/1.
  * Listing 9.4 · Using the loan pattern to write to a file.
  */

def withPrintWriter(file: File)(op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close()
  }
}

val file = new File("data.txt")
withPrintWriter(file) {
  writer => writer.println(new Date)
}