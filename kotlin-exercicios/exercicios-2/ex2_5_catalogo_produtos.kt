data class Produto(val nome: String, val preco: Double)

fun main() {
    val produtos = listOf(
        Produto("Notebook", 3500.0),
        Produto("Mouse", 45.0),
        Produto("Teclado", 120.0),
        Produto("Monitor", 890.0),
        Produto("Cadeira", 750.0)
    )

    val acimaDe100 = produtos.filter { it.preco > 100 }
    val nomes = produtos.map { it.nome }
    val precoTotal = produtos.sumOf { it.preco }
    val maisCaro = produtos.maxByOrNull { it.preco }
    val ordenadosPorPreco = produtos.sortedBy { it.preco }

    println("Acima de 100: $acimaDe100")
    println("Nomes: $nomes")
    println("Preço total: $precoTotal")
    println("Mais caro: $maisCaro")
    println("Ordenados por preço: $ordenadosPorPreco")
}
