package com.aseara.scala.ch18

import com.aseara.scala.ch18.circuit.CircuitSimulation

/**
 * Created with IntelliJ IDEA.
 * User: 境德
 * Date: 2015/7/24
 * Time: 14:45
 */
object MySimulation extends CircuitSimulation{
  override def InverterDelay = 1
  override def AndGateDelay = 3
  override def OrGateDelay = 5

  def main (args: Array[String]) {

    val input1, input2, sum, carry = new Wire
    probe("sum", sum)
    probe("carry", carry)

    halfAdder(input1, input2, sum, carry)

    input1 setSignal true
    run()

    input2 setSignal true
    run()

  }

}
