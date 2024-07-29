package _J_15_02_Parameterized_Constructor;

public class School_Student {

	int Marks;
	String Name;
	
	School_Student()  // <--- Constructor initialize default like this when we create object like below person person_object = new person();
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		
		School_Student person_object1 = new School_Student();   
		// <---- When Object created above Constructor in name of  Class will be 
		//      created imaginary(Logically)  without showing like above
		School_Student person_object2 = new School_Student();
		
		System.out.println(person_object1.Marks);
		System.out.println(person_object2.Name);
	}

}
