package br.com.esm.desafiodioBancoDigital.domain;

import lombok.Getter;

@Getter
public abstract class Conta implements Iconta {//impede que seja instânciada(exceto filhos)

    private static final int AGENCIA_PADRAO = 2020;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numeroConta;
    protected double saldoConta;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = Conta.SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldoConta -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldoConta +=valor;

    }

    @Override
    public void transferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfoExtrato() {
        System.out.printf("Titular: %s\n", this.cliente.getNomeCliente());
        System.out.printf("Agência: %d\n", this.agencia);
        System.out.printf("Numero: %d\n", this.numeroConta);
        System.out.printf("Saldo: %.2f\n", this.saldoConta);
    }
}
