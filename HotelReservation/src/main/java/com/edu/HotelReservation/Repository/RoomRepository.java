package com.edu.HotelReservation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.HotelReservation.Entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {


}
