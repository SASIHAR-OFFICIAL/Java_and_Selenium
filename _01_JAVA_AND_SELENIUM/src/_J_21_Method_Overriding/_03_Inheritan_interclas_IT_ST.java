package _J_21_Method_Overriding;
interface Print1{
	void Print1();
	//void display();
	void show();
	void display();
}
interface Showable{  
	void show();  
}  
class _03_Inheritan_interclas_IT_ST implements Showable, Print1{
	public void print(){
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);
	} 
	public void show(){
		int a=10,b=20,c;
		c=a-b;
		System.out.println(c);} 

	public void display(){
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);} 

	public static void main(String args[]){  
		_03_Inheritan_interclas_IT_ST obj = new _03_Inheritan_interclas_IT_ST(); 
		Print1 obj = new Print1();
		//Object creation not possible in interface name
		obj.Print1();
		obj.show();
		obj.display();
	}
	@Override
	public void Print1() {
		// TODO Auto-generated method stub
	}
}
