..........CustomerClass..............
  
package oops;

public class Customer1 {

	private String name;
	private Address address;

	public Customer1() {
	}

	public Customer1(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return name + " " + address.toString();
	}

}

.........AddressClass...................
  
package oops;
import java.util.Objects;

public class Address {
	private String street;
	private String city;
	private Integer pincode;

	public Address() {
	}

	public Address(String street, String city, Integer pincode) {
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(pincode, other.pincode)
				&& Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return street + "," + city + "-" + pincode;
	}

}


..................MainClass.........................
  
package oops;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Customer1 customer = null;
		Address address = null;

		Scanner scanner = new Scanner(System.in);
			customer = new Customer1();
			address = new Address();

			System.out.println("Enter the name :");
			customer.setName(scanner.next());

			System.out.println("Enter the street :");
			address.setStreet(scanner.next());

			System.out.println("Enter the city :");
			address.setCity(scanner.next());

			System.out.println("Enter the pincode :");
			address.setPincode(scanner.nextInt());

			customer.setAddress(address);

			System.out.println(customer);

		
	}

}

