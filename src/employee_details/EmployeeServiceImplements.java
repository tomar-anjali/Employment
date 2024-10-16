package employee_details;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImplements implements EmployeeService{
	 Scanner scanner=new Scanner(System.in);
	 Employee emp=new Employee();
	 ArrayList<Employee> emp_ar=new ArrayList<Employee>();
	 List list=new ArrayList();
	
//	 int id;

	@Override
	public Employee add(Employee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(int id) {
		System.out.print("Enter Employee ID to remove: ");
         id = scanner.nextInt();
         if(emp.getId()==id) {
        	 int i=(int)id;
        	 emp_ar.remove(i);
         }
//        employees.removeIf(employee -> employee.getId() == id);
        System.out.println("Employee removed successfully!");
		return emp;
	}

	@Override
	public String remove(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmpByName() {
		// TODO Auto-generated method stub
		return null;
	}

}
