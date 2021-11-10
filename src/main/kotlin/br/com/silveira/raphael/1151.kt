package br.com.silveira.raphael

fun main(args: Array<String>) {
    val n = readLine()?.toInt() ?: throw Exception("Required parameter")

    val sequence = arrayListOf<Int>()


    for (i in 0 until n) {
        when (i) {
            0 -> {
                sequence.add(0)
            }
            1 -> {
                sequence.add(1)
            }
            else -> {
                val value = sequence[i - 1] + sequence[i - 2]
                sequence.add(value)
            }
        }
    }

    println(sequence.joinToString(" "))
}