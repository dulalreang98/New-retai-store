package com.dulal.store;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Store {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	@Column
private String storeName;
	@Column
private String address;
	@Column
private int pincode;
	@Column
private String State;
	@Column
private String country;
public Store() {
	super();
	// TODO Auto-generated constructor stub
}
public Store(String storeName, String address, int pincode, String state, String country) {
	super();
	this.storeName = storeName;
	this.address = address;
	this.pincode = pincode;
	State = state;
	this.country = country;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStoreName() {
	return storeName;
}
public void setStoreName(String storeName) {
	this.storeName = storeName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}


}
