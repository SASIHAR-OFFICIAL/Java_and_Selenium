package _J_22_Inheritance;
class Bike{
   void run(){System.out.println("running");}
 }
 class Splender extends Bike{
   void run(){System.out.println("running safely with 60km");}
 
   public static void main(String args[]){
     Bike b = new Splender();//upcasting
     b.run();
   }
 }