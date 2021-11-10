package br.com.silveira.raphael

fun main(args: Array<String>) {
    val n = readLine()?.toInt() ?: throw Exception("Required parameter")

    var count = n
    var sum = 0
    while (count > 1) {
        if (sum == 0) {
            sum = count * --count
            count--
        } else {
            sum *= count
            count--
        }
    }

    println(sum)
}
