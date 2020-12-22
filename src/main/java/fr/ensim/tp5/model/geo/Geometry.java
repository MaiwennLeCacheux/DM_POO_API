package fr.ensim.tp5.model.geo;

import java.util.ArrayList;


public class Geometry {
	 private String type;
	 ArrayList<Double> coordinates = new ArrayList<Double>();


	 // Getter Methods 
	 
	 

	 public String getType() {
	  return type;
	 }

	 // Setter Methods 

	 public ArrayList<Double> getCoordinates() {
		return coordinates;
	}
	 
	 public double getCoordinates(int i) {
			return coordinates.get(i);
		}

	public void setCoordinates(ArrayList<Double> coordinates) {
		this.coordinates = coordinates;
	}

	public void setType(String type) {
	  this.type = type;
	 }
	}