package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/tag/#API
  * @param color The background color of Tag
  * @param closable Tag can be closed.
  * @param onClose Callback when tag was closed
  * @param afterClose Callback when closed animation is complete
  */
case class Tag(color: js.UndefOr[String] = js.undefined,
               closable: js.UndefOr[Boolean] = js.undefined,
               onClose: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
               afterClose: js.UndefOr[() => CallbackTo[Unit]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    color.foreach { x =>
      p.updateDynamic("color")(x)
    }
    closable.foreach { x =>
      p.updateDynamic("closable")(x)
    }
    onClose.foreach { x =>
      p.updateDynamic("onClose")(
        (v1: Event) => x(v1).runNow()
      )
    }
    afterClose.foreach { x =>
      p.updateDynamic("afterClose")(
        () => x().runNow()
      )
    }
    p
  }

  def apply(): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tag)
    f(toJS).asInstanceOf[ReactComponentU_]
  }

}

object Tag {

  /**
    * @see https://ant.design/components/tag/#Tag.CheckableTag
    * @param checked To set the checked status for Tag
    * @param onChange A callback which will be called while Tag is clicked
    */
  case class CheckableTag(checked: js.UndefOr[Boolean] = js.undefined,
                          onChange: js.UndefOr[Boolean => CallbackTo[Unit]] = js.undefined) {

    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      checked.foreach { x =>
        p.updateDynamic("checked")(x)
      }
      onChange.foreach { x =>
        p.updateDynamic("onChange")(
          (v1: Boolean) => x(v1).runNow()
        )
      }
      p
    }

    def apply(): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tag.CheckableTag)
      f(toJS).asInstanceOf[ReactComponentU_]
    }
  }
}
