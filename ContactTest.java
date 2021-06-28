// Nicholas Boyer
// 2021-06-26
// Contact test class

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		assertNotNull(new Contact("1772347564", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA"));
		assertTrue(contact.getId().equals("1772347564"));
		assertTrue(contact.getFirstName().equals("Bob"));
		assertTrue(contact.getLastName().equals("Murphy"));
		assertTrue(contact.getPhoneNumber().equals("1115558000"));
		assertTrue(contact.getAddress().equals("William's St. Seattle, WA"));
	}
	
	@Test
	void firstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bobyyyyyyyy", "Murphy", "1115558000", "William's St. Seattle, WA");
		});
	}
	
	@Test
	void firstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", null, "Murphy", "1115558000", "William's St. Seattle, WA");
		});	
	}
	
	@Test
	void lastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphyyyyyy", "1115558000", "William's St. Seattle, WA");
		});	
	}
	
	@Test
	void lastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", null, "1115558000", "William's St. Seattle, WA");
		});
	}
	
	@Test
	void phoneNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphy", null, "William's St. Seattle, WA");
		});	
	}
	
	@Test
	void phoneNumberNot10Chars() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphy", "01115558000", "William's St. Seattle, WA");
		});
	}
	
	@Test
	void phoneNumberNotNumeric() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphy", "abcdefghij", "William's St. Seattle, WA");
		});
	}
	
	@Test
	void addressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphy", "abcdefghij", null);
		});
	}
	
	@Test
	void addressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("1772347564", "Bob", "Murphy", "abcdefghij", "William's St. Seattle, WA77777777");
		});
	}
	
	@Test
	void idNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null, "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		});
	}
	
	@Test
	void idTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact("12345678901", "Bob", "Murphy", "1115558000", "William's St. Seattle, WA");
		});
	}
}














