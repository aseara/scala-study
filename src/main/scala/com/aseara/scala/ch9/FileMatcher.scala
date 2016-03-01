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

  def filesEnding(query: String) =
    for (file <- filesHere if file.getName.endsWith(query))
      yield file

  def filesContaining(query: String) =
    for (file <- filesHere if file.getName.contains(query))
      yield file

  def filesRegex(query: String) =
    for (file <- filesHere if file.getName.matches(query))
      yield file
}
