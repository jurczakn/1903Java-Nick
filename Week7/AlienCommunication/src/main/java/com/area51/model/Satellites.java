package com.area51.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SATELLITES")
public class Satellites {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SATELLITES_ID")
	private Integer id;
	
	@Column(name="FREQUENCY_RANGE")
	private String frequencyRange;
	
	@Column(name="X_COORDINATES")
	private Double xCoordinates;
	
	@Column(name="Y_COORDINATES")
	private Double yCoordinates;
	
	@Column(name="CONDITION")
	private String condition;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFrequencyRange() {
		return frequencyRange;
	}

	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}

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

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public Satellites(Integer id, String frequencyRange, Double xCoordinates, Double yCoordinates, String condition) {
		super();
		this.id = id;
		this.frequencyRange = frequencyRange;
		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
		this.condition = condition;
	}

	public Satellites() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Satellites [id=" + id + ", frequencyRange=" + frequencyRange + ", xCoordinates=" + xCoordinates
				+ ", yCoordinates=" + yCoordinates + ", condition=" + condition + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((condition == null) ? 0 : condition.hashCode());
		result = prime * result + ((frequencyRange == null) ? 0 : frequencyRange.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Satellites other = (Satellites) obj;
		if (condition == null) {
			if (other.condition != null)
				return false;
		} else if (!condition.equals(other.condition))
			return false;
		if (frequencyRange == null) {
			if (other.frequencyRange != null)
				return false;
		} else if (!frequencyRange.equals(other.frequencyRange))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
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
