package collections;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@DiscriminatorValue(value="L1")
public class Lokesh1 extends Lokesh
{
	@Column(name="Email")
	private String Email;
	@Column(name = "phoneNumber")
	private String phoneNumber;
	

	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
