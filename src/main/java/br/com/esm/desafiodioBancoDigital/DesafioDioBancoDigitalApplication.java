package br.com.esm.desafiodioBancoDigital;

import br.com.esm.desafiodioBancoDigital.domain.Cliente;
import br.com.esm.desafiodioBancoDigital.domain.Conta;
import br.com.esm.desafiodioBancoDigital.domain.ContaCorrente;
import br.com.esm.desafiodioBancoDigital.domain.ContaPoupanca;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioDioBancoDigitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioDioBancoDigitalApplication.class, args);

		Cliente cliente1 = new Cliente();
		cliente1.setNomeCliente("Emerson");
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(2000);

		Cliente cliente2 = new Cliente();
		cliente2.setNomeCliente("Tiago");
		Conta cp = new ContaPoupanca(cliente2);

		cp.depositar(500);


		cc.imprimirExtrato();
		System.out.println("-------------------------");
		cp.imprimirExtrato();
		cc.transferir(250,cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();

	}
}
