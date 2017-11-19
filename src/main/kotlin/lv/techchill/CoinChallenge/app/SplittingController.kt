package lv.techchill.CoinChallenge.app

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class SplittingController {

    @Autowired lateinit var splitter : SplittingService

    val coins = intArrayOf(25, 10, 5, 1)

    @GetMapping("api/split")
    fun get(@RequestParam(value = "sum", required = true) sum : Int ) = splitter.split(sum, coins)

}