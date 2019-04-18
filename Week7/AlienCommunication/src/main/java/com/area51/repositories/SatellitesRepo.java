package com.area51.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.area51.model.Satellites;

@Repository
public interface SatellitesRepo extends JpaRepository<Satellites, Integer> {
	
	public Satellites findSatellitesByXCoordinatesAndYCoordinates(Double xCoordinates, Double yCoordinates);

}
