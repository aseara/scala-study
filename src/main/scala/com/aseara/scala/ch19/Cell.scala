package com.aseara.scala.ch19

/**
  * Created by 邱境德 on 2016/3/15.
  */
class Cell[T] (init: T) {

  private[this] var current = init
  def get = current
  def set(x: T) { current = x }

}
