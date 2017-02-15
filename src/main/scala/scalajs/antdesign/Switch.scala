package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/switch/#API
  * @param checked determine whether the [[Switch]] is checked
  * @param defaultChecked to set the initial state
  * @param onChange a callback function, can be executed when the checked state is changing
  * @param checkedChildren content to be shown when the state is checked
  * @param unCheckedChildren content to be shown when the state is unchecked
  * @param size the size of the [[Switch]], options: [[scalajs.antdesign.Switch.Size.Default]] [[scalajs.antdesign.Switch.Size.Small]]
  */
case class Switch(checked: js.UndefOr[Boolean] = js.undefined,
                  defaultChecked: js.UndefOr[Boolean] = js.undefined,
                  onChange: js.UndefOr[(Boolean) => CallbackTo[Unit]] = js.undefined,
                  checkedChildren: js.UndefOr[String | ReactNode] = js.undefined,
                  unCheckedChildren: js.UndefOr[String | ReactNode] = js.undefined,
                  size: js.UndefOr[Switch.Size] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    checked.foreach { x =>
      p.updateDynamic("checked")(x)
    }
    defaultChecked.foreach { x =>
      p.updateDynamic("defaultChecked")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Boolean) => x(v1).runNow()
      )
    }
    checkedChildren.foreach { x =>
      p.updateDynamic("checkedChildren")(x.asInstanceOf[js.Any])
    }
    unCheckedChildren.foreach { x =>
      p.updateDynamic("unCheckedChildren")(x.asInstanceOf[js.Any])
    }
    size.foreach { x =>
      p.updateDynamic("size")(x.id)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Switch)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Switch {
  sealed abstract class Size(val id: String)

  object Size {
    case object Default extends Size("default")
    case object Small   extends Size("small")
  }
}
