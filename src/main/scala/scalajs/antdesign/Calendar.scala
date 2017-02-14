package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactElement, ReactNode}
import moment.Date

import scala.scalajs.js
import scala.scalajs.js.{Dynamic, Object}
import scala.scalajs.js.annotation.JSImport

/**
  * @see https://ant.design/components/calendar/#API
  * @param value set date
  * @param defaultValue set default date
  * @param mode can be set to month or year
  * @param fullScreen to set whether full-screen display
  * @param dateCellRender to set the way of renderer the date cell
  * @param monthCellRender to set the way of renderer the month cell
  * @param locale set locale
  * @param onPanelChange the callback when panel change
  */
case class Calendar(value: js.UndefOr[Date] = js.undefined,
                    defaultValue: js.UndefOr[Date] = js.undefined,
                    mode: js.UndefOr[Calendar.Mode] = js.undefined,
                    fullScreen: js.UndefOr[Boolean] = js.undefined,
                    dateCellRender: js.UndefOr[Date => CallbackTo[ReactNode]] = js.undefined,
                    monthCellRender: js.UndefOr[Date => CallbackTo[ReactNode]] = js.undefined,
                    locale: js.UndefOr[Calendar.Locale] = js.undefined,
                    onPanelChange: js.UndefOr[(Date, Calendar.Mode) => CallbackTo[Unit]] = js.undefined) {
  def toJS: Object with Dynamic = {
    val p = js.Dynamic.literal()

    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    mode.foreach { x =>
      p.updateDynamic("mode")(x.id)
    }
    fullScreen.foreach { x =>
      p.updateDynamic("fullScreen")(x)
    }
    dateCellRender.foreach { x =>
      p.updateDynamic("dateCellRender")(
        (v1: Date) => x(v1).runNow()
      )
    }
    monthCellRender.foreach { x =>
      p.updateDynamic("dateCellRender")(
        (v1: Date) => x(v1).runNow()
      )
    }
    locale.foreach { x =>
      p.updateDynamic("locale")(x.toJS)
    }
    onPanelChange.foreach { x =>
      p.updateDynamic("onPanelChange")(
        (v1: Date, v2: Calendar.Mode) => x(v1, v2).runNow()
      )
    }
    p
  }

  def apply(children: ReactNode*): ReactComponentU_ = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Calendar)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Calendar {
  sealed abstract class Mode(val id: String)

  object Mode {
    case object Month extends Mode("month")
    case object Year  extends Mode("year")
  }

  case class Locale(
      today: String,
      now: String,
      backToToday: String,
      ok: String,
      clear: String,
      month: String,
      year: String,
      timeSelect: String,
      dateSelect: String,
      monthSelect: String,
      yearSelect: String,
      decadeSelect: String,
      yearFormat: String,
      dateFormat: String,
      dayFormat: String,
      dateTimeFormat: String,
      monthFormat: String,
      monthBeforeYear: js.UndefOr[Boolean],
      previousMonth: String,
      nextMonth: String,
      previousYear: String,
      nextYear: String,
      previousDecade: String,
      nextDecade: String,
      previousCentury: String,
      nextCentury: String
  ) {
    def toJS: Object with Dynamic = {
      val p = js.Dynamic.literal()
      p.updateDynamic("today")(today)
      p.updateDynamic("now")(now)
      p.updateDynamic("backToToday")(backToToday)
      p.updateDynamic("ok")(ok)
      p.updateDynamic("clear")(clear)
      p.updateDynamic("month")(month)
      p.updateDynamic("year")(year)
      p.updateDynamic("timeSelect")(timeSelect)
      p.updateDynamic("dateSelect")(dateSelect)
      p.updateDynamic("monthSelect")(monthSelect)
      p.updateDynamic("yearSelect")(yearSelect)
      p.updateDynamic("decadeSelect")(decadeSelect)
      p.updateDynamic("yearFormat")(yearFormat)
      p.updateDynamic("dateFormat")(dateFormat)
      p.updateDynamic("dayFormat")(dayFormat)
      p.updateDynamic("dateTimeFormat")(dateTimeFormat)
      p.updateDynamic("monthFormat")(monthFormat)
      monthBeforeYear.foreach { x =>
        p.updateDynamic("monthBeforeYear")(x)
      }
      p.updateDynamic("previousMonth")(previousMonth)
      p.updateDynamic("nextMonth")(nextMonth)
      p.updateDynamic("previousYear")(previousYear)
      p.updateDynamic("nextYear")(nextYear)
      p.updateDynamic("previousDecade")(previousDecade)
      p.updateDynamic("nextDecade")(nextDecade)
      p.updateDynamic("previousCentury")(previousCentury)
      p.updateDynamic("nextCentury")(nextCentury)
      p
    }

    def apply(children: ReactNode*): ReactComponentU_ = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.antd.Calendar)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

  @js.native
  private trait LocaleReference extends js.Any {
    val today: String                        = js.native
    val now: String                          = js.native
    val backToToday: String                  = js.native
    val ok: String                           = js.native
    val clear: String                        = js.native
    val month: String                        = js.native
    val year: String                         = js.native
    val timeSelect: String                   = js.native
    val dateSelect: String                   = js.native
    val monthSelect: String                  = js.native
    val yearSelect: String                   = js.native
    val decadeSelect: String                 = js.native
    val yearFormat: String                   = js.native
    val dateFormat: String                   = js.native
    val dayFormat: String                    = js.native
    val dateTimeFormat: String               = js.native
    val monthFormat: String                  = js.native
    val monthBeforeYear: js.UndefOr[Boolean] = js.native
    val previousMonth: String                = js.native
    val nextMonth: String                    = js.native
    val previousYear: String                 = js.native
    val nextYear: String                     = js.native
    val previousDecade: String               = js.native
    val nextDecade: String                   = js.native
    val previousCentury: String              = js.native
    val nextCentury: String                  = js.native
  }

  private def toLocale(localeReference: LocaleReference): Locale = Locale(
    localeReference.today,
    localeReference.now,
    localeReference.backToToday,
    localeReference.ok,
    localeReference.clear,
    localeReference.month,
    localeReference.year,
    localeReference.timeSelect,
    localeReference.dateSelect,
    localeReference.monthSelect,
    localeReference.yearSelect,
    localeReference.decadeSelect,
    localeReference.yearFormat,
    localeReference.dateFormat,
    localeReference.dayFormat,
    localeReference.dateTimeFormat,
    localeReference.monthFormat,
    localeReference.monthBeforeYear,
    localeReference.previousMonth,
    localeReference.nextMonth,
    localeReference.previousYear,
    localeReference.nextYear,
    localeReference.previousDecade,
    localeReference.nextDecade,
    localeReference.previousCentury,
    localeReference.nextCentury
  )

  @js.native
  @JSImport("lib/calendar/locale/cs_CZ.js", JSImport.Default)
  private object _cs_CZ extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/da_DK.js", JSImport.Default)
  private object _da_DK extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/de_DE.js", JSImport.Default)
  private object _de_DE extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/en_US.js", JSImport.Default)
  private object _en_US extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/fr_BE.js", JSImport.Default)
  private object _fr_BE extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/ja_JP.js", JSImport.Default)
  private object _ja_JP extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/ko_KR.js", JSImport.Default)
  private object _ko_KR extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/pl_PL.js", JSImport.Default)
  private object _pl_PL extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/pt_BR.js", JSImport.Default)
  private object _pt_BR extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/ru_RU.js", JSImport.Default)
  private object _ru_RU extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/sv_SE.js", JSImport.Default)
  private object _sv_SE extends LocaleReference

  @js.native
  @JSImport("lib/calendar/locale/zh_CN.js", JSImport.Default)
  private object _zh_CN extends LocaleReference

  object Locale {
    val cs_CZ: Locale = toLocale(_cs_CZ)
    val da_DK: Locale = toLocale(_da_DK)
    val de_DE: Locale = toLocale(_de_DE)
    val en_US: Locale = toLocale(_en_US)
    val fr_BE: Locale = toLocale(_fr_BE)
    val ja_JP: Locale = toLocale(_ja_JP)
    val ko_KR: Locale = toLocale(_ko_KR)
    val pl_PL: Locale = toLocale(_pl_PL)
    val pt_BR: Locale = toLocale(_pt_BR)
    val ru_RU: Locale = toLocale(_ru_RU)
    val sv_SE: Locale = toLocale(_sv_SE)
    val zh_CN: Locale = toLocale(_zh_CN)
  }
}
