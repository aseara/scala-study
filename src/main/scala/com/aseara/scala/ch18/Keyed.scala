package com.aseara.scala.ch18

/**
  * Created by 邱境德 on 2016/3/11.
  */
class Keyed {
  // assume this will take some time and the results between invokes are equal
  def computeKey: Int = 30
}

class MemoKeyed extends Keyed {
  private var keyCache: Option[Int] = None

  override def computeKey: Int = {
    if (!keyCache.isDefined) keyCache = Some(super.computeKey)
    keyCache.get
  }
}
