fun main() {
    fun part1(input: List<String>): Int {
        var largest = 0
        var total = 0

        for (row in input) {
            if (row.isBlank()) {
                if (total > largest) {
                    largest = total
                }

                total = 0
            } else {
                total += Integer.parseInt(row)
            }
        }

        return largest
    }

    fun part2(input: List<String>): Int {
        val calories = mutableListOf<Int>()

        var total = 0
        for (row in input) {
            if (row.isBlank() || row.isEmpty()) {
                calories.add(total)
                total = 0
                continue
            }

            total += Integer.parseInt(row);
        }
        calories.add(total)

        calories.sortDescending()

        return calories[0] + calories[1] + calories[2]
    }

    // test if implementation meets criteria from the description, like:
    var part1TestResult = 24000
    val testInput = readInput("Day01_test")
    check(part1(testInput) == part1TestResult)

    var part2TestResult = 45000
    check(part2(testInput) == part2TestResult)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()

    check(part1(input) == 69912)
    check(part2(input) == 208180)
}
