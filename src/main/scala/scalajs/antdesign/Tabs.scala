package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/tabs/#API
  * @param activeKey Current TabPane's key
  * @param defaultActiveKey Default actived tabPanel's key, if activeKey is not setted.
  * @param onChange Callback when tab is switched
  * @param onTabClick Callback when tab is clicked
  * @param tabBarExtraContent Extra element in tab bar
  * @param `type` Basic style of tabs. Options: line, card & editable-card
  * @param size Tab bar size. Options: default, small. Only works while type=[[scalajs.antdesign.Tabs.Type.Line]].
  * @param tabPosition Position of tabs. Options: [[scalajs.antdesign.Tabs.TabPosition.Top]], [[scalajs.antdesign.Tabs.TabPosition.Right]], [[scalajs.antdesign.Tabs.TabPosition.Bottom]] & [[scalajs.antdesign.Tabs.TabPosition.Left]]
  * @param onEdit Callback when tab is added or removed, which is executing when set type as editable-card
  * @param hideAdd Hide plus icon or not, which is effective when set type as editable-card
  * @param animated Whether to change tabs with animation, this property only works with tabPosition=[[scalajs.antdesign.Tabs.TabPosition.Top]]|[[scalajs.antdesign.Tabs.TabPosition.Bottom]]
  */
case class Tabs(activeKey: js.UndefOr[String] = js.undefined,
                defaultActiveKey: js.UndefOr[String] = js.undefined,
                onChange: js.UndefOr[String => CallbackTo[Unit]] = js.undefined,
                onTabClick: js.UndefOr[String => CallbackTo[Unit]] = js.undefined,
                tabBarExtraContent: js.UndefOr[ReactNode] = js.undefined,
                `type`: js.UndefOr[Tabs.Type] = js.undefined,
                size: js.UndefOr[String] = js.undefined,
                tabPosition: js.UndefOr[Tabs.TabPosition] = js.undefined,
                onEdit: js.UndefOr[(String, Event) => CallbackTo[Unit]] = js.undefined,
                hideAdd: js.UndefOr[Boolean] = js.undefined,
                animated: js.UndefOr[Boolean] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    activeKey.foreach { x =>
      p.updateDynamic("activeKey")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: String) => x(v1).runNow()
      )
    }
    onTabClick.foreach { x =>
      p.updateDynamic("onTabClick")(
        (v1: String) => x(v1).runNow()
      )
    }
    tabBarExtraContent.foreach { x =>
      p.updateDynamic("tabBarExtraContent")(x)
    }
    `type`.foreach { x =>
      p.updateDynamic("type")(x.id)
    }
    size.foreach { x =>
      p.updateDynamic("size")(x)
    }
    tabPosition.foreach { x =>
      p.updateDynamic("tabPosition")(x.id)
    }
    onEdit.foreach { x =>
      p.updateDynamic("onEdit")(
        (v1: String, v2: Event) => x(v1, v2).runNow()
      )
    }
    hideAdd.foreach { x =>
      p.updateDynamic("hideAdd")(x)
    }
    animated.foreach { x =>
      p.updateDynamic("animated")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tabs)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Tabs {
  sealed abstract class Type(val id: String)

  object Type {
    case object Line         extends Type("line")
    case object Card         extends Type("card")
    case object EditableCard extends Type("editable-card")
  }

  sealed abstract class TabPosition(val id: String)

  object TabPosition {
    case object Top    extends TabPosition("top")
    case object Right  extends TabPosition("right")
    case object Bottom extends TabPosition("bottom")
    case object left   extends TabPosition("left")
  }

  /**
    * @see https://ant.design/components/tabs/#Tabs.TabPane
    * @param key TabPane's key
    * @param tab Show text in TabPane's head
    */
  case class TabPane(key: js.UndefOr[String] = js.undefined, tab: js.UndefOr[String | ReactNode] = js.undefined) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      key.foreach { x =>
        p.updateDynamic("key")(x)
      }
      tab.foreach { x =>
        p.updateDynamic("tab")(x.asInstanceOf[js.Any])
      }
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Tabs.TabPane)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }

  }
}
