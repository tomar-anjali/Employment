package employee_details;

import java.util.List;

public interface EmployeeService {
	Employee add(Employee emp);
	Employee update(int id);
	String remove(int id);
	List<Employee> getAllEmp();
	List<Employee> getAllEmpByName();
}
