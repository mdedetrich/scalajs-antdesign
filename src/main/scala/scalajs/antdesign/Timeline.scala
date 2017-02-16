package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js.{Dynamic, Object, |}
import scala.scalajs.js

/**
  * @see https://ant.design/components/timeline/#Timeline
  * @param pending to set the last ghost node's existence or its content
  */
case class Timeline(pending: js.UndefOr[Boolean | String | ReactNode] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    pending.foreach { x =>
      p.updateDynamic("pending")(x.asInstanceOf[js.Any])
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Timeline)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Timeline {

  /**
    * @see https://ant.design/components/timeline/#Timeline.Item
    * @param color to set the circle's color to blue, red, green or other custom colors
    * @param dot custom timeline dot
    */
  case class Item(color: js.UndefOr[String] = js.undefined, dot: js.UndefOr[String | ReactNode] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      color.foreach { x =>
        p.updateDynamic("color")(x)
      }
      dot.foreach { x =>
        p.updateDynamic("dot")(x.asInstanceOf[js.Any])
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Timeline.Item)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }
}
