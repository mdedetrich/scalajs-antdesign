package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/checkbox/#API
  * @param checked Specifies whether the checkbox is selected.
  * @param defaultChecked Specifies the initial state: whether or not the checkbox is selected.
  * @param onChange The callback function that is triggered when the state changes.
  */
case class Checkbox(checked: js.UndefOr[Boolean] = js.undefined,
                    defaultChecked: js.UndefOr[Boolean] = js.undefined,
                    onChange: js.UndefOr[(Event) => CallbackTo[Unit]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    checked.foreach { x =>
      p.updateDynamic("checked")(x)
    }
    defaultChecked.foreach { x =>
      p.updateDynamic("defaultChecked")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Checkbox)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
