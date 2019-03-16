package com.example.rehearsal;

import lombok.Data;
import lombok.AllArgsConstructor;
import java.util.*;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
public class Part {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String chords;
	private int repeats;
	@ManyToOne
	@JoinColumn
	@JsonIgnore
	private Song song;
}
