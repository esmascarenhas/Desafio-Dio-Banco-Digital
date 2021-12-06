package br.com.esm.desafiodioBancoDigital.domain;

import br.com.esm.desafiodioBancoDigital.domain.Conta;

public interface Iconta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor , Iconta contaDestino);
    void imprimirExtrato();

}
