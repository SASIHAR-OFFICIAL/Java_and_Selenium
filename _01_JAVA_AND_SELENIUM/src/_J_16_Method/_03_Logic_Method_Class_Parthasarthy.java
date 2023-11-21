package _J_16_Method;

public class methodclass {
	 
	// method definition
	  void logicMethod1(){
		   int z=10;
	       System.out.println("execution of sub one " +z);
	   }
	 
public   void  logicMethod2() {
		   
		   int A, P=10000, r=3, t=5;
		   A = P*(1 + r*t) ;
		   
		   System.out.println("Interest value is " +A); 
			   }

public static int logicMethod3(int i){
			   int h=i;
		      System.out.println("execution of sub one " +h);
		       return(h);
		   }
		  
public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodclass a=new methodclass();
		
		a.logicMethod2();
		methodclass.logicMethod3(50);
		a.logicMethod1();
				
				    
	   }  

	  	   }

	


