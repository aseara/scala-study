package com.aseara.scala

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/17
 * Time: 13:44
 */
package object ch15 {

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e))  => e     // Double negation
    case BinOp("+", e, Number(0)) => e     // Adding zero
    case BinOp("*", e, Number(1)) => e     // Multiplying by one
    case _ => expr
  }

  def simplifyAll(expr: Expr): Expr = expr match {

    case UnOp("-", UnOp("-", e)) =>
      simplifyAll(e)
    case BinOp("+", e, Number(0)) =>
      simplifyAll(e)
    case BinOp("*", e, Number(1)) =>
      simplifyAll(e)
    case UnOp("abs", e @ UnOp("abs", _)) =>
      simplifyAll(e)
    case UnOp(op, e) =>
      UnOp(op, simplifyAll(e))
    case BinOp(op, l, r) =>
      BinOp(op, simplifyAll(l), simplifyAll(r))
    case _ => expr
  }

}
