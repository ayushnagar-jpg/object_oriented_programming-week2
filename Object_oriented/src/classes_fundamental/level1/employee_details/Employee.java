package classes_fundamental.level1.employee_details;

public class Employee {
 String name;
 int id;
 double salary;


Employee(String name,int id,double salary){
	this.name = name;
	this.id = id;
	this.salary = salary;
}

void display() {
	System.out.println("Employee Name:"+ name);
	System.out.println("Employee Id:"+ id);
	System.out.println("Employee Salary"+ salary);
	
}
}
