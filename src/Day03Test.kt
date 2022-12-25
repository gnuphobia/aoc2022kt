import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class Day03Test {
    private final val test1: String = "vJrwpWtwJgWrhcsFMMfFFhFp"
    private final val test2: String = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"
    private final val test3: String = "PmmdzqPrVvPwwTWBwg"
    private final val test4: String = "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn"
    private final val test5: String = "ttgJtRGJQctTZtZT"
    private final val test6: String = "CrZsJsPPZsGzwwsLwLmpwMDw"

    private final val test1Compartment1: String = "vJrwpWtwJgWr"
    private final val test1Compartment2: String = "hcsFMMfFFhFp"
    private final val test4Compartment1: String = "wMqvLMZHhHMvwLH"
    private final val test4Compartment2: String = "jbvcjnnSBnvTQFn"

    private final val common1: String = "p"
    private final val common2: String = "L"
    private final val common3: String = "P"
    private final val common4: String = "v"
    private final val common5: String = "t"
    private final val common6: String = "s"

    @Test
    fun testConstructor() {
        var ruck = Rucksack(test1)

        assertNotNull(ruck)
        assertEquals(test1, ruck.contents)
        assertEquals(test1Compartment1, ruck.compartment1)
        assertEquals(test1Compartment2, ruck.compartment2)
    }

    @Test
    fun testConstructor2() {
        var ruck = Rucksack(test4)

        assertNotNull(ruck)
        assertEquals(test4, ruck.contents)
        assertEquals(test4Compartment1, ruck.compartment1)
        assertEquals(test4Compartment2, ruck.compartment2)
    }

    @ParameterizedTest
    @CsvSource(
        "vJrwpWtwJgWrhcsFMMfFFhFp, p",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL, L",
        "PmmdzqPrVvPwwTWBwg, P",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn, v",
        "ttgJtRGJQctTZtZT, t",
        "CrZsJsPPZsGzwwsLwLmpwMDw, s"
    )
    fun testCommonItem(contents: String, commonItem: String) {
        var ruck = Rucksack(contents)

        assertEquals(commonItem, ruck.commonItem)
    }

    @ParameterizedTest
    @CsvSource(
        "vJrwpWtwJgWrhcsFMMfFFhFp, 16",
        "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL, 38",
        "PmmdzqPrVvPwwTWBwg, 42",
        "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn, 22",
        "ttgJtRGJQctTZtZT, 20",
        "CrZsJsPPZsGzwwsLwLmpwMDw, 19"
    )
    fun testItemScore(contents: String, expectedPriority: Int) {
        var ruck = Rucksack(contents)

        assertEquals(expectedPriority, ruck.itemPriority)
    }
}