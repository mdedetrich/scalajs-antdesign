package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/spin/#API
  * @param size Size of dot in spin component, available in [[scalajs.antdesign.Size.Small]], [[scalajs.antdesign.Size.Default]] and [[scalajs.antdesign.Size.Large]].
  * @param spinning Use in embedded mode, to modify loading state.
  * @param tip Customize description content
  * @param delay Specifies a delay for loading state
  */

case class Spin(size: js.UndefOr[Size] = js.undefined,
                spinning: js.UndefOr[Boolean] = js.undefined,
                tip: js.UndefOr[String] = js.undefined,
                delay: js.UndefOr[Int] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    size.foreach{ x =>
      p.updateDynamic("size")(x.id)
    }
    spinning.foreach{ x =>
      p.updateDynamic("size")(x)
    }
    tip.foreach{ x =>
      p.updateDynamic("tip")(x)
    }
    delay.foreach{x =>
      p.updateDynamic("delay")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Spin)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
