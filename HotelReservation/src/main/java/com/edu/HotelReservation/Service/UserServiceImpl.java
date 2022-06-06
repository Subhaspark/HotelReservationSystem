package com.edu.HotelReservation.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.HotelReservation.Entity.User;
import com.edu.HotelReservation.Exception.ResourceNotFoundException;
import com.edu.HotelReservation.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService
{
UserRepository userrepository;
	

	public UserServiceImpl(UserRepository userrepository) {
		super();
		this.userrepository = userrepository;
	}
	
	@Override
	public User saveUser(User user) {
		return userrepository.save(user);
	}
	
	
    @Override
	public User getuserByid(long userId) {
		 Optional<User> user= userrepository.findById(userId);
		 if(user.isPresent()) {
			 return user.get();
		 }
		 return null;
	}
	
	@Override
	public User updateUser(long userId, User user) {
		// TODO Auto-generated method stub
		User u = new User();
		try {
			u = userrepository.findById(userId).orElseThrow(
					 ()-> 		 new ResourceNotFoundException("User","Id",userId));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 String fname = user.getFirstName();
		 u.setFirstName(fname);
		 String lname = user.getLastName();
		 u.setLastName(lname);
		 u.setContactNo(user.getContactNo());
		 u.setEmail(user.getEmail());
		 return userrepository.save(u);
		
		//return u;
	}
	
}
