package scalajs.antdesign

import japgolly.scalajs.react.{React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/grid/#Col
  * @param span raster occupying the number of cells,0 corresponds to display: none
  * @param order raster order, under flex effective layout mode
  * @param offset the number of cells to the left of the grid spacing, no cell in grid spacing
  * @param push the number of cells that raster move to the right
  * @param pull the number of cells that raster move to the left
  * @param xs <768px, could be a span value or a object contain above props
  * @param sm ≥768px, could be a span value or a object contain above props
  * @param md ≥992px, could be a span value or a object contain above props
  * @param lg ≥1200px, could be a span value or a object contain above props
  */
case class Col(span: js.UndefOr[Double] = js.undefined,
               order: js.UndefOr[Double] = js.undefined,
               offset: js.UndefOr[Double] = js.undefined,
               push: js.UndefOr[Double] = js.undefined,
               pull: js.UndefOr[Double] = js.undefined,
               xs: js.UndefOr[Double | js.Dictionary[js.Any]] = js.undefined,
               sm: js.UndefOr[Double | js.Dictionary[js.Any]] = js.undefined,
               md: js.UndefOr[Double | js.Dictionary[js.Any]] = js.undefined,
               lg: js.UndefOr[Double | js.Dictionary[js.Any]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    span.foreach { x =>
      p.updateDynamic("span")(x)
    }
    order.foreach { x =>
      p.updateDynamic("order")(x)
    }
    offset.foreach { x =>
      p.updateDynamic("offset")(x)
    }
    push.foreach { x =>
      p.updateDynamic("push")(x)
    }
    pull.foreach { x =>
      p.updateDynamic("pull")(x)
    }
    xs.foreach { x =>
      p.updateDynamic("xs")(x.asInstanceOf[js.Any])
    }
    sm.foreach { x =>
      p.updateDynamic("sm")(x.asInstanceOf[js.Any])
    }
    md.foreach { x =>
      p.updateDynamic("md")(x.asInstanceOf[js.Any])
    }
    lg.foreach { x =>
      p.updateDynamic("lg")(x.asInstanceOf[js.Any])
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Col)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}
