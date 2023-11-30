package _J_11_01_Return_Function_Payilagam;

public class ReturnWithDivide {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnWithDivide Addinput = new ReturnWithDivide();
		int Addoutput = Addinput.Add();
		ReturnWithDivide.Divide(Addoutput);
	}
	private static void Divide(int d) {
		// TODO Auto-generated method stub
		int e = d / 2;
		System.out.println("divide output = " + e);
	}
	private int Add() {
		// TODO Auto-generated method stub
		int a = 12, b = 38;
		int c = a + b;
		System.out.println("Add output = " + c);
		return c;
	}
}
