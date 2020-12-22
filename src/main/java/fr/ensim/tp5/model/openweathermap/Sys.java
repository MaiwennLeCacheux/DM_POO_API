package fr.ensim.tp5.model.openweathermap;

public class Sys {
	 private String country;
	 private float sunrise;
	 private float sunset;


	 // Getter Methods 

	 public String getCountry() {
	  return country;
	 }

	 public float getSunrise() {
	  return sunrise;
	 }

	 public float getSunset() {
	  return sunset;
	 }

	 // Setter Methods 

	 public void setCountry(String country) {
	  this.country = country;
	 }

	 public void setSunrise(float sunrise) {
	  this.sunrise = sunrise;
	 }

	 public void setSunset(float sunset) {
	  this.sunset = sunset;
	 }
	}