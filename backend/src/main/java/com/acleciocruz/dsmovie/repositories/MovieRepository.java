package com.acleciocruz.dsmovie.repositories;

import com.acleciocruz.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
