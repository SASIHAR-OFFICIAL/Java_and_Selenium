package _J_22_Inheritance;


	abstract class Base { 
	    abstract void fun();
	    void run() {System.out.println("Base run() called");}
	} 
	class Derived extends Base { 
	    void fun() { System.out.println("Derived fun() called"); } 
	} 
	class classtoinherit { 
	    public static void main(String args[]) {  
	      
	        // Uncommenting the following line will cause compiler error as the  
	        // line tries to create an instance of abstract class. 
	        Base b = new Base(); 
	  
	        // We can have references of Base type. 
	    
	    	//Derived b = new Derived(); 
	        b.fun();  
	        b.run();
	    } 
	} 

