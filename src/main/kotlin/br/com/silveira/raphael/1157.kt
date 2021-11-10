package br.com.silveira.raphael

fun main(args: Array<String>) {

    val n = readLine()?.toInt() ?: throw Exception("Required parameter")
    val divisors = mutableListOf<Int>()

    (1..n).forEach {
        if ((n % it) == 0) {
            divisors.add(it)
        }
    }

    divisors.forEach(::println)
}
