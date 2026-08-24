class Aluno(val nome: String) {
    companion object {
        const val MEDIA_APROVACAO = 6.0
    }

    private val notas = mutableListOf<Double>()

    fun adicionarNota(nota: Double) {
        notas.add(nota)
    }

    fun media(): Double {
        return if (notas.isEmpty()) 0.0 else notas.average()
    }

    fun aprovado(): Boolean {
        return media() >= MEDIA_APROVACAO
    }
}

class Turma {
    private val alunos = mutableListOf<Aluno>()

    fun adicionarAluno(aluno: Aluno) {
        alunos.add(aluno)
    }

    fun mediaGeral(): Double {
        return if (alunos.isEmpty()) 0.0 else alunos.map { it.media() }.average()
    }

    fun aprovados(): List<Aluno> {
        return alunos.filter { it.aprovado() }
    }

    fun melhorAluno(): Aluno? {
        return alunos.maxByOrNull { it.media() }
    }
}

fun main() {
    val turma = Turma()

    val ana = Aluno("Ana")
    ana.adicionarNota(8.0)
    ana.adicionarNota(7.5)

    val bruno = Aluno("Bruno")
    bruno.adicionarNota(5.0)
    bruno.adicionarNota(4.0)

    val carla = Aluno("Carla")
    carla.adicionarNota(9.5)
    carla.adicionarNota(10.0)

    turma.adicionarAluno(ana)
    turma.adicionarAluno(bruno)
    turma.adicionarAluno(carla)

    println("Média geral da turma: ${turma.mediaGeral()}")
    println("Aprovados: ${turma.aprovados().map { it.nome }}")
    println("Melhor aluno: ${turma.melhorAluno()?.nome}")
}
