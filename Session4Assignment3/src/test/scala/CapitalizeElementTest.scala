package com.knoldus
import org.scalatest.funsuite.AnyFunSuite

class CapitalizeElementTest extends AnyFunSuite {
  val listObject = new CapitalizeElement

  test("To test for list with elements") {
    val list = List("My", "name", "is", "Michael", "Scott")
    val result = List("My", "nAme", "is", "MichAel", "Scott")
    assert(listObject.capitalizeLetterA(list) === result)
  }

  test("To test for list with empty elements") {
    val list = List.empty[String]
    val result = List("List is empty")
    assert(listObject.capitalizeLetterA(list) === result)
  }
}
