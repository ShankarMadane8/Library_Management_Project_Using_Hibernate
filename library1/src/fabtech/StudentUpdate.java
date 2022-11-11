package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

import org.hibernate.Session;
public class StudentUpdate {
  
  static void stuUpdate(){
    System.out.println();
    System.out.println("**********update Student Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Student id :-");
    int id =sc.nextInt();

    System.out.println("Enter Student Name:-");
    String name =sc.next();
    
    System.out.println("Enter Student Role_no :-");
    int Role_no =sc.nextInt();

    System.out.println("Enter Student Library_id :-");
    int Library_id =sc.nextInt();

    
    
    Student obj=new Student(id, name, Role_no, Library_id);
//-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    
    //5. update object
    session.update(obj);
    System.out.println("update Student Successflly !!!");
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------
    

    
  }
  
}
