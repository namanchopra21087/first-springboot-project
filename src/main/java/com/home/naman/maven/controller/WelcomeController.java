/**
 *
 */
package com.home.naman.maven.controller;

import com.home.naman.maven.model.Person;
import com.home.naman.maven.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * @author naman
 *
 */
@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @GetMapping(value = "/welcome")
    public Map<String, Person> welcome() {
        return service.welcomeMessage();
    }

    @GetMapping("/getNext")
    public Map<String, Person> getNext() {
        return service.getNext();
    }

    @GetMapping("/dynamic")
    public Map<String, Person> getDynamic(@PathParam("var") String var) {
        if ("1".equals(var))
            return service.getNext();
        else
            return service.welcomeMessage();
    }

}
