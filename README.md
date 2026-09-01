# 📚 Sistema de Biblioteca (Prática de POO em Java)

Este projeto é uma simulação simples de um sistema de biblioteca, desenvolvido como exercício prático para aplicar e consolidar conceitos fundamentais de **Programação Orientada a Objetos (POO)** na linguagem Java. 

O sistema permite cadastrar livros, gerenciar diferentes tipos de usuários (Alunos e Professores) e simular aluguéis e renovações aplicando regras de negócio específicas para cada tipo de usuário.

## 🚀 Conceitos Aplicados

O código foi cuidadosamente planejado e escrito para demonstrar a aplicação prática dos seguintes pilares e conceitos da Orientação a Objetos:

* **Classes e Objetos**: Estruturação de moldes (`Livro`, `Usuario`) e instanciação de objetos.
* **Encapsulamento**: Proteção de dados utilizando modificadores de acesso (`private`, `protected`) e acesso via métodos `Getters` e `Setters`.
* **Construtores**: Inicialização segura dos objetos garantindo as regras de negócio iniciais. Referências com as palavras-chave `this` e `super`.
* **Atributos Estáticos**: Uso de `static` para armazenar informações que pertencem à classe como um todo (Ex: contagem total de livros cadastrados).
* **Associação**: Relacionamento entre classes, onde a classe `Usuario` guarda uma referência para um objeto do tipo `Livro`.
* **Herança**: Uso da palavra `extends` para criar uma hierarquia onde `Aluno` e `Professor` herdam características da superclasse `Usuario`.
* **Classe Abstrata e Métodos Abstratos**: A classe `Usuario` foi definida como `abstract`, impedindo sua instanciação direta e forçando suas subclasses a implementarem regras de negócio obrigatórias (ex: `obterDiasDevolucao()`).
* **Polimorfismo**:
  * **Sobrescrita (Overriding)**: Alunos têm 7 dias para devolução e Professores têm 15 dias.
  * **Sobrecarga (Overloading)**: O método `alugar` possui duas versões na mesma classe (uma para aluguel comum e outra para renovação recebendo um `boolean`).
* **Interfaces**: Uso da palavra `implements` para assinar contratos de comportamento através da interface `Imprimivel`.

## 📁 Estrutura do Projeto

* `Imprimivel.java`: Interface que obriga a implementação do método `imprimirDados()`.
* `Livro.java`: Representa os livros da biblioteca. Contabiliza o total de livros no sistema.
* `Usuario.java`: Superclasse abstrata que contém as lógicas de locação e renovação.
* `Aluno.java`: Subclasse de Usuário (prazo de 7 dias).
* `Professor.java`: Subclasse de Usuário (prazo de 15 dias).
* `Principal.java`: Classe executável contendo o método `main` para rodar e testar o funcionamento do sistema.

## ⚙️ Como executar

Certifique-se de ter o [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/downloads/) instalado em sua máquina.

1. Abra o terminal e navegue até a pasta do projeto.
2. Compile os arquivos Java:
   ```bash
   javac src/biblioteca/*.java
   ```
3. Execute a classe principal:
   ```bash
   java -cp src biblioteca.Principal
   ```

---
*Projeto desenvolvido para fins acadêmicos e de aprendizado.*
