package com.maven.test1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GoldController {
	
	@Autowired
	UserService userservice;
	
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<List<User>> getAllUsers() {
		System.out.println("all users");
		List<User> users = userservice.findAllUsers();
		
		ResponseEntity<List<User>> user = new ResponseEntity<List<User>>(users, HttpStatus.OK);
		return user;
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveUser(@RequestBody User user) {
		userservice.saveUser(user);
	}
	
	 @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	 public ResponseEntity<User> findById(@PathVariable("id") long id) {
	  User user = userservice.findByID(id);
	  if (user == null) {
	   return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	  }
	  return new ResponseEntity<User>(user, HttpStatus.OK);
	 }
	  

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteUser(@PathVariable("id") long id) {
		User user = userservice.findByID(id);
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
		}
		userservice.deleteUserbyId(id);
	return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

	
	
	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<User> deleteAllUsers() {
		System.out.println("Deleting All Users");
		userservice.deleteAllUsers();
		return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	}

}
