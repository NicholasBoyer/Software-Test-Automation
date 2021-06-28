// Nicholas Boyer
// 2021-06-26
// Contact class

class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	
	public Contact(String id, String firstName, String lastName, String phoneNumber, String address) {
		initID(id);
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setAddress(address);
	}


	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getAddress() {
		return address;
	}
	
	private void initID(String id) {
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid id");
		}
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if (phoneNumber == null || phoneNumber.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		for (int i = 0; i < phoneNumber.length(); i++) {
			char a = phoneNumber.charAt(i);
			if ( !(a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9')) {
				throw new IllegalArgumentException("Invalid phone number");
			}
		}
		this.phoneNumber = phoneNumber;
	}
	
	public void setAddress(String address) {
		if (address.length() > 30) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}
}














