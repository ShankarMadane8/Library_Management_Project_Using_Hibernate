
 package fabtech;
import java.util.Scanner;

public class StudentsRecord {
 Scanner sc =new Scanner(System.in);
  
 
 
 //----------------------------------
 
 
 
  StudentAddForm obj=new StudentAddForm();

  void addStudent() {
    
    while (true){
      obj.studentAddForm();
      String flag="no";
      
      System.out.println("add one more student (yes/no): ");
      String choose=sc.next();

      if (choose.equals(flag)){
          studentRecord();
          break;
      }
      
    }
  }


  StudentShows obj1=new StudentShows();
  
  
  
  
  
//----------------------------------------
  
  
  
  
  void studentRecord() {
    
    System.out.println();
    System.out.println("*********** Student Management ***********");
    System.out.println("1.Add Student");
    System.out.println("2.Show Student");
    System.out.println("3.Delete Student");
    System.out.println("4.Update student");
    System.out.println("5.Back");
    System.out.println("Enter your option");
    int a = sc.nextInt();
    switch (a) {
      case 1:addStudent();
      studentRecord();
        break;

      case 2:obj1.studentShow();
        studentRecord();
        break;

      case 3:StudentDelete.studentDelete( );
        studentRecord( );
        break;

      case 4:StudentUpdate.stuUpdate();
        studentRecord( );
        break;

      case 5:;
        break;

      default:
        break;
    }
  }




}
