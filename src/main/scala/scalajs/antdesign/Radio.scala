package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/radio/#Radio
  * @param checked Specifies whether the radio is selected.
  * @param defaultChecked Specifies the initial state: whether or not the radio is selected.
  * @param value According to value for comparison, to determine whether the selected
  */
case class Radio(checked: js.UndefOr[Boolean] = js.undefined,
                 defaultChecked: js.UndefOr[Boolean] = js.undefined,
                 value: js.UndefOr[String] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    checked.foreach { x =>
      p.updateDynamic("checked")(x)
    }
    defaultChecked.foreach { x =>
      p.updateDynamic("defaultChecked")(x)
    }
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Radio)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Radio {

  /**
    * @see https://ant.design/components/radio/#RadioGroup
    * @param onChange The callback function that is triggered when the state changes.
    * @param value Used for setting the currently selected value.
    * @param defaultValue Default selected value
    * @param size Size, only on radio style
    */
  case class Group(onChange: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                   value: js.UndefOr[String] = js.undefined,
                   defaultValue: js.UndefOr[String] = js.undefined,
                   size: js.UndefOr[Size] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      onChange.foreach { x =>
        p.updateDynamic("onChange")(
          (v1: Event) => x(v1).runNow()
        )
      }
      value.foreach { x =>
        p.updateDynamic("value")(x)
      }
      defaultValue.foreach { x =>
        p.updateDynamic("defaultValue")(x)
      }
      size.foreach { x =>
        p.updateDynamic("size")(x.id)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Radio.Group)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }
}
