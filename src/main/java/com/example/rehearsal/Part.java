package com.example.rehearsal;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.*;

@Data
@AllArgsConstructor
public class Part {
	private String name;
	private String chords;
	private int repeats;
}
