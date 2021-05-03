package app

import data.Person

fun main() {
  val jet = Person()
  jet.firstName = "Adzani"

  jet.sayHello("Budi")
  jet.sayHello("Budi", "Sudarsono")
}