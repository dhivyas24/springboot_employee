package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/getbyid")
public class Findbyid {
	@Autowired EmployeeRepo ob;
	@GetMapping()
	    public List<Employee> getbyid(@RequestBody String id)
	    {

	        return ob.findbyid(id);

	        
	    }
}