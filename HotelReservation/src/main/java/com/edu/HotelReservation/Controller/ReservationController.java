package com.edu.HotelReservation.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HotelReservation.Entity.Reservation;
import com.edu.HotelReservation.Service.ReservationService;

@RestController
@RequestMapping("/api/reservation")
public class ReservationController 
{
	ReservationService reservationService;
	public ReservationController(ReservationService reservationService) {
		super();
		this.reservationService = reservationService;
	}
	@PostMapping
	public ResponseEntity<Reservation> saveReservation(@RequestBody Reservation reservation){
		return new ResponseEntity<Reservation>(reservationService.saveReservation(reservation),HttpStatus.CREATED);
	}
	@GetMapping
	public List<Reservation> listAll(){
	 return reservationService.listAll();
	}
	@GetMapping(path = "/{roomno}")
	public Reservation getReservationByid(@PathVariable("roomno") long roomno) {
		return  reservationService.getreservationByid(roomno);
	}
	@PutMapping(path="/{roomno}")
	public ResponseEntity<Reservation> updateReservation(@PathVariable("roomno") long roomno, @RequestBody Reservation reservation){
		return new ResponseEntity<Reservation>(reservationService.updateReservation(roomno, reservation),HttpStatus.OK);
	}
}
