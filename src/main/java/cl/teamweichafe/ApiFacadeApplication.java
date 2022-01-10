package cl.teamweichafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ApiFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiFacadeApplication.class, args);
	}

}
