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
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    var priority1: Int = part1(testInput)
    check(priority1 == 157)

    val input = readInput("Day03")
    part1(input).println()
//    part2(input).println()
}
