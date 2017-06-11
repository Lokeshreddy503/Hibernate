package collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="raju")
public class First {
	
@Id
private int id;
String lname,fname;

	public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
