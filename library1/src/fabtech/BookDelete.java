package fabtech;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

public class BookDelete {

    static void bookDelete( ) {
    	System.out.println();
		System.out.println("**********Delete Student************");
		System.out.println("Enter Book id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		
		
//-------------------------------------------------------------------
	    
	    Session session= HibernateConnection.getHibrenateConnection();
	    
	    //5. get all object
	    TypedQuery query=session.createQuery("from Book");   
	    ArrayList<Book> list=(ArrayList<Book>)query.getResultList();
	    
	   
	
	    boolean match=false;
	    for(Book obj:list) {
	    	if(obj.getId()==id) {
	    		session.delete(obj);
	    		match=true;
	    	}
	    }
	    
	    if(match) {
	    	System.out.println("delete Book Successflly !!!");
	    }
	    else {
	    	System.out.println("invalid Book id.....");
	    }
	    
	    
	    //6. Commit the transaction
		session.getTransaction().commit();
		
		//7. Close the session

		session.close();

	   //---------------------------------------------------------------------

		
	}
}
