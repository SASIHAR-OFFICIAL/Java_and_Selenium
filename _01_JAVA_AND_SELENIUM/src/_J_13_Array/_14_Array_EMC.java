package _J_13_Array;

import java.util.Scanner;

public class _14_Array_EMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] Mark = new int[5];


		for (int i = 0; i <=4; i=i+1) {

			Mark[i]=scan.nextInt();
		}
		
		for (int i = 0; i < Mark.length; i++) {
			System.out.println(i);
		}
		
//		System.out.println(Mark[0]);
//		
//		System.out.println("Mark[0] = "+Mark[0]);
//		
//		
//		System.out.println("Mark[1] = "+Mark[1]);
//		System.out.println("Mark[2] = "+Mark[2]);
//		System.out.println("Mark[3] = "+Mark[3]);
//		System.out.println("Mark[4] = "+Mark[4]);
	}

}
