package br.com.silveira.raphael

fun main(args: Array<String>) {

    var s = 1.0
    for (i in 2..100) {
        s += 1.0 / i.toDouble()
    }

    println("%.2f".format(s).replace(",", "."))
}
