package com.springb5r6.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springb5r6.model.PersonDTO;

@RestController
public class PersonRestController {

	
	@RequestMapping(value = "/persistPerson", method = RequestMethod.POST)
	 public ResponseEntity < String > persistPerson(@RequestBody PersonDTO person) {
		if (person.getFirstName() instanceof String && person.getFirstName().length()>0
			&& person.getSecondName() instanceof String && person.getSecondName().length()>0
			&& person.getDateOfBirth() instanceof String && person.getDateOfBirth().length()>0
			&& person.getProfession() instanceof String && person.getProfession().length()>0
			&& person.getSalary()>0) {
			
            
			System.out.println(person);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	}
}
