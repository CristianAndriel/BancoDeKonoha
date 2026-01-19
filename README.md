# 🏦 Desafio: Banco de Konoha


<img width="637" height="751" alt="image" src="https://github.com/user-attachments/assets/4c3aa4b8-9ea6-4980-8f9b-c9a82f76a6fe" />


Este projeto foi desenvolvido como parte do desafio **Java.10x**, focado no domínio de Programação Orientada a Objetos (POO) e organização de código profissional. O sistema simula a gestão de diferentes tipos de contas bancárias, aplicando regras de negócio específicas para cada uma.

---

## 🏗️ Arquitetura do Projeto

Seguindo princípios de **Clean Architecture**, o código foi organizado para manter a lógica de negócio isolada e protegida.

* **Camada de Domínio:** Localizada em `domain.entities`, contém o núcleo da aplicação.
* **Inversão de Dependência:** O uso de interfaces permite que o sistema dependa de abstrações e não de implementações concretas.

---

## 🛠️ Componentes do Sistema

### 1. Interface `Conta`
Define o contrato obrigatório para todas as contas do Banco de Konoha:
* `double consultarSaldo()`: Método para retorno do saldo atualizado.
* `void depositar(double valor)`: Método para entrada de capital.

### 2. Classe Abstrata `ContaBancaria`
Centraliza as características comuns entre as contas:
* **Atributo Saldo:** Armazenado como `protected double saldo` para permitir que as subclasses manipulem o valor respeitando a herança.
* **Construtor:** Garante que toda conta seja iniciada com um saldo definido (Saldo Inicial).
* **Abstração:** O método de depósito é marcado como `abstract`, forçando a implementação de regras específicas nas classes filhas.

### 3. Classes Concretas (Especializações)
* **Conta Corrente:** Implementa o depósito padrão sem taxas adicionais.
* **Conta Poupança:** Implementa uma regra de negócio onde cada depósito sofre uma **taxa de 1%** (dedução de valor).

---

## 🚀 Exemplo de Fluxo

Ao realizar uma operação de depósito de **R$ 200,00** em uma `ContaPoupanca` iniciada com saldo zero:

1.  O valor é processado pela lógica da subclasse.
2.  A taxa de 1% é calculada (R$ 2,00).
3.  O saldo final atualizado para consulta será de **R$ 198,00**.

---

## 📝 Tecnologias Utilizadas
* **Java JDK 17+**
* **IntelliJ IDEA**
* **Conceitos de POO:** Herança, Polimorfismo, Encapsulamento e Abstração.
