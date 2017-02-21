package br.com.nuvemapp.exemplolog4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainSpringLog4j2 {
	
	public static void main(final String... args) throws Exception {
		SpringApplication.run(MainSpringLog4j2.class, args);
	}
	
}
