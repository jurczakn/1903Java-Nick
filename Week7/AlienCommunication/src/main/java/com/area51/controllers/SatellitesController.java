package com.area51.controllers;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.area51.dto.CoordinatesDTO;
import com.area51.exceptions.CoordinatesOutOfBounds;
import com.area51.model.Satellites;
import com.area51.services.SatellitesService;

@RestController("/satellites")
public class SatellitesController {
	
	SatellitesService satellitesService;
	
	@GetMapping
	public Satellites getSatelliteByCoordinates(
			@RequestParam(name="xCoordinates")Double xCoordinates, 
			@RequestParam(name="yCoordinates")Double yCoordinates) {
		return satellitesService.findSatelliteByLocation(xCoordinates, yCoordinates);
	}
	
	@PostMapping
	public void createSatellites(@RequestBody Satellites satellite) {
		satellitesService.addSatellite(satellite);
	}
	
	@PostMapping("/satellites/{id}/message")
	public void sendMessage(@RequestBody String frequency, @PathVariable Integer id) {
		satellitesService.sendMessage(satellitesService.findSatelliteById(id), frequency);
	}
	
	@DeleteMapping("/satellites/{id}")
	public void deleteSatellite(@PathVariable Integer id) {
		satellitesService.retireSatellite(satellitesService.findSatelliteById(id));
	}
	
	@PatchMapping("/satellites/{id}")
	public String updateLocation(@PathVariable Integer id, @RequestBody CoordinatesDTO coordinates, HttpServletResponse resp) {
		try {
			satellitesService.changeLocation(satellitesService.findSatelliteById(id), coordinates.getxCoordinates(), coordinates.getyCoordinates());
			return "success";
		} catch (CoordinatesOutOfBounds e) {
			resp.setStatus(400);
			return e.getMessage();
		}
	}

	@Autowired
	public void setSatellitesService(SatellitesService satellitesService) {
		this.satellitesService = satellitesService;
	}

}
