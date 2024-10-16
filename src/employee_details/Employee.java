package employee_details;

import java.util.Objects;

public class Employee {

		private String name;
		private String email;
		private int id;
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		@Override
		public boolean equals(Object obj) {
			if(this==obj) {
				return true;
			}
			if(obj==null || getClass()!=obj.getClass()) {
				return false;
			}
			Employee emp=(Employee) obj;
			return id==emp.id && obj.equals(name) && obj.equals(email);
		}
		
		public int hashCode() {
			// TODO Auto-generated method stub
			return Objects.hash(id,name,email);
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", email=" + email + ", id=" + id + "]";
		}

}
