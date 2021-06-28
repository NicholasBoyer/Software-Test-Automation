// Nicholas Boyer
// 2021-06-26
// Contact service test
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

	@Test
	void addContact() {
		Contact contact = new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		ContactService contactService = new ContactService();
		contactService.addContact(contact);
		
		assertTrue(contactService.getContactById(contact.getId()).equals(contact));
	}
	
	@Test
	void deleteContact() {
		Contact contact = new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		ContactService contactService = new ContactService();
		contactService.addContact(contact);
		contactService.deleteContact(contact.getId());
		
		assertNull(contactService.getContactById(contact.getId()));
	}
	
	@Test
	void addDuplicateContact() {
		Contact contact = new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		ContactService contactService = new ContactService();
		contactService.addContact(contact);
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contactService.addContact(contact);
		});
	}
	
	@Test
	void updateContact() {
	
		String newFirstName = "James";
		String newLastName = "Brown";
		String newPhone = "4257775678";
		String newAddress = "New Street Payton, PA";
		Contact update = new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		ContactService contactService = new ContactService();
		
		contactService.addContact(update);
		contactService.updateContact(update.getId(), newFirstName, newLastName, newPhone, newAddress);
		
		assertTrue(update.getFirstName().equals(newFirstName));
		assertTrue(update.getLastName().equals(newLastName));
		assertTrue(update.getPhoneNumber().equals(newPhone));
		assertTrue(update.getAddress().equals(newAddress));
	}
	
	
}
