package app

import data.Person

fun main() {
  val adzani = Person()
  adzani.firstName = "Idham"

  val joko = Person()
  joko.firstName = "Eko"

  val budi = Person()
  budi.firstName = "Budi"

  println(adzani.firstName)
  println(joko.firstName)
  println(budi.firstName)
}