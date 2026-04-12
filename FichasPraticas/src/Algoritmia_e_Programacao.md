# 📘 Algoritmia e Programação — Java
> Guia de revisão pessoal · Módulo completo

---

## 📁 Estrutura do Repositório

```
src/
├── FichaPratica01/        → Tipos de dados, variáveis, input/output
├── FichaPratica02/        → Condicionais (if / else / switch)
├── FichaPratica03/        → Ciclos while
├── FichaPratica04/        → Ciclos do-while e menus
├── FichaExtraCondicionais/ → Exercícios extra de condicionais
└── FichaExtraCiclos/      → Exercícios extra de ciclos (for)
```

---

## 🗂️ Índice de Conceitos

| Conceito | Ficha(s) | Exercícios de referência |
|---|---|---|
| Variáveis e tipos primitivos | FP01 | Ex01, Ex02 |
| Operações aritméticas | FP01 | Ex02, Ex03, Ex04 |
| Scanner (input do teclado) | FP01 | Ex01 em diante |
| Fórmulas matemáticas | FP01 | Ex03, Ex04, Ex05, Ex08 |
| Permuta de variáveis | FP01 | Ex06 |
| Condicional `if / else` | FP02, FPExtra | Ex01, Ex02, Ex03 |
| Condicional `else if` (múltiplos escalões) | FP02 | Ex03 |
| `switch / case / break` | FP02, FPExtra | Ex04, Ex10, Ex12 |
| Fall-through no switch | FPExtraCondicionais | Ex04 |
| Ciclo `while` | FP03 | Ex01 ao Ex15 |
| Sentinela num ciclo | FP03, FPExtraCiclos | Ex09, Ex06, Ex07 |
| Acumulador / contador | FP03 | Ex07, Ex09, Ex12 |
| Ciclo `do-while` | FP04 | Ex01, Ex02, Ex03 |
| Menu com `do-while` | FP04 | Ex02 |
| Ciclo `for` | FPExtraCiclos | Ex01 ao Ex10 |
| `for` aninhado (padrões visuais) | FPExtraCiclos | Ex03, Ex04, Ex05 |
| Aritmética modular (`%`) | FP02, FPExtraCiclos | Ex07, Ex09, Ex10 |
| Flag booleana | FP03 | Ex14 |
| Fatorial | FP03 | Ex15 |
| Inversão de dígitos | FPExtraCiclos | Ex10 |
| Soma de dígitos | FPExtraCiclos | Ex09 |

---

## 📚 Ficha Prática 01 — Tipos de Dados e Input/Output

> **Tema:** Variáveis, tipos primitivos, operações aritméticas e leitura de dados com `Scanner`.

### Conceitos-chave

**Declarar e usar variáveis**
```java
int numero;          // inteiro (sem casas decimais)
double preco;        // número decimal
String nome;         // texto
boolean ativo;       // verdadeiro ou falso
```

**Ler dados do teclado com Scanner**
```java
Scanner input = new Scanner(System.in);

int n        = input.nextInt();      // lê um inteiro
double d     = input.nextDouble();   // lê um decimal
String linha = input.nextLine();     // lê uma linha inteira
```

> ⚠️ Depois de `nextInt()` ou `nextDouble()`, se precisares de `nextLine()` em seguida, chama `input.nextLine()` uma vez extra para limpar o `\n` que fica no buffer. Ver **FP03 Ex05**.

**Operações aritméticas básicas**
```java
soma  = a + b;
sub   = a - b;
mult  = a * b;
div   = a / b;   // divisão inteira se ambos forem int
resto = a % b;   // módulo: resto da divisão
```

> ⚠️ Divisão entre dois `int` trunca a parte decimal. Para obter casas decimais, usa `double`.

### Exercícios

| Exercício | O que faz |
|---|---|
| Ex01 | Soma de dois inteiros |
| Ex02 | Quatro operações com dois números |
| Ex03 | Área e perímetro de um retângulo |
| Ex04 | Área de uma circunferência (π × r²) |
| Ex05 | Média aritmética e média ponderada (20%, 30%, 50%) |
| Ex06 | Permuta de dois valores **sem variável auxiliar** |
| Ex07 | Total de 3 produtos com 10% de desconto |
| Ex08 | Duração total de 3 músicas → formato hh:mm:ss |

### 💡 Notas de revisão

**Permuta sem variável auxiliar** (Ex06) — truque aritmético:
```java
valor1 = valor1 + valor2;
valor2 = valor1 - valor2;   // recupera o valor1 original
valor1 = valor1 - valor2;   // recupera o valor2 original
```

**Converter segundos totais em hh:mm:ss** (Ex08):
```java
hh = totalSegundos / 3600;
mm = totalSegundos / 60 - (hh * 60);
ss = totalSegundos - (hh * 3600) - (mm * 60);
```

---

## 📚 Ficha Prática 02 — Condicionais

> **Tema:** Estruturas de decisão com `if`, `else if`, `else` e `switch`.

### Conceitos-chave

**if / else simples**
```java
if (condicao) {
    // executa se verdadeiro
} else {
    // executa se falso
}
```

**if / else if / else (múltiplos escalões)**
```java
if (valor <= 100) {
    // caso 1
} else if (valor <= 200) {
    // caso 2
} else {
    // todos os outros casos
}
```

> 💡 Usar `else if` é mais eficiente do que vários `if` independentes — assim que uma condição é verdadeira, as restantes são ignoradas.

**switch / case**
```java
switch (variavel) {
    case 1:
        // ação para valor 1
        break;      // sem break, a execução "cai" para o case seguinte!
    case 2:
        // ação para valor 2
        break;
    default:
        // executado quando nenhum case corresponde
}
```

**Fall-through** (técnica útil no switch):
```java
// Quando vários cases fazem a mesma coisa, omite-se o break entre eles
case "a":
case "e":
case "i":
case "o":
case "u":
    System.out.println("é uma vogal");
    break;
```

**Operador módulo `%` para paridade**
```java
if (n % 2 == 0)  // par
if (n % 2 != 0)  // ímpar
if (n % 5 == 0)  // múltiplo de 5
```

### Exercícios

| Exercício | O que faz |
|---|---|
| Ex01 | Maior de dois números |
| Ex02 | Imposto sobre salário (2 escalões) |
| Ex03 | Imposto sobre salário (4 escalões com if independentes) |
| Ex04 | Pontos de F1 por posição (switch) |
| Ex05 | Ordenar dois números crescente |
| Ex06 | Ordenar dois números decrescente |
| Ex07 | Par ou ímpar (`% 2`) |
| Ex08 | Média ponderada + aprovação (≥ 9.5) |
| Ex09 | Mínimo de três números |
| Ex10 | Calculadora com switch (+, -, *, /) |
| Ex11 | Saldo bancário com depósito/levantamento |
| Ex12 | Menu CRUD simples (switch) |
| Ex13 | Converter horas 24h → AM/PM |
| Ex14 | Ordenar três números crescente |
| Ex15 | Ordenar três números (escolha crescente/decrescente) |
| Ex16 | Decomposição de valor em notas (200, 100, 50, 20, 10, 5) |

### 💡 Notas de revisão

**Decomposição em notas** (Ex16) — padrão repetido:
```java
numeroNotas = valor / 200;   // quantas notas de 200 cabem
valor       = valor % 200;   // resto a decompor
// repete para 100, 50, 20, 10, 5
```

**Converter horas** (Ex13):
```java
if (horas < 12)  → AM
else             → horas - 12 + " PM"
```

---

## 📚 Ficha Prática 03 — Ciclos while

> **Tema:** Repetição controlada com `while`, contadores, acumuladores e sentinelas.

### Conceitos-chave

**Estrutura do while**
```java
while (condicao) {
    // executa enquanto a condição for verdadeira
    // é preciso garantir que a condição muda dentro do ciclo!
}
```

**Contador** — conta iterações:
```java
int i = 0;
while (i < 10) {
    i++;  // incrementa o contador
}
```

**Acumulador** — acumula valores:
```java
int soma = 0;
while (i <= 100) {
    soma = soma + i;  // soma += i
    i++;
}
```

**Sentinela** — valor especial que termina o ciclo:
```java
while (num != -1) {       // -1 é o valor sentinela
    // processa num
    num = input.nextInt(); // lê o próximo valor
}
```

**Flag booleana** — regista se uma condição foi violada:
```java
boolean crescente = true;
while (...) {
    if (atual <= anterior) crescente = false; // uma vez false, fica false
}
```

### Exercícios

| Exercício | O que faz |
|---|---|
| Ex01 | Imprimir 1 a 250 |
| Ex02 | Números pares entre 1 e 400 |
| Ex03 | Números ímpares entre 531 e 750 |
| Ex04 | Sequência de 0 até N (lido pelo utilizador) |
| Ex05 | Repetir uma frase N vezes |
| Ex06 | Sequência entre dois números |
| Ex07 | Números de 1 a 100 e a sua soma |
| Ex08 | 5 antecessores e 5 sucessores de um número |
| Ex09 | Média de números até digitar -1 (sentinela) |
| Ex10 | Números pares até um limite com salto de 2 |
| Ex11 | Sequência com salto e limite definidos |
| Ex12 | Contar números por 4 intervalos (sentinela negativo) |
| Ex13 | Múltiplos de 5 num intervalo |
| Ex14 | Verificar se sequência é crescente (flag booleana) |
| Ex15 | Fatorial de N |

### 💡 Notas de revisão

**Fatorial** (Ex15):
```java
int fatorial = 1;        // elemento neutro da multiplicação
while (n > 1) {
    fatorial *= n;       // fatorial = fatorial * n
    n--;
}
// guarda o n original antes do ciclo para usar no print
```

**Sentinela com correção posterior** (Ex09):
```java
// O -1 é somado e contado indevidamente → corrige depois do ciclo
soma     = soma + 1;       // cancela o -1 somado
contador = contador - 1;   // desconta a contagem do -1
```

---

## 📚 Ficha Prática 04 — Ciclos do-while e Menus

> **Tema:** O ciclo `do-while` garante pelo menos uma execução antes de verificar a condição. Muito usado em menus.

### Conceitos-chave

**Estrutura do do-while**
```java
do {
    // executa pelo menos uma vez
} while (condicao);
```

> 💡 A diferença para o `while`: no `while` a condição é verificada **antes** de entrar; no `do-while` é verificada **depois** — o bloco corre sempre pelo menos uma vez.

**Menu típico com do-while**
```java
int opcao;
do {
    System.out.println("1. Opção A");
    System.out.println("2. Sair");
    opcao = input.nextInt();

    switch (opcao) {
        case 1: /* ... */ break;
        case 2: /* sair */ break;
        default: System.out.println("Inválido");
    }
} while (opcao != 2);
```

**equalsIgnoreCase** — comparar Strings ignorando maiúsculas/minúsculas:
```java
continuar.equalsIgnoreCase("s")  // "s" e "S" são tratados igual
```

### Exercícios

| Exercício | O que faz |
|---|---|
| Ex01 | Calculadora com repetição (do-while + switch) |
| Ex02 | Menu CRUD em loop (do-while + switch + case aninhado) |
| Ex03 | Jogo de adivinhar o número com dicas (do-while) |
| Ex04 | Verificar se número é primo (for dentro de outro contexto) |

### 💡 Notas de revisão

**Verificar número primo** (Ex04):
```java
boolean primo = true;
for (int divisor = 2; divisor < numero; divisor++) {
    if (numero % divisor == 0) primo = false;
}
// se nenhum divisor entre 2 e n-1 funcionar → é primo
```

---

## 📚 Ficha Extra — Condicionais

> Exercícios extra para consolidar `if/else` e `switch`. Padrão igual à FP02.

| Exercício | O que faz | Conceito destacado |
|---|---|---|
| Ex01 | Maior ou menor de idade (≥ 18) | `if/else` simples |
| Ex02 | Peso na Lua (× 0.16) com validação | `if/else` + validação de input |
| Ex03 | Desconto 10% se ≥ 100€ | `if/else` com pré-cálculo |
| Ex04 | Vogal ou consoante | `switch` com fall-through |
| Ex05 | Adivinhar número com 2 tentativas | `if/else if` encadeado |
| Ex06 | Ano bissexto (% 4) | `if/else` com módulo |

---

## 📚 Ficha Extra — Ciclos (for)

> Exercícios extra com foco no ciclo `for` e padrões visuais com ciclos aninhados.

### Conceitos-chave

**Estrutura do for**
```java
for (inicialização; condição; incremento) {
    // corpo do ciclo
}

// Equivalente while:
int i = 0;
while (i < 10) { i++; }

// for equivalente:
for (int i = 0; i < 10; i++) { }
```

**For aninhado** — ciclo dentro de ciclo:
```java
for (int i = 1; i <= linhas; i++) {       // controla as linhas
    for (int j = 1; j <= colunas; j++) {  // controla as colunas
        System.out.print("*");
    }
    System.out.println(); // nova linha
}
```

**Extrair dígitos com aritmética modular:**
```java
while (numero != 0) {
    digito  = numero % 10;   // último dígito (ex: 1234 → 4)
    numero /= 10;            // remove o último dígito (ex: 1234 → 123)
}
```

**Inverter número** (Ex10):
```java
numeroInvertido = numeroInvertido * 10 + digito;
// desloca os dígitos já recolhidos e acrescenta o novo à direita
```

### Exercícios

| Exercício | O que faz | Conceito destacado |
|---|---|---|
| Ex01 | Imprimir 1 a 500 | `for` básico |
| Ex02 | Múltiplos de 3 até 255 | `for` + filtro `if` |
| Ex03 | Tabuada completa 1 a 10 | `for` aninhado |
| Ex04_01 | Retângulo de `*` (4×10) | `for` aninhado — retângulo |
| Ex04_02 | Triângulo crescente de `*` | `for` aninhado — triângulo |
| Ex04_03 | Pirâmide centrada de `*` | `for` aninhado — pirâmide com espaços |
| Ex05_01 | Triângulo com número da linha repetido | `for` aninhado — dígitos |
| Ex05_02 | Pirâmide centrada com número da linha | `for` aninhado — pirâmide de dígitos |
| Ex05_03 | Pirâmide espelhada de números | `for` aninhado — espelho |
| Ex06 | Maior e menor com sentinela 0 | `while` + sentinela |
| Ex07 | Contar positivos e negativos | `while` + múltiplos contadores |
| Ex08 | Potência sem `Math.pow` | `for` + acumulador multiplicativo |
| Ex09 | Soma dos dígitos de um número | `while` + `% 10` e `/ 10` |
| Ex10 | Inverter os dígitos de um número | `while` + reconstrução invertida |

### 💡 Padrão dos padrões visuais (Ex04 e Ex05)

Todos os padrões seguem a mesma lógica de três partes por linha:

```
1. Espaços à esquerda   → centra ou recua o padrão
2. Caracteres/números   → o conteúdo visual da linha
3. println()            → avança para a próxima linha
```

E os contadores atualizam-se **depois** de cada linha:
```java
espacos--;       // menos espaços na próxima linha
asteriscos += 2; // mais dois asteriscos na próxima linha
```

---

## 🔑 Referência Rápida — Sintaxe Java

```java
// ── Tipos primitivos ──────────────────────────────
int    n  = 10;
double d  = 3.14;
boolean b = true;
String  s = "texto";
char    c = 'A';

// ── Operadores ────────────────────────────────────
+   -   *   /        // aritméticos
%                    // módulo (resto da divisão)
==  !=  >  <  >=  <= // comparação
&&  ||  !            // lógicos (E, OU, NÃO)
++  --               // incremento / decremento
+=  -=  *=  /=       // atribuição composta

// ── Input ─────────────────────────────────────────
Scanner input = new Scanner(System.in);
int    n  = input.nextInt();
double d  = input.nextDouble();
String s  = input.next();        // uma palavra
String ln = input.nextLine();    // linha completa

// ── Output ────────────────────────────────────────
System.out.print("sem newline");
System.out.println("com newline");
System.out.println("valor: " + variavel);  // concatenação

// ── Condicionais ──────────────────────────────────
if (cond) { } else if (cond2) { } else { }

switch (var) {
    case X: break;
    default: break;
}

// ── Ciclos ───────────────────────────────────────
while (cond) { }

do { } while (cond);

for (int i = 0; i < n; i++) { }

// ── Conversões úteis ─────────────────────────────
String s = input.next().toLowerCase();    // minúsculas
String s = input.next().toUpperCase();    // maiúsculas
s.equalsIgnoreCase("texto")              // comparar Strings
```

---

## ✅ Checklist de Conceitos Dominados

- [ ] Declarar variáveis e escolher o tipo correto (`int`, `double`, `String`)
- [ ] Ler dados do teclado com `Scanner`
- [ ] Aplicar operações aritméticas e entender a divisão inteira
- [ ] Usar `if / else if / else` para tomar decisões
- [ ] Usar `switch` com `break` e entender o fall-through
- [ ] Construir um ciclo `while` com contador/acumulador/sentinela
- [ ] Entender a diferença entre `while` e `do-while`
- [ ] Construir menus interativos com `do-while + switch`
- [ ] Usar o ciclo `for` e comparar com o `while`
- [ ] Criar padrões visuais com `for` aninhado
- [ ] Usar `%` para verificar paridade e extrair dígitos
- [ ] Inverter e somar os dígitos de um número
- [ ] Usar uma flag booleana para rastrear uma condição

---

*Módulo: Algoritmia e Programação — Java*
