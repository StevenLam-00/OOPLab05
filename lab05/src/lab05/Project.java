package lab05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Project {
	private String projectId;
	private Date startDate;
	private Date endDate;
	private ArrayList<Employee> listOfEmployee ;
	
	public Project() {
		
	}
	public Project(String projectId, Date startDate, Date endDate, ArrayList<Employee> listOfEmployee ) {
		this.projectId= projectId;
		this.startDate= startDate;
		this.endDate= endDate;
		this.listOfEmployee =listOfEmployee;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public ArrayList<Employee> getListOfEmployee() {
		return listOfEmployee;
	}
	public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	public int estimateBudget() {
		int estimateBubgetValue=0;
		for(int i=0; i< listOfEmployee.size(); i++) {
			estimateBubgetValue= listOfEmployee.get(i).getSalaryPerHour()*(endDate.getDate()-startDate.getDate());
		}
		return estimateBubgetValue ;
	}
	@Override
	public String toString() {
		Collections.sort(listOfEmployee);//sort by id
		String setToString=null;
		for(Employee e: listOfEmployee) {
			setToString=setToString+"[Employee id:"+ e.getEmployeeId() + "-Employee name:" +
					e.getEmployeeName()+ "-Salary per hour:" + e.getSalaryPerHour()+ 
					"-No of travel day:" + e.getNoOfTravelDay() 
					+"-No of leaving day:" + e.getNoOfLeavingDay() +"] \n";
		}
		return "Project [ListOfEmployee:  " + setToString + "]";
		
	}
	
}
