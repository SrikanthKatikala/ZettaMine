package com.zettamine.java.day6.a2;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneBook phoneBook = new PhoneBook();
		while(true) {
			System.out.println("Menu\r\n"
					+ "1. Add Contact\r\n"
					+ "2. Display all Contacts\r\n"
					+ "3. Search Contact by phone \r\n"
					+ "4. Remove Contact\r\n"
					+ "5. Exit\r\n"
					+ "");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
					Contact contact = new Contact();
					System.out.print("Enter first name: ");
					sc.nextLine();
					contact.setFirstName(sc.nextLine());
					System.out.print("Enter last name: ");
					contact.setLastName(sc.nextLine());
					System.out.print("Enter phone number: ");
					contact.setPhoneNumber(sc.nextLong());
					System.out.print("Enter email: ");
					sc.nextLine();
					contact.setEmailId(sc.nextLine());
					phoneBook.addContact(contact);
				break;
			}
			case 2: {
					List<Contact> allContacts = phoneBook.viewAllContacts();
					if (allContacts.isEmpty()!=true) {
						for(Contact cont : allContacts) {
							System.out.println("First Name: "+cont.getFirstName()+" | "
									+"Last Name: "+cont.getLastName()+" | "
									+"Phone No: "+cont.getPhoneNumber()+" | "
									+"Email: "+cont.getEmailId());
						}
					} else {
						System.err.println("Your Phone book is Empty");
					}
					//First Name: John | Last Name: Michael  | Phone No.: 9787878900 | Email: John@gmail.com
				break;
			}
			case 3: {
					System.out.print("Enter phone number: ");
					long phone = sc.nextLong();
					Contact contact = phoneBook.viewContactByPhoneNo(phone);
					if (contact != null) {
						System.out.println("First Name: "+contact.getFirstName()+" | "
								+"Last Name: "+contact.getLastName()+" | "
								+"Phone No: "+contact.getPhoneNumber()+" | "
								+"Email: "+contact.getEmailId());
					} else {
						System.err.println("No contact saved by this number "+phone);
					}
				break;
					}
			case 4: {
					System.out.print("Enter phone number: ");
					long phone = sc.nextLong();
					boolean status = phoneBook.removeContact(phone);
					if (status) {
						System.err.println("Contact removed Successfully");
					} else {
						System.err.println("No cantact removed or entered invalid number!!!");
					}
				break;
			}
			case 5: {
				System.err.println("Application closed");
				System.exit(0);
				break;
			}
			default:
				System.err.println("Invalid Input give valid input!!!");
				break;
			}
		}
	}
}
