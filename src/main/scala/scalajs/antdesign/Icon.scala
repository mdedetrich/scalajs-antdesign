package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}

/**
  * @see https://ant.design/components/icon/#Props
  * @param `type` Type of ant design icons
  * @param spin Rotate icon with animation
  */
case class Icon(`type`: String, spin: js.UndefOr[Boolean] = js.undefined) {

  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    p.updateDynamic("type")(`type`)
    spin.foreach { x =>
      p.updateDynamic("spin")(x)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Icon)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }

}
