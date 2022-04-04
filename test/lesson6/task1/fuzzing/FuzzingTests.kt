package lesson6.task1.fuzzing

import com.pholser.junit.quickcheck.Property
import edu.berkeley.cs.jqf.fuzz.JQF
import lesson6.task1.dateStrToDigit
import lesson6.task1.plusMinus
import org.junit.runner.RunWith

@RunWith(JQF::class)
class FuzzingTests {

    @Property(trials = 500)
    fun dateStrToDigitFuzzingTests(str: String) {
        dateStrToDigit(str)
    }

    @Property(trials = 500)
    fun plusMinusFuzzingTests(expression: String) {
        try {
            plusMinus(expression)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
        }
    }
}