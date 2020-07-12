/**
 * 
 */
package com.home.naman.maven.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.home.naman.maven.model.Person;

/**
 * @author naman
 *
 */
@Service
public class WelcomeService {
	
	public Map<String,Person> welcomeMessage(){
		Map<String,Person> personMap=new HashMap<>();
		Person p=new Person();
		p.setName("Spring Boot Application");
		p.setCountry("Spring-Boot");
		p.setId(1);
		personMap.put("First", p);
		return personMap;
	}
	
	public Map<String,Person> getNext(){
		Map<String,Person> personMap=new HashMap<>();
		Person p=new Person();
		p.setName("Get Next Main");
		p.setCountry("Next Main");
		p.setId(2);
		personMap.put("Second", p);
		return personMap;
	}

}
