package crud.employee.service;

import java.util.*;
import crud.employee.entity.Employee;

public interface Service1 {
	void createNewEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Long id);
	
	Employee searchEmployee(Long id);

	List<Employee> getAllEmployees();

}
