package br.com.silveira.raphael

fun main(args: Array<String>) {

    var s = 1.0
    var second = 2
    for (first in 3..39 step 2) {
        s += (first.toDouble() / second.toDouble())
        second += second
    }

    println("%.2f".format(s).replace(",", "."))
}
