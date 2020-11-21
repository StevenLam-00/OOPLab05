package lab05;

import java.util.Collections;
import java.util.Comparator;


public class Employee implements Comparable<Employee>{
	private String employeeId;
	private String employeeName;
	private int salaryPerHour;
	private int noOfLeavingDay;
	private int noOfTravelDay;
	
	public Employee() {
		
	}
	public Employee(String employeeId, String employeeName, 
			int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
		
		this.employeeId= employeeId;
		this.employeeName= employeeName;
		this.salaryPerHour= salaryPerHour;
		this.noOfLeavingDay= noOfLeavingDay;
		this.noOfTravelDay= noOfTravelDay;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalaryPerHour() {
		return salaryPerHour;
	}

	public void setSalaryPerHour(int salaryPerHour) {
		this.salaryPerHour = salaryPerHour;
	}

	public int getNoOfLeavingDay() {
		return noOfLeavingDay;
	}

	public void setNoOfLeavingDay(int noOfLeavingDay) {
		this.noOfLeavingDay = noOfLeavingDay;
	}

	public int getNoOfTravelDay() {
		return noOfTravelDay;
	}

	public void setNoOfTravelDay(int noOfTravelDay) {
		this.noOfTravelDay = noOfTravelDay;
	}
	
	public int calculateWeeklySalary() {
		return salaryPerHour*8*(5-noOfLeavingDay+ noOfTravelDay/2);
	}

	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", salaryPerHour=" + salaryPerHour
				+ ", calculateWeeklySalary=" + calculateWeeklySalary() + "]";
	}
	
	@Override
	public int compareTo(Employee e) {
		if (getNoOfTravelDay()> e.getNoOfTravelDay()) {
            return 1;
        }
		
        if(getNoOfTravelDay()==e.getNoOfTravelDay()) {
        	
        	if( getNoOfLeavingDay()<e.getNoOfLeavingDay()) {
        		return 1;
        	}else if(getNoOfLeavingDay()>e.getNoOfLeavingDay()) {
        		return -1;
        	}else return 0;
        }
        return -1;
	}
	
}
