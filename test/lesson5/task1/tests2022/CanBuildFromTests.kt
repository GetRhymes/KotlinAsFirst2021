package lesson5.task1.tests2022

import lesson5.task1.canBuildFrom
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


/**
 * Средняя (3 балла)
 *
 * Для заданного набора символов определить, можно ли составить из него
 * указанное слово (регистр символов игнорируется)
 *
 * Например:
 *   canBuildFrom(listOf('a', 'b', 'o'), "baobab") -> true
 */
class CanBuildFromTests {

    @Test
    fun testPositiveCanBuildFrom() {
        assertTrue(canBuildFrom(listOf('a', 'b'), "abbbabbbababa"))
        assertTrue(canBuildFrom(listOf('A', 'B', 't'), "abbbabbbababa"))
        assertTrue(canBuildFrom(emptyList(), ""))
    }

    @Test
    fun testNegativeCanBuildFrom() {
        assertFalse(canBuildFrom(emptyList(), "test"))
        assertFalse(canBuildFrom(listOf('a', 'b'), "test"))
        assertFalse(canBuildFrom(listOf('a', 'b', 't'), "test"))
//        assertFalse(canBuildFrom(listOf('a', 'b', 't'), ""))
    }
}