package com.area51.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.area51.exceptions.CoordinatesOutOfBounds;
import com.area51.model.Satellites;
import com.area51.repositories.SatellitesRepo;

@Service
public class SatellitesServiceImpl implements SatellitesService {
	
	private SatellitesRepo satelliteRepo;

	@Override
	public void addSatellite(Satellites satellite) {
		satelliteRepo.save(satellite);
	}

	@Override
	public void changeLocation(Satellites satellite, Double xCoordinates, Double yCoordinates) throws CoordinatesOutOfBounds {
		if (xCoordinates < 0 || xCoordinates > 90) {
			throw new CoordinatesOutOfBounds("X-Coordinates must be between 0 & 90");
		}
		
		if (yCoordinates < 0 || yCoordinates > 180) {
			throw new CoordinatesOutOfBounds("Y-Coordinates must be between 0 & 180");
		}
		
		satellite = satelliteRepo.getOne(satellite.getId());
		
		satellite.setxCoordinates(xCoordinates);
		satellite.setyCoordinates(yCoordinates);
		
		satelliteRepo.save(satellite);
	}

	@Override
	public void sendMessage(Satellites satellite, String frequency) {
		System.out.println("Message being sent from satellite: " + satellite + " on Frequency: " + frequency);
	}

	@Override
	public Satellites findSatelliteByLocation(Double xCoordinates, Double yCoordinates) {
		return satelliteRepo.findSatellitesByXCoordinatesAndYCoordinates(xCoordinates, yCoordinates);
	}

	@Override
	public void retireSatellite(Satellites satellite) {
		satelliteRepo.delete(satellite.getId());

	}
	
	@Override
	public Satellites findSatelliteById(Integer id) {
		return satelliteRepo.findOne(id);
		
	}

	@Autowired
	public void setSatelliteRepo(SatellitesRepo satelliteRepo) {
		this.satelliteRepo = satelliteRepo;
	}

	public SatellitesServiceImpl(SatellitesRepo satelliteRepo) {
		super();
		this.satelliteRepo = satelliteRepo;
	}

	public SatellitesServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
