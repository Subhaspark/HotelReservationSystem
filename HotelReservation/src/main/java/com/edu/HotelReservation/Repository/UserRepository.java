package com.edu.HotelReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HotelReservation.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
