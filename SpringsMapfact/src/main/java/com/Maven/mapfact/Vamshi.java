package com.Maven.mapfact;

import java.util.Map;

public class Vamshi {

	private Map directions;

	public Map getMaps() {
		return directions;
	}

	public void setMaps(Map maps) {
		this.directions = maps;
	}

	@Override
	public String toString() {
		return "Vamshi [Location=" + directions + "]";
	}

	
}