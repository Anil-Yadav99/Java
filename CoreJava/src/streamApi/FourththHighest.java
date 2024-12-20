package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FourththHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> emp = Arrays.asList(
	            new Employee(1, "Alice", 5000),
	            new Employee(2, "Bob", 7000),
	            new Employee(3, "Charlie", 6000),
	            new Employee(4, "David", 8000),
	            new Employee(5, "Eve", 9000)
	        );

	        // Find the 4th highest salary
	        Optional<Employee> salary = emp.stream()
	                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()) // Sort in descending order
	                .skip(3) // Skip the first 3 employees
	                .findFirst(); // Get the 4th employee

	        // Print the result
	        if (salary.isPresent()) {
	            System.out.println("4th Highest Salary: " + salary.get());
	        } else {
	            System.out.println("4th highest salary not found.");
	
	        }
	}
}
