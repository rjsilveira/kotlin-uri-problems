package br.com.silveira.raphael

fun main(args: Array<String>) {

    val n = readLine()?.toInt() ?: throw Exception("Required parameter")
    val results = mutableListOf<Int>()

    (1..n).forEach { _ ->
        val values = readLine()?.split(" ") ?: throw Exception("Required parameter")
        val x = values[0].toInt()
        val y = values[1].toInt()

        var sum = 0
        var count = if ((x % 2) != 0) x else x + 1
        (1..y).forEach { _ ->
            sum += count
            count += 2
        }
        results.add(sum)
    }

    results.forEach(::println)
}
