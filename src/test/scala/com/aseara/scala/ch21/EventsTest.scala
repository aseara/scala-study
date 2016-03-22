package com.aseara.scala.ch21

import java.awt.event.{ActionEvent, ActionListener}
import javax.swing.JButton

/**
  * Created by 邱境德 on 2016/3/18.
  */
object EventsTest extends App {

  val button = new JButton
  button.addActionListener(
    (_: ActionEvent) => println("pressed!")
  )



  implicit def function2ActionListener(f: ActionEvent => Unit): ActionListener =
    new ActionListener {
      override def actionPerformed(event: ActionEvent) {
        f(event)
      }
    }

}
