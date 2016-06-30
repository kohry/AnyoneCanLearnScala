package test

object Ex_9_7 {
  object Companion {
    private def ma = {}
    def mb = {}
  }

  class Companion {
    val a = Companion.ma  // 컴파일 에러
    val b = Companion.mb  // 정상
  }
  
  def main(args: Array[String]): Unit = {
    println(Companion.mb)
  }
}