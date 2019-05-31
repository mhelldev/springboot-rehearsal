package com.example.rehearsal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import java.util.*;

@SpringBootApplication
public class RehearsalApplication {

	public static void main(String[] args) {
		SpringApplication.run(RehearsalApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(SongRepository repository) {
		return (args) -> {
			Song song = new Song();
			song.setName("Black Swan");
			song.setDescription("A song about a black swan");
			song.setParts("Am C Dm A7\n B Fm");
			repository.save(song);
		};
	}

}
