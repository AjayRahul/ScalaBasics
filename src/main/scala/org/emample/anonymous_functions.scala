package org.emample

object anonymous_functions extends App{

  //Takes no parameters and returns a print statement
  val myfunc1 = () => {"Takes no paramters..."}
  println(myfunc1)
  //Output
  //Takes no paramters...

  //Anonymous functions takes two wildcard paramter of String DataType
  val myfunc2 = (_:String) + (_:String)
  println(myfunc2("Hey, ", "... It is working!"))
  //Output
  //Hey, ... It is working!

  //An anonymous function takes two String parameters
  val myfunc3 = (str1: String, str2: String) => str1 + str2
  println(myfunc3("Method", "Three"))
  //Output
  //MethodThree

  //A function takes a parameter of an anonmous function and returns String
  def myFunc4(func:(Int, String) => String): String = {
    func(4, "Th function")
  }
  val myfunc4 = myFunc4((n:Int, s:String) => n+s)
  println(myfunc4)
  //output
  //4Th function

}
