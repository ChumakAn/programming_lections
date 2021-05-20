package ua.lviv.iot.shoppingproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "ua.lviv.iot.shoppingproject.controllers", "ua.lviv.iot.shoppingproject.service" })
public class ShoppingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingProjectApplication.class, args);
	}

}
