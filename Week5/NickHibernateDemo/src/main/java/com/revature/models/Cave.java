package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cave")
public class Cave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cave_id")
	private int caveId;
	
	@Column(name = "sq_footage")
	private double sqFootage;
	
	@Column(name = "cavetype")
	private String caveType;

	public int getCaveId() {
		return caveId;
	}

	public void setCaveId(int caveId) {
		this.caveId = caveId;
	}

	public double getSqFootage() {
		return sqFootage;
	}

	public void setSqFootage(double sqFootage) {
		this.sqFootage = sqFootage;
	}

	public String getCaveType() {
		return caveType;
	}

	public void setCaveType(String caveType) {
		this.caveType = caveType;
	}

	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caveId;
		result = prime * result + ((caveType == null) ? 0 : caveType.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sqFootage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Cave other = (Cave) obj;
		if (caveId != other.caveId)
			return false;
		if (caveType == null) {
			if (other.caveType != null)
				return false;
		} else if (!caveType.equals(other.caveType))
			return false;
		if (Double.doubleToLongBits(sqFootage) != Double.doubleToLongBits(other.sqFootage))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cave [caveId=" + caveId + ", sqFootage=" + sqFootage + ", caveType=" + caveType + "]";
	}
	
	
	
}
