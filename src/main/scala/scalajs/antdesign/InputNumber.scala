package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

// Currently missing styles property, need to figure this out

/**
  * @see https://ant.design/components/input-number/#API
  * @param min Specifies the minimum value
  * @param max Specifies the maximum value
  * @param step The number to which the current value is increased or decreased. It can be an integer or decimal.
  * @param disabled Specifies that an InputNumber should be disabled
  * @param value Specifies the value of an InputNumber
  * @param defaultValue Specifies the defaultValue of an InputNumber
  * @param onChange Called when value of an InputNumber changed
  */
case class InputNumber(min: js.UndefOr[Int] = js.undefined,
                       max: js.UndefOr[Int] = js.undefined,
                       value: js.UndefOr[Int] = js.undefined,
                       step: js.UndefOr[Int | String] = js.undefined,
                       defaultValue: js.UndefOr[Int] = js.undefined,
                       onChange: js.UndefOr[Unit => CallbackTo[Unit]] = js.undefined,
                       disabled: js.UndefOr[Boolean] = js.undefined,
                       size: js.UndefOr[Size] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    min.foreach { x =>
      p.updateDynamic("min")(x)
    }
    max.foreach { x =>
      p.updateDynamic("max")(x)
    }
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    step.foreach { x =>
      p.updateDynamic("step")(x.asInstanceOf[js.Any])
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        () => x().runNow()
      )
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    size.foreach { x =>
      p.updateDynamic("size")(x.id)
    }
    p
  }

  def apply(): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.InputNumber)
    f(toJS).asInstanceOf[ReactComponentU_]
  }
}
