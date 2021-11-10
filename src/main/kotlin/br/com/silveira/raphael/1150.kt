package br.com.silveira.raphael


fun main(args: Array<String>) {

    var x = readLine()?.toInt() ?: throw Exception("Required parameter")

    var z = 0
    do {
        z = readLine()?.toInt() ?: throw Exception("Required parameter")
    } while (z <= x)

    var sum = x
    var count = 1
    while (sum < z) {
        sum += x++
       count++
    }

    println(count)
}