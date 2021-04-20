package com.veterinaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HistoriasBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(HistoriasBackendApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("*").allowedHeaders("*");
				registry.addMapping("/").allowedOrigins("https://historias-app.herokuapp.com").allowedMethods("*").allowedHeaders("*");
		                registry.addMapping("/*").allowedOrigins("").allowedMethods("GET", "POST", "PUT","DELETE");
			}
			
		};
	}
	

}
