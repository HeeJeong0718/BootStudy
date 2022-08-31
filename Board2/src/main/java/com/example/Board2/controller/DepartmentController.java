package com.example.Board2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Board2.entity.Department;
import com.example.Board2.service.DepartmentService;

@RestController
public class DepartmentController {
   
	
	@Autowired
	private DepartmentService departmentService;
	
	//1.save
   @PostMapping("/departments")	
   public Department saveDepartment(
	        @Validated @RequestBody Department department)
	    {
	        return departmentService.saveDep(department);
	    }

    //2.read
   
     @GetMapping("/departments")
     public List<Department> DepList(){
    	 return departmentService.DepList();
     }
     
     //3.update
     @PutMapping("/department/{id}")
    public Department updatgeDep(@RequestBody Department department , @PathVariable("id") Long departmentId) {
    	return departmentService.updatgeDep(department, departmentId); 
     }
     
     //4.Delete
     @DeleteMapping("/departments/{id}")
     public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
    	 departmentService.deleteDepartmentById(departmentId);
    	 return "delete Succeess";
     }
     
     
     
     
   
   
}
