package org.emample

object case_classes extends App{

  // note: case classes are immutable

  case class Rectangle(width: Int, height: Int) {
    val area = width * height
  }

  val ansRectangle = Rectangle(3, 7)
  print("area of small rectangle is", ansRectangle.area)
  // (area of small rectangle is,21)

  val largeRectangle = ansRectangle.copy(width = (ansRectangle.width * 4), height = (ansRectangle.height*8))
  print("area of large rectangle is", largeRectangle.area)
  // (area of small rectangle is,672)

  case class Square(side: Int){
    val area = 4 * side
  }

  val ansSquare = Square(3)
  print("area of small rectangle is", ansSquare.area)
  // (area of small rectangle is,12)

}
