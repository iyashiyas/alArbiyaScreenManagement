package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="BRANCH")
public class Branch {

	@Id @GeneratedValue 
	@Column(name="BRANCH_ID")
	private long id;
	
	@Column(name="BRANCH_NAME") 
	private String branchName;
	
	@Column(name="BRANCH_PHONENUMBER") 
	private String branchPhoneNumber;
	
	@Column(name="BRANCH_EMAIL") 
	private String branchEmail;
	
	@Column(name="BRANCH_ADDRESS") 
	private String branchAddress;
	
	@Column(name="BRANCH_DESCRIPTION") 
	private String branchDescription;
	
	@Column(name="BRANCH_STATUS") 
	private String branchStatus;
	
	@Column(name="BRANCH_CODE", unique=true) 
	private String branchCode;

	@OneToMany(mappedBy="branch", cascade=CascadeType.MERGE, fetch=FetchType.EAGER) 
	@JsonManagedReference
	private List<Building> buildings;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	 

	public String getBranchPhoneNumber() {
		return branchPhoneNumber;
	}

	public void setBranchPhoneNumber(String branchPhoneNumber) {
		this.branchPhoneNumber = branchPhoneNumber;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchDescription() {
		return branchDescription;
	}

	public void setBranchDescription(String branchDescription) {
		this.branchDescription = branchDescription;
	}

	public String getBranchStatus() {
		return branchStatus;
	}

	public void setBranchStatus(String branchStatus) {
		this.branchStatus = branchStatus;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}	 
	
	public List<Building> getBuildings() {
		return buildings;
	}

	public void addBuildings(Building building) {
        this.buildings.add(building);
        if (building.getBranch() != this) {
        	building.setBranch(this);
        }
    }
	
	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	} 
	
	
	
	
	
	
	
}
