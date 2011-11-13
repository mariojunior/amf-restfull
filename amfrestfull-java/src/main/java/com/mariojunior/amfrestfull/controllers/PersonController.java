package com.mariojunior.amfrestfull.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mariojunior.amfrestfull.model.Person;
import com.mariojunior.amfrestfull.services.PersonService;

//import org.springframework.oxm.Marshaller


@Controller
@RequestMapping("/person")
public class PersonController
{
	/*
	 * Some people prefers inject the DAO class on controller,
	 * another prefers inject 'business services' ... 
	 * feel free to do what do you wanna. :)
	 */
	
	@Autowired
	private PersonService _service;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Person> list()
	{
		return _service.listPersons();
	}
	
	@RequestMapping(value = "/person/save", method = RequestMethod.POST)
	public void savePerson(@RequestBody Person p)
	{
		_service.savePerson(p);
	}

}
