package lv.techchill.CoinChallenge.app

import org.springframework.stereotype.Component

@Component
class SplittingService {

    fun split(sum: Int, coins: IntArray) : List<Result>{

        return MoneySplitter(forCoins = coins)
                .split(sum)
                .mapIndexed { i, combination -> convert(combination).toResult(withCaption = "Combination No${i+1}") }
    }

    data class Result(val caption : String, val combination: List<Int>);
}