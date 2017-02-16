package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/input/#API
  * @param `type` The type of input, [[scalajs.antdesign.Input.Type.Text]] or [[scalajs.antdesign.Input.Type.TextArea]]
  * @param id The ID for input
  * @param size The input content value
  * @param disabled The initial input content
  * @param value The size of the input box. Note: in the context of a form, the large size is used. Available: [[scalajs.antdesign.Size.Large]] [[scalajs.antdesign.Size.Default]] [[scalajs.antdesign.Size.Small]]
  * @param defaultValue Tell if the input is disabled.
  * @param addonBefore The label text displayed before (on the left side of) the input field.
  * @param addonAfter The label text displayed after (on the right side of) the input field.
  * @param prefix The Input with prefix icon.
  * @param suffix The Input with suffix icon.
  * @param onPressEnter The callback function that is triggered when pressing Enter key.
  * @param autosize Height autosize feature, available when type=[[scalajs.antdesign.Input.Type.TextArea]], can be set to true|false or [[scalajs.antdesign.Input.Autosize]]
  */
case class Input(`type`: js.UndefOr[Input.Type] = js.undefined,
                 id: js.UndefOr[String | Int] = js.undefined,
                 size: js.UndefOr[Size] = js.undefined,
                 disabled: js.UndefOr[Boolean] = js.undefined,
                 value: js.UndefOr[String] = js.undefined,
                 defaultValue: js.UndefOr[String] = js.undefined,
                 addonBefore: js.UndefOr[String | ReactNode] = js.undefined,
                 addonAfter: js.UndefOr[String | ReactNode] = js.undefined,
                 autosize: js.UndefOr[Boolean | Input.Autosize] = js.undefined,
                 onPressEnter: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                 prefix: js.UndefOr[ReactNode] = js.undefined,
                 suffix: js.UndefOr[ReactNode] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    `type`.foreach { x =>
      p.updateDynamic("type")(x.id)
    }
    id.foreach { x =>
      p.updateDynamic("id")(x.asInstanceOf[js.Any])
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
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    addonBefore.foreach { x =>
      p.updateDynamic("addonBefore")(x.asInstanceOf[js.Any])
    }
    addonAfter.foreach { x =>
      p.updateDynamic("addonBefore")(x.asInstanceOf[js.Any])
    }
    prefix.foreach { x =>
      p.updateDynamic("prefix")(x)
    }
    suffix.foreach { x =>
      p.updateDynamic("suffix")(x)
    }
    onPressEnter.foreach { x =>
      p.updateDynamic("onPressEnter")(
        (v1: Event) => x(v1).runNow()
      )
    }
    autosize.foreach { x =>
      p.updateDynamic("autosize")((x: Any) match {
        case b: Boolean        => b
        case a: Input.Autosize => a.toJS
      })
    }
    p
  }

  def apply(): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Input)
    f(toJS).asInstanceOf[ReactComponentU_]
  }
}

object Input {
  sealed abstract class Type(val id: String)

  object Type {
    case object Text     extends Type("text")
    case object TextArea extends Type("textarea")
  }

  case class Autosize(minRows: js.UndefOr[Int], maxRows: js.UndefOr[Int]) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      minRows.foreach { x =>
        p.updateDynamic("minRows")(x)
      }
      maxRows.foreach { x =>
        p.updateDynamic("maxRows")(x)
      }
      p
    }
  }
}
