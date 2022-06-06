package com.edu.HotelReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HotelReservation.Entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
