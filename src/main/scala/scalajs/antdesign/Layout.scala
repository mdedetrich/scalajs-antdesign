package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/layout/#Layout
  * @param style to custom the styles
  * @param className container className
  */
case class Layout(style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined, className: js.UndefOr[String]) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    style.foreach { x =>
      p.updateDynamic("style")(x)
    }
    className.foreach { x =>
      p.updateDynamic("className")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Layout)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Layout {

  /**
    * @see https://ant.design/components/layout/#Layout
    * @param style to custom the styles
    * @param className container className
    */
  case class Header(style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined, className: js.UndefOr[String]) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      style.foreach { x =>
        p.updateDynamic("style")(x)
      }
      className.foreach { x =>
        p.updateDynamic("className")(x)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Layout.Header)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

  /**
    * @see https://ant.design/components/layout/#Layout
    * @param style to custom the styles
    * @param className container className
    */
  case class Footer(style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined, className: js.UndefOr[String]) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      style.foreach { x =>
        p.updateDynamic("style")(x)
      }
      className.foreach { x =>
        p.updateDynamic("className")(x)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Layout.Footer)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

  /**
    * @see https://ant.design/components/layout/#Layout
    * @param style to custom the styles
    * @param className container className
    */
  case class Content(style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined, className: js.UndefOr[String]) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      style.foreach { x =>
        p.updateDynamic("style")(x)
      }
      className.foreach { x =>
        p.updateDynamic("className")(x)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Layout.Content)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

  /**
    * @see https://ant.design/components/layout/#Layout.Sider
    * @param collapsible whether can be collapsed
    * @param defaultCollapsed to set the initial status
    * @param collapsed to set the current status
    * @param onCollapse the callback function, can be executed when you switch the sidebar, available only [[collapsible]]=true
    * @param trigger specify the customized trigger, set to null to hide the trigger
    * @param width width of the sidebar
    * @param collapsedWidth width of the collapsed sidebar, available only [[collapsible]]=true
    * @param style to custom the styles
    * @param className container className
    */
  case class Sidebar(collapsible: js.UndefOr[Boolean] = js.undefined,
                     defaultCollapsed: js.UndefOr[Boolean] = js.undefined,
                     collapsed: js.UndefOr[Boolean] = js.undefined,
                     onCollapse: js.UndefOr[Boolean => CallbackTo[Unit]] = js.undefined,
                     trigger: js.UndefOr[String | ReactNode] = js.undefined,
                     width: js.UndefOr[Int | ReactNode] = js.undefined,
                     collapsedWidth: js.UndefOr[Int] = js.undefined,
                     style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                     className: js.UndefOr[String] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      collapsible.foreach { x =>
        p.updateDynamic("collapsible")(x)
      }
      defaultCollapsed.foreach { x =>
        p.updateDynamic("defaultCollapsed")(x)
      }
      collapsed.foreach { x =>
        p.updateDynamic("collapsed")(x)
      }
      onCollapse.foreach { x =>
        p.updateDynamic("onCollapse")(
          (v1: Boolean) => x(v1).runNow()
        )
      }
      trigger.foreach { x =>
        p.updateDynamic("trigger")(x.asInstanceOf[js.Any])
      }
      width.foreach { x =>
        p.updateDynamic("width")(x.asInstanceOf[js.Any])
      }
      collapsedWidth.foreach { x =>
        p.updateDynamic("collapsedWidth")(x)
      }
      style.foreach { x =>
        p.updateDynamic("style")(x)
      }
      className.foreach { x =>
        p.updateDynamic("style")(x)
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Layout.Sidebar)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

}
