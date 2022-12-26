import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class PriorityScoreTest {
    var priority = PriorityScore()
    @BeforeEach
    fun setup() {
        var priority = PriorityScore()
    }

    @ParameterizedTest
    @CsvSource("a, 1",
        "z, 26",
        "A, 27",
        "Z, 52",
        "P, 42")
    fun testPriorityScore(item: String, expectedValue: Int) {
        assertEquals(expectedValue, priority.itemPriority(item))
    }

}