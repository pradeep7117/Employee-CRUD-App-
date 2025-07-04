package crud.employee.controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import crud.employee.entity.Employee;
import crud.employee.service.Service1;

@Controller
public class EmployeeControlller {
	@Autowired
	Service1 service;
	
	@PostMapping("/create")
	public void createNewEmloyee(Employee emp) {
		service.createNewEmployee(emp);
	}
	@PostMapping("/update")
	public void updateEmployee(Employee emp) {
		service.updateEmployee(emp);
	}
	@GetMapping("/delete")
	public void deleteEmployee(Long id) {
		service.deleteEmployee(id);
	}

	@GetMapping("/search")
	public String searchEmployee(@RequestParam Long id,Model model) {
	    Employee emp = service.searchEmployee(id);
	    model.addAttribute("empObj",emp);
	    return "SearchResult";
	}
	
	@GetMapping("/ViewPage")
	public String getAllEmployees(Model model) {
		List<Employee> emplist=service.getAllEmployees();
		System.out.print(emplist);
		 model.addAttribute("empObj1",emplist);
		return "viewAll";
	}
    
	
	@GetMapping("/createPage")
	public String createPage() {
	    return "create";
	}
	
	@GetMapping("/updatePage")
	public String updatepage() {
	    return "update";
	}
	
	@GetMapping("/deletePage")
	public String deletePage() {
	    return "delete";
	}
	@GetMapping("/searchPage")
	public String SearchPage() {
	    return "search";
	}
	


}
