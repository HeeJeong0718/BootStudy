package com.example.Board2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Board2.entity.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
