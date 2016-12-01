package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;

@Entity
@Table(name="BUILDING")
public class Building {

	
	@Id @GeneratedValue 
	@Column(name="BUILDING_ID")
	private long id;
	
	@Column(name="BUILDING_NAME") 
	private String buildingName;
	
	@Column(name="BUILDING_CODE", unique=true) 
	private String buildingCode;
	
	@Column(name="BUILDING_PHONENUMBER") 
	private String buildingPhoneNumber;
	
	@Column(name="BUILDING_EMAIL") 
	private String buildingEmail;
	
	@Column(name="BUILDING_TOTALFLOOR") 
	private long buildingTotalFloor;
	
	@Column(name="BUILDING_DESCRIPTION") 
	private String buildingDescription;
	
	@Column(name="BUILDING_STATUS") 
	private String buildingStatus;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="BRANCH_ID")
	private Branch branch;
	
	@OneToMany(mappedBy="building",cascade={CascadeType.MERGE}, fetch=FetchType.EAGER) 
	private List<Floor> floors;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getBuildingCode() {
		return buildingCode;
	}

	public void setBuildingCode(String buildingCode) {
		this.buildingCode = buildingCode;
	}

	public String getBuildingPhoneNumber() {
		return buildingPhoneNumber;
	}

	public void setBuildingPhoneNumber(String buildingPhoneNumber) {
		this.buildingPhoneNumber = buildingPhoneNumber;
	}

	public String getBuildingEmail() {
		return buildingEmail;
	}

	public void setBuildingEmail(String buildingEmail) {
		this.buildingEmail = buildingEmail;
	}

	public long getBuildingTotalFloor() {
		return buildingTotalFloor;
	}

	public void setBuildingTotalFloor(long buildingTotalFloor) {
		this.buildingTotalFloor = buildingTotalFloor;
	}

	public String getBuildingDescription() {
		return buildingDescription;
	}

	public void setBuildingDescription(String buildingDescription) {
		this.buildingDescription = buildingDescription;
	}

	public String getBuildingStatus() {
		return buildingStatus;
	}

	public void setBuildingStatus(String buildingStatus) {
		this.buildingStatus = buildingStatus;
	}
	
	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
        if (branch.getBuildings()!=null && !branch.getBuildings().contains(this)) {
        	branch.getBuildings().add(this);
        }
	}
	 
	
	public List<Floor> getFloors() {
		return floors;
	}

	public void addFloors(Floor floor) {
        this.floors.add(floor);
        if (floor.getBuilding() != this) {
        	floor.setBuilding(this);
        }
    }
	
	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	} 
	
	
	
	
}

