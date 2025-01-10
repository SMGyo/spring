package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface EmployeesMapper {
	List<EmployeesDto> findAll();
	EmployeesDto findById(long id);
	List<EmployeesDto> findBydeptAndName(@Param("departmentId") Long departmentId, @Param("firstName") String firstName);
	List<DeptDto> deptAll();
}
