package org.alArbiyaScreenManagement.model;

 
import javax.persistence.Column;
import javax.persistence.Entity;
 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HOTEL_INFO")
public class HotelInfo {

	@Id @GeneratedValue 
	@Column(name="HOTEL_INFO_ID")
	private long id;
	
	@Column(name="HOTEL_NAME")
	private String hotelName;
	
	@Column(name="HOTEL_ADDRESS1")
	private String hotelAddress1;
	
	@Column(name="HOTEL_ADDRESS2")
	private String hotelAddress2;
	
	@Column(name="HOTEL_HEAD_OFFICE_BRANCH")
	private String hotelHeadOffice;
	
	@Column(name="HOTEL_PHONE")
	private String hotelPhone;
	
	@Column(name="HOTEL_FAX")
	private String hotelFax;
	
	@Column(name="HOTEL_EMAIL")
	private String hotelEmail;
	
	@Column(name="HOTEL_CITY")
	private String hotelCity;
	
	@Column(name="HOTEL_STATE")
	private String hotelState;
	
	@Column(name="HOTEL_NATION")
	private String hotelNation;
	
	@Column(name="HOTEL_TOTAL_BRANCH")
	private int hotelTotalBranch;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelAddress1() {
		return hotelAddress1;
	}

	public void setHotelAddress1(String hotelAddress1) {
		this.hotelAddress1 = hotelAddress1;
	}

	public String getHotelAddress2() {
		return hotelAddress2;
	}

	public void setHotelAddress2(String hotelAddress2) {
		this.hotelAddress2 = hotelAddress2;
	}

	public String getHotelHeadOffice() {
		return hotelHeadOffice;
	}

	public void setHotelHeadOffice(String hotelHeadOffice) {
		this.hotelHeadOffice = hotelHeadOffice;
	}

	public String getHotelPhone() {
		return hotelPhone;
	}

	public void setHotelPhone(String hotelPhone) {
		this.hotelPhone = hotelPhone;
	}

	public String getHotelFax() {
		return hotelFax;
	}

	public void setHotelFax(String hotelFax) {
		this.hotelFax = hotelFax;
	}

	public String getHotelEmail() {
		return hotelEmail;
	}

	public void setHotelEmail(String hotelEmail) {
		this.hotelEmail = hotelEmail;
	}

	public String getHotelCity() {
		return hotelCity;
	}

	public void setHotelCity(String hotelCity) {
		this.hotelCity = hotelCity;
	}

	public String getHotelState() {
		return hotelState;
	}

	public void setHotelState(String hotelState) {
		this.hotelState = hotelState;
	}

	public String getHotelNation() {
		return hotelNation;
	}

	public void setHotelNation(String hotelNation) {
		this.hotelNation = hotelNation;
	}

	public int getHotelTotalBranch() {
		return hotelTotalBranch;
	}

	public void setHotelTotalBranch(int hotelTotalBranch) {
		this.hotelTotalBranch = hotelTotalBranch;
	}
	
}
