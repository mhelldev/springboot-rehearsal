package com.example.rehearsal;

import lombok.Data;
import java.util.*;
import javax.persistence.*;

@Data
@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String description;
	@OneToMany(mappedBy = "song", cascade = CascadeType.ALL)
	private List<Part> parts;
}
