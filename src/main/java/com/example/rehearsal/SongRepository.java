package com.example.rehearsal;

import java.util.*;
import org.springframework.data.repository.CrudRepository;


public interface SongRepository extends CrudRepository<Song, Long> {
	@Override
	public List<Song> findAll();
}
