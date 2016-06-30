package test

object Ex_4_9 {
  def main(args: Array[String]): Unit = {
    val robot = new SuperMazinga
    println(robot.shoot)
  }
}

class SuperMazinga extends Robot with M16 with Bazooka with Daepodong

abstract class AnotherRobot {
  def shoot = "뿅뿅"
}

trait AnotherM16 extends AnotherRobot {
  override def shoot = super.shoot + "빵야"
}

trait AnotherBazooka extends AnotherRobot {
  override def shoot = super.shoot + "뿌왕뿌왕"
}

trait AnotherDaepodong extends AnotherRobot {
  override def shoot = super.shoot + "콰르르르릉"
}
