package DAO;

import java.util.List;

import models.Employee;

public interface EmployeeDAO {

	List<Employee> getAllEmployees();

	void saveEmployee(Employee Employee);

	Employee getEmployeeById(int empid);

}
