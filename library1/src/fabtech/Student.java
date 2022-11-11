package fabtech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
  
  @Id
  @GeneratedValue()
  private int id;
  
  private String name;
  private int Role_no;
  private int Library_id;

  public Student(String name, int role_no, int library_id) {
    this.name = name;
    this.Role_no = role_no;
    this.Library_id = library_id;
  }
  
  public Student(int id,String name, int role_no, int library_id) {
	    this.id=id;
	    this.name = name;
	    this.Role_no = role_no;
	    this.Library_id = library_id;
	  }

  public Student() {
  }

  
  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRole_no() {
    return Role_no;
  }

  public void setRole_no(int role_no) {
    Role_no = role_no;
  }

  public int getLibrary_id() {
    return Library_id;
  }

  public void setLibrary_id(int library_id) {
    Library_id = library_id;
  }


  



}
