package _J_20_Method_Overloading;

class methodload
{
	public  void display()
	{
		int t=70;
	}
	public  void display(int a)
	{
		System.out.println( "Value a is " +a);
	}
	public  static void display(char a, int num)  
	{
		System.out.println(a+""+num);
	}
	public void display(String c)
	{
		System.out.println(c);
	}
	public void display1(int v)
	{
		System.out.println(v);
	}
	public void display(char v)
	{
		System.out.println(v);
	}
}
public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		asd w = new asd();
		w.display("rate");
		w.display();
		w.display(80);
		w.display(88);
		w.display('r');
		asd.display('z',20);	      
	}
}