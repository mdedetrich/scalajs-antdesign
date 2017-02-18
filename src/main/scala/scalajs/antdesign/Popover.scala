package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/popover/#API
  * @note Please ensure that the child node of [[Popover]] accepts onMouseEnter, onMouseLeave, onFocus, onClick event.
  * @param title title of the card
  * @param content content of the card
  */
case class Popover(title: js.UndefOr[String | ReactNode] = js.undefined,
                   content: js.UndefOr[String | ReactNode] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    title.foreach { x =>
      p.updateDynamic("title")(x.asInstanceOf[js.Any])
    }
    content.foreach { x =>
      p.updateDynamic("content")(x.asInstanceOf[js.Any])
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Popover)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
