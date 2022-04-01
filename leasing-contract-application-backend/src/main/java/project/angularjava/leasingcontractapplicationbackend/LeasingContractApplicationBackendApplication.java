package project.angularjava.leasingcontractapplicationbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ComponentScan({"project.angularjava.leasingcontactapplicationbackend"})
@EnableJpaRepositories("project.angularjava.leasingcontactapplicationbackend.repositories")
public class LeasingContractApplicationBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeasingContractApplicationBackendApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(final CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:8080")
						.allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}


}
