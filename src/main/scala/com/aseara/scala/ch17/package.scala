package com.aseara.scala

import scala.collection.{mutable => m}

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/22
 * Time: 16:26
 */
package object ch17 {

  def countWords(text: String) = {
    val counts = m.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount =
        if (counts.contains(word)) counts(word)
        else 0

      counts += (word -> (oldCount + 1))
    }
    counts
  }

  def longestWord(words: Array[String]) = {
    var word = words(0)
    var idx = 0
    for (i <- 1 until words.length)
      if (words(i).length > word.length) {
        word = words(i)
        idx = i
      }
    (word, idx)
  }

}
