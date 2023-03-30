package com.knoldus

object Driver extends App {
  val inputList = List("My", "name", "is", "Michael", "Scott")
  private val capitalizeElementObject = new CapitalizeElement
  println(capitalizeElementObject.capitalizeLetterA(inputList))
}