package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

import org.hibernate.Session;
public class BookUpdate {
  

  static void bookUpdate(){
    System.out.println();
    System.out.println("**********update Book Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Book id :-");
    int id =sc.nextInt();

    System.out.println("Enter Author Name:-");
    sc.nextLine();
    String Author =sc.nextLine();
    
    System.out.println("Enter Book Name:-");
   
    String BookName =sc.nextLine();
    
    Book obj=new Book(id, Author, BookName);
    
    
//-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    
    //5 . update object
    session.update(obj);
    System.out.println("update Book Successflly !!!");
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------
    
    
    

    
  }

}
