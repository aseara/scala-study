package com.aseara.scala.ch4

/**
  * Created with IntelliJ IDEA.
  * User: 境德
  * Date: 2015/7/11
  * Time: 17:56
  * Listing 4.2 · Companion object for class ChecksumAccumulator.
  *
  * Tip1: You must define both the class and its companion object in the same source file.
  * Tip2: A class and its companion object can access each other’s private members.
  *
  */
class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

import scala.collection.{mutable => m}

object ChecksumAccumulator {

  private val cache = m.Map[String, Int]()

  def calculate(s : String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.sum += c.toByte
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}