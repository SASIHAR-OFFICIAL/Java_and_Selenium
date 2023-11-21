package _J_11_Return_Function;
interface Print{
	void Print();
//void display();
}
interface Showable{  
void show();  
}  

class interclas implements Showable, Print{

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
		//interclas obj = new interclas(); 
		Print obj = new Print(); //Object creation not possible in interface name
		obj.print();
		obj.show();
		obj.display();

	}

}

  
