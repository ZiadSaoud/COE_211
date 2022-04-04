import java.io.*;  // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class ExpensesTracker{
  public static void main(String[] args){
    try {
		File f = new File("expenses.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		Scanner scan = new Scanner(System.in);
		String yn;
		boolean cont = false;
		String name = "";
		String purchase = "";
		double price = 0;
		do{
			System.out.println("Input your name: ");
			name =  scan.nextLine();
			System.out.println("What did you purchase?");
			purchase =  scan.nextLine();
			System.out.println("How much did you pay? (in USD)");
			price =  scan.nextDouble();
			pw.println(name + " purchased "+ purchase+" for "+price+" US Dollars.");
			System.out.println("Would you like to log another purchase? (y/n)");
			scan.nextLine();
			if(scan.nextLine().equals("y")){
				cont = true;
			}else{
				cont = false;
			}
		}while(cont);
		pw.close();
		System.out.println("Would you like to read a summary of your purchases? (y/n)");
		if(scan.nextLine().equals("y")){
			Scanner fscan = new Scanner(new File("expenses.txt"));
			fscan.useDelimiter("\n");
			while(fscan.hasNext()){
				System.out.println(fscan.next());
			}
		}
	  scan.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
