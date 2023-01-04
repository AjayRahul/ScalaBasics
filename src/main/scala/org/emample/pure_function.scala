package org.emample

object pure_function extends App{

  case class Book(name: String, score: Double)

  val bookList = List(
    Book("book_one", 3.7),
    Book("book_2", 4.1),
    Book("bookThree", 4.4),
    Book("4th_book", 2.9),
    Book("5_th_book", 3.21),
  )

  def printBook(b: Book): Unit = {
    println(s"Our recommondation is '${b.name}' and the score of this book is '${b.score}'")
  }

  def compareBook(b1: Book, b2: Book): Book = {
    if(b1.score > b2.score)
      b1
    else
      b2
  }

  printBook(bookList reduceLeft(compareBook))

}
