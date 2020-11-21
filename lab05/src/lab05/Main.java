package lab05;

import java.util.ArrayList;
import java.util.Date;


public class Main {
	public static void main(String[] args) {
		
		//=================================================//
		Employee  e1= new Employee("a1", "Lam", 1400, 3, 8);
		Employee  e2= new Employee("a2", "Man", 900, 7, 3);
		Employee  e3= new Employee("a3", "Duy", 200, 3, 14);
		Employee  e4= new Employee("a4", "Kiet", 300, 2, 12);
		Employee  e5= new Employee("a5", "Ha", 150, 1, 8);
		//=================================================//
		Employee  e6= new Employee("b1", "Ngoc", 930, 4, 23);
		Employee  e7= new Employee("b2", "Trang", 240, 6, 14);
		Employee  e8= new Employee("b3", "Vy", 530, 3, 12);
		Employee  e9= new Employee("b4", "Truc", 940, 6, 15);
		Employee  e10= new Employee("b5", "Phuong", 230, 3, 20);
		
		
		//================================================//
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		//===============================================//
		System.out.println();
		ArrayList<Employee> listOfEmployeeA = new ArrayList<Employee>();
		String projectId="project1";
		Date startDate= new Date(2020-1900,1,1);
		Date endDate= new Date(2020-1900,2,1);
		Project pro =new Project(projectId, startDate, endDate, listOfEmployeeA);
		pro.getListOfEmployee().add(e1);
		pro.getListOfEmployee().add(e2);
		pro.getListOfEmployee().add(e3);
		pro.getListOfEmployee().add(e4);
		pro.getListOfEmployee().add(e5);
		System.out.println(pro.toString());
		//==================================================//
		System.out.println();
		ArrayList<Employee> listOfEmployeeB = new ArrayList<Employee>();
		String projectId2="project2";
		Date startDate2= new Date(2020,4,23);
		Date endDate2= new Date(2020,5,3);
		Project pro2 =new Project(projectId, startDate, endDate, listOfEmployeeB);
		pro2.getListOfEmployee().add(e6);
		pro2.getListOfEmployee().add(e7);
		pro2.getListOfEmployee().add(e8);
		pro2.getListOfEmployee().add(e9);
		pro2.getListOfEmployee().add(e10);
		System.out.println(pro2.toString());
		//=============================================//
		System.out.println("//////////////////////////////");
		ProjectPrinter print= new ProjectPrinter(pro);
		print.run();
		System.out.println("/////////////////////////////");
		ProjectPrinter print2 = new ProjectPrinter(pro2);
		print2.run();
		
	}
}
