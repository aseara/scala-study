import java.net.{MalformedURLException, URL}

/**
  * Created by 邱境德 on 2016/2/26.
  * Listing 7.13 · A catch clause that yields a value.
  */

def urlFor(path: String) =
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }