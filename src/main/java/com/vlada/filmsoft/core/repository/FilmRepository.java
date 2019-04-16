package com.vlada.filmsoft.core.repository;

import com.vlada.filmsoft.core.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film, Integer> {

}
