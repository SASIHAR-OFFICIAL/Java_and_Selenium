package _J_17_01_Method_Calling;

//Java program to illustrate 
//the concept of Aggregation. 
import java.io.*; 
import java.util.*;

import _J_14_01_Array_List_IT_ST.Student_IT_ST; 

//student class 
class Student  
{ 
 String name; 
 int id ; 
 String dept; 
   
 Student(String name, int id, String dept)  
 { 
       
     this.name = name; 
     this.id = id; 
     this.dept = dept; 
       
 } 
} 

/* Department class contains list of student 
Objects. It is associated with student 
class through its Object(s). */
class Department  
{ 
   
 String name; 
 private List<Student_IT_ST> students; 
 Department(String name, List<Student_IT_ST> students)  
 { 
       
     this.name = name; 
     this.students = students; 
       
 } 
   
 public List<Student_IT_ST> getStudents()  
 { 
     return students; 
 } 
} 

/* Institute class contains list of Department 
Objects. It is asoociated with Department 
class through its Object(s).*/
class Institute  
{ 
   
 String instituteName; 
 private List<Department> departments; 
   
 Institute(String instituteName, List<Department> departments) 
 { 
     this.instituteName = instituteName; 
     this.departments = departments; 
 } 
   
 // count total students of all departments 
 // in a given institute  
 public int getTotalStudentsInInstitute() 
 { 
     int noOfStudents = 0; 
     List<Student_IT_ST> students;  
     for(Department dept : departments) 
     { 
         students = dept.getStudents(); 
         for(Student_IT_ST s : students) 
         { 
             noOfStudents++; 
         } 
     } 
     return noOfStudents; 
 } 
   
}  

//main method 
class GFG 
{ 
 public static void main (String[] args)  
 { 
     Student_IT_ST s1 = new Student_IT_ST("Mia", 1, "CSE"); 
     Student_IT_ST s2 = new Student_IT_ST("Priya", 2, "CSE"); 
     Student_IT_ST s3 = new Student_IT_ST("John", 1, "EE"); 
     Student_IT_ST s4 = new Student_IT_ST("Rahul", 2, "EE"); 
   
     // making a List of  
     // CSE Students. 
     List <Student_IT_ST> cse_students = new ArrayList<Student_IT_ST>(); 
     cse_students.add(s1); 
     cse_students.add(s2); 
       
     // making a List of  
     // EE Students 
     List <Student_IT_ST> ee_students = new ArrayList<Student_IT_ST>(); 
     ee_students.add(s3); 
     ee_students.add(s4); 
       
     Department CSE = new Department("CSE", cse_students); 
     Department EE = new Department("EE", ee_students); 
       
     List <Department> departments = new ArrayList<Department>(); 
     departments.add(CSE); 
     departments.add(EE); 
       
     // creating an instance of Institute. 
     Institute institute = new Institute("BITS", departments); 
       
     System.out.print("Total students in institute: "); 
     System.out.print(institute.getTotalStudentsInInstitute()); 
 } 
} 

