package com.desafiodiospring.ultimodesafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class UltimodesafioApplication {

	public static void main(String[] args) {
		SpringApplication.run(UltimodesafioApplication.class, args);
	}

}
