package com.aseara.scala

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/29
 * Time: 16:18
 */
package object ch20 {

  def using[T <: { def close(): Unit }, S](obj: T)
      (operation: T => S) = {
    val result = operation(obj)
    obj.close()
    result
  }

}
