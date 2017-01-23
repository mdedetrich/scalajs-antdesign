package scalajs.antdesign

sealed abstract class SortOrder(val id: String)

object SortOrder {
  case object Ascend  extends SortOrder("ascend")
  case object Descend extends SortOrder("descend")
}
