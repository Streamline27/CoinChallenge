package lv.techchill.CoinChallenge.app

class MoneySplitter(val forCoins: IntArray) {

    val coins = forCoins

    fun split(sum : Int) : List<List<Int>> = combinationsFor(sum, 0)

    private fun combinationsFor(sum : Int, minCoinIndex: Int) : List<List<Int>>{

        var combinations = emptyList<List<Int>>()

        for (i in minCoinIndex.rangeTo(coins.lastIndex)) {

            val coin = coins[i]

            var sumToSplit  = sum
            var combination = emptyList<Int>()

            while (sumToSplit > 0) {

                sumToSplit   -= coin
                combination  += coin

                when {
                    sumToSplit >  0 -> combinations += combinationsFor(sumToSplit, i+1).map { combination + it }
                    sumToSplit == 0 -> combinations  = combinations.plusElement(combination)
                }
            }
        }
        return combinations
    }

}