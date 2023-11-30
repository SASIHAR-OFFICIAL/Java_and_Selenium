package _J_17_04_Method_Calling_Parthasarthy;

public class variable {
		//import java.util.Math.max()
		public static void main(String[] args) {
				bank b ;
				b = new Axis();
				b.sum();
			}
		}
		class bank{ 
			  void sum(){
				  float p  = 100087,n = 10,r = 3;
				 float SI =  (p * n* r)/100;
				  System.out.println(" The simple interest is:" +SI);} 
			}
		class Axis extends bank{ 
			  void sum(){
				  int p = 200067,n = 5,r = 5;
				  float SI = (p * n * r)/100;
				  double IS = (p * n * r)/100;
				System.out.println(" The Simple interest is:"+SI);
				System.out.println(" The Simple interest is:"+IS);
			  } 
			}

	


