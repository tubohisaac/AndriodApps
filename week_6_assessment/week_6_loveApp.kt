package week_6_assessment

fun loveCheck(male: Int, female: Int): Boolean {
    if (male % 2 == 0 && female % 2 == 1)
        return true
    return false
}


fun main() {
    val result = loveCheck()
    println(result)
}