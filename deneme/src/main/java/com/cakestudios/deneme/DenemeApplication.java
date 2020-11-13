package com.cakestudios.deneme;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DenemeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenemeApplication.class, args);

	}
	@Bean
	public ModelMapper getModelmapper(){
		return  new ModelMapper();
	}
}
