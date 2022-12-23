package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/saveemployee")
public class save {

@Autowired EmployeeRepo ob;

@PostMapping()
	public <S> String saveemp(@RequestBody Employee log)
	{
	Employee a= new Employee();
	String empid = log.getEmpid();
	String empname=log.getEmpname();
	
	String empemail=log.getEmpemail();
	String dept=log.getDept();
	a.setEmpid(empid);
	a.setEmpname(empname);
	a.setEmpemail(empemail);
	a.setDept(dept);
	
 Employee first = new Employee(empid,empname,empemail,dept);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  