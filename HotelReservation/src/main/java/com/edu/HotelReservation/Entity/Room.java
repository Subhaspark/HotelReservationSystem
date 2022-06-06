package com.edu.HotelReservation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Room 
{
	@Id
	private long roomNo;
	private String roomType;
	private long roomPrice;
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
	public long getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(long roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	
	@Override
	public String toString() {
		return "Room [roomNo=" + roomNo + ", roomType=" + roomType + ", roomPrice=" + roomPrice + "]";
	}
	
	
	public Room(long roomNo, String roomType, long roomPrice) {
		super();
		this.roomNo = roomNo;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
