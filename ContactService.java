// Nicholas Boyer
// 2021-06-26
// Contact service class

import java.util.Map;
import java.util.TreeMap;

public class ContactService {
	
	
	private Map<String, Contact> myContacts;
	
	
	public ContactService() {
		myContacts = new TreeMap<String, Contact>();
	}
	
	
	public void addContact(Contact contact) {
		String id = contact.getId();
		if (myContacts.get(id) != null) {
			throw new IllegalArgumentException("Contact with this id already exists");
		}
		myContacts.put(id, contact);
	}

	public void deleteContact(String id) {
		myContacts.remove(id);
	}
	
	public Contact getContactById(String id) {
		return myContacts.get(id);
	}
	
	public void updateContact(String id, String firstName, String lastName, String phoneNumber, String address) {
		Contact toUpdate = myContacts.get(id);
		toUpdate.setAddress(address);
		toUpdate.setFirstName(firstName);
		toUpdate.setLastName(lastName);
		toUpdate.setPhoneNumber(phoneNumber);
	}
}