package _J_24_Polymorphism;


//Interface declaration: by first user  
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){
	System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawable{  
public void draw(){
	System.out.println("drawing circle");
	}  
}  
//Using interface: by third user  
class poly_object_polyint {  
public static void main(String args[]){  
Drawable c=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
c.draw(); 
Drawable r=new Rectangle();//In real scenario, object is provided by method e.g. getDrawable()  
r.draw();  
}}  