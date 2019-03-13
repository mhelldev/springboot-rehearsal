package com.example.rehearsal;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RehearsalController {
        @GetMapping("/songs")
        public List<Song> songs() {
		List<Song> songs = new ArrayList<>();
		songs.add(new Song("Black Swan", "A song about a black swan"));
		songs.add(new Song("Home", "This song is about home"));

                return songs;
        }
}
