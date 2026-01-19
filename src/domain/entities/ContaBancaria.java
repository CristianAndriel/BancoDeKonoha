package domain.entities;

public abstract class ContaBancaria implements Conta {

    protected double saldo;

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {

    }


}
