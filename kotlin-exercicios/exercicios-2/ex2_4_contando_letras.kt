fun main() {
    print("Digite o nome: ")
    val nome = readLine() ?: "Ana"
    print("Digite a letra: ")
    val letra = readLine()?.firstOrNull() ?: 'a'

    // Versão com laço manual
    var contador = 0
    for (c in nome) {
        if (c.lowercaseChar() == letra.lowercaseChar()) {
            contador++
        }
    }
    println("A letra '$letra' aparece $contador vez(es) em \"$nome\" (laço manual)")

    // Versão com count { }
    val contadorPronto = nome.count { it.lowercaseChar() == letra.lowercaseChar() }
    println("A letra '$letra' aparece $contadorPronto vez(es) em \"$nome\" (count)")
}
