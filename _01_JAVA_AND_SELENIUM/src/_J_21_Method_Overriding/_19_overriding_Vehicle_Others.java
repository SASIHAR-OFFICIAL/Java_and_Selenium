package _J_21_Method_Overriding;

import _J_22_Inheritance.Bike;

class Vehicle{
  void run(){System.out.println("Vehicle is running");}
  }
  class Bike extends Vehicle{
  
  public static void main(String args[]){
  Bike obj = new Bike();
  obj.run();
  }
}