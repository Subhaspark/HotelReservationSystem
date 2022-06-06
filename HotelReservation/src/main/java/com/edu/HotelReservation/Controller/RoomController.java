package com.edu.HotelReservation.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HotelReservation.Entity.Room;
import com.edu.HotelReservation.Entity.User;
import com.edu.HotelReservation.Service.RoomService;
import com.edu.HotelReservation.Service.UserService;

@RestController
@RequestMapping("/api/room")
public class RoomController 
{
	RoomService roomService;
	public RoomController(RoomService roomService) {
		super();
		this.roomService = roomService;
	}
	@PostMapping
	public ResponseEntity<Room> saveRoom(@RequestBody Room room){
		return new ResponseEntity<Room>(roomService.saveRoom(room),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Room> listAll(){
	 return roomService.listAll();
	}
	@GetMapping(path = "/{roomno}")
	public Room getRoomByid(@PathVariable("roomno") long roomno) {
		return  roomService.getroomByid(roomno);
	}
	@PutMapping(path="/{roomno}")
	public ResponseEntity<Room> updateRoom(@PathVariable("roomno") long roomno, @RequestBody Room room){
		return new ResponseEntity<Room>(roomService.updateRoom(roomno, room),HttpStatus.OK);
	}
	@DeleteMapping("{roomno}")
	public String  deleteRoom(@PathVariable("roomno")long roomno){
		roomService.deleteRoom(roomno);
		return ("Employee Record Deleted");
	}
}

