import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
	static int demerit = 0; 
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		myMenu();	
	}
	
	public static  void myMenu(){
		
		System.out.print("What operation would you like to do? ");
		String answer = console.next();
		
		if (console.hasNext()){
			System.out.print("Please type in only one word either Power, Multiply or Exit");
			multiplyMenu(); 
		}
		System.out.print(answer);
		if (answer.equalsIgnoreCase("multiply")){
			multiplyMenu();
		}
		
		else if (answer.equalsIgnoreCase("power")){
			powerMenu();
		}
		else if (answer.equalsIgnoreCase("exit")){
			System.out.print("thank you for using this program");
			System.exit(0);
		}
		else{
			System.out.println("please type in either Power, Multiply, or exit");
			myMenu();
		}
	}
	public static void multiplyMenu(){
		System.out.println("what two numbers would you like to multiply");
		System.out.print("operator 1: ");
		int op1 = 0;
		int op2 = 0;
		try{
			op1 = console.nextInt();
		}
		catch(InputMismatchException e){
			console.next();
			dicipline(" in numbers with out decimals", "multiply");
			
		}
		if (console.hasNext()){
			dicipline(" in only a single number", "multiply");
		}
		if (op1 < 0){
			dicipline(" positve numbers","multiply");
		}
		System.out.print("operator 2: ");	
		try{
			op2 = console.nextInt();
		}
		catch(InputMismatchException e) {
			console.next();
			dicipline(" in numbers with out decimals", "multiply");
			
		}
		if (op2 <0){
			dicipline("positive numbers", "multiply");
		}
		int hold = MyMath.multiply(op1, op2);
		System.out.println(hold);
		myMenu(); 
		
	}
	public static void dicipline(String crime,String c){
		demerit++; 
		if (demerit == 1){
			System.out.println("please type" + crime);
		}
		else {
			System.out.println("Your reckless misconduct has been noted");
			System.out.println("you have " + demerit + " demerits!");
		}
		
		if (c.equals("multiply")){
			multiplyMenu();
		}
		else{
			powerMenu();
		}
			
		
		
	}
	public static void powerMenu(){
		System.out.println("ahhhhhhhhhhhhhh");
	}
	
}
