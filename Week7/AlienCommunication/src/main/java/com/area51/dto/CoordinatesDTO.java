package com.area51.dto;

public class CoordinatesDTO {
	
	private Double xCoordinates;
	
	private Double yCoordinates;

	public Double getxCoordinates() {
		return xCoordinates;
	}

	public void setxCoordinates(Double xCoordinates) {
		this.xCoordinates = xCoordinates;
	}

	public Double getyCoordinates() {
		return yCoordinates;
	}

	public void setyCoordinates(Double yCoordinates) {
		this.yCoordinates = yCoordinates;
	}

	public CoordinatesDTO(Double xCoordinates, Double yCoordinates) {
		super();
		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
	}

	public CoordinatesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CoordinatesDTO [xCoordinates=" + xCoordinates + ", yCoordinates=" + yCoordinates + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((xCoordinates == null) ? 0 : xCoordinates.hashCode());
		result = prime * result + ((yCoordinates == null) ? 0 : yCoordinates.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoordinatesDTO other = (CoordinatesDTO) obj;
		if (xCoordinates == null) {
			if (other.xCoordinates != null)
				return false;
		} else if (!xCoordinates.equals(other.xCoordinates))
			return false;
		if (yCoordinates == null) {
			if (other.yCoordinates != null)
				return false;
		} else if (!yCoordinates.equals(other.yCoordinates))
			return false;
		return true;
	}

}
