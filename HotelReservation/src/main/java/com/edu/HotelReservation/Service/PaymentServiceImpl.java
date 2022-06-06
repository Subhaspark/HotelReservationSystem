package com.edu.HotelReservation.Service;

import org.springframework.stereotype.Service;

import com.edu.HotelReservation.Entity.Payment;
import com.edu.HotelReservation.Entity.Reservation;
import com.edu.HotelReservation.Repository.PaymentRepository;
import com.edu.HotelReservation.Repository.ReservationRepository;

@Service
public class PaymentServiceImpl implements PaymentService 
{
	PaymentRepository paymentrepository;
	

	public PaymentServiceImpl(PaymentRepository paymentrepository) {
		super();
		this.paymentrepository = paymentrepository;
	}
	
	@Override
	public Payment savePayment(Payment payment) {
		return paymentrepository.save(payment);
	}

}
