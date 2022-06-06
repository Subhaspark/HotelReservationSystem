package com.edu.HotelReservation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.HotelReservation.Entity.Room;
import com.edu.HotelReservation.Entity.User;
import com.edu.HotelReservation.Exception.ResourceNotFoundException;
import com.edu.HotelReservation.Repository.RoomRepository;

@Service
public class RoomServiceImpl implements RoomService 
{
	RoomRepository roomrepository;
	

	public RoomServiceImpl(RoomRepository roomrepository) {
		super();
		this.roomrepository = roomrepository;
	}
	
	@Override
	public Room saveRoom(Room room) {
		return roomrepository.save(room);
	}
	@Override
	public List<Room> listAll(){
		return roomrepository.findAll();
				
	}
	
    @Override
	public Room getroomByid(long roomno) {
		 Optional<Room> room= roomrepository.findById(roomno);
		 if(room.isPresent()) {
			 return room.get();
		 }
		 return null;
	}
	
	@Override
	public Room updateRoom(long roomno, Room room) {
		// TODO Auto-generated method stub
		Room r = new Room();
		try {
			r = roomrepository.findById(roomno).orElseThrow(
					 ()-> 		 new ResourceNotFoundException("Room","Id",room));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 long rno = room.getRoomNo();
		 r.setRoomNo(rno);
		 r.setRoomType(room.getRoomType());
		 r.setRoomPrice(room.getRoomPrice());
		 
		 roomrepository.save(r);
		
		return r;
	}

	@Override
	public void deleteRoom(long roomno) {
		roomrepository.findById(roomno).orElseThrow(
				()->new ResourceNotFoundException("Room","Id",roomno));
		
		roomrepository.deleteById(roomno);
		// TODO Auto-generated method stub
		
	}
	
}
