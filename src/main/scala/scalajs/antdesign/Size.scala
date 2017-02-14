package scalajs.antdesign

sealed abstract class Size(val id: String)

object Size {
  case object Small   extends Size("small")
  case object Default extends Size("default")
  case object Large   extends Size("large")
}
