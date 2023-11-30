package _J_11_01_Return_Function_Payilagam;
public class ReturnFuntion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnFuntion ReturnAdd = new ReturnFuntion();
		int int_Add =ReturnAdd.add();
		//ReturnFuntion.sub(int_Add);
		
		System.out.println("returnedADD = "+int_Add);
	}
	
	private int add() {
		// TODO Auto-generated method stub
		int a = 5, b = 5;
		int add = a + b;
		System.out.println("Addition Total = " +add);
		return add;
	}
}
