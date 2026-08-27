# 🔥 Aquecimento Android — Views e interação

Primeiro contato com a interface do Android: declarar componentes no XML,
alcançá-los pelo código Kotlin e reagir ao toque do usuário.

Os dois arquivos desta pasta são o **estado final**, depois das 6 tarefas.
Para estudar, vale seguir a ordem abaixo e rodar após cada passo — cada uma
muda uma coisa só, justamente pra você ver o efeito isolado.

## ⚙️ Como usar

Estes arquivos não rodam sozinhos: precisam de um projeto Android.
No Android Studio, crie um projeto *Empty Views Activity* e substitua:

| Arquivo daqui | Onde vai no projeto |
|---|---|
| `activity_main.xml` | `app/src/main/res/layout/activity_main.xml` |
| `MainActivity.kt` | `app/src/main/java/<seu/pacote>/MainActivity.kt` |

> ⚠️ Ajuste a primeira linha do `MainActivity.kt` (`package com.example.aquecimento`)
> para o pacote real do seu projeto, senão não compila.

## 📋 As 6 tarefas, uma a uma

### 1. Um botão na tela

No `activity_main.xml`, dentro do layout raiz:

```xml
<Button
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Clique" />
```

Rode. O botão aparece. Ainda é só desenho — não faz nada.

### 2. A ponte do XML para o código

Acrescente o id ao botão:

```xml
android:id="@+id/btnTeste"
```

E na Activity, dentro do `onCreate`, **depois** do `setContentView`:

```kotlin
val btn = findViewById<Button>(R.id.btnTeste)
```

O `@+id/` cria a constante `R.id.btnTeste`. Se compilou, a ponte funcionou —
o código agora tem em mãos o botão que o XML desenhou.

> A ordem importa: `findViewById` antes do `setContentView` devolve `null`,
> porque o layout ainda não foi inflado.

### 3. Reagir ao clique

```kotlin
btn.setOnClickListener {
    Toast.makeText(this, "oi", Toast.LENGTH_SHORT).show()
}
```

O bloco entre chaves não roda agora — fica guardado e só é executado quando
o usuário toca. O `.show()` no final é obrigatório: sem ele o Toast é
criado, mas nunca aparece.

### 4. Largura do botão

Troque no botão:

```diff
- android:layout_width="wrap_content"
+ android:layout_width="match_parent"
```

Rode e compare: `wrap_content` encolhe até caber o texto, `match_parent`
estica até a largura do pai.

### 5. CheckBox e Switch

Abaixo do botão, ainda sem código nenhum:

```xml
<CheckBox
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Aceito os termos" />

<Switch
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Modo escuro" />
```

Os dois já marcam e desmarcam sozinhos. O estado visual é do próprio
componente; só precisaria de código para *ler* esse estado.

### 6. SeekBar

```xml
<SeekBar
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:max="10" />
```

Arraste com o dedo — funciona sem uma linha de Kotlin.

## 💡 O que fica da lição

As tarefas 5 e 6 são o contraste com as tarefas 2 e 3: **componente aparecer
e funcionar sozinho é de graça no XML**. Código só entra quando você precisa
que algo aconteça *fora* do componente — como o Toast do botão.
