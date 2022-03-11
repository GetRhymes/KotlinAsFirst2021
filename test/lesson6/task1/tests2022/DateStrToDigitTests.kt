package lesson6.task1.tests2022

import lesson6.task1.dateStrToDigit
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


/**
 * Средняя (4 балла)
 *
 * Дата представлена строкой вида "15 июля 2016".
 * Перевести её в цифровой формат "15.07.2016".
 * День и месяц всегда представлять двумя цифрами, например: 03.04.2011.
 * При неверном формате входной строки вернуть пустую строку.
 *
 * Обратите внимание: некорректная с точки зрения календаря дата (например, 30.02.2009) считается неверными
 * входными данными.
 */
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