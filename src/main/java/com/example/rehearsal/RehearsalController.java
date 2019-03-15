package com.example.rehearsal;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class RehearsalController {
        @GetMapping("/songs")
        public List<Song> songs() {
		List<Part> parts = new ArrayList<>();
		Part part = new Part("chorus", "A Bm F", 2);
		parts.add(part);
		List<Song> songs = new ArrayList<>();
		songs.add(new Song("Black Swan", "A song about a black swan", parts));
		songs.add(new Song("Home", "This song is about home", parts));

                return songs;
        }

	@PostMapping("/songs") 
	public void newSong(@RequestBody Song song) {
		
	}
}
