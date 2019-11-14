package ContactsManager;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactsManagerTest {

	@Test
	public void searchContactsTest() {
		ContactsManager myContactsManager = new ContactsManager();
		Contacts newContacts = new Contacts();
		newContacts.name = "Alan";
		newContacts.phoneNumber = "+59179350463";
		myContactsManager.addContacts(newContacts);
		var actual = newContacts;
		var expected = myContactsManager.searchContact("Alan");
		assertEquals(expected, actual);
	}

}
