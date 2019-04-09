package com.revature.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class House {
	
	private String name;
	
	//@Autowired
	private DoorInterface door;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DoorInterface getDoor() {
		return door;
	}

	@Autowired
	public void setDoor(DoorInterface door) {
		this.door = door;
	}

	public House(String name, Door door) {
		super();
		this.name = name;
		this.door = door;
	}
	
	@Autowired
	public House(Door door) {
		super ();
		this.door = door;
	}

	
	  public House() { super(); // TODO Auto-generated constructor stub 
	  
	  }
	 

	@Override
	public String toString() {
		return "House [name=" + name + ", door=" + door + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((door == null) ? 0 : door.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		House other = (House) obj;
		if (door == null) {
			if (other.door != null)
				return false;
		} else if (!door.equals(other.door))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
