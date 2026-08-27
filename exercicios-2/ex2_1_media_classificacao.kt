fun main() {
    print("Nota 1: ")
    val nota1 = readLine()?.toDoubleOrNull() ?: 8.0
    print("Nota 2: ")
    val nota2 = readLine()?.toDoubleOrNull() ?: 6.0
    print("Nota 3: ")
    val nota3 = readLine()?.toDoubleOrNull() ?: 9.5

    val media = (nota1 + nota2 + nota3) / 3

    val conceito = when {
        media >= 9 -> "A"
        media >= 7 -> "B"
        media >= 5 -> "C"
        else -> "D"
    }

    println("Média: $media")
    println("Conceito: $conceito")
}
