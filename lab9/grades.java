import java.util.Scanner;
public class grades{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter all assignment grades on the same line separated by space:");
		int[] grades = new int[5];
		int idx = 0;
		idx++;
		for (int i=0; i <5; i++){
			String s = scan.next();
			grades[i] = Integer.parseInt(s);
		}
		double avg = 0;
		for(int i=0;i<grades.length;i++){
			avg+=grades[i];
		}
		avg/=grades.length;
		avg = avg *0.3;
		System.out.println("Input the number of attended labs");
		double at = scan.nextInt();
		at=(at*100*0.05)/7;
		System.out.println("Input the midterm grade");
		double exam = scan.nextInt();
		exam*=0.3;
		System.out.println("Assignments (30%): "+avg);
		System.out.println("Attendance (5%): "+at);
		System.out.println("Midterm (30%): "+exam);
	}
}