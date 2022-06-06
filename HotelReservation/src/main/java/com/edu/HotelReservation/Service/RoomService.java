package com.edu.HotelReservation.Service;

import java.util.List;

import com.edu.HotelReservation.Entity.Room;
import com.edu.HotelReservation.Entity.User;

public interface RoomService {

	Room saveRoom(Room room);

   	public List<Room> listAll();

	Room getroomByid(long roomno);

	public Room updateRoom(long roomno, Room room);

	public void deleteRoom(long roomno);


}
