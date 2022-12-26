import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class RuckGroupTest {
    @Test
    fun findBadgeTest1() {
        val ruckGroup = RuckGroup()

        assertNotNull(ruckGroup)

        var test: MutableList<Rucksack> = emptyList<Rucksack>().toMutableList()

        test.add(Rucksack("12345"))

        ruckGroup.addRucker("vJrwpWtwJgWrhcsFMMfFFhFp")
        ruckGroup.addRucker("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL")
        ruckGroup.addRucker("PmmdzqPrVvPwwTWBwg")

        ruckGroup.findCommonItem()
        assertEquals("r", ruckGroup.commonItem)
    }

    @Test
    fun findBadgeTest2() {
        val ruckGroup = RuckGroup()

        assertNotNull(ruckGroup)

        var test: MutableList<Rucksack> = emptyList<Rucksack>().toMutableList()

        test.add(Rucksack("12345"))

        ruckGroup.addRucker("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn")
        ruckGroup.addRucker("ttgJtRGJQctTZtZT")
        ruckGroup.addRucker("CrZsJsPPZsGzwwsLwLmpwMDw")

        ruckGroup.findCommonItem()
        assertEquals("Z", ruckGroup.commonItem)
    }
}