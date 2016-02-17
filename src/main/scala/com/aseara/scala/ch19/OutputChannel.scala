package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/28
 * Time: 13:38
 */
trait OutputChannel[-T] {

  def write(x: T)

}
