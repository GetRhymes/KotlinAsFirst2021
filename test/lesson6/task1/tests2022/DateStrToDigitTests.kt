package lesson6.task1.tests2022

import lesson6.task1.dateStrToDigit
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class DateStrToDigitTests {

    @Test
    fun testPositiveDateStrToDigit() {
        assertEquals("01.01.1800", dateStrToDigit("1 января 1800"))
        assertEquals("16.02.1974", dateStrToDigit("16 февраля 1974"))
        assertEquals("27.08.2022", dateStrToDigit("27 августа 2022"))
    }

    @Test
    fun testNegativeDateStrToDigit() {
        assertEquals("", dateStrToDigit("32 сентября 2011"))
        assertEquals("", dateStrToDigit("29 февраля 1993"))
        assertEquals("", dateStrToDigit("3 августина 1918"))
        assertEquals("", dateStrToDigit("27  августа  2022"))
        assertEquals("", dateStrToDigit("1918 августа 23"))
        assertEquals("", dateStrToDigit("23"))
        assertEquals("", dateStrToDigit("августа"))
        assertEquals("", dateStrToDigit("2022"))
        assertEquals("", dateStrToDigit(""))
    }
}