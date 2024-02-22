
object Main extends App {

    val M = 1000
    val N = 10000000
    val arr = Array.fill[Long](N)(1)

    var sum = 0L
    val s2 = System.nanoTime()
    (0 until M).foreach { _ =>
      var i = 0
      while (i < N) {
        sum += arr(i)
        i += 1
      }
    }

    println(s"time ${(System.nanoTime() - s2) / 1000000} ms")
    println(sum)
}
