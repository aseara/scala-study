package com.aseara.scala.ch9

import java.io.File

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/13
 * Time: 14:50
 */
object FileMatcher {

  private def filesHere = new File(".").listFiles

  def fileMatching(query: String,
                   matcher: (String, String) => Boolean) =
    for (file <- filesHere if matcher(file.getName, query))
      yield file

  def filesEnding(query: String) =
    fileMatching(query, _.endsWith(_))

  def filesContaining(query: String) =
    fileMatching(query, _.contains(_))

  def filesRegex(query: String) =
    fileMatching(query, _.matches(_))
}
