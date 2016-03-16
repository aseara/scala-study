package com.aseara.scala.ch19

/**
  * Created by 邱境德 on 2016/3/16.
  */
trait Function1[-S, +T] {
  def apply(x: S): T
}
