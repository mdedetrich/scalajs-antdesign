package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/slider/#API
  * @param range dual thumb mode
  * @param min The minimum value the slider can slide to.
  * @param max The maximum value the slider can slide to
  * @param step The granularity the slider can step through values. Must greater than 0, and be divided by (max - min) . When marks no null, step can be null.
  * @param marks Tick mark of Slider, type of key must be number, and must in closed interval [min, max] ，each mark can declare its own style.
  * @param dots Whether the thumb can drag over tick only.
  * @param value The value of slider. When range is false, use number, otherwise, use [number, number]
  * @param defaultValue The default value of slider. When range is false, use number, otherwise, use [number, number]
  * @param included Make effect when marks not null，true means containment and false means coordinative
  * @param disabled If true, the slider will not be interactable.
  * @param vertical If true, the slider will be vertical.
  * @param onChange Callback function that is fired when the user changes the slider's value.
  * @param onAfterChange Fire when onmouseup is fired.
  * @param tipFormatter Slider will pass its value to tipFormatter, and display its value in Tooltip, and hide Tooltip when return value is null.
  */
case class Slider(range: js.UndefOr[Boolean] = js.undefined,
                  min: js.UndefOr[Double] = js.undefined,
                  max: js.UndefOr[Double] = js.undefined,
                  step: js.UndefOr[Double | Null] = js.undefined,
                  marks: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                  dots: js.UndefOr[Boolean] = js.undefined,
                  value: js.UndefOr[Double | js.Array[Double]] = js.undefined,
                  defaultValue: js.UndefOr[Double | js.Array[Double]] = js.undefined,
                  included: js.UndefOr[Boolean] = js.undefined,
                  disabled: js.UndefOr[Boolean] = js.undefined,
                  vertical: js.UndefOr[Boolean] = js.undefined,
                  onChange: js.UndefOr[Double => CallbackTo[Unit]] = js.undefined,
                  onAfterChange: js.UndefOr[Double => CallbackTo[Unit]] = js.undefined,
                  tipFormatter: js.UndefOr[Double => CallbackTo[String]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    range.foreach { x =>
      p.updateDynamic("range")(x)
    }
    min.foreach { x =>
      p.updateDynamic("min")(x)
    }
    max.foreach { x =>
      p.updateDynamic("max")(x)
    }
    step.foreach { x =>
      p.updateDynamic("step")(x.asInstanceOf[js.Any])
    }
    marks.foreach { x =>
      p.updateDynamic("marks")(x.asInstanceOf[js.Any])
    }
    dots.foreach { x =>
      p.updateDynamic("dots")(x)
    }
    value.foreach { x =>
      p.updateDynamic("value")(x.asInstanceOf[js.Any])
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
    }
    included.foreach { x =>
      p.updateDynamic("included")(x)
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    vertical.foreach { x =>
      p.updateDynamic("vertical")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Double) => x(v1).runNow()
      )
    }
    onAfterChange.foreach { x =>
      p.updateDynamic("onAfterChange")(
        (v1: Double) => x(v1).runNow()
      )
    }
    tipFormatter.foreach { x =>
      p.updateDynamic("tipFormatter")(
        (v1: Double) => x(v1).runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Slider)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
