fun main() {
    // Parte A: contagem regressiva
    for (i in 10 downTo 1) {
        println(i)
    }
    println("Lançado!")

    // Parte B: tabuada
    print("Digite um número: ")
    val numero = readLine()?.toIntOrNull() ?: 5

    for (i in 1..10) {
        println("$numero x $i = ${numero * i}")
    }

    // Parte C: pares de 1 a 20 - duas formas
    println("Usando step:")
    for (i in 2..20 step 2) {
        println(i)
    }

    println("Usando if e %:")
    for (i in 1..20) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
