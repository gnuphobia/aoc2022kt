fun main() {
    fun part1(input: List<String>): Int {
        var score: Int = 0
        for (contents: String in input) {
            var ruck: Rucksack = Rucksack(contents)
            score += ruck.itemPriority
        }

        return score
    }

    fun part2(input: List<String>): Int {
        var journey: MutableList<RuckGroup> = mutableListOf<RuckGroup>()
        var count = 0
        var ruckGroup = RuckGroup()
        for(item in input) {
            ruckGroup.addRucker(item)
            count++

            if (count > 2) {
                journey.add(ruckGroup)
                ruckGroup = RuckGroup()
                count = 0
            }
        }

        var priorityScore: Int = 0
        val priority = PriorityScore()
        for(group in journey) {
            group.findCommonItem()
            priorityScore += priority.itemPriority(group.commonItem)
        }

        return priorityScore
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    var priority1: Int = part1(testInput)
    check(priority1 == 157)

    var part2ExpectedAnswer = 70
    var part2Answer = part2(testInput)
    check(part2Answer == part2ExpectedAnswer)

    val input = readInput("Day03")
    part1(input).println()
    part2(input).println()
}
