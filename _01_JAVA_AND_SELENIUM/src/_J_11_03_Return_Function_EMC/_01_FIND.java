package _J_11_03_Return_Function_EMC;

import java.util.Scanner;

public class _01_FIND {

	void evenorodd(int num) {
		if (num%2 ==0) {
			System.out.println(num+" = This is EVEN number");
		}
		else {
			System.out.println(num+" = This is ODD number");
		}


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int number = scan.nextInt();
		_01_FIND obj1 = new _01_FIND();
		obj1.evenorodd(number);


	}

}
