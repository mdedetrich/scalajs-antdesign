package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.raw.Event

import scala.scalajs.js
import scala.scalajs.js.|

case class Input(`type`: js.UndefOr[Input.Type] = js.undefined,
                 id: js.UndefOr[String | Int] = js.undefined,
                 size: js.UndefOr[Input.Size] = js.undefined,
                 disabled: js.UndefOr[Boolean] = js.undefined,
                 value: js.UndefOr[String] = js.undefined,
                 defaultValue: js.UndefOr[String] = js.undefined,
                 className: js.UndefOr[String] = js.undefined,
                 addonBefore: js.UndefOr[String | ReactNode] = js.undefined,
                 addonAfter: js.UndefOr[String | ReactNode] = js.undefined,
                 prefixCls: js.UndefOr[String] = js.undefined,
                 autosize: js.UndefOr[Boolean | Input.Autosize] = js.undefined,
                 onPressEnter: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                 onKeyDown: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                 onFocus: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                 onBlur: js.UndefOr[Event => CallbackTo[Unit]] = js.undefined,
                 prefix: js.UndefOr[ReactNode] = js.undefined,
                 suffix: js.UndefOr[ReactNode] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    `type`.foreach{x =>
      p.updateDynamic("type")(x.id)
    }
    id.foreach{x =>
      p.updateDynamic("id")((x: Any) match {
        case s: String => s
        case i: Int => i
      })
    }
    size.foreach{x =>
      p.updateDynamic("size")(x.id)
    }
    disabled.foreach{x =>
      p.updateDynamic("disabled")(x)
    }
    value.foreach{x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach{x =>
      p.updateDynamic("defaultValue")(x)
    }
    className.foreach{x =>
      p.updateDynamic("className")(x)
    }
    addonBefore.foreach{x =>
      p.updateDynamic("addonBefore")(x.asInstanceOf[js.Any])
    }
    addonAfter.foreach{x =>
      p.updateDynamic("addonBefore")(x.asInstanceOf[js.Any])
    }
    prefixCls.foreach{ x =>
      p.updateDynamic("prefixCls")(x)
    }
    autosize.foreach{ x =>
      p.updateDynamic("autosize")((x: Any) match {
        case b: Boolean => b
        case a: Input.Autosize => a.toJS
      })
    }
    onPressEnter.foreach{ x =>
      p.updateDynamic("onPressEnter")(
        (v1: Event) => x(v1).runNow()
      )
    }
    onKeyDown.foreach{ x =>
      p.updateDynamic("onKeyDown")(
        (v1: Event) => x(v1).runNow()
      )
    }
    onFocus.foreach{ x =>
      p.updateDynamic("onFocus")(
        (v1: Event) => x(v1).runNow()
      )
    }
    onBlur.foreach{ x =>
      p.updateDynamic("onBlur")(
        (v1: Event) => x(v1).runNow()
      )
    }
    prefix.foreach{x =>
      p.updateDynamic("prefix")(x)
    }
    suffix.foreach{x =>
      p.updateDynamic("suffix")(x)
    }
    p
  }

  def apply(children: ReactNode*) = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Input)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Input {
  sealed abstract class Type(val id: String)

  object Type {
    case object Text     extends Type("text")
    case object TextArea extends Type("textarea")
  }

  sealed abstract class Size(val id: String)

  object Size {
    case object Small   extends Size("small")
    case object Default extends Size("default")
    case object Large   extends Size("large")
  }

  case class Autosize(minRows: js.UndefOr[Int], maxRows: js.UndefOr[Int]) {
    def toJS = {
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
