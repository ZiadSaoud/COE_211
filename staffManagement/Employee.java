import java.util.Scanner;
public class Employee{
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	public Employee(String firstName, String lastName, int age, double salary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	public Employee(){
		
	}
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public int getAge(){
		return age;
	}
	public double getSalary(){
		return salary;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setEmployeeInfo(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input the employee's first name");
		firstName = scan.nextLine();
		System.out.println("Please input the employee's last name");
		lastName = scan.nextLine();
		System.out.println("Please input the employee's age");
		age = scan.nextInt();
		System.out.println("Please input the employee's monthly salary");
		salary = scan.nextDouble();
	}
	public String toString(){
		return ("Employee information: "+firstName + " "+lastName+", "+age+", "+salary);
	}
}