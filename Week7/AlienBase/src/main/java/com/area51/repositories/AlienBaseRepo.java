package com.area51.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.area51.model.AlienBase;

@Repository
public interface AlienBaseRepo extends JpaRepository<AlienBase, Integer> {

}
