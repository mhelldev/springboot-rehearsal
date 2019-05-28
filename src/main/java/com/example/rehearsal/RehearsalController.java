package com.example.rehearsal;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class RehearsalController {

	@Autowired
	private SongRepository songRepo;
	@Autowired
	private PartRepository partRepo;

	@GetMapping("/songs")
	public List<Song> songs() {
		List<Song> songs = songRepo.findAll();
		Collections.sort(songs, (Song s1, Song s2) -> s2.getId().compareTo(s1.getId()));
		return songs;
	}

	@PostMapping("/songs")
	public void newSong(@RequestBody Song song) {	
		if (song.getParts() != null) {
			for(Part p : song.getParts()) {
				p.setSong(song);
			}
		}	
		songRepo.save(song);
	}

	@PostMapping("/parts")
	public void newPart(@RequestBody Part part) {
		partRepo.save(part);
	}

	/*
	 * curl localhost:8080/songs
	 *
	 * curl --header "Content-Type:application/json" --request POST --data
	 * '{"name":"Home", "description":"a song about home" ,
	 * "parts":[{"name":"chorus", "chords":"Am F", "repeats":2}] }'
	 * localhost:8080/songs
	 *
	 *
	 * curl --header "Content-Type:application/json" --request POST --data
	 * '{"name":"ref", "chords":"A F", "repeats":1 , "song":{"id": 3}}'
	 * localhost:8080/parts
	 *
	 */

}
