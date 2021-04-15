package guru.springframework.spring5jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring5JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppApplication.class, args);
	}

	@Bean
	public ChuckNorrisQuotes getJokesService() {
		return new ChuckNorrisQuotes();
	}

}
