package cn.edu.ahut.demo

import scala.io.StdIn

/**
 * <p>projectName: test</p>
 * <p>packageName: cn.edu.ahut.demo</p>
 * <p>className: JavaDemo</p>
 * <p>date: 3/25/2024</p>
 *
 * @author qinjiawei(alan)
 * @since JDK8.0
 * @version 1.0.0
 */

object ScalaDemo {
  def main(args: Array[String]): Unit = {
    println("jack")

    while (true) {
      val score: Int = StdIn.readInt()
      if (score == 10) {
        println("垃圾")
      } else if (score == 20) {
        println("依然垃圾")
      } else if (score == 50) {
        println("还是垃圾")
      } else if (score == 60) {
        println("终于及格了")
      } else {
        println("还不错")
      }
    }
  }
}
