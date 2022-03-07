import java.util.Scanner;
public class EntryPoint {
    public static void main (String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int choice = 0;
		 boolean cont = false;
		 do{
		 System.out.println("Which service would you like to use?");
		 System.out.println("[1]: Basic week visualizer");
		 System.out.println("[2]: Advanced week visualizer");
		 System.out.println("[3]: Basic calculator");
		 System.out.println("[4]: Employee repertoire");
		 choice = scan.nextInt();
		 switch(choice){
			 case 1:
				BasicWeek w1 = new BasicWeek();
				w1.printDays();
				break;
			 case 2:
				AdvancedWeek w = new AdvancedWeek();
				w.printDays();
				break;
			 case 3:
				Calculator c = new Calculator();
				break;
			 case 4:
				Employee e = new Employee();
				System.out.println(e);
				break;
			 default:
				System.out.println("Please make sure you pick a number between 1 and 4");
				cont = true;
		 }
		 System.out.println("Would you like to perform another operation? (y/n)");
		 scan.nextLine();
		 if(scan.nextLine().equals("y")){
			 cont = true;
		 }else{
			 cont = false;
		 }
		 }while(cont);
		 
    }
}