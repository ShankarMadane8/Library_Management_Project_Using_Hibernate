package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
public class Signup {


 public void signup(){
    System.out.println();
    System.out.println("**********Signup Form**********");
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter User Name:-");
    String user_name =sc.nextLine();
    System.out.println("Enter Password:-");
    String password =sc.nextLine();
    
    Adminlog obj=new Adminlog(user_name, password);
    
    
    //-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    
    //5. save object
    session.save(obj);
    System.out.println("registration completed successfully!!!");
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------
    
  }

}
// CREATE TABLE Admins(id INT primary key AUTO_INCREMENT,user_name CHAR(30) NOT NULL,password CHAR(30) NOT NULL);