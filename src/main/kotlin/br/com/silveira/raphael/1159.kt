package br.com.silveira.raphael

fun main(args: Array<String>) {

    val results = mutableListOf<Int>()
    do {
        val x = readLine()?.toInt() ?: throw Exception("Required parameter")

        if (x == 0) continue

        var sum = 0
        var count = if ((x % 2) == 0) x else x + 1
        (1..5).forEach { _ ->
            sum += count
            count += 2
        }
        results.add(sum)
    } while (x != 0)

    results.forEach(::println)
}
