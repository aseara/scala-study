package com.aseara.scala.ch14

import org.junit.Assert._
import org.junit.Test

import com.aseara.scala.ch10.Element.elem

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/17
 * Time: 11:11
 */
class ElementTest {

  @Test
  def uniformElementTest(): Unit = {
    val ele = elem('x', 2, 3)
    assertEquals(2, ele.width)
    assertEquals(3, ele.height)

    try {
      elem('x', -2, 3)
      fail()
    } catch {
      case e: IllegalArgumentException => // expected
    }

    import org.scalacheck.Prop._

    forAll { (l1: List[Int], l2: List[Int]) =>
      l1.size + l2.size == (l1 ::: l2).size
    }

  }

}
