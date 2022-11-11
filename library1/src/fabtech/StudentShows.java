package fabtech;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.TypedQuery;

import org.hibernate.Session;



public class StudentShows {
  
  public void studentShow() {
    System.out.println();
    System.out.println("************* Show Student *************");
    
//-------------------------------------------------------------------
    
    Session session= HibernateConnection.getHibrenateConnection();
    

    //5. get all object
    TypedQuery query=session.createQuery("from Student");   
    ArrayList<Student> list=(ArrayList<Student>)query.getResultList();
    
    
    
    System.out.println("id\t\tname\t\tRoll No\t\tLibrary id");
    for(Student obj:list) {
    	System.out.println(obj.getId()+")\t\t"+obj.getName()+"\t\t"+obj.getRole_no()+"\t\t"+obj.getLibrary_id());
    }
    

    
   
    //6. Commit the transaction
	session.getTransaction().commit();
	
	//7. Close the session

	session.close();

   //---------------------------------------------------------------------

    

    
  }
}
