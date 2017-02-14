package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import moment.Date

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/time-picker/#API
  * @param value to set default time
  * @param defaultValue to set time
  * @param placeholder display when there's no value
  * @param onChange a callback function, can be executed when the selected time is changing
  * @param format to set the time format
  * @param disabled determine whether the TimePicker is disabled
  * @param disabledHours to specify the hours that cannot be selected
  * @param disabledMinutes to specify the minutes that cannot be selected
  * @param disabledSeconds to specify the seconds that cannot be selected
  * @param hideDisabledOptions hide the options that can not be selected
  * @param getPopupContainer to set the container of the floating layer, while the default is to create a div element in body
  * @param addon called from timepicker panel to render some addon to its bottom
  */
case class TimePicker(
    value: js.UndefOr[Date] = js.undefined,
    defaultValue: js.UndefOr[Date] = js.undefined,
    placeholder: js.UndefOr[String] = js.undefined,
    onChange: js.UndefOr[(Date, String) => CallbackTo[Unit]] = js.undefined,
    format: js.UndefOr[String] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disabledHours: js.UndefOr[() => CallbackTo[js.Array[Int]]] = js.undefined,
    disabledMinutes: js.UndefOr[Int => CallbackTo[js.Array[Int]]] = js.undefined,
    disabledSeconds: js.UndefOr[Int => CallbackTo[js.Array[Int]]] = js.undefined,
    hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
    getPopupContainer: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[Unit]] = js.undefined, // Need to confirm this, its poorly documented
    addon: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[ReactNode]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    placeholder.foreach { x =>
      p.updateDynamic("placeholder")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Date, v2: String) => x(v1, v2).runNow()
      )
    }
    format.foreach { x =>
      p.updateDynamic("format")(x)
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(disabled)
    }
    disabledHours.foreach { x =>
      p.updateDynamic("disabledHours")(
        () => x().runNow()
      )
    }
    disabledMinutes.foreach { x =>
      p.updateDynamic("disabledMinutes")(
        (v1: Int) => x(v1).runNow()
      )
    }
    disabledSeconds.foreach { x =>
      p.updateDynamic("disabledSeconds")(
        (v1: Int) => x(v1).runNow()
      )
    }
    hideDisabledOptions.foreach { x =>
      p.updateDynamic("hideDisabledOptions")(x)
    }
    getPopupContainer.foreach { x =>
      p.updateDynamic("getPopupContainer")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    addon.foreach { x =>
      p.updateDynamic("addon")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.TimePicker)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
