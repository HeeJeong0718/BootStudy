package com.example.Board2.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Board2.entity.Department;
import com.example.Board2.repository.DepartmentRepository;
import com.example.Board2.repository.GuestRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
 
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	
	//1.save 
	@Override
	public Department saveDep(Department department) {
		return departmentRepository.save(department);
	}
	
	//2.list
	@Override
	public List<Department> DepList(){
		return (List<Department>) departmentRepository.findAll();
	}
	
	//3 .update
	public Department updatgeDep(Department department ,  Long departmentId) {
	   //depDB ->repository에서 id를 하나 찾아온다
		Department depDB = departmentRepository.findById(departmentId).get();
	   //nonNull(Object o) 매개값이  not null 일 경우 true 리턴
		//equalsIgnoreCase대소문자 구분없이 문자열 비교
		if(Objects.nonNull(department.getDepartmentName())
			   && !"".equalsIgnoreCase(department.getDepartmentName())) {
		   depDB.setDepartmentName(department.getDepartmentName());
	   }
	   
	   if(Objects.nonNull(department.getDepartmentAddress())
			&& !"".equalsIgnoreCase(department.getDepartmentAddress())) {
		   depDB.setDepartmentAddress(department.getDepartmentAddress());
	   }
	   
	   if(Objects.nonNull(department.getDepartmentCode())
	  	 && !"".equalsIgnoreCase(department.getDepartmentCode())) {
		   depDB.setDepartmentCode(department.getDepartmentCode());
	   }
         return departmentRepository.save(depDB);
    }
	
	//4. delete
	public void deleteDepartmentById(Long departmentId) {
		departmentRepository.deleteById(departmentId);
	}
	
	
	
	
}
