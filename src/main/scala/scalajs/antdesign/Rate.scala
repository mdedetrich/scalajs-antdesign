package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/rate/#API
  * @param count star count
  * @param value current value
  * @param defaultValue default value
  * @param onChange callback
  * @param allowHalf whether to allow semi selection
  * @param disabled read only, unable to interact
  */
case class Rate(count: js.UndefOr[Double] = js.undefined,
                value: js.UndefOr[Double] = js.undefined,
                defaultValue: js.UndefOr[Double] = js.undefined,
                onChange: js.UndefOr[Double => CallbackTo[Unit]] = js.undefined,
                allowHalf: js.UndefOr[Boolean] = js.undefined,
                disabled: js.UndefOr[Boolean] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    count.foreach { x =>
      p.updateDynamic("count")(x)
    }
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Double) => x(v1).runNow()
      )
    }
    allowHalf.foreach { x =>
      p.updateDynamic("allowHalf")(x)
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Rate)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
