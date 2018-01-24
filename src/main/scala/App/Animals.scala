package App

object Animals  extends App {

  val Persian: Cat = new Persian()
  val Wolf : Dog = new Wolf()
  val Boarder : Boarder = new Boarder()
  val Meowth : Cat = new Meowth(100, true)
  val Jess : Animal = new Cat()
  val Lassie : Animal = new Dog()

  println(Persian.speak)
  println(Wolf.speak)
  println(Meowth.speak)
  println(Boarder.speak)


}

abstract class Animal{
  def speak : String

}

class Cat() extends Animal {
  override def speak: String = "Meow!"
}

class Dog() extends Animal{
  override def speak: String = "Meow"
}

class Persian() extends Cat {
  override def speak: String = "Meow!"
}
class Wolf() extends Dog {
    override def speak: String = "Howl!"
}

class Meowth(coins: Int, teamrocket: Boolean) extends Cat{
  override def speak: String = {
    val message = s"That's Right!, I have $coins coins "
    if (teamrocket) {
      s"$message I am in team rocket"
    }
    else{
      s"$message I am not in team rocket"
    }
  }
}

class Boarder() extends Dog{
  override def speak: String = "Woof! " + hunt
  private val hunt : String = "I hunt rats"
}
