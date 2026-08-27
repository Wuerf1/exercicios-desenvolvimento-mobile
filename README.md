# Exercícios de Desenvolvimento Mobile — Kotlin

Repositório de estudo. Reúne os exercícios que venho fazendo enquanto
aprendo Kotlin e desenvolvimento Android, guardados aqui para consulta e
para acompanhar a evolução ao longo do curso.

O conteúdo vai do básico da linguagem — variáveis, condicionais, laços —
até classes, funções de ordem superior e as primeiras telas em Android.
Cada arquivo trata de um assunto específico e é curto de propósito, para
servir de referência rápida depois.

Os exercícios de `aquecimento/` e `exercicios-2/` são independentes: cada
arquivo tem sua própria função `main()` e roda isolado. Já o
`AquecimentoApp/` é um projeto Android, que abre no Android Studio.

## Como rodar

Vale para `aquecimento/` e `exercicios-2/`. Sem precisar instalar nada,
cole o conteúdo do arquivo no
[Kotlin Playground](https://play.kotlinlang.org) e clique em *Run*.

Se tiver o compilador local:

```bash
kotlinc aquecimento/01_val_var.kt -include-runtime -d prog.jar && java -jar prog.jar
```

> Alguns exercícios da pasta `exercicios-2/` leem dados via `readLine()`.
> Todos têm valor padrão caso nada seja digitado, então rodam liso mesmo
> em ambientes sem entrada interativa.

## Estrutura

### `aquecimento/` — fundamentos da linguagem

| Arquivo | Conteúdo |
|---|---|
| `01_val_var.kt` | Diferença entre `val` (imutável) e `var` (mutável) |
| `02_interpolacao.kt` | Interpolação de strings com `$` e `${}` |
| `03_divisao.kt` | Divisão inteira x divisão decimal |
| `04_if_expressao.kt` | `if` como statement e como expressão |
| `05_for_ranges.kt` | `for` com ranges, `downTo` e `step` |
| `06_colecoes.kt` | `sum()`, `average()` e `filter {}` |
| `07_null_safety.kt` | Tipos nuláveis, `?.` e operador elvis `?:` |

### `exercicios-2/` — exercícios aplicados

| Arquivo | Conteúdo |
|---|---|
| `ex2_1_media_classificacao.kt` | Média de 3 notas com classificação via `when` |
| `ex2_2_contagem_tabuada.kt` | Contagem regressiva, tabuada e números pares |
| `ex2_3_temperaturas.kt` | Maior/menor/média em array — laço manual x funções prontas |
| `ex2_4_contando_letras.kt` | Contagem de ocorrências de letra — laço manual x `count {}` |
| `ex2_5_catalogo_produtos.kt` | `data class` + funções de ordem superior |
| `ex2_6_sistema_alunos.kt` | Classes, `companion object` e listas mutáveis |

### `AquecimentoApp/` — primeiro contato com Android

Projeto Android completo, com os 6 exercícios de aquecimento resolvidos:
`Button` com id e listener de clique, `Toast`, `CheckBox`, `Switch` e
`SeekBar`.

| Arquivo | Conteúdo |
|---|---|
| `app/src/main/res/layout/activity_main.xml` | Layout com os componentes da tela |
| `app/src/main/java/.../MainActivity.kt` | `findViewById`, `setOnClickListener` e `Toast` |

Diferente das outras pastas, esta **não roda no Kotlin Playground** — abre no
Android Studio. As instruções estão no
[README do projeto](AquecimentoApp/README.md).

## Sobre os exercícios

Vários exercícios resolvem o mesmo problema de duas formas — primeiro com
laço manual, depois com as funções prontas da biblioteca padrão. A ideia é
enxergar o que a linguagem está fazendo por baixo antes de usar o atalho.
