import java.util.Random;
public class EntryPoint{
	public static void main(String[] args){
		Random rnd = new Random();
		int val = rnd.nextInt(10)+1;
		System.out.println("You have "+val+" insertions left");
		Employee[] arr = new Employee[val];
		for(int i=1; i<=val; i++){
			Employee emp = new Employee();//Note that the constructor that takes parameters is available in the Employee class.
			emp.setEmployeeInfo();
			arr[i-1]=emp;
			System.out.println("You have "+(val-i)+" insertions left");
		}
		for(int j=0; j<arr.length; j++){
			System.out.println(arr[j]);
		}
	}
	
}