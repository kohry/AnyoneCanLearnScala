package test

object Ex_5_6 {
  def main(args: Array[String]): Unit = {
    val g = f
    println(f(1))
  }

  def f = (i: Int) => i + 1
}
