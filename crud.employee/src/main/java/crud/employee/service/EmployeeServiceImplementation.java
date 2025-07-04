package crud.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import crud.employee.entity.Employee;
import crud.employee.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImplementation implements Service1{
	@Autowired
	private EmployeeRepository repo;

	@Override
	public void createNewEmployee(Employee emp) {
	    repo.save(emp);
	}
	@Override
	public void updateEmployee(Employee emp) {
	    repo.save(emp);
	}
	@Override
	public void deleteEmployee(Long id) {
		repo.deleteById(id);
	}	
	
	public Employee searchEmployee(Long id) {
		return repo.findById(id).get();
	}
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}