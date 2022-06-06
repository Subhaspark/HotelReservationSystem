package com.edu.HotelReservation.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation 
{
	@Id
	private long roomNo;
	private String roomType;
	@Temporal(TemporalType.DATE)
	private Date checkInDate;
	private Date checkOutDate;
	private String payment;
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
	
	
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "Reservation [roomNo=" + roomNo + ", roomType=" + roomType + ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", payment=" + payment + "]";
	}
	
	
	public Reservation(long roomNo, String roomType, Date checkInDate, Date checkOutDate, String payment) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.payment = payment;
	}
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
