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

  println(op)
  assert(op.left == Var("x"))

  val copy = op.copy(operator = "-")
  op.copy(right = Var("+"))

  def test(expr: Expr) = expr match {
    case BinOp(op, left, right) =>
      println(expr + " is a binary operation")
    case _ =>
  }

  def test2(expr: Expr) = expr match {
    case BinOp(_, _, _) =>
      println(expr + " is a binary operation")
    case _ =>
  }

  def test3(expr: Any) = expr match {
    case List(0, _, _) => println("found it")
    case _ =>
  }

  def test4(expr: Any) = expr match {
    case List(0, _*) => println("found it")
    case _ =>
  }

  def tupleDemo(expr: Any) =
    expr match {
      case (a, b, c) => println("matched" + a + b + c)
      case _ =>
    }

}
