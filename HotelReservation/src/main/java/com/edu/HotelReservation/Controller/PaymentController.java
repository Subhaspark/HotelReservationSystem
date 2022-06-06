package com.edu.HotelReservation.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HotelReservation.Entity.Payment;
import com.edu.HotelReservation.Service.PaymentService;



@RestController
@RequestMapping("/api/payment")
public class PaymentController 
{
	PaymentService paymentService;
	public PaymentController(PaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}
	@PostMapping
	public ResponseEntity<Payment> savePayment(@RequestBody Payment payment){
		return new ResponseEntity<Payment>(paymentService.savePayment(payment),HttpStatus.CREATED);
	}
}
