package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello world");
        Contact juanContact = new Contact();
        juanContact.name = "Juan";
        juanContact.phoneNumber = "066646669";

        Contact alexContact = new Contact();
        alexContact.name = "Alex";
        alexContact.phoneNumber = "07777774747";

        Contact sofiContact = new Contact();
        sofiContact.name = "Sofi";
        sofiContact.phoneNumber = "05456454566";

        Contact betyContact = new Contact();
        betyContact.name = "Bety";
        betyContact.phoneNumber = "054113213";

        ContactManager myContactManager = new ContactManager();
        myContactManager.addContact(juanContact);
        myContactManager.addContact(alexContact);
        myContactManager.addContact(sofiContact);
        myContactManager.addContact(betyContact);

        Contact contactSearched = myContactManager.searchContact("Juan");
        System.out.println(contactSearched.name);
        System.out.println(contactSearched.phoneNumber);

        contactSearched = myContactManager.searchContact("Alex");
        System.out.println(contactSearched.name);
        System.out.println(contactSearched.phoneNumber);

        contactSearched = myContactManager.searchContact("Sofi");
        System.out.println(contactSearched.name);
        System.out.println(contactSearched.phoneNumber);

        contactSearched = myContactManager.searchContact("Bety");
        System.out.println(contactSearched.name);
        System.out.println(contactSearched.phoneNumber);
    }
}
