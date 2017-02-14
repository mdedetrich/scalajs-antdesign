package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Node

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/cascader/#API
  * @param options data options of cascade
  * @param defaultValue initial selected value
  * @param value selected value
  * @param onChange callback when finishing cascader select
  * @param displayRender render function of displaying selected options
  * @param style additional style
  * @param className 	additional css class
  * @param popupClassName additional className of popup overlay
  * @param popupPlacement use preset popup align config from builtin Placements：[[scalajs.antdesign.Cascader.PopupPlacement.BottomLeft]] [[scalajs.antdesign.Cascader.PopupPlacement.BottomRight]] [[scalajs.antdesign.Cascader.PopupPlacement.TopLeft]] [[scalajs.antdesign.Cascader.PopupPlacement.TopRight]]
  * @param placeholder input placeholder
  * @param size input size, one of [[scalajs.antdesign.Size.Large]] [[scalajs.antdesign.Size.Default]] [[scalajs.antdesign.Size.Small]]
  * @param disabled whether disabled select
  * @param allowClear whether allow clear
  * @param expandTrigger expand current item when click or hover, one of [[scalajs.antdesign.Cascader.ExpandTrigger.Click]] [[scalajs.antdesign.Cascader.ExpandTrigger.Hover]]
  * @param changeOnSelect change value on each selection if set to true, see above demo for details
  * @param showSearch Whether show search input in single mode.
  * @param notFoundContent Specify content to show when no result matches.
  * @param loadData To load option lazily, and it cannot work with showSearch
  * @param getPopupContainer Parent Node which the selector should be rendered to. Default to body. When position issues happen, try to modify it into scrollable content and position it relative.
  */
case class Cascader(options: js.UndefOr[Cascader.Options] = js.undefined,
                    defaultValue: js.UndefOr[Cascader.Options] = js.undefined,
                    value: js.UndefOr[Cascader.Options] = js.undefined,
                    onChange: js.UndefOr[(String, Cascader.Options) => CallbackTo[Unit]] = js.undefined,
                    displayRender: js.UndefOr[(String, Cascader.Options) => CallbackTo[ReactNode]] = js.undefined,
                    style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                    className: js.UndefOr[String] = js.undefined,
                    popupClassName: js.UndefOr[String] = js.undefined,
                    popupPlacement: js.UndefOr[Cascader.PopupPlacement] = js.undefined,
                    placeholder: js.UndefOr[String] = js.undefined,
                    size: js.UndefOr[Size] = js.undefined,
                    disabled: js.UndefOr[Boolean] = js.undefined,
                    allowClear: js.UndefOr[Boolean] = js.undefined,
                    expandTrigger: js.UndefOr[Cascader.ExpandTrigger] = js.undefined,
                    changeOnSelect: js.UndefOr[Boolean] = js.undefined,
                    showSearch: js.UndefOr[js.UndefOr[Boolean | Cascader.ShowSearch]] = js.undefined,
                    notFoundContent: js.UndefOr[String] = js.undefined,
                    loadData: js.UndefOr[Cascader.Options => CallbackTo[Unit]] = js.undefined,
                    getPopupContainer: js.UndefOr[() => CallbackTo[Node]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    options.foreach { x =>
      p.updateDynamic("options")(x.toJS)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("options")(x.toJS)
    }
    value.foreach { x =>
      p.updateDynamic("options")(x.toJS)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: String, v2: Cascader.Options) => x(v1, v2).runNow()
      )
    }
    displayRender.foreach { x =>
      p.updateDynamic("displayRender")(
        (v1: String, v2: Cascader.Options) => x(v1, v2).runNow()
      )
    }
    style.foreach { x =>
      p.updateDynamic("style")(x)
    }
    className.foreach { x =>
      p.updateDynamic("className")(x)
    }
    popupClassName.foreach { x =>
      p.updateDynamic("popupClassName")(x)
    }
    popupPlacement.foreach { x =>
      p.updateDynamic("popupPlacement")(x.id)
    }
    placeholder.foreach { x =>
      p.updateDynamic("placeholder")(x)
    }
    size.foreach { x =>
      p.updateDynamic("size")(x.id)
    }
    disabled.foreach { x =>
      p.updateDynamic("disabled")(x)
    }
    allowClear.foreach { x =>
      p.updateDynamic("allowClear")(x)
    }
    expandTrigger.foreach { x =>
      p.updateDynamic("expandTrigger")(x.id)
    }
    changeOnSelect.foreach { x =>
      p.updateDynamic("changeOnSelect")(x)
    }
    showSearch.foreach { x =>
      p.updateDynamic("showSearch")((x: Any) match {
        case b: Boolean             => b
        case c: Cascader.ShowSearch => c.toJS
      })
    }
    notFoundContent.foreach { x =>
      p.updateDynamic("notFoundContent")(x)
    }
    loadData.foreach { x =>
      p.updateDynamic("loadData")(
        (v1: Cascader.Options) => x(v1).runNow()
      )
    }
    getPopupContainer.foreach { x =>
      p.updateDynamic("getPopupContainer")(
        () => x().runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Cascader)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Cascader {
  case class Options(value: js.UndefOr[String],
                     label: js.UndefOr[String],
                     disabled: js.UndefOr[Boolean],
                     children: js.Array[Options]) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      value.foreach { x =>
        p.updateDynamic("value")(x)
      }
      label.foreach { x =>
        p.updateDynamic("label")(x)
      }
      disabled.foreach { x =>
        p.updateDynamic("disabled")(x)
      }
      val array: js.Array[Object with Dynamic] = js.Array()
      children.foreach { x =>
        array.push(x.toJS)
      }
      p.updateDynamic("children")(array)
      p
    }
  }

  sealed abstract class PopupPlacement(val id: String)

  object PopupPlacement {
    case object BottomLeft  extends PopupPlacement("bottomLeft")
    case object BottomRight extends PopupPlacement("bottomRight")
    case object TopLeft     extends PopupPlacement("topLeft")
    case object TopRight    extends PopupPlacement("topRight")
  }

  sealed abstract class ExpandTrigger(val id: String)

  object ExpandTrigger {
    case object Click extends ExpandTrigger("click")
    case object Hover extends ExpandTrigger("hover")
  }

  case class ShowSearch(filter: js.UndefOr[(String, Options) => CallbackTo[Boolean]] = js.undefined,
                        render: js.UndefOr[(String, Options) => CallbackTo[ReactNode]] = js.undefined,
                        sort: js.UndefOr[(js.Array[String], js.Array[String], String) => CallbackTo[Boolean]] =
                          js.undefined,
                        matchInputWidth: js.UndefOr[Boolean] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      filter.foreach { x =>
        p.updateDynamic("filter")(
          (v1: String, v2: Options) => x(v1, v2).runNow()
        )
      }
      render.foreach { x =>
        p.updateDynamic("render")(
          (v1: String, v2: Options) => x(v1, v2).runNow()
        )
      }
      sort.foreach { x =>
        p.updateDynamic("sort")(
          (v1: js.Array[String], v2: js.Array[String], v3: String) => x(v1, v2, v3).runNow()
        )
      }
      matchInputWidth.foreach { x =>
        p.updateDynamic("matchInputWidth")(x)
      }
      p
    }
  }

}
