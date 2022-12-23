package com.example.SpringBootApp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


	@Entity
	public class Employee {

	    @Id

	    @GeneratedValue(strategy = GenerationType.AUTO)
	   private int id;
		private String empid,empname,empemail,dept;
		Employee() {}

		Employee(String empid,String empname,String empemail,String dept)

		    {
			this.setEmpid(empid);
			this.setEmpname(empname);
			this.setEmpemail(empemail);
		  this.setDept(dept);
		
	}

		public String getDept() {
			return dept;
		}

		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getEmpid() {
			return empid;
		}

		public void setEmpid(String empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empname;
		}

		public void setEmpname(String empname) {
			this.empname = empname;
		}

		public String getEmpemail() {
			return empemail;
		}

		public void setEmpemail(String empemail) {
			this.empemail = empemail;
		}

		
		
	}
