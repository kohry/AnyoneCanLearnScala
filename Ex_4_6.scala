package test

object Ex_4_6 {
  def main(args: Array[String]): Unit = {
    val pig = new Animal2
    pig.eat
  }

  class Animal2 extends Eating {
    def eat = println("먹습니다. 쩝쩝~")
  }

  trait Swimming {
    def swim = println("수영을 합니다. 촤아~")
  }

  trait Flying {
    def fly = println("납니다. 휘리릭~")
  }

  trait Running {
    def run = println("달립니다. 슈웅~")
  }

  trait Eating {
    def eat
   }
}
