package com.softtek.java.academy.temporal;
import com.softtek.java.academy.entities.Contact;
import com.softtek.java.academy.entities.ContactType;
import com.softtek.java.academy.service.ContactServiceData;
import com.softtek.java.academy.service.ContactServiceDateMemoryImpl;

public class PlaceholderContacts {
	private Contact contact;
	private Contact friend;
	private Contact anotherFriend;
	public static void main(String[] args) {
	PlaceholderContacts p= new PlaceholderContacts();
	p.crearContactos();
	
	ContactServiceData csd= new ContactServiceDateMemoryImpl();
	Contact myContact = csd.createContact(p.contact);
	Contact myFriendContact= csd.createContact(p.friend);
	Contact antotherFriend= csd.createContact(p.anotherFriend);
	
	Contact[] contacts = csd.findByContactType(ContactType.FRIEND);
	if(contacts != null) {
		for(Contact c: contacts) {
			System.out.println(c);
		}
	}else {
		System.out.println("No se encontro ningun contacto de tipo:"+ContactType.FRIEND);
	}
	
	
	}
	public void crearContactos() {
		 contact = new Contact();
		contact.setFirtsName("Carlos");
		contact.setLastName("Mendoza");
		contact.setMotherName("Andrade");
		contact.setEmail("Carlos.mendozaa@softtek.com");
		contact.setPhoneNumber("8110414032");
		
		 friend = new Contact("1","Javier","Juarez","Rosas",
				"Javier.juarez@softtek.com","8112354759",ContactType.FRIEND);
		 
		 anotherFriend = new Contact("1","Juan","Juarez","Rosas",
					"Javier.juarez@softtek.com","8119954759",ContactType.FRIEND);
		
	}
}
