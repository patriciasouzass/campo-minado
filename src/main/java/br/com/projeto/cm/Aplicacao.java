package br.com.projeto.cm;

import br.com.projeto.cm.modelo.Tabuleiro;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aplicacao {
    public static void main(String[] args) {
        SpringApplication.run(Aplicacao.class, args);
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        tabuleiro.alternarMarcacao(4, 4);
        tabuleiro.alternarMarcacao(4, 5);
        tabuleiro.abrir(3, 3);

        System.out.println(tabuleiro);
    }
}
