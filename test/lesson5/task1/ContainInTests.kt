package lesson5.task1

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


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