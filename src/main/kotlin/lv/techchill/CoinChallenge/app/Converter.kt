package lv.techchill.CoinChallenge.app

/**
 * Function to supply human readable way for data transformations
 * Made just for fun. To check out some Kotlin features
 *
 */
fun <T> convert(entity : T) : Transformation<T> = Transformation(entity)
data class Transformation<out T>(val entity : T)

/* Transformation extend methods */


fun Transformation<List<Int>>.toResult(withCaption: String) : SplittingService.Result =
        SplittingService.Result(withCaption, this.entity)

