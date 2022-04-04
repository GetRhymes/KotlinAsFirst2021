package lesson7.task1.fuzzing

import com.pholser.junit.quickcheck.Property
import edu.berkeley.cs.jqf.fuzz.JQF
import lesson7.task1.chooseLongestChaoticWord
import lesson7.task1.oldTests.ChooseLongestChaoticWordTest
import org.junit.runner.RunWith
import java.io.File

@RunWith(JQF::class)
class FuzzingTests {

    private val INPUT = "input.txt"
    private val OUTPUT = "output.txt"

    @Property(trials = 500)
    fun chooseLongestChaoticWordFuzzingTests(str: String) {
        val input = "input.txt"
        val output = "output.txt"
        val file = File(input)
        file.writer().use {
            it.write(str)
        }
        chooseLongestChaoticWord(input, output)
        after()
    }

    private fun after() {
        File(INPUT).delete()
        File(OUTPUT).delete()
    }
}