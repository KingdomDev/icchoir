package fr.icchoirlyon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class IcchoirApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IcchoirApplication.class, args);
	}
}
