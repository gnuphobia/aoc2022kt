import kotlin.Exception as KotlinException

fun main() {
    fun part1(input: List<String>): Int {
        val rps = RockPaperScissors()
        rps.playGame(input)

        return rps.gameScore
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 15)

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}

class RockPaperScissors() {
    private val lose : Int = 0
    private val draw : Int = 3
    private val win : Int = 6

    var gameScore = 0

    fun playGame(gameRounds : List<String>)  {
        for(round in gameRounds) {
            gameScore += playRound(round)
        }
    }

    fun playRound(round : String) : Int {
        val (opponent, player) = round.split(' ')

        var score = 0
        val opponentMove = RpsScore.ROCK.playType(opponent)
        val playerMove = RpsScore.ROCK.playType(player)
        score = playResult(opponentMove, playerMove) + playerMove.score
        return score
    }

    fun playResult(opponentPlayed : RpsScore, playerPlayed : RpsScore) : Int {
        if (opponentPlayed == playerPlayed) return draw

        if (opponentPlayed == RpsScore.ROCK && playerPlayed == RpsScore.SCISSORS) return lose
        if (opponentPlayed == RpsScore.ROCK && playerPlayed == RpsScore.PAPER)  return win

        if (opponentPlayed == RpsScore.PAPER && playerPlayed == RpsScore.ROCK) return lose
        if (opponentPlayed == RpsScore.PAPER && playerPlayed == RpsScore.SCISSORS)  return win

        if (opponentPlayed == RpsScore.SCISSORS && playerPlayed == RpsScore.PAPER) return lose

        return win
    }
}

enum class RpsScore(val score: Int) {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    fun playType(play : String) : RpsScore {
        if (play == "X" || play == "A") return ROCK
        if (play == "Y" || play == "B") return PAPER
        if (play == "Z" || play == "C") return SCISSORS
        return ROCK
    }
}
