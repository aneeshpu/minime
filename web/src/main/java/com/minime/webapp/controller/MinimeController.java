package com.minime.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minime.Minime;
import com.minime.domain.Email;
import com.minime.domain.Name;
import com.minime.domain.Person;
import com.minime.domain.ProfileService;

@Controller
@RequestMapping("/profile")
public class MinimeController {

	public ProfileService profileService;

	@Autowired
	public MinimeController(ProfileService profileService) {
		this.profileService = profileService;
	}

	@RequestMapping(value = "/{profileId}", method = RequestMethod.GET)
	@ResponseBody
	public Person get(@PathVariable String profileId) {
		System.out.println("Inside get");
		return profileService.get(profileId);
	}


}