package br.com.loterias.caixa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CaixaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaixaApplication.class, args);
	}

}
