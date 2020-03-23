package Java8Concepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DriverClass 
{
	public static void main(String[] args) {
		/*Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(1214, "Shubham Routh", 439853.43);
		empArr[1] = new Employee(3214, "Shubham Das", 423453.43);
		empArr[2] = new Employee(2214, "Shubham Majhi", 433853.43);
	
		
		Arrays.sort(empArr);
		
		for(Employee emp : empArr) {
			System.out.println(emp.toString());
		}*/
		Integer a = 3;
		
		System.out.println(a);
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee(1214, "Shubham Routh", 439853.43));
		list.add(new Employee(3214, "Shubham Das", 423453.43));
		list.add(new Employee(2214, "Shubham Majhi", 433853.43));
		
		Collections.sort(list,Employee.SalaryComparator);
		list.forEach( emp -> printOut(emp.toString()));
	}
	
	public static void printOut(String ans) {
		System.out.println(ans);
	}
}
