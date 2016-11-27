package org.alArbiyaScreenManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "COUNTRY")
public class Country {
	
	@Id @GeneratedValue	
	@Column(name="COUNTRY_ID")
	private long id;
	
	@Column(name="COUNTRY_CODE")
	private String countryCode;
	
	@Column(name="COUNTRY_IMAGE_URL")
	private String countryImageUrl;
	
	@Column(name="COUNTRY_NAME")	
	private String countryName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryImageUrl() {
		return countryImageUrl;
	}

	public void setCountryImageUrl(String countryImageUrl) {
		this.countryImageUrl = countryImageUrl;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName
				+ ", countryImageUrl=" + countryImageUrl + "]";
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

}
