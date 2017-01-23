package scalajs.antdesign

import japgolly.scalajs.react._
import org.scalajs.dom.raw.Event

import scala.scalajs.js
import scala.scalajs.js.|

/**
  * https://github.com/react-component/table/tree/master#api
  * @param prefixCls
  * @param className additional className
  * @param useFixedHeader whether use separator table for header. better set width for columns
  * @param scroll whether table can be scroll in x/y direction, `x` or `y` can be a number that indicated the width and height of table body
  * @param expandIconAsCell whether render expandIcon as a cell
  * @param expandIconColumnIndex The index of expandIcon which column will be inserted when expandIconAsCell is false
  * @param rowKey If rowKey is string, `record[rowKey]` will be used as key. If rowKey is function, the return value of `rowKey(record, index)` will be use as key.
  * @param rowClassName get row's className
  * @param rowRef get row's ref key
  * @param defaultExpandedRowKeys initial expanded rows keys
  * @param expandedRowKeys current expanded rows keys
  * @param defaultExpandAllRows Expand All Rows initially
  * @param onExpandedRowsChange function to call when the expanded rows change
  * @param onExpand function to call when click expand icon
  * @param expandedRowClassName get expanded row's className
  * @param data data record array to be rendered
  * @param indentSize indentSize for every level of data.i.children, better using with column.width specified
  * @param onRowClick handle rowClick action, index means the index of current row among fatherElement[childrenColumnName]
  * @param onRowDoubleClick handle rowDoubleClick action, index means the index of current row among fatherElement[childrenColumnName]
  * @param showHeader whether table head is shown
  * @param title table title render function
  * @param footer table footer render function
  * @param getBodyWrapper get wrapper of tbody, [demoe](http://react-component.github.io/table/examples/animation.html)
  * @param emptyText Display text when data is empty
  * @param columns The columns config of table, see table below
  */
case class Table(prefixCls: js.UndefOr[js.Array[String]] = js.undefined,
                 className: js.UndefOr[String] = js.undefined,
                 useFixedHeader: js.UndefOr[Boolean] = js.undefined,
                 scroll: js.UndefOr[Table.Scroll] = js.undefined,
                 expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
                 expandIconColumnIndex: js.UndefOr[Int] = js.undefined,
                 rowKey: js.UndefOr[String | ((js.Dictionary[js.Any], Int) => CallbackTo[String])] = js.undefined,
                 rowClassName: js.UndefOr[(js.Dictionary[js.Any], Int, Int) => CallbackTo[String]] = js.undefined,
                 rowRef: js.UndefOr[(js.Dictionary[js.Any], Int, Int) => CallbackTo[String]] = js.undefined,
                 defaultExpandedRowKeys: js.UndefOr[js.Array[String]] = js.undefined,
                 expandedRowKeys: js.UndefOr[js.Array[String]] = js.undefined,
                 defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
                 onExpandedRowsChange: js.UndefOr[js.Array[String] => CallbackTo[Unit]] = js.undefined,
                 onExpand: js.UndefOr[(js.Array[String], js.Dictionary[js.Any]) => CallbackTo[Unit]] = js.undefined,
                 expandedRowClassName: js.UndefOr[(js.Dictionary[js.Any], Int, Int) => CallbackTo[String]],
                 data: js.UndefOr[js.Array[Table.DataSource]] = js.undefined,
                 indentSize: js.UndefOr[Int] = js.undefined,
                 onRowClick: js.UndefOr[(js.Dictionary[js.Any], Int) => CallbackTo[Unit]] = js.undefined,
                 onRowDoubleClick: js.UndefOr[(js.Dictionary[js.Any], Int) => CallbackTo[Unit]] = js.undefined,
                 showHeader: js.UndefOr[Boolean] = js.undefined,
                 title: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[String]] = js.undefined,
                 footer: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[String]] = js.undefined,
                 getBodyWrapper: js.UndefOr[ReactElement => CallbackTo[Unit]] = js.undefined,
                 emptyText: js.UndefOr[String] = js.undefined,
                 columns: js.UndefOr[js.Array[Table.Column]] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    prefixCls.foreach { x =>
      p.updateDynamic("prefixCls")(x)
    }
    className.foreach { x =>
      p.updateDynamic("className")(x)
    }
    useFixedHeader.foreach { x =>
      p.updateDynamic("useFixedHeader")(x)
    }
    scroll.foreach { x =>
      p.updateDynamic("scroll")(x.toJS)
    }
    expandIconAsCell.foreach { x =>
      p.updateDynamic("expandIconAsCell")(x)
    }
    expandIconColumnIndex.foreach { x =>
      p.updateDynamic("expandIconColumnIndex")(x)
    }
    rowKey.foreach { x =>
      p.updateDynamic("rowKey")((x: Any) match {
        case func: ((js.Dictionary[js.Any], Int) => CallbackTo[String]) @unchecked =>
          (v1: js.Dictionary[js.Any], v2: Int) =>
            func(v1, v2).runNow()
        case s: String => s
      })
    }
    rowClassName.foreach { x =>
      p.updateDynamic("rowClassName")(
        (v1: js.Dictionary[js.Any], v2: Int, v3: Int) => x(v1, v2, v3).runNow()
      )
    }
    rowRef.foreach { x =>
      p.updateDynamic("rowRef")(
        (v1: js.Dictionary[js.Any], v2: Int, v3: Int) => x(v1, v2, v3).runNow()
      )
    }
    defaultExpandedRowKeys.foreach { x =>
      p.updateDynamic("defaultExpandedRowKeys")(x)
    }
    expandedRowKeys.foreach { x =>
      p.updateDynamic("expandedRowKeys")(x)
    }
    defaultExpandAllRows.foreach { x =>
      p.updateDynamic("defaultExpandAllRows")(x)
    }
    onExpandedRowsChange.foreach { x =>
      p.updateDynamic("onExpandedRowsChange")((v1: js.Array[String]) => x(v1).runNow())
    }
    onExpand.foreach { x =>
      p.updateDynamic("onExpand")(
        (v1: js.Array[String], v2: js.Dictionary[js.Any]) => x(v1, v2).runNow()
      )
    }
    expandedRowClassName.foreach { x =>
      p.updateDynamic("expandedRowClassName")(
        (v1: js.Dictionary[js.Any], v2: Int, v3: Int) => x(v1, v2, v3).runNow()
      )
    }
    data.foreach { x =>
      p.updateDynamic("data")(x.map(_.toJS))
    }
    indentSize.foreach { x =>
      p.updateDynamic("indentSize")(x)
    }
    onRowClick.foreach { x =>
      p.updateDynamic("onRowClick")(
        (v1: js.Dictionary[js.Any], v2: Int) => x(v1, v2).runNow()
      )
    }
    onRowDoubleClick.foreach { x =>
      p.updateDynamic("onRowDoubleClick")(
        (v1: js.Dictionary[js.Any], v2: Int) => x(v1, v2).runNow()
      )
    }
    showHeader.foreach { x =>
      p.updateDynamic("showHeader")(x)
    }
    title.foreach { x =>
      p.updateDynamic("title")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    footer.foreach { x =>
      p.updateDynamic("footer")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    getBodyWrapper.foreach { x =>
      p.updateDynamic("getBodyWrapper")(
        (v1: ReactElement) => x(v1).runNow()
      )
    }
    emptyText.foreach { x =>
      p.updateDynamic("emptyText")(x)
    }
    columns.foreach { x =>
      p.updateDynamic("columns")(x.map(_.toJS))
    }
    p
  }

  def apply(children: ReactNode*) = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Table)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Table {

  /**
    * https://github.com/react-component/table/tree/master#column-props
    * @param key key of this column
    * @param className className of this column
    * @param colSpan thead colSpan of this column
    * @param title title of this column
    * @param dataIndex display field of the data record
    * @param width width of the specific proportion calculation according to the width of the columns
    * @param fixed this column will be fixed when table scroll horizontally: true or 'left' or 'right'
    * @param render The render function of cell, has three params: the text of this cell, the record of this row,
    *               the index of this row, it's return an object:{ children: value, props: { colSpan: 1, rowSpan:1 } } ==> 'children'
    *               is the text of this cell, props is some setting of this cell, eg: 'colspan' set td colspan, 'rowspan' set td rowspan
    * @param onCellClick Called when column's cell is clicked
    */
  case class Column(key: js.UndefOr[String] = js.undefined,
                    className: js.UndefOr[String] = js.undefined,
                    colSpan: js.UndefOr[Int] = js.undefined,
                    title: js.UndefOr[String] = js.undefined,
                    dataIndex: js.UndefOr[String] = js.undefined,
                    width: js.UndefOr[String | Int] = js.undefined,
                    fixed: js.UndefOr[Column.Fixed] = js.undefined,
                    render: js.UndefOr[(String, js.Dictionary[js.Any], Int) => CallbackTo[ReactNode]] = js.undefined,
                    onCellClick: js.UndefOr[(String, Event) => CallbackTo[Unit]] = js.undefined) {
    def toJS = {
      val p = js.Dynamic.literal()
      key.foreach { x =>
        p.updateDynamic("key")(x)
      }
      className.foreach { x =>
        p.updateDynamic("className")(x)
      }
      colSpan.foreach { x =>
        p.updateDynamic("colSpan")(x)
      }
      title.foreach { x =>
        p.updateDynamic("title")(x)
      }
      dataIndex.foreach { x =>
        p.updateDynamic("dataIndex")(x)
      }
      width.foreach { x =>
        p.updateDynamic("width")((x: Any) match {
          case int: Int  => int
          case s: String => s
        })
      }
      fixed.foreach { x =>
        p.updateDynamic("fixed")(x.id)
      }
      render.foreach { fn =>
        p.updateDynamic("render")(
          (t0: String, t1: js.Dictionary[js.Any], t3: Int) => fn(t0, t1, t3).runNow()
        )
      }
      onCellClick.foreach { x =>
        p.updateDynamic("onCellClick")(
          (s1: String, s2: Event) => x(s1, s2).runNow()
        )
      }
      p
    }
  }

  object Column {
    sealed abstract class Fixed(val id: String)

    object Fixed {
      case object Left  extends Fixed("left")
      case object Right extends Fixed("right")
    }
  }

  case class DataSource(key: String, data: js.Dictionary[js.Any]) {
    def toJS = {
      val p = js.Dynamic.literal()
      p.updateDynamic("key")(key)
      data.foreach {
        case (k, v) =>
          p.updateDynamic(k)(v.toString)
      }
      p
    }
  }

  case class Scroll(x: js.UndefOr[Int], y: js.UndefOr[Int]) {
    def toJS = {
      val p = js.Dynamic.literal()
      x.foreach { _x =>
        p.updateDynamic("x")(_x)
      }
      y.foreach { y =>
        p.updateDynamic("y")(y)
      }
      p
    }
  }

}
