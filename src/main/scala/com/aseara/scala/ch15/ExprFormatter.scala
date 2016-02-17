package com.aseara.scala.ch15

import com.aseara.scala.ch10.Element
import com.aseara.scala.ch10.Element.elm

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/17
 * Time: 16:51
 */
class ExprFormatter {

  // Contains operators in groups of increasing precedence
  private val opGroups =
    Array(
      Set("|", "||"),
      Set("&", "&&"),
      Set("^"),
      Set("==", "!="),
      Set("<", "<=", ">", ">="),
      Set("+", "-"),
      Set("*", "%")
    )

  // A mapping from operators to their precedence
  private val precedence = {
    val assocs =
      for {
        i <- opGroups.indices
        op <- opGroups(i)
      } yield op -> i

    assocs.toMap
  }

  private val unaryPrecedence = opGroups.length
  private val fractionalPrecedence = -1

  private def format(e: Expr, enclPrec: Int): Element =
    e match {
      case Var(name) =>
        elm(name)
      case Number(num) =>
        def stripDot(s: String) =
          if (s endsWith ".0") s.substring(0, s.length - 2)
          else s
        elm(stripDot(num.toString))

      case UnOp(op, arg) =>
        elm(op) beside format(arg, unaryPrecedence)

      case BinOp("/", left, right) =>
        val top = format(left, fractionalPrecedence)
        val bot = format(right, fractionalPrecedence)
        val line = elm('_', top.width max bot.width, 1)
        val frac = top above line above bot
        if (enclPrec != fractionalPrecedence) frac
        else elm(" ") beside frac beside elm(" ")

      case BinOp(op, left, right) =>
        val opPrec = precedence(op)
        val l = format(left, opPrec)
        val r = format(right, opPrec + 1)
        val oper = l beside elm(" " + op + " ") beside r
        if (enclPrec <= opPrec) oper
        else elm("(") beside oper beside elm(")")
    }

    def format(e: Expr): Element = format(e, 0)
}
