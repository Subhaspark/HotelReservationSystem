package com.edu.HotelReservation.Service;

import java.util.List;

import com.edu.HotelReservation.Entity.User;

public interface UserService {

	User saveUser(User user);

	User getuserByid(long userId);

	public User updateUser(long userId, User user);
	

}
