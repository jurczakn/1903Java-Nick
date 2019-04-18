package com.area51.services;

import com.area51.exceptions.CoordinatesOutOfBounds;
import com.area51.model.Satellites;

public interface SatellitesService {
	
	public void addSatellite(Satellites satellite);
	
	public void changeLocation(Satellites satellite, Double xCoordinates, Double yCoordinates) throws CoordinatesOutOfBounds;
	
	public void sendMessage(Satellites satellite, String frequency);
	
	public Satellites findSatelliteByLocation(Double xCoordinates, Double yCoordinates);
	
	public void retireSatellite(Satellites satellite);
	
	public Satellites findSatelliteById(Integer id);

}
