package com.brideglabz.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    public void addNewContact(){
        System.out.println(".............Add new Contact in Address Book System..........");
        System.out.println("     Enter The Contact Details    ");
        System.out.println("Enter the First Name :");
        String firsName = sc.next();
        System.out.println("Enter Last Name :");
        String lastName = sc.next();
        System.out.println("Enter The PhoneNumber :");
        Double phoneNumber = sc.nextDouble();
        System.out.println("Enter The Email ID :");
        String email = sc.next();
        System.out.println("Enter the Address :");
        String Address = sc.next();
        System.out.println("Enter the city :");
        String city = sc.next();
        System.out.println("Enter The state :");
        String state = sc.next();
        System.out.println("Enter The Zip :");
        Double zip = sc.nextDouble();
        contact.setFirstName(firsName);
        contact.setLastName(lastName);
        contact.setAddress(Address);
        contact.setPhoneNumber(phoneNumber);
        contact.setCity(city);
        contact.setZip(zip);
        contact.setEmail(email);
        contact.setState(state);
        System.out.println("...........Successfully................");
        displayContact(contact);
    }
    public void displayContact(Contact contact){
        System.out.println(contact);
    }

}
