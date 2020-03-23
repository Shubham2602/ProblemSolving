package Java8Concepts;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	String name;
	double salary;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static Comparator<Employee> SalaryComparator = new Comparator<Employee>() {

        @Override
        public int compare(Employee e1, Employee e2) {
            return (int) (e1.getSalary() - e2.getSalary());
        }
    };
	public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
	
	public String toString() {
		return this.name+" with employee id "+this.id+" draws a salary of "+this.salary+" INR per annum.";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*public int compareTo(Employee otherEmployee)
	{
		if(this.salary > otherEmployee.salary) {
			return 1;
		}else if(this.salary < otherEmployee.salary) 
		{
			return -1;
		}else {
			return 0;
		}
	}*/
	
	
	
}
