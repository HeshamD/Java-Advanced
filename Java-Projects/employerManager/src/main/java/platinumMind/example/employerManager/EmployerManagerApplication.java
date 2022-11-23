package platinumMind.example.employerManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class EmployerManagerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployerManagerApplication.class, args);
	}
}
