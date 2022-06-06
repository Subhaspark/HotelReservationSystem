package com.edu.HotelReservation.Service;

import java.util.List;

import com.edu.HotelReservation.Entity.Reservation;

public interface ReservationService {

	Reservation saveReservation(Reservation reservation);

	public List<Reservation> listAll();

	public Reservation updateReservation(long roomno, Reservation reservation);

	Reservation getreservationByid(long roomno);

	public void deleteReservation(long roomno);

}
