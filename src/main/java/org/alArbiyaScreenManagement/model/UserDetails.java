package org.alArbiyaScreenManagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="USER_DETAILS")
public class UserDetails {
	
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private long id;
	
	@Column(name="MEMBER_ID")
	private String memberId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="PHONE")
	private String phoneNumber;
	
	@Transient
	private String phoneCode;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="ADDRESSLINEONE")
	private String addressLineOne;
	
	@Column(name="COMPANTNAME")
	private String companyName;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="IDENTITYTYPE")
	private String identityType;
	
	@Column(name="IDENTITYNUMBER")
	private String identityNumber;
	
	@Column(name="SCANID")
	private long scannedId;
	
	@Column(name="HOTELMEMBER")
	private String hotelMember;
	
	@OneToMany(mappedBy="userDetails", cascade={javax.persistence.CascadeType.MERGE})
	private List<Booking> bookings;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public void setPhoneCode(String phoneCode) {
		this.phoneCode = phoneCode;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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

	public String getIdentityType() {
		return identityType;
	}

	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public long getScannedId() {
		return scannedId;
	}

	public void setScannedId(long scannedId) {
		this.scannedId = scannedId;
	}

	public String getHotelMember() {
		return hotelMember;
	}

	public void setHotelMember(String hotelMember) {
		this.hotelMember = hotelMember;
	}

	public List<Booking> getBooking() {
		return bookings;
	}
	
	public void addBooking(Booking booking) {
		this.bookings.add(booking);
		if(booking.getUserDetails() != this) {
			booking.setUserDetails(this);
		}
	}

	public void setBooking(List<Booking> bookings) {
		this.bookings = bookings;
	}

}
