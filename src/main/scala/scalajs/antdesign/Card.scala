package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/card/#API
  * @param title Card title
  * @param extra Content to render in the top-right corner of the card
  * @param bordered Toggles rendering of the border around the card
  * @param bodyStyle Inline style to apply to the card content
  */
case class Card(title: js.UndefOr[String | ReactNode] = js.undefined,
                extra: js.UndefOr[String | ReactNode] = js.undefined,
                bordered: js.UndefOr[Boolean] = js.undefined,
                bodyStyle: js.UndefOr[js.Dictionary[js.Any]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    title.foreach { x =>
      p.updateDynamic("title")(x.asInstanceOf[js.Any])
    }
    extra.foreach { x =>
      p.updateDynamic("extra")(x.asInstanceOf[js.Any])
    }
    bordered.foreach { x =>
      p.updateDynamic("bordered")(x)
    }
    bodyStyle.foreach { x =>
      p.updateDynamic("bodyStyle")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Card)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
