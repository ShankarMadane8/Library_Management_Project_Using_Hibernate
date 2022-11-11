package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.hibernate.Session;



public class StudentAddForm {

  

  void studentAddForm(){
    System.out.println();
    System.out.println("**********Add Student Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Student Name:-");
    String name =sc.nextLine();
    
    System.out.println("Enter Student Role_no :-");
    int Role_no =sc.nextInt();

    System.out.println("Enter Student Library_id :-");
    int Library_id =sc.nextInt();

    Student obj=new Student(name, Role_no, Library_id);
   
    
    
//-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    
    //5. save object
    session.save(obj);
    System.out.println("Add Student Successflly !!!");
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------
   
    

    
  }

}
// CREATE TABLE students(id INT primary key AUTO_INCREMENT,name CHAR(30) NOT NULL,role_no INT NOT NULL,library_id INT NOT NULL 
// );