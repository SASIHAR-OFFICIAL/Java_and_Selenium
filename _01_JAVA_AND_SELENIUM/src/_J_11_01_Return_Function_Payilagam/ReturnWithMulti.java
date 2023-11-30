package _J_11_01_Return_Function_Payilagam;
public class ReturnWithMulti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnWithMulti add2number = new ReturnWithMulti();
		int multi =add2number.add();
	System.out.println("Multi input = " +multi);
	ReturnWithMulti.MultiplyMethod(multi);
	}
	private static void MultiplyMethod(int multi) {
		// TODO Auto-generated method stub
		int d = multi*2;
		System.out.println("Multiply output = " +d);
	}
	private int add() {
		// TODO Auto-generated method stub
		int a = 16, b = 16;
		int c= a+b;
		System.out.println("add output = " +c);
		return c;
		
	}

}
