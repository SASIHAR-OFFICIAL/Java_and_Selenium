package _J_16_Method;

public class IT10_Method {

public void logicmethod()

{
	int z=10;
	System.out.println(z);
}
public void logicmethod2()
{
	int a,p=1000, r=3, t=5;
	a=p*(1+r*t); 
	System.out.println("interest ="+a);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
IT10_Method e=new IT10_Method();
e.logicmethod();
e.logicmethod2();
}
}