package HibernateMapExercise1.HinernateMapEx1;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "address1")

public class Address1 {
	
	@Id 
	@Column(name = "doorNo", unique = true, nullable = false)
	private int doorNo;
	@Column(name = "Street")
	private String Street;

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

}
