.........CustomerClass...................
  
package oops;

import java.util.Objects;

public class Customerr {
	private String name;
	private Address address;

	public Customerr() {
	}

	public Customerr(String name, Address address) {
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

		Customerr other = (Customerr) obj;
		return Objects.equals(name, other.name) && this.address.equals(other.getAddress());
	}

	@Override
	public String toString() {
		return "Name:" + name + " Address:" + address.getStreet() + "," + address.getCity() + "-"
				+ address.getPincode();
	}

}

............Address Class.......
  
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

.............Main Class..............
  
package oops;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customerr[] customers = null, duplicateCustomer = null;
		Customerr customer = null;
		Address address = null;
		int count = 0, i = 0, duplicateCount = 0;

		Scanner sc = new Scanner(System.in); 
			customers = new Customerr[100];
			duplicateCustomer = new Customerr[100];

			System.out.println("Enter the number of customers");
			count = sc.nextInt();

			do {
				address = new Address();
				customer = new Customerr();
				System.out.printf("Enter the Customer Details....", i + 1);
				System.out.println();
				System.out.println("Enter the name");
				customer.setName(sc.next());

				System.out.println("Enter the street");
				address.setStreet(sc.next());

				System.out.println("Enter the city");
				address.setCity(sc.next());

				System.out.println("Enter the pincode");
				address.setPincode(sc.nextInt());

				customer.setAddress(address);
				customers[i] = customer;
			} while (++i < count);

			for (i = 0; i < count; i++) {
				for (int j = i + 1; j < count; j++) {
					if (customers[i].equals(customers[j])) {
						duplicateCustomer[duplicateCount++] = customers[i];
					}
				}
			}

			if (duplicateCustomer[0] == null) {
				System.out.println("No duplicate found ");
			} else {
				System.out.println("Identical Customer details:");

				for (i = 0; i < duplicateCount; i++) {
					System.out.println((i + 1) + ")" + duplicateCustomer[i]);
				}
			}

		} 
	}

