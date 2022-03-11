package lesson5.task1.tests2022

import lesson5.task1.containsIn
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


/**
 * Простая (2 балла)
 *
 * Определить, входит ли ассоциативный массив a в ассоциативный массив b;
 * это выполняется, если все ключи из a содержатся в b с такими же значениями.
 *
 * Например:
 *   containsIn(mapOf("a" to "z"), mapOf("a" to "z", "b" to "sweet")) -> true
 *   containsIn(mapOf("a" to "z"), mapOf("a" to "zee", "b" to "sweet")) -> false
 */
class ContainInTests {

    @Test
    fun testPositiveContainIn() {
        assertTrue(containsIn(mapOf("a" to "z"), mapOf("a" to "z", "b" to "j")))
        assertTrue(
            containsIn(
                mapOf("a" to "z", "g" to "f", "b" to "o"),
                mapOf("a" to "z", "b" to "o", "g" to "f")
            )
        )
        assertTrue(containsIn(mapOf(), mapOf("a" to "z", "b" to "sweet")))
        assertTrue(containsIn(mapOf(), mapOf()))
    }

    @Test
    fun testNegativeContainIn() {
        assertFalse(containsIn(mapOf("a" to "z"), mapOf("b" to "b")))
        assertFalse(containsIn(mapOf("a" to "z", "b" to "b"), mapOf("b" to "b")))
        assertFalse(containsIn(mapOf("a" to "z", "b" to "b"), mapOf()))
    }
}