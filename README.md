# 📐 Senai_LLP_Variaveis_Geometria

Projeto desenvolvido para a disciplina **Lógica e Linguagem de Programação (LLP)** do SENAI.  
Cada arquivo `.java` implementa o cálculo de área de uma figura geométrica diferente.

---

## 📁 Estrutura dos Arquivos

| Arquivo | Figura | Fórmula |
|---|---|---|
| `AreaRetangulo.java` | Retângulo | `A = base × altura` |
| `AreaTriangulo.java` | Triângulo | `A = (base × altura) / 2` |
| `AreaCirculo.java`   | Círculo   | `A = π × raio²` |
| `AreaCaixa.java`     | Caixa (Paralelepípedo) | `A = 2(ab + bc + ac)` |
| `AreaPiramide.java`  | Pirâmide (Base Quadrada) | `A = base² + 2 × base × apótema` |
| `AreaTubo.java`      | Tubo (Cilindro) | `A = 2πr(r + h)` |
| `AreaBola.java`      | Bola (Esfera) | `A = 4 × π × raio²` |

---

## ▶️ Como Compilar e Executar

Certifique-se de ter o **JDK** instalado. Para cada arquivo:

```bash
# Compilar
javac AreaRetangulo.java

# Executar
java AreaRetangulo
```

Exemplo com todos os arquivos:

```bash
javac AreaRetangulo.java  && java AreaRetangulo
javac AreaTriangulo.java  && java AreaTriangulo
javac AreaCirculo.java    && java AreaCirculo
javac AreaCaixa.java      && java AreaCaixa
javac AreaPiramide.java   && java AreaPiramide
javac AreaTubo.java       && java AreaTubo
javac AreaBola.java       && java AreaBola
```

---

## 🧠 Conceitos Aplicados

- Variáveis e tipos primitivos (`double`)
- Entrada de dados com `Scanner`
- Operadores aritméticos
- Classe `Math` (`Math.PI`, `Math.pow`, `Math.sqrt`)
- Saída formatada com `printf`

---

## 👨‍💻 Desenvolvido para SENAI — LLP
