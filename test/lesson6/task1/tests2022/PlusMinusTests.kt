package lesson6.task1.tests2022

import lesson6.task1.plusMinus
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test


/**
 * Сложная (6 баллов)
 *
 * В строке представлено выражение вида "2 + 31 - 40 + 13",
 * использующее целые положительные числа, плюсы и минусы, разделённые пробелами.
 * Наличие двух знаков подряд "13 + + 10" или двух чисел подряд "1 2" не допускается.
 * Вернуть значение выражения (6 для примера).
 * При нарушении формата входной строки бросить исключение IllegalArgumentException
 */
class PlusMinusTests {

    @Test
    fun testPositivePlusMinus() {
        assertEquals(0, plusMinus("0"))
        assertEquals(0, plusMinus("0 + 0 - 0"))
        assertEquals(2, plusMinus("2"))
        assertEquals(4, plusMinus("2 + 2"))
        assertEquals(-50, plusMinus("50 - 100"))
        assertEquals(0, plusMinus("50 - 100 - 50 + 100"))
        assertEquals(-1000, plusMinus("0 - 1000"))
        assertEquals(Int.MIN_VALUE) { plusMinus("${Int.MAX_VALUE} + 1") } //drop
        assertEquals(Int.MAX_VALUE) { plusMinus("${Int.MIN_VALUE} - 1") } //drop
    }

    @Test
    fun testNegativePlusMinus() {
        assertThrows(IllegalArgumentException::class.java) { plusMinus("") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("- 0") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("+ 4") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("+ 4 + 4 + 4") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("- 4 - 4 - 4") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("+4+4+4") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("-4-4-4") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("44 + + 12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("44 - - 12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("44++12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("44--12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("4-+12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("4 + - 12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("4 12") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("2 - p") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("p + 2") }
        assertThrows(IllegalArgumentException::class.java) { plusMinus("4-12") } //drop
        assertThrows(IllegalArgumentException::class.java) { plusMinus("4       12") } //drop
    }
}