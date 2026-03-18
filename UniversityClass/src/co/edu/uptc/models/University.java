package co.edu.uptc.models;

import java.time.LocalDate;

public class University {

	private String name;
	private String nitId;
	private String address;
	private String website;
	private LocalDate foundationDate;
	private boolean publicService;
	public University() {
		super();
	}
	public University(String name, String nitId, String address, String website, LocalDate foundationDate,
			boolean publicService) {
		super();
		this.name = name;
		this.nitId = nitId;
		this.address = address;
		this.website = website;
		this.foundationDate = foundationDate;
		this.publicService = publicService;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNitId() {
		return nitId;
	}
	public void setNitId(String nitId) {
		this.nitId = nitId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public LocalDate getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(LocalDate foundationDate) {
		this.foundationDate = foundationDate;
	}
	public boolean isPublicService() {
		return publicService;
	}
	public void setPublicService(boolean publicService) {
		this.publicService = publicService;
	}
	
	
}
