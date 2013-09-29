import java.util.InputMismatchException;

import java.util.Scanner;


public class Menu {
	static int demerit = 0; 
	static Scanner console = new Scanner(System.in);
	public static void main (String Args[]){
		myMenu();	
	}
	
	public static  void myMenu(){
		
		System.out.print("What operation would you like to do? (multiply, power, or exit) ");
		String answer = console.next();
		String a = console.nextLine();
		String[] as = a.split(" ");
		if (as.length > 1){
			dicipline(" in only exit, multiply, or power", "menu");
		}
		
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
			String a = console.nextLine();
			String[] as = a.split(" ");
			if (as.length > 1){
				dicipline(" in only one number", "multiply");
			}
		}
		catch(InputMismatchException e){
			console.next();
			dicipline(" in numbers with out decimals", "multiply");
			
		}
		if (op1 < 0){
			dicipline(" positve numbers","multiply");
		}
		System.out.print("operator 2: ");	
		try{
			op2 = console.nextInt();
			String a = console.nextLine();
			String[] as = a.split(" ");
			if (as.length > 1){
				dicipline(" in only one number", "multiply");
			}
		}
		catch(InputMismatchException e){
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
			System.out.println("please type" + crime);
		
		if (demerit < 3){
			
		}
		else if ( demerit < 5){
			System.out.println("Your reckless misconduct has been noted");
		}
		else if (demerit < 6 ){
			System.out.println("Just so you know your misconduct really has been noted");
		}
		else if (demerit < 7){
			System.out.println("please type in your parent's email adress so  we can notify them of your bad behavoir!");
			console.next();
		}
		else {
			System.out.println("really?");
		}
		
		if (c.equals("multiply")){
			multiplyMenu();
		}
		else if (c.equals("power")){
			powerMenu();
		}
		else{
			myMenu();
		}
			
		
		
	}
	
	public static void powerMenu(){
		System.out.println("What number do you want to exponentially increase?");
		System.out.print("operator: ");
		int op1 = 0;
		int op2 = 0;
		try{
			op1 = console.nextInt();
			String a = console.nextLine();
			String[] as = a.split(" ");
			if (as.length > 1){
				dicipline(" in only one number", "power");
			}
		}
		catch(InputMismatchException e){
			console.next();
			dicipline(" in numbers with out decimals", "power");
			
		}
		if (op1 < 0){
			dicipline(" positve numbers","power");
		}
		System.out.print("exponet: ");
		try{
			op2 = console.nextInt();
			String a = console.nextLine();
			String[] as = a.split(" ");
			if (as.length > 1){
				dicipline(" in only one number", "power");
			}
		}
		catch(InputMismatchException e){
			console.next();
			dicipline(" in numbers with out decimals", "power");
			
		}
		if (op2 < 0){
			dicipline(" positve numbers","power");
		}
		System.out.println(MyMath.power(op1, op2));
		myMenu();
		
	}
	
}
