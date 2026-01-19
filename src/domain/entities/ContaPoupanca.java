package domain.entities;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(int i) {
        super();
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
        this.saldo += valor *0.99;
    }

}
