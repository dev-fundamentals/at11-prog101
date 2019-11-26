package ContactsManager;

import java.util.ArrayList;

import java.util.*;


public class ContactsManager {
	protected List<Contacts> listContacts;
	protected Contacts myContacts;
	//Contacts [] myContacts;
	
	ContactsManager() {
		listContacts = new ArrayList<Contacts>();
		myContacts = new Contacts();
	}
	public void addContacts(Contacts contact) {
		listContacts.add(contact);
		
	}
	public Contacts searchContact(String name) {
		if (name != null) {
			for (int i = 0; i < listContacts.size(); i++) {
				if (listContacts.get(i).name.equals(name)) {
					return listContacts.get(i);
				}
			}
		}
		return null;
	} 
	

}
