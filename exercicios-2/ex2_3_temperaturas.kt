fun main() {
    val temperaturas = arrayOf(28.5, 30.0, 27.2, 25.8, 29.1, 31.4, 26.6)

    // Versão com laço manual
    var maior = temperaturas[0]
    var menor = temperaturas[0]
    var soma = 0.0

    for (t in temperaturas) {
        if (t > maior) maior = t
        if (t < menor) menor = t
        soma += t
    }

    val mediaManual = soma / temperaturas.size

    println("== Com laço manual ==")
    println("Maior: $maior")
    println("Menor: $menor")
    println("Média: $mediaManual")

    // Versão com funções prontas
    val maiorPronto = temperaturas.maxOrNull()
    val menorPronto = temperaturas.minOrNull()
    val mediaPronta = temperaturas.average()

    println("== Com funções prontas ==")
    println("Maior: $maiorPronto")
    println("Menor: $menorPronto")
    println("Média: $mediaPronta")
}
