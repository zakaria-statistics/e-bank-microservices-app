package net.zakaria.customerservice;

import net.zakaria.customerservice.config.GlobalConfig;
import net.zakaria.customerservice.entities.Customer;
import net.zakaria.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
@EnableConfigurationProperties(GlobalConfig.class)
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
		return args -> {
			List<Customer> customerList	= List.of(
					Customer.builder()
							.firstName("Michael")
							.lastName("Scott")
							.email("scott@hotmail.com")
							.build(),
					Customer.builder()
							.firstName("Jim")
							.lastName("Halpert")
							.email("jim@hotmail.com")
							.build()
			);
			customerRepository.saveAll(customerList);
		};
	}

}
