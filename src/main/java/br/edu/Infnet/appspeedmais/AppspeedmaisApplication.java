package br.edu.Infnet.appspeedmais;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class AppspeedmaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppspeedmaisApplication.class, args);
	}

}
