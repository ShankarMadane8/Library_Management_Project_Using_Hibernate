package fabtech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
  
  @Id
  @GeneratedValue()
  private int id;
  
  private String Author;
  private String BookName;

  public Book(String author, String bookName) {
    this.Author = author;
    this.BookName = bookName;
  }
  
  public Book(int id ,String author, String bookName) {
	  this.id=id;
	  this.Author = author;
	  this.BookName = bookName;
	  }

  public Book() {

  }

  @Override
  public String toString() {
    return "Book [Author=" + Author + ", BookName=" + BookName + "]";
  }
  
  

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAuthor() {
    return Author;
  }

  public void setAuthor(String author) {
    Author = author;
  }

  public String getBookName() {
    return BookName;
  }

  public void setBookName(String bookName) {
    BookName = bookName;
  }

}
