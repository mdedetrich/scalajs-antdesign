package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.|

// Currently missing styles property, need to figure this out

/**
  * https://github.com/react-component/input-number/tree/master
  * @param min Specifies the minimum value
  * @param onClick
  * @param placeholder
  * @param max Specifies the maximum value
  * @param step Specifies the legal number intervals
  * @param disabled Specifies that an InputNumber should be disabled
  * @param focusOnUpDown whether focus input when click up or down button
  * @param autoFocus Specifies that an InputNumber should automatically get focus when the page loads
  * @param readOnly 	Specifies that an InputNumber is read only
  * @param name Specifies the name of an InputNumber(`web only`)
  * @param value Specifies the value of an InputNumber
  * @param defaultValue Specifies the defaultValue of an InputNumber
  * @param onChange Called when value of an InputNumber changed
  * @param style root style. such as {width:100}
  * @param upStyle up step wrap style. react native only
  * @param downStyle down step style. react native only
  * @param inputStyle input style. react native only
  */
case class InputNumber(min: js.UndefOr[Int] = js.undefined,
                       onClick: js.UndefOr[() => CallbackTo[Unit]] = js.undefined,
                       placeholder: js.UndefOr[String] = js.undefined,
                       max: js.UndefOr[Int] = js.undefined,
                       step: js.UndefOr[Int | String] = js.undefined,
                       disabled: js.UndefOr[Boolean] = js.undefined,
                       focusOnUpDown: js.UndefOr[Boolean] = js.undefined,
                       autoFocus: js.UndefOr[Boolean] = js.undefined,
                       readOnly: js.UndefOr[Boolean] = js.undefined,
                       name: js.UndefOr[String] = js.undefined,
                       value: js.UndefOr[Int] = js.undefined,
                       defaultValue: js.UndefOr[Int] = js.undefined,
                       onChange: js.UndefOr[Unit => CallbackTo[Unit]] = js.undefined,
                       style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                       upStyle: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                       downStyle: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                       inputStyle: js.UndefOr[js.Dictionary[js.Any]] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    min.foreach { x =>
      p.updateDynamic("min")(x)
    }
    onClick.foreach { x =>
      p.updateDynamic("click")(
        () => x().runNow()
      )
    }
    placeholder.foreach { x =>
      p.updateDynamic("placeholder")(x)
    }
    max.foreach { x =>
      p.updateDynamic("max")(x)
    }
    step.foreach { x =>
      p.updateDynamic("step")((x: Any) match {
        case i: Int    => i
        case s: String => s
      })
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    focusOnUpDown.foreach { x =>
      p.updateDynamic("focusOnUpDown")(x)
    }
    autoFocus.foreach { x =>
      p.updateDynamic("autoFocus")(x)
    }
    readOnly.foreach { x =>
      p.updateDynamic("readOnly")(x)
    }
    name.foreach { x =>
      p.updateDynamic("name")(x)
    }
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        () => x().runNow()
      )
    }
    style.foreach { x =>
      p.updateDynamic("style")(x)
    }
    upStyle.foreach { x =>
      p.updateDynamic("upStyle")(x)
    }
    downStyle.foreach { x =>
      p.updateDynamic("downStyle")(x)
    }
    inputStyle.foreach { x =>
      p.updateDynamic("inputStyle")(x)
    }
    p
  }

  def apply(children: ReactNode*) = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.InputNumber)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
