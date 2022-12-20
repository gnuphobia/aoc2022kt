import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RpsScoreTest {

    @Test
    fun rockScoreTest() {
        assertEquals(1, RpsScore.ROCK.score);
    }

    @Test
    fun paperScoreTest() {
        assertEquals(2, RpsScore.PAPER.score);
    }

    @Test
    fun scissorsScoreTest() {
        assertEquals(3, RpsScore.SCISSORS.score);
    }

    @Test
    fun rockPlayTypeTest() {
        val playType = RpsScore.ROCK.playType("X")
        assertEquals(playType, RpsScore.ROCK)
    }

    @Test
    fun paperPlayTypeTest() {
        val playType = RpsScore.ROCK.playType("Y")
        assertEquals(playType, RpsScore.PAPER);
    }

    @Test
    fun scissorsPlayTypeTest() {
        val playType = RpsScore.ROCK.playType("Z")
        assertEquals(playType, RpsScore.SCISSORS);
    }

    @Test
    fun rockOpponentTypeTest() {
        val playType = RpsScore.ROCK.playType("A")
        assertEquals(playType, RpsScore.ROCK)
    }

    @Test
    fun paperOpponentTypeTest() {
        val playType = RpsScore.ROCK.playType("B")
        assertEquals(playType, RpsScore.PAPER);
    }

    @Test
    fun scissorsOpponentTypeTest() {
        val playType = RpsScore.ROCK.playType("C")
        assertEquals(playType, RpsScore.SCISSORS);
    }
}