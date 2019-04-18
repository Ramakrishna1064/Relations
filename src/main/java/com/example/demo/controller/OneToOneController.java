package com.example.demo.controller;
import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.User;
import com.example.demo.model.StatusObject;
import com.example.demo.repository.UserProfileRepository;
import com.example.demo.repository.UserRepository;


@RestController
public class OneToOneController {
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

	
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/addUSer", method = RequestMethod.POST, consumes = "application/json",
			produces = "application/json")
	@ResponseBody
	public StatusObject addUSer(@RequestBody User user) {
		 //System.out.println("Request object is---->"+Conversions.ObjectToJson(user));
		 user.getUserProfile().setUser(user);
	     User user1 = userRepository.save(user);
	     if(user1!=null) {
	    	 System.out.println("your in if");
	    	 StatusObject statusObject = new StatusObject();
	    	 statusObject.setStatus(true);
	    	 statusObject.setMessage("User added successfully");
	    	 return statusObject;
	     }else {
	    	 System.out.println("your in else");
	    	 StatusObject statusObject = new StatusObject();
	    	 statusObject.setStatus(true);
	    	 statusObject.setMessage("Failed to add user");
	    	 return statusObject;
	     }
	}
	
	

	/**
	 * 
	 * @return
	 */
	@PostMapping(value = "/getUser")
	@ResponseBody
	public User getUSer(@RequestParam int userID) {
		 System.out.println("Request Id is---->"+userID);
		 User user = userRepository.findById(userID);
		 System.out.println(user.getUserProfile().getCity());
//        for (User user : userRepository.findAll()) {
//            System.out.println(user.getUserProfile().getAddress1());
//        }
        return user;
	}
}
