package myspring;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.databind.ObjectMapper;

@EntityScan("myspring.model")
@EnableJpaRepositories("myspring.dao")//יודע ליצור אוטומטית מופעים מהממשקים הנדרשים //spring boot //
@SpringBootApplication
@ComponentScan("myspring")
public class AdvertiserApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvertiserApplication.class, args);
	}
	
	@Bean
	public ModelMapper getMapper()
	{
		return new ModelMapper();
	}

	@Bean
	public ObjectMapper getobjectMapper()
	{
		return new ObjectMapper();
	}

}
