package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

	
	    List<Employee> findAll();
	    
	    @Query(value = "SELECT * FROM employee u where u.empid= ?1", nativeQuery = true)
	    List<Employee> findbyid(String id);
	    

@Transactional
@Modifying
@Query(value = "Update employee u set u.empid = ?1 , u.empname =?2 , u.empmail = ?3  ,u.dept=?4  where u.empid = ?5 ", nativeQuery = true)
void update(String empid,String empname,String empemail,String dept,String id);

@Modifying
@Transactional 
@Query(value = "DELETE FROM empiloyee t WHERE t.empid= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(String id);

}