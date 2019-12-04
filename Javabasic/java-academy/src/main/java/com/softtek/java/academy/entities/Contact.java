package com.softtek.java.academy.entities;

import com.softtek.java.academy.entities.ContactType;

public class Contact {
	private String id;
	private String firtsName;
	private String lastName;
	private String motherName;
	private String email;
	private String phoneNumber;
	private ContactType contactType;
	
	public Contact() {
		this.contactType = ContactType.UNKNOW;
		
	}
	
	public Contact(String id, String firtsName, String lastName, String motherName, 
			String email, String phoneNumber,ContactType contactType) {
		super();
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.motherName = motherName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.contactType = contactType;
	}

	public String getId() {
		return this.id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ContactType getContactType() {
		return contactType;
	}

	public void setContactType(ContactType contactType) {
		this.contactType = contactType;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Contact.Id ="+ this.getId()+"\n");
		sb.append("Contact.FirstName ="+ this.getFirtsName()+"\n");
		sb.append("Contact.LastName ="+ this.getLastName()+"\n");
		sb.append("Contact.MotherName ="+ this.getMotherName()+"\n");
		sb.append("Contact.Email ="+ this.getEmail()+"\n");
		sb.append("Contact.Number ="+this.getPhoneNumber()+"\n");
		return sb.toString();
	}
}
