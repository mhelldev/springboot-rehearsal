package com.example.rehearsal;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;


@RestController
public class RehearsalController {

	@Autowired
	private SongRepository songRepo;

        @GetMapping("/songs")
        public Iterable<Song> songs() {
		return songRepo.findAll();
        }

	@PostMapping("/songs") 
	public void newSong(@RequestBody Song song) {
		
	}
}
