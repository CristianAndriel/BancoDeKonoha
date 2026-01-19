package domain.entities;

public interface Conta {
    double consultarSaldo();
    void depositar(double valor);
}
