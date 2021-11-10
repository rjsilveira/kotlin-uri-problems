package br.com.silveira.raphael

fun main(args: Array<String>) {

    val ages = arrayListOf<Int>()
    do {
        val age = readLine()?.toInt() ?: throw Exception("Required parameter")
        if (age >= 0) {
            ages.add(age)
        }
    } while (age >= 0)

    println("%.2f".format(ages.average()).replace(",", "."))
}
