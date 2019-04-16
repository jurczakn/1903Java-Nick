package com.revature.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.bean.Penguin;

@Repository
public interface PenguinRepo extends JpaRepository<Penguin, Integer> {

}
