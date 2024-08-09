package _J_11_01_Return_Function_Payilagam;

public class ReturnExample2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnExample2 return2 = new ReturnExample2();
		int add_Two_numbers = return2.add_Two_numbers();
		System.out.println("add_Two_numbers ="+add_Two_numbers);
	}
	
private	int  add_Two_numbers() {
		int a =10;
		int b =30;
		int c =a+b;
		System.out.println("C Value = "+c);
		return c;

	}
}
