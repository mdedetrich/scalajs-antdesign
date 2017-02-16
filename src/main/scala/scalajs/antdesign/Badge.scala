package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/badge/#API
  * @param count Number to show in badge
  * @param overflowCount Max count to show
  * @param dot Whether to show red dot without number
  * @param status Set Badge as a status dot
  * @param text If [[status]] is set, [[text]] is to set the text of status dot
  */
case class Badge(count: js.UndefOr[Int] = js.undefined,
                 overflowCount: js.UndefOr[Int] = js.undefined,
                 dot: js.UndefOr[Boolean] = js.undefined,
                 status: js.UndefOr[Badge.Status] = js.undefined,
                 text: js.UndefOr[String] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    count.foreach { x =>
      p.updateDynamic("count")(x)
    }
    overflowCount.foreach { x =>
      p.updateDynamic("overflowCount")(x)
    }
    dot.foreach { x =>
      p.updateDynamic("dot")(x)
    }
    status.foreach { x =>
      p.updateDynamic("status")(x.id)
    }
    text.foreach { x =>
      p.updateDynamic("text")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Badge)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Badge {
  sealed abstract class Status(val id: String)

  object Status {
    case object Success    extends Status("success")
    case object Processing extends Status("processing")
    case object Default    extends Status("default")
    case object Error      extends Status("error")
    case object Warning    extends Status("warning")
  }
}
