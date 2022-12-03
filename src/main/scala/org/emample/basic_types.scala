package org.emample

object basic_types extends App {

  // repeat a value n times
  val n1 = "A" * 3
  print(n1, " ", "b"*2)
  // Output: (AAA, ,bb)

  // boolean
  print(1 > 0)
  // Output: (): scala.Unit

  true.&&(true)
  // Output: true: scala.Boolean

  true && false
  // Output: false: scala.Boolean

  "true" concat "false"
  // Output: truefalse: java.lang.String

  "trueee".length
  // Output: 6: scala.Int

}
