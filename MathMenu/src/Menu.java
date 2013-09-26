import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu {
	static int demerit = 0; 
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		multiplyMenu();	
	}
	
	public static  void myMenu(){
		
		System.out.print("What operation would you like to do");
		String answer = console.next();
		if (answer.equalsIgnoreCase("multiply")){
			multiplyMenu();
		}
	}
	public static void multiplyMenu(){
		System.out.println("what two numbers would you like to multiply");
		System.out.print("operator 1: ");
		int op1 = 0;
		try{
			op1 = console.nextInt();
		}
		catch(InputMismatchException e){
			console.next();
			System.out.println("\n" + op1);
			dicipline("in numbers with out decimals", "multiply");
			
		}
		
		if (op1 < 0){
			dicipline("type positve numbers","multiply");
		}
		System.out.print("operator 2: ");	
		int op2 = console.nextInt();
		if (op2 <0){
			dicipline("type negitive numbers", "multiply");
		}
		int hold = MyMath.multiply(op1, op2);
		System.out.println(hold);
		multiplyMenu(); 
		
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
		
		//if (c.equals("multiply")){
			multiplyMenu();
		//}
		//else{
		
		//}
			
		
		
	}
	public static void powerMenu(){
		System.out.println("ahhhhhhhhhhhhhh");
	}
	
}
