object fizzBuzz extends App {
  import scala.io.StdIn.readLine

  val start = 1.toInt//readLine().toLong
  val end = 30.toInt//readLine().toLong

  def fizzbuzz(i: Int): String = {
    (i % 3, i % 5) match {
      case (0, 0) => "FizzBuzz"
      case (0, _) => "Fizz"
      case (_, 0) => "Buzz"
      case _ => i.toString
    }
  }
  (start to end).map(i => println(fizzbuzz(i)))
}
