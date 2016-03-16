package com.aseara.scala.ch19

/**
  * Created by 邱境德 on 2016/3/16.
  */
trait OutputChannel[-T] {

  def write(x: T)

}
