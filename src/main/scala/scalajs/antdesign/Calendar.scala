package scalajs.antdesign

import japgolly.scalajs.react.{CallbackTo, React, ReactComponentU_, ReactElement, ReactNode}
import moment.Date

import scala.scalajs.js

/**
  * https://github.com/react-component/calendar#api
  * @param prefixCls prefixCls of this component
  * @param className additional css class of root dom node
  * @param style additional style of root dom node
  * @param renderSidebar side bar
  * @param renderFooter extra footer
  * @param value current value like input's value
  * @param defaultValue defaultValue like input's defaultValue
  * @param locale calendar locale
  * @param format use to format/parse date(without time) value to/from input
  * @param disabledDate use to format/parse date(without time) value to/from input
  * @param disabledTime a function which return a object with member of disabledHours/disabledMinutes/disabledSeconds according to rc-time-picker
  * @param showDateInput whether to show input on top of calendar panel
  * @param showWeekNumber whether to show week number of year
  * @param showToday whether to show today button
  * @param showOk whether has ok button in footer
  * @param timePicker rc-timer-picker/lib/module/panel element
  * @param onSelect called when a date is selected from calendar
  * @param onChange called when a date is changed inside calendar (next year/next month/keyboard)
  * @param dateInputPlaceholder date input's placeholder
  */
case class Calendar(prefixCls: js.UndefOr[String] = js.undefined,
                    className: js.UndefOr[String] = js.undefined,
                    style: js.UndefOr[js.Dictionary[js.Any]] = js.undefined,
                    renderSidebar: js.UndefOr[(ReactNode) => CallbackTo[Unit]] = js.undefined,
                    renderFooter: js.UndefOr[(ReactNode) => CallbackTo[Unit]] = js.undefined,
                    value: js.UndefOr[Date] = js.undefined,
                    defaultValue: js.UndefOr[Date] = js.undefined,
                    locale: js.UndefOr[Calendar.Locale] = js.undefined,
                    format: js.UndefOr[String] = js.undefined,
                    disabledDate: js.UndefOr[Date => CallbackTo[Boolean]] = js.undefined,
                    disabledTime: js.UndefOr[Date => CallbackTo[Calendar.DisabledTime]] = js.undefined,
                    showDateInput: js.UndefOr[Boolean] = js.undefined,
                    showWeekNumber: js.UndefOr[Boolean] = js.undefined,
                    showToday: js.UndefOr[Boolean] = js.undefined,
                    showOk: js.UndefOr[Boolean] = js.undefined,
                    timePicker: js.UndefOr[ReactElement] = js.undefined,
                    onSelect: js.UndefOr[Date => CallbackTo[Unit]] = js.undefined,
                    onChange: js.UndefOr[Date => CallbackTo[Unit]] = js.undefined,
                    dateInputPlaceholder: js.UndefOr[String] = js.undefined) {
  def toJS = {
    val p = js.Dynamic.literal()
    prefixCls.foreach { x =>
      p.updateDynamic("prefixCls")(x)
    }
    className.foreach { x =>
      p.updateDynamic("className")(x)
    }
    style.foreach { x =>
      p.updateDynamic("style")(x)
    }
    renderSidebar.foreach { x =>
      p.updateDynamic("renderSidebar")(
        (v1: ReactNode) => x(v1).runNow()
      )
    }
    renderFooter.foreach { x =>
      p.updateDynamic("renderFooter")(
        (v1: ReactNode) => x(v1).runNow()
      )
    }
    value.foreach { x =>
      p.updateDynamic("value")(x)
    }
    defaultValue.foreach { x =>
      p.updateDynamic("defaultValue")(x)
    }
    locale.foreach { x =>
      p.updateDynamic("locale")(x.toJS)
    }
    format.foreach { x =>
      p.updateDynamic("format")(x)
    }
    disabledDate.foreach { x =>
      p.updateDynamic("disabledDate")(
        (v1: Date) => x(v1).runNow()
      )
    }
    disabledTime.foreach { x =>
      p.updateDynamic("disabledTime")(
        (v1: Date) => x(v1).runNow().toJS
      )
    }

    showDateInput.foreach { x =>
      p.updateDynamic("showDateInput")(x)
    }
    showWeekNumber.foreach { x =>
      p.updateDynamic("showWeekNumber")(x)
    }
    showToday.foreach { x =>
      p.updateDynamic("showToday")(x)
    }
    showOk.foreach { x =>
      p.updateDynamic("showOk")(x)
    }
    timePicker.foreach { x =>
      p.updateDynamic("timePicker")(x)
    }
    onSelect.foreach { x =>
      p.updateDynamic("onSelect")(
        (v1: Date) => x(v1).runNow()
      )
    }
    onChange.foreach { x =>
      p.updateDynamic("onChange")(
        (v1: Date) => x(v1).runNow()
      )
    }
    dateInputPlaceholder.foreach { x =>
      p.updateDynamic("dateInputPlaceholder")(x)
    }
    p
  }

  def apply(children: ReactNode*) = {
    val f =
      React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Calendar)
    f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
  }
}

object Calendar {
  case class DisabledTime(disabledHours: js.UndefOr[js.Array[Int]],
                          disabledMinutes: js.UndefOr[js.Array[Int]],
                          disabledSeconds: js.UndefOr[js.Array[Int]]) {
    def toJS = {
      val p = js.Dynamic.literal()
      disabledHours.foreach{ x =>
        p.updateDynamic("disabledHours")(disabledHours)
      }
      disabledMinutes.foreach{ x =>
        p.updateDynamic("disabledMinutes")(disabledMinutes)
      }
      disabledSeconds.foreach{ x =>
        p.updateDynamic("disabledSeconds")(disabledSeconds)
      }
      p
    }
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
    def toJS = {
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

    def apply(children: ReactNode*) = {
      val f =
        React.asInstanceOf[js.Dynamic].createFactory(js.Dynamic.global.Calendar)
      f(toJS, children.toJsArray).asInstanceOf[ReactComponentU_]
    }
  }

  object Locale {
    val cs_CZ: Locale = ???
    val da_DK: Locale = ???
    val de_DE: Locale = ???
    val en_US: Locale = ???
    val fr_BE: Locale = ???
    val ja_JP: Locale = ???
    val ko_KR: Locale = ???
    val pl_PL: Locale = ???
    val pt_BR: Locale = ???
    val ru_RU: Locale = ???
    val sv_SE: Locale = ???
    val zh_CN: Locale = ???
  }
}
