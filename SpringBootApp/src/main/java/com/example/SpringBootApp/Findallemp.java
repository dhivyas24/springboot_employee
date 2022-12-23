package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/findallemp")

public class Findallemp {
	@Autowired EmployeeRepo ob;
	@GetMapping()
	    public List<Employee> getAllemp()
	    {

	        return ob.findAll();

	        
	    }
}