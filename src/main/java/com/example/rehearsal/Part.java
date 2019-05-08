package com.example.rehearsal;

import lombok.Data;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.*;

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

	@JsonIgnore
	public Song getSong() {
		return this.song;
	}
	
	@JsonProperty
	public void setSong(Song song) {
		this.song = song;
	}
}
