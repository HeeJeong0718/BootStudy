package com.example.Board2.service;

import java.util.List;

import com.example.Board2.entity.Department;

public interface DepartmentService {
   
	
	//1.save
	Department saveDep(Department department);
	//2.read
	List<Department> DepList();
	
	//3. update	
	Department updatgeDep(Department department ,  Long departmentId);
	
	//4.delete
	
	void deleteDepartmentById(Long departmentId);
}
