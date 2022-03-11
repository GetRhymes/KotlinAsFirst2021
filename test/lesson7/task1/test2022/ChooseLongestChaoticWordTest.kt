package lesson7.task1.test2022

import lesson7.task1.chooseLongestChaoticWord
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File


class ChooseLongestChaoticWordTest {

    companion object {
        const val INPUT = "chooseLongestChaoticWordTest.input"
        const val OUTPUT = "chooseLongestChaoticWordTest.output"
    }

    private fun initEasy() {
        val inputFile = File(INPUT)
        inputFile.writer().use {
            for (i in 0 until 10) {
                it.write("qwerty$i")
                it.appendLine()
                it.write("qwerty${i}qwertyqwErtyqwertyqwerty")
                it.appendLine()
            }
            it.write("qwertyuiopasdfghjklzxcvbnm")
        }
    }

    private fun initHard() {
        val inputFile = File(INPUT)
        inputFile.writer().use {
            for (i in 0 until 3) {
                it.write("qqwerty$i")
                it.appendLine()
            }
            it.write("Ee")
            it.appendLine()
            it.write("0qwertyuio0")
        }
    }

    private fun after() {
        File(INPUT).delete()
        File(OUTPUT).delete()
    }

    private fun assertFileContent(name: String = OUTPUT, expectedContent: String) {
        val file = File(name)
        val content = file.readLines().joinToString("\n")
        Assertions.assertEquals(expectedContent, content)
    }


    @Test
    fun testChooseLongestChaoticWordEasy() {
        initEasy()
        chooseLongestChaoticWord(INPUT, OUTPUT)
        assertFileContent(expectedContent = "qwertyuiopasdfghjklzxcvbnm")
        after()
    }

    @Test
    fun testChooseLongestChaoticWordHard() {
        initHard()
        chooseLongestChaoticWord(INPUT, OUTPUT)
        assertFileContent(expectedContent = "")

        File(INPUT).writer().close()
        chooseLongestChaoticWord(INPUT, OUTPUT)
        assertFileContent(expectedContent = "")
        after()
    }
}