package _J_17_Method_Calling;
// Constructor WILL have same name of CLASS NAME
// Constructor WILL NOT have RETURN DATA TYPE
// Constructor will be called automatically when OBJECT IS CREATED (when CLASS initialized)
//  
public class Bank_Customer {
	String Name, City;
	int DoB, AadhaarNo;
	public Bank_Customer(String CustomerName, int DateOfBirth, int Aadhar, String CityName) {
		Name = CustomerName;
		DoB = DateOfBirth;
		AadhaarNo = Aadhar;
		City = CityName;
	}
	public Bank_Customer(int Aadhar2) {
		// TODO Auto-generated constructor stub
		AadhaarNo = Aadhar2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank_Customer Anbu = new Bank_Customer("Anbu", 10081980, 123456789, "Madurai");
		Bank_Customer Selvan = new Bank_Customer(999999);
		Anbu.applyloan();
		Selvan.applyloan();
	}
	private void applyloan() {
		// TODO Auto-generated method stub
		System.out.println(+AadhaarNo);
		System.out.println(+AadhaarNo);
		System.out.println(+AadhaarNo);
		System.out.println(+AadhaarNo);
	}
	}
