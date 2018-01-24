package App

object Animals  extends App {

  val Jess : Animal = new Cat()
  val Lassie : Animal = new Dog()

  println(Jess.speak)
  println(Lassie.speak)

}

abstract class Animal{
  def speak : String

}

class Cat() extends Animal {
  override def speak: String = "Meow!"
}

class Dog() extends Animal{
  override def speak: String = "Woof!"
}
