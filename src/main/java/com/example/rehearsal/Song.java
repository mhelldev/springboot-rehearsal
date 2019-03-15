package com.example.rehearsal;

import lombok.Data;
import java.util.*;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Song {
	private String name;
	private String description;
	private List<Part> parts;
}

