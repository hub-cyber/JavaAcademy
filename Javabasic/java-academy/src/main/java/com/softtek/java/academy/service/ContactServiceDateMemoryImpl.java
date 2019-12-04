package com.softtek.java.academy.service;

import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.util.Util;

public class ContactServiceDateMemoryImpl implements ContactServiceData {
	private Contact[] contacts;
	private int currentIndex;
	private Util util;
	public ContactServiceDateMemoryImpl() {
		contacts= new Contact[100];
		currentIndex=0;
		util= new Util();
	}
	@Override
	public Contact createContact(Contact contact) {
		Contact newContact= new Contact(
				util.generateId(), contact.getFirtsName(),contact.getLastName(),
				contact.getMotherName(), contact.getEmail(),contact.getPhoneNumber(),
				contact.getContactType()
				);
		contacts[currentIndex]= newContact;
		currentIndex++;
		return newContact;
	}

	@Override
	public Contact updateContact(String id, Contact contact) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteContact(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contact findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact[] findByContactType(ContactType contactType) {
		int recordFound =0;
		
		for(Contact c: contacts) {
			if(c != null && c.getContactType() == contactType) {
				recordFound++;
			}else if(c==null) {
				break;
			}
		}
		
		if(recordFound>0) {
			Contact[] result= new Contact[recordFound];
			int index=0;
			for(Contact ct: contacts) {
				if(ct != null) {
					if(ct.getContactType() == contactType) {
						result[index]=ct;
						index++;
					}
				}else {
					break;
				}
			}
			
			return result;
		}else {
			return null;
		}
	}
	@Override
	public Contact[] findAll() {
		Contact[] storedContacts = new Contact[currentIndex+1];
		
		for(int i=0; i< contacts.length;i++) {
			Contact c= contacts[i];
			if(c !=null) {
				storedContacts[i]=c;
			}else {
				break;
			}
		}
		return storedContacts;
	}
	
}
