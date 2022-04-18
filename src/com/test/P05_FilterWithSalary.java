package com.test;

import java.util.ArrayList;
import java.util.List;

public class P05_FilterWithSalary {

	public static void main(String[] args) {
		
		List<P05_EmployeeFilter> empList = new ArrayList<P05_EmployeeFilter>();

		empList.add(new P05_EmployeeFilter(10, "Sharad", 50000));
		empList.add(new P05_EmployeeFilter(20, "Abhinath", 125000));
		empList.add(new P05_EmployeeFilter(30, "Pooja", 80000));
		empList.add(new P05_EmployeeFilter(40, "shivam", 75000));
		empList.add(new P05_EmployeeFilter(50, "Akshata", 40000));

		List<P05_EmployeeFilter> above50Emp = new ArrayList<P05_EmployeeFilter>();
		
		for( P05_EmployeeFilter emp: empList) {
			if(emp.getSalary()>50000) {
				above50Emp.add(emp);
			}
		}
		for( P05_EmployeeFilter emp: above50Emp) {
			System.out.println(emp);
		}
	}
}
