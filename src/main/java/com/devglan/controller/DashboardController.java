package com.devglan.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.devglan.model.User;

@Controller
public class DashboardController {
	
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public ModelAndView welcome() {
    	ModelAndView model = new ModelAndView();
    	model.setViewName("welcome");
    	return model;
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard() {
    	ModelAndView model = new ModelAndView();
    	model.addObject("users", getUsers());
    	model.setViewName("dashboard");
    	return model;
    }

	private List<User> getUsers() {
		User user = new User();
		user.setEmail("johndoe123@gmail.com");
		user.setName("John Doe");
		user.setAddress("Bangalore, Karnataka");
		User user1 = new User();
		user1.setEmail("amitsingh@yahoo.com");
		user1.setName("Amit Singh");
		user1.setAddress("Chennai, Tamilnadu");
		User user2 = new User();
		user2.setEmail("bipulkumar@gmail.com");
		user2.setName("Bipul Kumar");
		user2.setAddress("Bangalore, Karnataka");
		User user3 = new User();
		user3.setEmail("prakashranjan@gmail.com");
		user3.setName("Prakash Ranjan");
		user3.setAddress("Chennai, Tamilnadu");
		
		User user4 = new User();
		user4.setEmail("vedMohapatra123@gmail.com");
		user4.setName("ved");
		user4.setAddress("Bhubanswar, Orrisa");
		User user5 = new User();
		user5.setEmail("Jsonr@yahoo.com");
		user5.setName("Json Roy");
		user5.setAddress("London, UK");
		User user6 = new User();
		user6.setEmail("Sital Patro@gmail.com");
		user6.setName("Sital");
		user6.setAddress("Pune, Maharastra");
		User user7 = new User();
		user7.setEmail("SatishY@gmail.com");
		user7.setName("Sathish yella");
		user7.setAddress("Chennai, Tamilnadu");
		
		
		User user8 = new User();
		user8.setEmail("ManojBatina@gmail.com");
		user8.setName("Manoj");
		user8.setAddress("Bhubanswar, Orrisa");
		User user9 = new User();
		user9.setEmail("Laxmi@yahoo.com");
		user9.setName("Laxmi Roy");
		user9.setAddress("Chennai, Tamilnadu");
		User user10 = new User();
		user10.setEmail("SunilRiz@gmail.com");
		user10.setName("Sunil");
		user10.setAddress("Pune, Maharastra");
		User user11 = new User();
		user11.setEmail("RaviY@gmail.com");
		user11.setName("Ravi yella");
		user11.setAddress("Chennai, Tamilnadu");
		
		return Arrays.asList(user, user1, user2, user3,user4, user5, user6,user7, user8, user9,user10, user11);
	}

}
