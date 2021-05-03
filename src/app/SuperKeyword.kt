package app

import data.Rectangle

fun main() {
  val rectangle = Rectangle()
  println("Corner ${rectangle.corner}")
  println("Pareng corner ${rectangle.parentCorner}")

  rectangle.printName()
}