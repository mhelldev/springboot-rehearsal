package com.example.rehearsal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
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

			Part part = new Part();
			part.setName("Chorus");
			part.setRepeats(4);
			part.setSong(song);

			List<Part> parts = new ArrayList<>();
			parts.add(part);
			song.setParts(parts);
			
			repository.save(song);

		};
	}

}
