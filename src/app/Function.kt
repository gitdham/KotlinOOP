package app

import data.Person

fun main() {
  val jet = Person()
  jet.firstName = "Idham"
  jet.middleName = "Nur"
  jet.lastName = "Adzani"

  jet.sayHello("Budi")
  jet.run()

  val fullName = jet.getFullName()
  println(fullName)
}