package App

import scala.io.StdIn
object	Prompt {
  def ask(message: String) = StdIn.readLine(message)
}
class Person(name : String, age : Int){

  def speak() : String = {
    if (name == "Shannon") {
      "You dont get a hello."
    } else {
      s"Hello $name, you are $age years old. "
    }
  }
}
object Promt {
  def ask(message : String) : String = StdIn.readLine(message)
}
object GreetingApplication extends App {
  val name = Promt.ask("What is your name?")
  val age = Promt.ask("How old are you? ")
  val person = new Person(name, age.toInt)
  println(person.speak())
}
