package fabtech;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo {
  public static void main(String[] args) {
	  System.out.println("Current JVM version - " + System.getProperty("java.version"));
	System.out.println("stating project......");
	
	Configuration config = new Configuration().configure("fabtech/hibernate.cfg.xml");
	SessionFactory factory=config.buildSessionFactory();
	System.out.println(factory);
	System.out.println(factory.isClosed());
    }
}
