package com.aseara.scala.ch14

import org.scalatest._
import com.aseara.scala.ch10.Element.elem

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/17
 * Time: 10:38
 */
class ElementSuite extends FunSuite{

  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width === 2)
    assertResult(2) {
      ele.width
    }
    intercept[IllegalArgumentException]{
      elem('x', -2, 3)
    }
  }

}
