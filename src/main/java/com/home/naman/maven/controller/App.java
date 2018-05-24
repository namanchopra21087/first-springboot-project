package com.home.naman.maven.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ctx=SpringApplication.run(App.class, args);    
    }
}
