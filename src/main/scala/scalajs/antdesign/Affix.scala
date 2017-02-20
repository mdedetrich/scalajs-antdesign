package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/affix/
  * @note Children of [[Affix]] can not be position: absolute, but you can set [[Affix]] as position: absolute:
  * @param offsetTop Pixels to offset from top when calculating position of scroll
  * @param offsetBottom Pixels to offset from bottom when calculating position of scroll
  * @param onChange Callback when affix state is changed
  */
case class Affix(offsetTop: js.UndefOr[Int] = js.undefined,
                 offsetBottom: js.UndefOr[Int] = js.undefined,
                 onChange: js.UndefOr[Boolean => CallbackTo[Unit]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    offsetTop.foreach { x =>
      p.updateDynamic("offsetTop")(x)
    }
    offsetBottom.foreach { x =>
      p.updateDynamic("offsetBottom")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Boolean) => x(v1).runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Affix)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
