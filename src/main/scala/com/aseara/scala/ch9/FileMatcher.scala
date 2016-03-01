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

  private def fileMatching(matcher: String => Boolean) =
    for (file <- filesHere if matcher(file.getName))
      yield file

  def filesEnding(query: String) =
    fileMatching(_.endsWith(query))

  def filesContaining(query: String) =
    fileMatching(_.contains(query))

  def filesRegex(query: String) =
    fileMatching(_.matches(query))
}
