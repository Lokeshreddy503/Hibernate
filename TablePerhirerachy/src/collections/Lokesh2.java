package collections;

import javax.persistence.*;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="L2")

public class Lokesh2 extends Lokesh
{
	@Column(name="address")
	private String address;
	@Column(name="gender")
	private String gender;
	

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
