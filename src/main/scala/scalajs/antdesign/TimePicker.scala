package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import moment.Date

import scala.scalajs.js

/**
  * https://github.com/react-component/time-picker#api
  * @param prefixCls prefixCls of this component
  * @param clearText
  * @param disabled whether picker is disabled
  * @param open current open state of picker. controlled prop
  * @param defaultValue default initial value
  * @param defaultOpenValue default open panel value, used to set utcOffset,locale if value/defaultValue absent
  * @param value current value
  * @param placeholder time input's placeholder
  * @param showHour
  * @param showMinute
  * @param showSecond
  * @param format
  * @param disabledHours
  * @param disabledMinutes
  * @param disabledSeconds
  * @param hideDisabledOptions
  * @param onChange called when select a different value
  * @param addon called from timepicker panel to render some addon to its bottom, like an OK button. Receives panel instance as parameter, to be able to close it like panel.close().
  * @param placement one of [[scalajs.antdesign.TimePicker.Placement.Left]], [[scalajs.antdesign.TimePicker.Placement.Right]], [[scalajs.antdesign.TimePicker.Placement.Top]], [[scalajs.antdesign.TimePicker.Placement.Bottom]],
  *                  [[scalajs.antdesign.TimePicker.Placement.TopLeft]], [[scalajs.antdesign.TimePicker.Placement.TopRight]], [[scalajs.antdesign.TimePicker.Placement.BottomLeft]], [[scalajs.antdesign.TimePicker.Placement.BottomRight]]
  * @param transitionName
  */

case class TimePicker(prefixCls: js.UndefOr[String] = js.undefined,
                      clearText: js.UndefOr[String] = js.undefined,
                      disabled: js.UndefOr[Boolean] = js.undefined,
                      open: js.UndefOr[Boolean] = js.undefined,
                      defaultValue: js.UndefOr[Date] = js.undefined,
                      defaultOpenValue: js.UndefOr[Date] = js.undefined,
                      value: js.UndefOr[Date] = js.undefined,
                      placeholder: js.UndefOr[String] = js.undefined,
                      showHour: js.UndefOr[Boolean] = js.undefined,
                      showMinute: js.UndefOr[Boolean] = js.undefined,
                      showSecond: js.UndefOr[Boolean] = js.undefined,
                      format: js.UndefOr[String] = js.undefined,
                      disabledHours: js.UndefOr[Date => CallbackTo[js.Array[Int]]] = js.undefined,
                      disabledMinutes: js.UndefOr[Date => CallbackTo[js.Array[Int]]] = js.undefined,
                      disabledSeconds: js.UndefOr[Date => CallbackTo[js.Array[Int]]] = js.undefined,
                      hideDisabledOptions: js.UndefOr[Boolean] = js.undefined,
                      onChange: js.UndefOr[Date => CallbackTo[Unit]] = js.undefined,
                      addon: js.UndefOr[js.Dynamic => CallbackTo[Unit]] = js.undefined,
                      placement: js.UndefOr[TimePicker.Placement] = js.undefined,
                      transitionName: js.UndefOr[String] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    prefixCls.foreach{ x =>
      p.updateDynamic("prefixCls")(prefixCls)
    }
    clearText.foreach{ x =>
      p.updateDynamic("clearText")(clearText)
    }
    disabled.foreach{ x =>
      p.updateDynamic("disabled")(disabled)
    }
    open.foreach{ x =>
      p.updateDynamic("open")(x)
    }
    defaultValue.foreach{ x =>
      p.updateDynamic("defaultValue")(x)
    }
    defaultOpenValue.foreach{ x =>
      p.updateDynamic("defaultOpenValue")(x)
    }
    value.foreach{ x =>
      p.updateDynamic("value")(x)
    }
    placeholder.foreach{ x =>
      p.updateDynamic("placeholder")(x)
    }
    showHour.foreach{ x =>
      p.updateDynamic("showHour")(x)
    }
    showMinute.foreach{ x =>
      p.updateDynamic("showHour")(x)
    }
    showSecond.foreach{ x =>
      p.updateDynamic("showSecond")(x)
    }
    format.foreach{ x =>
      p.updateDynamic("format")(x)
    }
    disabledHours.foreach{ x =>
      p.updateDynamic("disabledHours")(
        (v1: Date) => x(v1).runNow()
      )
    }
    disabledMinutes.foreach{ x =>
      p.updateDynamic("disabledMinutes")(
        (v1: Date) => x(v1).runNow()
      )
    }
    disabledSeconds.foreach{ x =>
      p.updateDynamic("disabledSeconds")(
        (v1: Date) => x(v1).runNow()
      )
    }
    hideDisabledOptions.foreach{ x =>
      p.updateDynamic("hideDisabledOptions")(x)
    }
    onChange.foreach{ x =>
      p.updateDynamic("onChange")(
        (v1: Date) => x(v1).runNow()
      )
    }
    addon.foreach{ x =>
      p.updateDynamic("addon")(
        (v1: js.Dynamic) => x(v1).runNow()
      )
    }
    placement.foreach{ x =>
      p.updateDynamic("placement")(x.id)
    }
    transitionName.foreach{ x =>
      p.updateDynamic("transitionName")(x)
    }
    p
  }

  def apply(children: ReactNode*) = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.TimePicker)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object TimePicker {
  sealed abstract class Placement(val id: String)

  object Placement {
    case object Left        extends Placement("left")
    case object Right       extends Placement("right")
    case object Top         extends Placement("top")
    case object Bottom      extends Placement("bottom")
    case object TopLeft     extends Placement("topLeft")
    case object TopRight    extends Placement("topRight")
    case object BottomLeft  extends Placement("bottomLeft")
    case object BottomRight extends Placement("bottomRight")
  }
}
