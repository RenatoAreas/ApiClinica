package br.com.psicologando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "br.com.psicologando")
public class ProjetoPsicologandoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoPsicologandoApiApplication.class, args);
	}

}
