package App

import scala.io.StdIn


class Person(name : String){

  def speak() : String = {
    if (name == "Shannon") {
      "You dont get a hello."
    } else {
      "Hello " + name
    }
  }
}
object Promt {
  def ask(message : String) : String = StdIn.readLine(message)
}
object GreetingApplication extends App {
  val name = Promt.ask("What is your name?")
  val p = new Person(name)
  println(p.speak())
}
