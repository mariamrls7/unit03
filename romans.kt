val romanNumerals = mapOf(
       1 to "I",
       2 to "II",
       3 to "III",
       4 to "IV",
       5 to "V",
       6 to "VI",
       7 to "VII",
       8 to "VIII",
       9 to "IX",
       10 to "X"
)

fun encode(number: Int): String? {
    if (number > 11 || number < 0) {
        return "error"
    }
    var num = number
    var result = ""
    for ((multiple, numeral) in romanNumerals.entries) {
        while (num >= multiple) {
            num -= multiple
            result += numeral
        }
    }
    return result
}

fun main(args: Array<String>) {
    println(encode(12))
    println(encode(10))
}
