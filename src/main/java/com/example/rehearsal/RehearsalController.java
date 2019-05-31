package com.example.rehearsal;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RehearsalController {

	@Autowired
	private SongRepository songRepo;

	@GetMapping("/songs")
	public List<Song> songs() {
		List<Song> songs = songRepo.findAll();
		Collections.sort(songs, (Song s1, Song s2) -> s2.getId().compareTo(s1.getId()));
		return songs;
	}

	@PostMapping("/songs")
	public void submitSong(@RequestBody Song song) {			 
		songRepo.save(song);
	}
 
}
