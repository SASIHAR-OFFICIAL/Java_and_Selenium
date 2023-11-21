package J_24_Polymorphism;
final class ABC{
			   //Overridden method
			    void disp()
			   {
			    	int b=20;
			    	final int a=10;
			    	int c=a+b;
				System.out.println("disp() method of parent1 class");
			   }
			    
			      final void disp1()
			   {
				System.out.println("disp() method of parent2 class");
			   }
			  
			}
			class moverload_methodclass extends ABC2{
			   //Overriding method
				   void disp(){
				System.out.println("disp() method of Child1 class");
			   }
				   void disp1()
				   {
					System.out.println("disp() method of parent2 class");
				   }
			  
			   public void newMethod(){
				System.out.println("new method of main class");
			   }
			  		   
			   public static void main( String args[]) {
				/* When Parent class reference refers to the parent class object
				 * then in this case overridden method (the method of parent class)
				 *  is called.*/
				 
				ABC2 x = new ABC2();
				x.disp();
				x.disp1();
				/* When parent class reference refers to the child class object
				 * then the overriding method (method of child class) is called.
				 * This is called dynamic method dispatch and runtime polymorphism
				 */
				ABC2 y = new moverload_methodclass();
				y.disp();
				y.disp1();
								
				moverload_methodclass z = new moverload_methodclass();
				z.newMethod();
				
			   }
			

	}



