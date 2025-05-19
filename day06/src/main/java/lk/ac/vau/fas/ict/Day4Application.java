package lk.ac.vau.fas.ict;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})

public class Day4Application {

	public static void main(String[] args) {
		SpringApplication.run(Day4Application.class, args);
	}

}
