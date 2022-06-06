package com.edu.HotelReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HotelReservation.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
	

}
