package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.raw.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/alert/#API
  * @param `type` Type of Alert styles, options:[[scalajs.antdesign.Alert.Type.Success]], [[scalajs.antdesign.Alert.Type.Info]], [[scalajs.antdesign.Alert.Type.Warning]], [[scalajs.antdesign.Alert.Type.Error]]
  * @param closable Whether Alert can be closed
  * @param closeText Close text to show
  * @param message Content of Alert
  * @param description Additional content of Alert
  * @param onClose Callback when close Alert
  * @param showIcon Whether to show icon
  * @param banner Whether to show as banner
  */
case class Alert(`type`: js.UndefOr[Alert.Type] = js.undefined,
                 closable: js.UndefOr[Boolean] = js.undefined,
                 closeText: js.UndefOr[String | ReactNode] = js.undefined,
                 message: js.UndefOr[String | ReactNode] = js.undefined,
                 description: js.UndefOr[String | ReactNode] = js.undefined,
                 onClose: js.UndefOr[(Event) => CallbackTo[Unit]] = js.undefined,
                 showIcon: js.UndefOr[Boolean] = js.undefined,
                 banner: js.UndefOr[Boolean] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    `type`.foreach { x =>
      p.updateDynamic("type")(x.id)
    }
    closable.foreach { x =>
      p.updateDynamic("closable")(x)
    }
    closeText.foreach { x =>
      p.updateDynamic("closeText")(x.asInstanceOf[js.Any])
    }
    message.foreach { x =>
      p.updateDynamic("message")(x.asInstanceOf[js.Any])
    }
    description.foreach { x =>
      p.updateDynamic("description")(x.asInstanceOf[js.Any])
    }
    onClose.foreach { x =>
      p.updateDynamic("onClose")(
        (v1: Event) => x(v1).runNow()
      )
    }
    showIcon.foreach { x =>
      p.updateDynamic("showIcon")(x)
    }
    banner.foreach { x =>
      p.updateDynamic("banner")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Alert)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Alert {
  sealed abstract class Type(val id: String)

  object Type {
    case object Success extends Type("success")
    case object Info    extends Type("info")
    case object Warning extends Type("warning")
    case object Error   extends Type("error")
  }
}
