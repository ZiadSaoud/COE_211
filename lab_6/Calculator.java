import java.util.Scanner;
import java.text.DecimalFormat;
public class Calculator {
    private int num1;
    private int num2;
    private String operator;
	private String output;
    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
		System.out.println("Input the first number: ");
		num1 = scanCalc.nextInt();
		scanCalc.nextLine();
		System.out.println("Input the operator: ");
		operator = scanCalc.nextLine();
		System.out.println("Input the second number: ");
		num2 = scanCalc.nextInt();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
		 switch(operator){
			 case "+":
				output = add(num1,num2);
				break;
			 case "-":
				output = subtract(num1,num2);
				break;
			case "*":
				output = multiply(num1, num2);
				break;
			case "/":
				output = divide(num1, num2);
				break;
		 }
		 System.out.println(output);
    }

    public String add(int a, int b) {
        /**
         * Enter logic
         */
		 int sum = a + b;
		 return ""+a+" "+operator+" "+b+" = "+sum;
    }

    public String subtract(int a, int b) {
        /**
         * Enter logic
         */
		 int sub = a - b;
		 return ""+a+" "+operator+" "+b+" = "+sub;
    }

    public String multiply(int a, int b) {
        /**
         * Enter logic
         */
		 int mul = a * b;
		 return ""+a+" "+operator+" "+b+" = "+mul;
    }

    public String divide(int a, int b) {
        /**
         * Enter logic
         */
		 double div = a/(double) b;
		 DecimalFormat fmt = new DecimalFormat("0.##");
		 return ""+a+" "+operator+" "+b+" = "+fmt.format(div);
    }
}