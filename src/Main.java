import domain.entities.ContaPoupanca;

public class Main {
    static void main() {
        System.out.println("Hello World!");

        // Criando a conta com saldo inicial
        ContaPoupanca depositoPoupanca = new ContaPoupanca(0);

        // Realizando o depósito
        depositoPoupanca.depositar(200.0);

        // Verificando o saldo final
        System.out.println("Saldo após as operações: R$ " + depositoPoupanca.consultarSaldo());
    }
}
