package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;

import java.util.Scanner;

import org.hibernate.Session;
public class BookAddForm {
  

  void addBooksForm(){
    System.out.println();
    System.out.println("**********Add Books Form**********");
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter Author Name:-");
    String Author =sc.nextLine();
    
    System.out.println("Enter Book Name :-");
    String BookName =sc.nextLine();
    
     Book obj=new Book(Author, BookName);
     
     
     
  //-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    
    //5. save object
    session.save(obj);
    System.out.println("Add Book Successflly !!!");
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------
    
    
   
  }

}

// CREATE TABLE book(id INT primary key AUTO_INCREMENT,Author CHAR(30) NOT NULL,BookName CHAR(30) NOT NULL);