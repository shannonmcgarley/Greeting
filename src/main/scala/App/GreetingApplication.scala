package App

import scala.io.StdIn

object GreetingApplication extends App {
  def greet(name: String) : Unit = println("hello " + name)
val name = StdIn.readLine("What is you name? ")
greet(name)
}
