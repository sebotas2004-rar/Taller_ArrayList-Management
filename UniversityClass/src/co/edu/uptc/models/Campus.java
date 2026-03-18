package co.edu.uptc.models;

public class Campus {

	private String campusName;
	private String idCampus;
	private int capacity;
	private double totalArea;
	private String cityName;
	public Campus() {
		super();
	}
	public Campus(String campusName, String idCampus, int capacity, double totalArea, String cityName) {
		super();
		this.campusName = campusName;
		this.idCampus = idCampus;
		this.capacity = capacity;
		this.totalArea = totalArea;
		this.cityName = cityName;
	}
	public String getCampusName() {
		return campusName;
	}
	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}
	public String getIdCampus() {
		return idCampus;
	}
	public void setIdCampus(String idCampus) {
		this.idCampus = idCampus;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double getTotalArea() {
		return totalArea;
	}
	public void setTotalArea(double totalArea) {
		this.totalArea = totalArea;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	
}
