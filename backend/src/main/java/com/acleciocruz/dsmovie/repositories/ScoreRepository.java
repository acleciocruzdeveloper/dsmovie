package com.acleciocruz.dsmovie.repositories;

import com.acleciocruz.dsmovie.entities.Score;
import com.acleciocruz.dsmovie.entities.ScorePK;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
    
}
