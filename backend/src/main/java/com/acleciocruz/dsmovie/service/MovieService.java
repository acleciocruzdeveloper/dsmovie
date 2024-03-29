package com.acleciocruz.dsmovie.service;

import com.acleciocruz.dsmovie.dto.MovieDTO;
import com.acleciocruz.dsmovie.entities.Movie;
import com.acleciocruz.dsmovie.repositories.MovieRepository;

import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Api NetHero
 * @author Aclecio Cruz
 */
@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(converter -> new MovieDTO(converter));
        return page;
    }

    public MovieDTO findById(Long id) {
        Movie result = repository.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }

}
