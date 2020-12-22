package fr.ensim.tp5.model.geo;

import java.util.ArrayList;

public class Feature {
	 private String type;
	 private String version;
	 ArrayList<Features> features = new ArrayList<Features>();
	 private String attribution;
	 private String licence;
	 private String query;
	 private float limit;


	 // Getter Methods 
	 
	 

	 public String getType() {
	  return type;
	 }

	 public ArrayList<Features> getFeatures() {
		return features;
	}
	 
	public Features getFeatures(int i) {
		return features.get(i);
	}

	public void setFeatures(ArrayList<Features> features) {
		this.features = features;
	}

	public String getVersion() {
	  return version;
	 }

	 public String getAttribution() {
	  return attribution;
	 }

	 public String getLicence() {
	  return licence;
	 }

	 public String getQuery() {
	  return query;
	 }

	 public float getLimit() {
	  return limit;
	 }

	 // Setter Methods 

	 public void setType(String type) {
	  this.type = type;
	 }

	 public void setVersion(String version) {
	  this.version = version;
	 }

	 public void setAttribution(String attribution) {
	  this.attribution = attribution;
	 }

	 public void setLicence(String licence) {
	  this.licence = licence;
	 }

	 public void setQuery(String query) {
	  this.query = query;
	 }

	 public void setLimit(float limit) {
	  this.limit = limit;
	 }
	}