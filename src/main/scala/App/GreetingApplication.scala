package App

import scala.io.StdIn

object GreetingApplication extends App {
  def greet(name: String) : Unit = {
  if (name == "Shannon") {
    println("You don't get a hello. ")
  } else  {
    println("Hello " + name)
  }
  }
  val name = StdIn.readLine("What is your name?")
  greet(name)
}
