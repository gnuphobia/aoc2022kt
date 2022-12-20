import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RockPaperScissorsTest {
    val win : Int = 6
    val draw : Int = 3
    val lose : Int = 0

    @Test
    fun testPlayResult() {
        var rps = RockPaperScissors()

        assertEquals(win, rps.playResult(RpsScore.ROCK, RpsScore.PAPER))
        assertEquals(lose, rps.playResult(RpsScore.ROCK, RpsScore.SCISSORS))
        assertEquals(draw, rps.playResult(RpsScore.ROCK, RpsScore.ROCK))

        assertEquals(win, rps.playResult(RpsScore.PAPER, RpsScore.SCISSORS))
        assertEquals(lose, rps.playResult(RpsScore.PAPER, RpsScore.ROCK))
        assertEquals(draw, rps.playResult(RpsScore.PAPER, RpsScore.PAPER))

        assertEquals(win, rps.playResult(RpsScore.SCISSORS, RpsScore.ROCK))
        assertEquals(lose, rps.playResult(RpsScore.SCISSORS, RpsScore.PAPER))
        assertEquals(draw, rps.playResult(RpsScore.SCISSORS, RpsScore.SCISSORS))
    }

    @Test
    fun testPlayRoundOne() {
        var rps = RockPaperScissors()

        var roundScore = rps.playRound("A Y")
        assertEquals(8, roundScore)
    }

    @Test
    fun testPlayRoundTwo() {
        var rps = RockPaperScissors()

        var roundScore = rps.playRound("B X")
        assertEquals(1, roundScore)
    }

    @Test
    fun testPlayRoundThree() {
        var rps = RockPaperScissors()

        var roundScore = rps.playRound("C Z")
        assertEquals(6, roundScore)
    }

    @Test
    fun testPlayGame() {
        var rps = RockPaperScissors()

        val game = listOf<String>("A Y", "B X", "C Z")

        rps.playGame(game)

        assertEquals(15, rps.gameScore)
    }
}