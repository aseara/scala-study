package com.aseara.scala.ch19

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/28
 * Time: 10:19
 */
abstract class Cat[-T, +U] {

  def meow[W](volume: T, listener: Cat[U, T])
    : Cat[Cat[U, T], U]

}
