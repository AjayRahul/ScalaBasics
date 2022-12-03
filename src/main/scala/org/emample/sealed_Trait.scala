package org.emample

object sealed_Trait extends App {

  case class StateName(name: String)

  sealed trait India

  case class Tamil_Nadu(stateName: StateName, Lang: String) extends India
  case class Kerala(stateName: StateName, Lang: String) extends India
  case class Punjab(stateName: StateName, Lang: String) extends India
  case class Bengal(stateName: StateName, Lang: String) extends India

  val tn = Tamil_Nadu(StateName("Tamil Nadu"), "Tamil")
  val kl = Tamil_Nadu(StateName("Kerala"), "Malayalam")
  val pb = Tamil_Nadu(StateName("Punjab"), "Punjabi")
  val bl = Tamil_Nadu(StateName("Bengal"), "Bengali")

  print(tn, kl, pb, bl)

}
