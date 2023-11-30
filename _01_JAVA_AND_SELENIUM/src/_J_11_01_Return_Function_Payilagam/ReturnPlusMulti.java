package _J_11_01_Return_Function_Payilagam;
public class ReturnPlusMulti {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnPlusMulti Add2Value = new ReturnPlusMulti();
		int total2 = Add2Value.add();
		System.out.println("Total 2 = " +total2);
		ReturnPlusMulti.Multiply(total2);
					}
	private static void Multiply(int total3) {
		// TODO Auto-generated method stub
		total3 =total3*2;
		System.out.println("Return Plus Multi = "+total3);
	}

	private int add() {
		// TODO Auto-generated method stub
		int a=23, b= 27;
		int c= a+b;
		System.out.println("Total 1 = " +c);
		return c;
	}

}
