package lv.techchill.CoinChallenge

import lv.techchill.CoinChallenge.app.MoneySplitter
import org.junit.Test

class MoneySplitterTest {

    @Test
    fun getCoins() {

        val combinations = MoneySplitter(forCoins = intArrayOf(25, 10, 5, 1)).split(3);

        for (combination in combinations) {
            println()
            combination.forEach{ print("$it ") }
        }


    }

}