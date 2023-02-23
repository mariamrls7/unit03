val romanNumerals = mapOf(10 to "X", 9 to "IX", 8 to "VII", 7 to "VII", 6 to "VI", 5 to "V", 4 to "IV", 3 to "III", 2 to "II", 1 to "I")

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
    println(encode(7))
}
