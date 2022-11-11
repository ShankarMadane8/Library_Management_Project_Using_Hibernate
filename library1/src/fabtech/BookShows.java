package fabtech;


import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;


public class BookShows {

  public void bookShows() {
    System.out.println();
    System.out.println("************* Show Books *************");
    
//-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    

    //5 get all object
    TypedQuery query=session.createQuery("from Book");   
    ArrayList<Book> list=(ArrayList<Book>)query.getResultList();
    
    
    
    System.out.println("id\t\tAuthor\t\tBookName");
    for(Book obj:list) {
    	System.out.println(obj.getId()+")\t\t"+obj.getAuthor()+"\t\t"+obj.getBookName());
    }
    

    
   
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------

    

  }

}
