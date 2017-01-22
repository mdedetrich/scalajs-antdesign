package scalajs.antdesign

import japgolly.scalajs.react.CallbackTo

import scala.scalajs.js

/**
  * https://github.com/react-component/pagination#api
  * @param defaultCurrent default current page number
  * @param current current page number
  * @param total total number of data
  * @param defaultPageSize default number of data per page
  * @param pageSize number of data per page
  * @param onChange a callback function, can be executed when the page number is changing, and it takes the resulting page number as an argument
  * @param showSizeChanger determine whether [[pageSize]] can be changed
  * @param pageSizeOptions specify the sizeChanger selections
  * @param onShowSizeChange a callback function, can be executed when [[pageSize]] is changing
  * @param showQuickJumper determine whether you can jump to a page directly
  * @param showTotal to display the total number and range
  * @param className className of pagination
  * @param simple whether to use simple mode
  * @param local to set l10n config
  * @param style the style of pagination
  */
case class Pagination(defaultCurrent: js.UndefOr[Int] = js.undefined,
                      current: js.UndefOr[Int] = js.undefined,
                      total: js.UndefOr[Int] = js.undefined,
                      defaultPageSize: js.UndefOr[Int] = js.undefined,
                      pageSize: js.UndefOr[Int] = js.undefined,
                      onChange: js.UndefOr[(js.Dynamic) => CallbackTo[Unit]] = js.undefined,
                      showSizeChanger: js.UndefOr[Boolean] = js.undefined,
                      pageSizeOptions: js.UndefOr[js.Array[Int]] = js.undefined,
                      onShowSizeChange: js.UndefOr[(Int, Int) => CallbackTo[Unit]] = js.undefined,
                      showQuickJumper: js.UndefOr[Boolean] = js.undefined,
                      showTotal: js.UndefOr[(Int, Int) => CallbackTo[Unit]] = js.undefined,
                      className: js.UndefOr[String] = js.undefined,
                      simple: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                      local: js.UndefOr[Pagination.Locale] = js.undefined,
                      style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    defaultCurrent.foreach { x =>
      p.updateDynamic("defaultCurrent")(x)
    }
    current.foreach { x =>
      p.updateDynamic("current")(x)
    }
    total.foreach { x =>
      p.updateDynamic("total")(x)
    }
    defaultPageSize.foreach { x =>
      p.updateDynamic("defaultPageSize")(x)
    }
    pageSize.foreach { x =>
      p.updateDynamic("pageSize")(x)
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: js.Dynamic) => x(v1).runNow()
      )
    }
    showSizeChanger.foreach { x =>
      p.updateDynamic("showSizeChanger")(x)
    }
    pageSizeOptions.foreach { x =>
      p.updateDynamic("pageSizeOptions")(x)
    }
    onShowSizeChange.foreach { x =>
      p.updateDynamic("onShowSizeChange")(
        (v1: Int, v2: Int) => x(v1, v2).runNow()
      )
    }
    showQuickJumper.foreach { x =>
      p.updateDynamic("showQuickJumper")(x)
    }
    showTotal.foreach { x =>
      p.updateDynamic("showTotal")(
        (v1: Int, v2: Int) => x(v1, v2).runNow()
      )
    }
    className.foreach { x =>
      p.updateDynamic("className")(x)
    }
    simple.foreach { x =>
      p.updateDynamic("simple")(x)
    }
    local.foreach { x =>
      p.updateDynamic("local")(x.toJS)
    }
    style.foreach { x =>
      p.updateDynamic("style")(x)
    }
    p
  }
}

object Pagination {
  case class Locale(itemsPerPage: String,
                    jumpTo: String,
                    page: String,
                    prevPage: String,
                    nextPage: String,
                    prev5: String,
                    next5: String) {
    def toJS = {
      val p = js.Dynamic.literal()
      p.updateDynamic("items_per_page")(itemsPerPage)
      p.updateDynamic("jump_to")(jumpTo)
      p.updateDynamic("page")(page)
      p.updateDynamic("prev_page")(prevPage)
      p.updateDynamic("nextPage")(nextPage)
      p.updateDynamic("prev5")(prev5)
      p.updateDynamic("next5")(next5)
      p
    }
  }

  object Locale {
    val en_US: Locale = ???
    val fr_BE: Locale = ???
    val ru_RU: Locale = ???
    val sv_SE: Locale = ???
    val zh_CN: Locale = ???

  }

}
