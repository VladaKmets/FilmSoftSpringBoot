package com.vlada.filmsoft.core.controller;

import com.vlada.filmsoft.core.domain.Film;
import com.vlada.filmsoft.core.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("films")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @GetMapping(produces = "application/json")
    public List<Film> getFilms() {
        return filmService.getAllFilms();
    }

}
