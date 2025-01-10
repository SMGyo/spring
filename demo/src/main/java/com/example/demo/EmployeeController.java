package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.mapper.EmployeesMapper;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeesMapper employeesMapper;
	
	@GetMapping("/emp")
	public String list(Model model){
		model.addAttribute("empList",employeesMapper.findAll());
		return "empList";
	}
	@GetMapping("/dept")
	public String list2(Model model){
		model.addAttribute("deptList",employeesMapper.deptAll());
		return "deptList";
	}
//	@GetMapping("/empOne")
//	public Map<String,Object> list2(long empId) {
//		return employeesMapper.findById(empId);
//	}
	@ResponseBody
	@GetMapping("/")
	public String hello() {
		return "hello ~~~";
	}
}
