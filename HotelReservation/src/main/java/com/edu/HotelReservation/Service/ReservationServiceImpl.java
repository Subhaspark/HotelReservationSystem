package com.edu.HotelReservation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.HotelReservation.Entity.Reservation;
import com.edu.HotelReservation.Entity.Room;
import com.edu.HotelReservation.Exception.ResourceNotFoundException;
import com.edu.HotelReservation.Repository.ReservationRepository;
import com.edu.HotelReservation.Repository.RoomRepository;

@Service
public class ReservationServiceImpl implements ReservationService 
{
	ReservationRepository reservationrepository;
	

	public ReservationServiceImpl(ReservationRepository reservationrepository) {
		super();
		this.reservationrepository = reservationrepository;
	}
	
	@Override
	public Reservation saveReservation(Reservation reservation) {
		return reservationrepository.save(reservation);
	}
	@Override
	public List<Reservation> listAll(){
		return reservationrepository.findAll();
				
	}
	
    @Override
	public Reservation getreservationByid(long roomno) {
		 Optional<Reservation> reservation= reservationrepository.findById(roomno);
		 if(reservation.isPresent()) {
			 return reservation.get();
		 }
		 return null;
	}
	
	@Override
	public Reservation updateReservation(long roomno, Reservation reservation) {
		// TODO Auto-generated method stub
		Reservation reserve = new Reservation();
		try {
			reserve = reservationrepository.findById(roomno).orElseThrow(
					 ()-> 		 new ResourceNotFoundException("Reservation","Id",reservation));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 long rno = reservation.getRoomNo();
		 reserve.setRoomNo(rno);
		 reserve.setRoomType(reservation.getRoomType());
		 reserve.setCheckInDate(reservation.getCheckInDate());
		 reserve.setCheckOutDate(reservation.getCheckOutDate());
		 reserve.setPayment(reservation.getPayment());
		 
		 reservationrepository.save(reserve);
		
		return reserve;
	}

	@Override
	public void deleteReservation(long roomno) {
		reservationrepository.findById(roomno).orElseThrow(
				()->new ResourceNotFoundException("Room","Id",roomno));
		
		reservationrepository.deleteById(roomno);
		// TODO Auto-generated method stub
		
	}

}
