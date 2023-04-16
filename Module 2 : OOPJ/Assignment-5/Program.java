package org.problem.main;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
class Address implements Cloneable {
	private String street;
	private String city;
	private String state;

	@Override
	public Object clone() {
		try {
			Address ad = (Address) super.clone();
			return ad;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}

	@Override
	public String toString() {
		return this.street + ", " + this.city + ", " + this.state + ".";
	}

}

@Setter
class Person implements Cloneable {
	private String name;
	private Address address;

	public Person(String name, String street, String city, String state) {
		this.name = name;
		this.address = new Address(street, city, state);
	}

	@Override
	public Person clone() {
		try {
			Person other = (Person) super.clone();
			other.address = (Address) this.address.clone();
			return other;

		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}

	@Override
	public String toString() {
		return this.name + ", " + address.getStreet() + ", " + address.getCity() + ", " + address.getState() + ".";
	}
}

public class Program {
	public static void main(String[] args) {

		Person p1 = new Person("Rakesh", "Palm Beach", "Navi Mumbai", "Maharashtra");
		Person p2 = p1.clone();
		System.out.println(p1 == p2);
		System.out.println(p1);
		System.out.println(p2);
		p2.setName("Rohan");
		p2.setAddress(new Address("Chembur", "Mumbai", "Maharashtra"));
		System.out.println(p1);
		System.out.println(p2);

	}
}
