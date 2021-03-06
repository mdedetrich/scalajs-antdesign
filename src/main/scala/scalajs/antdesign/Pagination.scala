package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactNode}

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}
import scala.scalajs.js.annotation.JSImport

/**
  * @see https://github.com/react-component/pagination#api
  * @param current current page number
  * @param defaultCurrent default current page number
  * @param total total number of data
  * @param defaultPageSize default number of data per page
  * @param pageSize number of data per page
  * @param onChange a callback function, can be executed when the page number is changing, and it takes the resulting page number as an argument
  * @param showSizeChanger determine whether [[pageSize]] can be changed
  * @param pageSizeOptions specify the sizeChanger selections
  * @param onShowSizeChange a callback function, can be executed when [[pageSize]] is changing
  * @param showQuickJumper determine whether you can jump to a page directly
  * @param size specify the size of Pagination, can be set to small
  * @param simple whether to use simple mode
  * @param showTotal to display the total number and range
  * @param local to set l10n config
  */
case class Pagination(defaultCurrent: js.UndefOr[Int] = js.undefined,
                      current: js.UndefOr[Int] = js.undefined,
                      total: js.UndefOr[Int] = js.undefined,
                      defaultPageSize: js.UndefOr[Int] = js.undefined,
                      pageSize: js.UndefOr[Int] = js.undefined,
                      onChange: js.UndefOr[(js.Dynamic, Int) => CallbackTo[Unit]] = js.undefined,
                      showSizeChanger: js.UndefOr[Boolean] = js.undefined,
                      pageSizeOptions: js.UndefOr[js.Array[Int]] = js.undefined,
                      onShowSizeChange: js.UndefOr[(Int, Int) => CallbackTo[Unit]] = js.undefined,
                      showQuickJumper: js.UndefOr[Boolean] = js.undefined,
                      size: js.UndefOr[Pagination.Size] = js.undefined,
                      simple: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                      showTotal: js.UndefOr[(Int, Int) => CallbackTo[Unit]] = js.undefined,
                      local: js.UndefOr[Pagination.Locale] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()
    current.foreach { x =>
      p.updateDynamic("current")(x)
    }
    defaultCurrent.foreach { x =>
      p.updateDynamic("defaultCurrent")(x)
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
        (v1: js.Dynamic, v2: Int) => x(v1, v2).runNow()
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
    simple.foreach { x =>
      p.updateDynamic("simple")(x)
    }
    local.foreach { x =>
      p.updateDynamic("local")(x.toJS)
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Pagination)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Pagination {
  sealed abstract class Size(val id: String)

  object Size {
    case object Small extends Size("small")
  }

  case class Locale(itemsPerPage: String,
                    jumpTo: String,
                    page: String,
                    prevPage: String,
                    nextPage: String,
                    prev5: String,
                    next5: String) {
    def toJS: Object with Dynamic = {
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

  @js.native
  private trait LocaleReference extends js.Any {
    val items_per_page: String = js.native
    val jump_to: String        = js.native
    val page: String           = js.native
    val prev_page: String      = js.native
    val next_page: String      = js.native
    val prev5: String          = js.native
    val next5: String          = js.native
  }

  private def toLocale(localeReference: LocaleReference): Locale =
    Locale(localeReference.items_per_page,
           localeReference.jump_to,
           localeReference.page,
           localeReference.prev_page,
           localeReference.next_page,
           localeReference.prev5,
           localeReference.next5)

  @js.native
  @JSImport("lib/pagination/locale/en_US.js", JSImport.Default)
  private object _en_US extends LocaleReference

  @js.native
  @JSImport("lib/pagination/locale/ru_RU.js", JSImport.Default)
  private object _ru_RU extends LocaleReference

  @js.native
  @JSImport("lib/pagination/locale/zh_CN.js", JSImport.Default)
  private object _zh_CN extends LocaleReference

  object Locale {
    val en_US: Locale = toLocale(_en_US)
    val ru_RU: Locale = toLocale(_ru_RU)
    val zh_CN: Locale = toLocale(_zh_CN)
  }

}
