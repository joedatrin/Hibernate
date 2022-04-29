package Hibernate_Exercise_Map.HIbernate_Map;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@Column(name="address_id", unique=true,nullable=false)
	private int address_id;
	@Column(name="street")
	private String street;
	public int getAddress_id() {
	    return address_id;
	}
	public void setAddress_id(int address_id) {
	    this.address_id = address_id;
	}
	public String getStreet() {
	    return street;
	}
	public void setStreet(String street) {
	    this.street = street;
	}
	
}
