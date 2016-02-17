package com.aseara.scala.ch18

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/23
 * Time: 10:59
 */
class Keyed {
  def computeKey: Int = 1
}

class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None
  override def computeKey: Int = {
    if (keyCache.isEmpty) keyCache = Some(super.computeKey)
    keyCache.get
  }
}
