package org.raml.validation

object ValidationLogger {

  var history = List[String]()

  def log(last: String) {
    history = last :: history
  }
}
