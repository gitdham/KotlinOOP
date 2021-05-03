package app

import data.Manager
import data.VicePresident

fun main() {
  val manager = Manager("Jet")
  manager.sayHello("Budi")

  val vicePresident = VicePresident("Budi")
  vicePresident.sayHello("Joko")
}