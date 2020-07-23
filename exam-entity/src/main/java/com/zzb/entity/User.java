package com.zzb.entity;

public class User {
	private int id;
	private String name;
	private int addresId;
	
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
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
	public int getAddresId() {
		return addresId;
	}
	public void setAddresId(int addresId) {
		this.addresId = addresId;
	}
	
}
