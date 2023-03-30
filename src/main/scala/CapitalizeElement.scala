package com.knoldus

import scala.util.{Try, Success, Failure}

class CapitalizeElement {
  def capitalizeLetterA(inputList: List[String]): List[String] = {
    // used Try to catch any exception
    Try {
      if (inputList.isEmpty) throw new IllegalArgumentException("List is empty")
      else inputList.map(elements => elements.map(element => if (element == 'a') element.toUpper else element))
    } match {
      // return the resultant list if there are no exceptions
      case Success(resultantList) => resultantList
      // return the error message if error occurred
      case Failure(exception) => List(exception.getMessage)
    }
  }
}