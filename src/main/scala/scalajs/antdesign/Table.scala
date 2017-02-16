package scalajs.antdesign

import japgolly.scalajs.react._
import org.scalajs.dom.Event

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object, |}

/**
  * @see https://ant.design/components/table/#API
  * @param rowSelection row selection config
  * @param pagination pagination config, hide it via setting to false
  * @param size size of table: [[scalajs.antdesign.Table.Size.Default]], [[scalajs.antdesign.Table.Size.Middle]] or [[scalajs.antdesign.Table.Size.Small]]
  * @param dataSource data record array to be rendered
  * @param columns columns of table
  * @param rowKey get row's key, could be a string or function
  * @param rowClassName get row's className
  * @param expandedRowRender expanded container render for each row
  * @param defaultExpandedRowKeys initial expanded row keys
  * @param expandedRowKeys current expanded rows keys
  * @param defaultExpandAllRows expand all rows initially
  * @param onExpandedRowsChange function to call when the expanded rows change
  * @param onExpand function to call when click expand icon
  * @param onChange callback that is called when pagination, filters, sorter is changed
  * @param loading loading status of table
  * @param locale i18n text include filter, sort, empty text...etc
  * @param indentSize index pixel size of tree data
  * @param onRowClick callback that is called when click a row
  * @param bordered whether to show table border completely
  * @param showHeader whether to show table header
  * @param footer table footer renderer
  * @param title table title renderer
  * @param scroll whether table can be scroll in x/y direction, x or y can be a number that indicated the width and height of table body
  */
case class Table(
    rowSelection: js.UndefOr[Table.RowSelection] = js.undefined,
    pagination: js.UndefOr[Boolean | Pagination] = js.undefined,
    size: js.UndefOr[Table.Size] = js.undefined,
    dataSource: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
    columns: js.UndefOr[js.Array[Table.Column]] = js.undefined,
    rowKey: js.UndefOr[String | (js.Dictionary[js.Any] => CallbackTo[Unit])] = js.undefined,
    rowClassName: js.UndefOr[(js.Dictionary[js.Any], Int) => CallbackTo[String]] = js.undefined,
    expandedRowRender: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[ReactNode]] = js.undefined,
    defaultExpandedRowKeys: js.UndefOr[js.Array[String]] = js.undefined,
    expandedRowKeys: js.UndefOr[js.Array[String]] = js.undefined,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    onExpandedRowsChange: js.UndefOr[js.Array[js.Dictionary[js.Any]] => CallbackTo[Unit]] = js.undefined,
    onExpand: js.UndefOr[(js.Array[js.Dictionary[js.Any]], js.Dictionary[js.Any]) => CallbackTo[Unit]] = js.undefined,
    onChange: js.UndefOr[(js.Dictionary[js.Any], js.Dictionary[js.Any], js.Dictionary[js.Any]) => CallbackTo[Unit]] =
      js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: js.UndefOr[Table.Locale] = js.undefined,
    indentSize: js.UndefOr[Int] = js.undefined,
    onRowClick: js.UndefOr[(js.Dictionary[js.Any], Int) => CallbackTo[Unit]] = js.undefined,
    bordered: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    footer: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[String]] = js.undefined,
    title: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[String]] = js.undefined,
    scroll: js.UndefOr[Table.Scroll] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()

    rowSelection.foreach { x =>
      p.updateDynamic("rowSelection")(x.toJS)
    }
    pagination.foreach { x =>
      p.updateDynamic("pagination")((x: Any) match {
        case b: Boolean    => b
        case p: Pagination => p.toJS
      })
    }
    size.foreach { x =>
      p.updateDynamic("size")(x.id)
    }
    dataSource.foreach { x =>
      p.updateDynamic("dataSource")(x)
    }
    columns.foreach { x =>
      p.updateDynamic("columns")(x.map(_.toJS))
    }
    rowKey.foreach { x =>
      p.updateDynamic("rowKey")((x: Any) match {
        case func: ((js.Dictionary[js.Any]) => CallbackTo[String]) @unchecked =>
          (v1: js.Dictionary[js.Any]) =>
            func(v1).runNow()
        case s: String => s
      })
    }
    rowClassName.foreach { x =>
      p.updateDynamic("rowClassName")(
        (v1: js.Dictionary[js.Any], v2: Int) => x(v1, v2).runNow()
      )
    }
    expandedRowRender.foreach { x =>
      p.updateDynamic("expandedRowRender")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
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
      p.updateDynamic("onExpandedRowsChange")((v1: js.Array[js.Dictionary[js.Any]]) => x(v1).runNow())
    }
    onExpand.foreach { x =>
      p.updateDynamic("onExpand")(
        (v1: js.Array[js.Dictionary[js.Any]], v2: js.Dictionary[js.Any]) => x(v1, v2).runNow()
      )
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: js.Dictionary[js.Any], v2: js.Dictionary[js.Any], v3: js.Dictionary[js.Any]) => x(v1, v2, v3).runNow()
      )
    }
    loading.foreach { x =>
      p.updateDynamic("loading")(x)
    }
    locale.foreach { x =>
      p.updateDynamic("locale")(x.toJS)
    }
    indentSize.foreach { x =>
      p.updateDynamic("indentSize")(x)
    }
    onRowClick.foreach { x =>
      p.updateDynamic("onRowClick")(
        (v1: js.Dictionary[js.Any], v2: Int) => x(v1, v2).runNow()
      )
    }
    bordered.foreach { x =>
      p.updateDynamic("bordered")(x)
    }
    showHeader.foreach { x =>
      p.updateDynamic("showHeader")(x)
    }
    footer.foreach { x =>
      p.updateDynamic("footer")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    title.foreach { x =>
      p.updateDynamic("title")(
        (v1: js.Dictionary[js.Any]) => x(v1).runNow()
      )
    }
    scroll.foreach { x =>
      p.updateDynamic("scroll")(x.toJS)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Table)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Table {

  /**
    * https://ant.design/components/table/#rowSelection
    * @param `type` [[scalajs.antdesign.Table.RowSelection.Type.Checkbox]] or [[scalajs.antdesign.Table.RowSelection.Type.Radio]]
    * @param selectedRowKeys controlled selected row keys
    * @param onChange callback that is called when selected rows change
    * @param getCheckboxProps get Checkbox or Radio props
    * @param onSelect callback that is called when select/deselect one row
    * @param onSelectAll callback that is called when select/deselect all
    */
  case class RowSelection(
      `type`: js.UndefOr[RowSelection.Type] = js.undefined,
      selectedRowKeys: js.UndefOr[js.Array[String]] = js.undefined,
      onChange: js.UndefOr[(js.Array[String], js.Array[String]) => CallbackTo[Unit]] = js.undefined,
      getCheckboxProps: js.UndefOr[js.Dictionary[js.Any] => CallbackTo[js.Dictionary[js.Any]]] = js.undefined,
      onSelect: js.UndefOr[(js.Dictionary[js.Any], Boolean, js.Array[js.Dictionary[js.Any]]) => CallbackTo[Unit]] =
        js.undefined,
      onSelectAll: js.UndefOr[(Boolean, js.Array[js.Dictionary[js.Any]], js.Array[js.Dictionary[js.Any]]) => CallbackTo[
        Unit]] = js.undefined) {

    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      `type`.foreach { x =>
        p.updateDynamic("type")(x.id)
      }
      selectedRowKeys.foreach { x =>
        p.updateDynamic("selectedRowKeys")(x)
      }
      onChange.foreach { x =>
        p.updateDynamic("onChange")(
          (v1: js.Array[String], v2: js.Array[String]) => x(v1, v2).runNow()
        )
      }
      getCheckboxProps.foreach { x =>
        p.updateDynamic("getCheckboxProps")(
          (v1: js.Dictionary[js.Any]) => x(v1).runNow()
        )
      }
      onSelect.foreach { x =>
        p.updateDynamic("onSelect")(
          (v1: js.Dictionary[js.Any], v2: Boolean, v3: js.Array[js.Dictionary[js.Any]]) => x(v1, v2, v3).runNow()
        )
      }
      onSelectAll.foreach { x =>
        p.updateDynamic("onSelectAll")(
          (v1: Boolean, v2: js.Array[js.Dictionary[js.Any]], v3: js.Array[js.Dictionary[js.Any]]) =>
            x(v1, v2, v3).runNow()
        )
      }
      p
    }
  }

  object RowSelection {
    sealed abstract class Type(val id: String)

    object Type {
      case object Radio    extends Type("radio")
      case object Checkbox extends Type("checkbox")
    }
  }

  sealed abstract class Size(val id: String)

  object Size {
    case object Default extends Size("default")
    case object Middle  extends Size("middle")
    case object Small   extends Size("small")
  }

  case class Locale(filterTitle: String, filterConfirm: String, filterReset: String, emptyText: String) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      p.updateDynamic("filterTitle")(filterTitle)
      p.updateDynamic("filterConfirm")(filterConfirm)
      p.updateDynamic("filterReset")(filterReset)
      p.updateDynamic("emptyText")(emptyText)
      p
    }
  }

  /**
    * https://ant.design/components/table/#Column
    * @param title title of this column
    * @param key key of this column
    * @param dataIndex display field of the data record, could be set like a.b.c
    * @param render renderer of table cell, has three params: text, record and index of this row. The render value should be a ReactNode, or a object for colSpan/rowSpan config
    * @param filters filter menu config
    * @param onFilter callback that is called when when click confirm filter button
    * @param filterMultiple whether to select multiple filtered item
    * @param filterDropdown customized filter overlay
    * @param filterDropdownVisible whether filterDropdown is visible
    * @param onFilterDropdownVisibleChange called when filterDropdownVisible is changed
    * @param filteredValue controlled filtered value
    * @param sorter sorter	sort function for local sort. If you need sort buttons only, set it true
    * @param colSpan span of this column's title
    * @param width width of this column
    * @param className className of this column
    * @param fixed set column to be fixed: true(same as left) [[scalajs.antdesign.Table.Column.Fixed.Left]] [[scalajs.antdesign.Table.Column.Fixed.Right]]
    * @param sortOrder controlled sorted value: [[scalajs.antdesign.SortOrder.Ascend]] [[scalajs.antdesign.SortOrder.Descend]] false
    * @param onCellClick callback when click cell
    */
  case class Column(
      title: js.UndefOr[String | ReactNode] = js.undefined,
      key: js.UndefOr[String] = js.undefined,
      dataIndex: js.UndefOr[String] = js.undefined,
      render: js.UndefOr[(String, js.Dictionary[js.Any], Int) => CallbackTo[ReactNode]] = js.undefined,
      filters: js.UndefOr[js.Array[js.Dictionary[js.Any]]] = js.undefined,
      onFilter: js.UndefOr[(String, js.Dictionary[js.Any]) => CallbackTo[Boolean]] = js.undefined,
      filterMultiple: js.UndefOr[Boolean] = js.undefined,
      filterDropdown: js.UndefOr[ReactNode] = js.undefined,
      filterDropdownVisible: js.UndefOr[Boolean] = js.undefined,
      onFilterDropdownVisibleChange: js.UndefOr[Boolean => CallbackTo[Unit]] = js.undefined,
      filteredValue: js.UndefOr[js.Array[String]] = js.undefined,
      sorter: js.UndefOr[String | (js.Dictionary[js.Any], js.Dictionary[js.Any]) => CallbackTo[Boolean]] = js.undefined,
      colSpan: js.UndefOr[Int] = js.undefined,
      width: js.UndefOr[String | Boolean] = js.undefined,
      className: js.UndefOr[String] = js.undefined,
      fixed: js.UndefOr[Boolean | Column.Fixed] = js.undefined,
      sortOrder: js.UndefOr[Boolean | SortOrder] = js.undefined,
      onCellClick: js.UndefOr[(js.Dictionary[js.Any], Event) => CallbackTo[Unit]] = js.undefined) {

    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      title.foreach { x =>
        p.updateDynamic("title")(x.asInstanceOf[js.Any])
      }
      key.foreach { x =>
        p.updateDynamic("key")(x)
      }
      dataIndex.foreach { x =>
        p.updateDynamic("dataIndex")(x)
      }
      render.foreach { x =>
        p.updateDynamic("render")(
          (v1: String, v2: js.Dictionary[js.Any], v3: Int) => x(v1, v2, v3).runNow()
        )
      }
      filters.foreach { x =>
        p.updateDynamic("filters")(x)
      }
      onFilter.foreach { x =>
        p.updateDynamic("onFilter")(
          (v1: String, v2: js.Dictionary[js.Any]) => x(v1, v2).runNow()
        )
      }
      filterMultiple.foreach { x =>
        p.updateDynamic("filterMultiple")(x)
      }
      filterDropdown.foreach { x =>
        p.updateDynamic("filterDropdown")(x)
      }
      filterDropdownVisible.foreach { x =>
        p.updateDynamic("filterDropdownVisible")(x)
      }
      onFilterDropdownVisibleChange.foreach { x =>
        p.updateDynamic("onFilterDropdownVisibleChange")(
          (v1: Boolean) => x(v1).runNow()
        )
      }
      filteredValue.foreach { x =>
        p.updateDynamic("filteredValue")(x)
      }
      sorter.foreach { x =>
        p.updateDynamic("sorter")((x: Any) match {
          case s: String => s
          case func: ((js.Dictionary[js.Any], js.Dictionary[js.Any]) => CallbackTo[String]) @unchecked =>
            (v1: js.Dictionary[js.Any], v2: js.Dictionary[js.Any]) =>
              func(v1, v2).runNow()
        })
      }
      colSpan.foreach { x =>
        p.updateDynamic("colSpan")(x)
      }
      width.foreach { x =>
        p.updateDynamic("width")(x.asInstanceOf[js.Any])
      }
      className.foreach { x =>
        p.updateDynamic("className")(x)
      }
      fixed.foreach { x =>
        p.updateDynamic("fixed")((x: Any) match {
          case b: Boolean      => b
          case c: Column.Fixed => c.id
        })
      }
      sortOrder.foreach { x =>
        p.updateDynamic("sortOrder")((x: Any) match {
          case b: Boolean   => b
          case s: SortOrder => s.id
        })
      }
      onCellClick.foreach { x =>
        p.updateDynamic("onCellClick")(
          (v1: js.Dictionary[js.Any], v2: Event) => x(v1, v2).runNow()
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

  case class Scroll(x: js.UndefOr[Int], y: js.UndefOr[Int]) {
    def toJS: Object with Dynamic = {
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
