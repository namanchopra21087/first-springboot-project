/**
 * 
 */
package com.home.naman.maven.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.home.naman.maven.model.Person;
import com.home.naman.maven.service.WelcomeService;

/**
 * @author naman
 *
 */
@RestController
public class WelcomeController {
	
	@Autowired
	private WelcomeService service;
	
	@RequestMapping(value="/welcome")
	public Map<String,Person> welcome(){
		return service.welcomeMessage();
	}
	
	@RequestMapping("/getNext")
	public Map<String,Person> getNext(){
		return service.getNext();
	}
	
	@RequestMapping("/dynamic")
	public Map<String,Person> getDynamic(@PathParam("var") String var){
		if("1".equals(var))
		    return service.getNext();
		else
			return service.welcomeMessage();
	}

}
