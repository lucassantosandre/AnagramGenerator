# 📜 Gerador de Anagramas


Este projeto é um **Gerador de Anagramas** em Java. Ele permite que você forneça uma palavra e obtenha todas as possíveis combinações (anagramas) de suas letras. Além disso, integra automações via **GitHub Actions**, incluindo execução de testes e visualização dos resultados.

---

## 🎯 Objetivo

O objetivo do projeto é criar um código que:
1. Gere anagramas de uma palavra dada como entrada.
2. Valide que a entrada contém apenas letras alfabéticas.
3. Funcione tanto localmente quanto em uma integração contínua com GitHub Actions.
4. Forneça logs claros e resultados visualmente destacados, facilitando a interpretação de saídas no terminal e no Actions.

---

## 📌 Funcionalidades

- **Geração de Anagramas**: Insira uma palavra e receba todas as combinações possíveis.
- **Validação de Entrada**: Garante que a palavra contenha apenas letras.
- **Cores e Emojis no Output**: Resultados formatados com cores para destacar sucesso ou erros.
- **Integração com GitHub Actions**:
  - Executa testes automaticamente.
  - Exibe os resultados gerados em destaque.

---

## 🛠️ Pré-requisitos

Certifique-se de ter os seguintes itens instalados:

- [Java 11+](https://adoptium.net/)
- [Apache Maven](https://maven.apache.org/)

---

## 🚀 Como Utilizar

### 🔧 Localmente

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd <PASTA_DO_REPOSITORIO>
   ```

2. Compile o código:
   ```bash
   mvn compile
   ```

3. Execute o código com uma palavra como entrada:
   ```bash
   mvn exec:java -Dexec.mainClass="AnagramGenerator" -Dexec.args="<PALAVRA>"
   ```
   Exemplo:
   ```bash
   mvn exec:java -Dexec.mainClass="AnagramGenerator" -Dexec.args="java"
   ```
   ou apenas:
  ```bash
   mvn exec:java -Dexec.mainClass="AnagramGenerator"
   ```

4. Execute os testes:
   ```bash
   mvn test
   ```

### 🤖 Pelo GitHub Actions

1. Certifique-se de que o repositório está no GitHub e que as workflows do Actions estão configuradas.
2. No repositório, acesse a aba **Actions**.
3. Selecione o workflow **Test and Run Anagram Generator**.
4. Clique em **Run Workflow** e insira a palavra desejada no campo de entrada.
5. Visualize os resultados destacados no log da execução.

---

## 🧪 Testes

Os testes automatizados verificam:

1. **Validação de entrada**:
   - Rejeitar entradas vazias.
   - Rejeitar entradas com caracteres não alfabéticos.

2. **Geração de anagramas**:
   - Confirma se todas as combinações possíveis são geradas corretamente.

Para executar os testes localmente:
```bash
mvn test
```

---

## 📂 Estrutura do Repositório

- `src/main/java/AnagramGenerator.java`: Contém o código principal do gerador de anagramas.
- `src/test/java/AnagramGeneratorTest.java`: Contém os testes unitários.
- `.github/workflows/anagram-generator.yml`: Workflow para execução automatizada no GitHub Actions.

---