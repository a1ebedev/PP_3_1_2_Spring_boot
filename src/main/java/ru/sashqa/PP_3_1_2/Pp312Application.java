package ru.sashqa.PP_3_1_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Pp312Application {

	public static void main(String[] args) {
		SpringApplication.run(Pp312Application.class, args);
	}

}
