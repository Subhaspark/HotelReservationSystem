package com.edu.HotelReservation.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.HotelReservation.Entity.User;
import com.edu.HotelReservation.Service.UserService;

@RestController
@RequestMapping("/api/hotel")
public class UserController 
{
	UserService userService;
	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return new ResponseEntity<User>(userService.saveUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping(path = "/{userId}")
	public User getUserByid(@PathVariable("userId") long userId) {
		return  userService.getuserByid(userId);
	}
	@PutMapping(path="/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable("userId") long userId, @RequestBody User user){
		return new ResponseEntity<User>(userService.updateUser(userId, user),HttpStatus.OK);
	}
}
