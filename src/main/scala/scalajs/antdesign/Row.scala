package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/grid/#Row
  * @param gutter grid spacing
  * @param `type` layout mode, the optional flex, effective modern browser
  * @param align the vertical alignment of the layout of flex: [[scalajs.antdesign.Row.Align.Top]] [[scalajs.antdesign.Row.Align.Middle]] [[scalajs.antdesign.Row.Align.Bottom]]
  * @param justify horizontal arrangement of the layout of flex: [[scalajs.antdesign.Row.Justify.Start]] [[scalajs.antdesign.Row.Justify.End]] [[scalajs.antdesign.Row.Justify.Center]] [[scalajs.antdesign.Row.Justify.SpaceAround]] [[scalajs.antdesign.Row.Justify.SpaceBetween]]
  */
case class Row(gutter: js.UndefOr[Double] = js.undefined,
               `type`: js.UndefOr[Row.Type] = js.undefined,
               align: js.UndefOr[Row.Align] = js.undefined,
               justify: js.UndefOr[Row.Justify] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    gutter.foreach { x =>
      p.updateDynamic("gutter")(x)
    }
    `type`.foreach { x =>
      p.updateDynamic("type")(x.id)
    }
    `align`.foreach { x =>
      p.updateDynamic("align")(x.id)
    }
    `justify`.foreach { x =>
      p.updateDynamic("justify")(x.id)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Row)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Row {
  sealed abstract class Type(val id: String)

  object Type {
    case object Flex extends Type("flex")
  }

  sealed abstract class Align(val id: String)

  object Align {
    case object Top    extends Align("top")
    case object Middle extends Align("middle")
    case object Bottom extends Align("bottom")
  }

  sealed abstract class Justify(val id: String)

  object Justify {
    case object Start        extends Justify("start")
    case object End          extends Justify("end")
    case object Center       extends Justify("center")
    case object SpaceAround  extends Justify("space-around")
    case object SpaceBetween extends Justify("space-between")
  }
}
