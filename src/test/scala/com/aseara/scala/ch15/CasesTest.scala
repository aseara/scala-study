package com.aseara.scala.ch15

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/17
 * Time: 13:35
 */
object CasesTest extends App {

  val v = Var("x")

  val op = BinOp("+", Number(1), v)

  println(v.name)
  println(op.left)

}
