
public class MyMath {
	public static int multiply(int op1, int op2){
		int op3 = op1;
		for (int i = 1; i < op2; i++){
			op1 += op3;
		}
		return op1;
	}
	public static int power(int op1, int op2){
		if (op2 > 0){
			int op3 = op1;
			for (int i = 1; i < op2; i++){
				op1 = multiply(op1,op3);
			}
			return op1; 
			}
		else{
			return 1;
		}
		
		
	}
}
