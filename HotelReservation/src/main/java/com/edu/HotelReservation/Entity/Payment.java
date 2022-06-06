package com.edu.HotelReservation.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Payment 
{
	@Id
	private long userId;
	private String firstName;
	private String lastName;
	private long roomNo;
	private String roomType;
	private String cardType;
	private long cardNo;
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	private long securityCode;
	private long pan;
	private long postalCode;
	
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(long roomNo) {
		this.roomNo = roomNo;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
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
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public long getCardNo() {
		return cardNo;
	}
	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public long getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(long securityCode) {
		this.securityCode = securityCode;
	}
	public long getPan() {
		return pan;
	}
	public void setPan(long pan) {
		this.pan = pan;
	}
	public long getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(long postalCode) {
		this.postalCode = postalCode;
	}
	
	
	@Override
	public String toString() {
		return "Payment [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", roomNo="
				+ roomNo + ", roomType=" + roomType + ", cardType=" + cardType + ", cardNo=" + cardNo + ", expiryDate="
				+ expiryDate + ", securityCode=" + securityCode + ", pan=" + pan + ", postalCode=" + postalCode + "]";
	}
	
	
	public Payment(long userId, String firstName, String lastName, long roomNo, String roomType, String cardType,
			long cardNo, Date expiryDate, long securityCode, long pan, long postalCode) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.cardType = cardType;
		this.cardNo = cardNo;
		this.expiryDate = expiryDate;
		this.securityCode = securityCode;
		this.pan = pan;
		this.postalCode = postalCode;
	}
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
