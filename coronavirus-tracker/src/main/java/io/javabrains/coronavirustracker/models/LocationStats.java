package io.javabrains.coronavirustracker.models;

public class LocationStats {

	private String state;
	private String country;
	private long confirmedCases;
	private long diffromprevday;
	
	public long getDiffromprevday() {
		return diffromprevday;
	}
	public void setDiffromprevday(long diffromprevday) {
		this.diffromprevday = diffromprevday;
	}
	public long getConfirmedCases() {
		return confirmedCases;
	}
	public void setConfirmedCases(long confirmedCases) {
		this.confirmedCases = confirmedCases;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
