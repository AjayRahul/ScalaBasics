package org.emample

object impure_function extends App{

  case class Book(name: String, score: Double)

  val b1 = Book("book_one", 3.7)
  val b2 = Book("book_2", 4.1)

  def printBook(b: Book): Unit = {
    println(s"Our recommondation is '${b.name}' and the score of this book is '${b.score}'")
  }

  def compareBook(b1: Book, b2: Book): Unit = {
    if(b1.score > b2.score)
      printBook(b1)
    else
      printBook(b2)
  }

  println(compareBook(b1, b2))


  import java.util.Calendar
  val calender = Calendar.getInstance()
  val current_time = calender.get(Calendar.HOUR_OF_DAY)+ ":" +calender.get(Calendar.MINUTE)
  print(current_time)

  /*
    11:27
    Above is the Last worked time
  */


}
