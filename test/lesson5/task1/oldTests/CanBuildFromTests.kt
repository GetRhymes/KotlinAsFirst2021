package lesson5.task1.oldTests

import lesson5.task1.canBuildFrom
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test



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
        assertFalse(canBuildFrom(listOf('a', 'b', 't'), "")) //drop
    }
}