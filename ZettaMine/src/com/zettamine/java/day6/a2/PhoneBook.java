package com.zettamine.java.day6.a2;

import java.util.ArrayList;
import java.util.List;

import com.zettamine.java.day6.a1.Book;

public class PhoneBook {
	private List<Contact> phoneBook = new ArrayList<Contact>();

	public List<Contact> getPhoneBook() {
		return phoneBook;
	}

	public void setPhoneBook(List<Contact> phoneBook) {
		this.phoneBook = phoneBook;
	}
	public void addContact(Contact contact) {
		phoneBook.add(contact);
	}
	public List<Contact> viewAllContacts(){
		return phoneBook;
	}
	public Contact viewContactByPhoneNo(long phoneNumber) {
		List<Contact> result = viewAllContacts();
		for(Contact contact: result) {
			if (contact.getPhoneNumber()==phoneNumber) {
				return contact;
			}
		}
		return null;
	}
	public boolean removeContact(long phoneNumber) {
		List<Contact> result = viewAllContacts();
		for(Contact contact: result) {
			if (contact.getPhoneNumber()==phoneNumber) {
				result.remove(contact);
				return true;
			}
		}
		return false;
	}
}
