package org.miu.Prob2.prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		if(table==null||table.isEmpty()||socSecNums==null) throw new IllegalArgumentException("Inputs cannot be null or empty");
		List<Employee> employeeList80K=new ArrayList<>();
		for (String ssn : socSecNums) {
			Employee emp = table.get(ssn);
			if (emp != null && emp.getSalary() > 80000) {
				employeeList80K.add(emp);
			}
		}
		Collections.sort(employeeList80K,new Comparator<Employee>(){

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getSsn().compareTo(o2.getSsn());
			}
		});
		return employeeList80K;
	}
	
}
