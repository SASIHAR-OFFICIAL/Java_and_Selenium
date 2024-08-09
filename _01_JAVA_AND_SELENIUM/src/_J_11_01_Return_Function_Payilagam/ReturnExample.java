package _J_11_01_Return_Function_Payilagam;
//From pailagam

public class ReturnExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnExample add2nos = new ReturnExample();
		int Total2 =add2nos.add();
		System.out.println("Total 2 is " +Total2);
		
		}
	private int add() {
		// TODO Auto-generated method stub
		int a = 10, b = 10;
		int add = a+b;
		System.out.println("Total 1 is " +add);
		return add;
		
	}

}
