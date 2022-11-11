package fabtech;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TypedQuery;

import org.hibernate.Session;

@Entity
public class Adminlog {
	
	@Id
	@GeneratedValue()
	 private int id;
	
	 private String user_name;
	 private String password;
	 
	 
	 
	 
	 
	 
	 public Adminlog(String user_name, String password) {
	        this.user_name = user_name;
	        this.password = password;
	    }
	    
	    

	    public Adminlog() {

	    }
	 
	 
	 
	 
	

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//----------------------------------------------------------------

	Scanner sc = new Scanner(System.in);
   

    

    // ---------------- dash board ---------------------------

    static void dashboard() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("*********** Welcome To the Library ***********");
        System.out.println("1.Students Record");
        System.out.println("2.Book Records");
        System.out.println("3.Manage Books");
        System.out.println("4.logout");
        System.out.println("Enter your option");
        int a = sc.nextInt();
        BookRecords obj = new BookRecords();
        StudentsRecord obj1 = new StudentsRecord();
        switch (a) {
            case 1:
                obj1.studentRecord();
                Adminlog.dashboard();
                break;

            case 2:
                obj.Librarydisplay();
                Adminlog.dashboard();
                break;

            case 3:
                break;

            case 4:
                break;

            default:
                break;
        }
    }

    // ----------------Login Form-------------------------------

   // BookRecords obj = new BookRecords();
    //StudentsRecord obj1 = new StudentsRecord();

    public void loginForm() {
        System.out.println();
        System.out.println("************* Login page *************");
        System.out.println("Enter User Name:-");
        String user_name = sc.next();

        System.out.println("Enter Password:-");
        String password = sc.next();

        
      //-------------------------------------------------------------------
        
        Session session= HibernateConnection.getHibrenateConnection();
        
        TypedQuery query=session.createQuery("from Adminlog");   
        ArrayList<Adminlog> list=(ArrayList<Adminlog>)query.getResultList();
        
        boolean match = false;
        for(Adminlog obj:list) {
        	 if ( obj.getUser_name().equals(user_name) && obj.getPassword().equals(password)) {
                 match = true;
                 break;
        }
        }
        
        //7. Commit the transaction
    	session.getTransaction().commit();
    	
    	//8. Close the session

    	session.close();
    	
    	
    	if (match) {
            System.out.println("Login Successful !!!");
            dashboard();

        } else {
            System.out.println("Incorrect User Name or Password Try again. ");

        }

       //---------------------------------------------------------------------
       
       

    }

    
}
