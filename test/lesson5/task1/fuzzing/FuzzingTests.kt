package lesson5.task1.fuzzing

import com.pholser.junit.quickcheck.Property
import edu.berkeley.cs.jqf.fuzz.JQF
import lesson5.task1.canBuildFrom
import lesson5.task1.containsIn
import org.junit.runner.RunWith

@RunWith(JQF::class)
class FuzzingTests {
    @Property(trials = 500)
    fun canBuildFuzzingTest(chars: List<Char>, word: String) {
        canBuildFrom(chars, word)
    }

    @Property(trials = 500)
    fun containsInFuzzingTests(a: Map<String, String>, b: Map<String, String>) {
        containsIn(a, b)
    }
}