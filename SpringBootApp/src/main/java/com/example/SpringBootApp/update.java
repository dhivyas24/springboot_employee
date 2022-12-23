package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/employee/{id}")
	public class update {	
		@Autowired EmployeeRepo ob;
		@PutMapping()
		    public String updatecar(@RequestBody Employee log,@PathVariable("id") String id)
		    {
			
			

			String empid=log.getEmpid();
			String empname=log.getEmpname();
			String empemail=log.getEmpemail();
			String dept=log.getDept();
			ob.update(empid,empname,empemail,dept,id);
			 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		