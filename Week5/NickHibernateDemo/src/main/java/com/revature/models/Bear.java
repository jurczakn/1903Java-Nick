package com.revature.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "bears")
public class Bear {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bear_id")
	private int bearId;
	
	private String color;
	
	private String breed;
	
	@Column(name = "legs")
	private int numberOfLegs;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cave_id", referencedColumnName = "cave_id")
	private Cave cave;
	
	
	@ManyToMany
	@JoinTable(name = "parent_cub", joinColumns = @JoinColumn(name = "parent_id"), inverseJoinColumns = @JoinColumn(name = "cub_id"))
	private Set<Bear> cubs;


	public int getBearId() {
		return bearId;
	}


	public void setBearId(int bearId) {
		this.bearId = bearId;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public int getNumberOfLegs() {
		return numberOfLegs;
	}


	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}


	public Cave getCave() {
		return cave;
	}


	public void setCave(Cave cave) {
		this.cave = cave;
	}


	public Set<Bear> getCubs() {
		return cubs;
	}


	public void setCubs(Set<Bear> cubs) {
		this.cubs = cubs;
	}


	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bearId;
		result = prime * result + ((breed == null) ? 0 : breed.hashCode());
		result = prime * result + ((cave == null) ? 0 : cave.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((cubs == null) ? 0 : cubs.hashCode());
		result = prime * result + numberOfLegs;
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
		Bear other = (Bear) obj;
		if (bearId != other.bearId)
			return false;
		if (breed == null) {
			if (other.breed != null)
				return false;
		} else if (!breed.equals(other.breed))
			return false;
		if (cave == null) {
			if (other.cave != null)
				return false;
		} else if (!cave.equals(other.cave))
			return false;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (cubs == null) {
			if (other.cubs != null)
				return false;
		} else if (!cubs.equals(other.cubs))
			return false;
		if (numberOfLegs != other.numberOfLegs)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Bear [bearId=" + bearId + ", color=" + color + ", breed=" + breed + ", numberOfLegs=" + numberOfLegs
				+ ", cave=" + cave + ", cubs=" + cubs + "]";
	}

	
	
}
