package com.aseara.scala.ch14

import org.scalatest.WordSpec
import org.scalatest.prop.Checkers
import org.scalacheck.Prop._
import com.aseara.scala.ch10.Element.elem

/**
  * Created by 邱境德 on 2016/3/8.
  */
class ElementSpec extends WordSpec with Checkers{

  "elem result" must {
    "have passed width" in {
      (w: Int) => {
        w > 0 ==> (elem('x', w, 3).width == w)
      }
    }
  }

}
