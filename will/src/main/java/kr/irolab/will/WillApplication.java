package kr.irolab.will;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication
public class WillApplication {

	public static void main(String[] args) {
		SpringApplication.run(WillApplication.class, args);
		
	}

}
