package org.emample

object case_class_with_trait extends App {

  sealed trait Shape

  case class Rectangle(length: Int, breath: Int) extends Shape
  case class Circle(side: Int) extends Shape

  def area(shape: Shape): Int = {
    shape match {
      case rectangle: Rectangle => rectangle.length * rectangle.breath
      case circle: Circle => circle.side * 4
    }
  }

  println("Area of Rectangle is " + area(Rectangle(4,8)))
  println("Area of Circle is " + area(Circle(8)))


  // ---------------------------------------------------------------------------------------------------------------------------------
  // Alternate use of case class with sealed trait

/*
  def area(shape: Shape): Int = {
    shape match {
      case Rectangle(l, b) => l * b
      case Circle(x) => x * 4
    }
  }

  println("Area of Rectangle is " + area(Rectangle(2, 4)))
  println("Area of Circle is " + area(Circle(6)))

  // Output:
  // Area of Rectangle is 8
  // Area of Circle is 24 */
}