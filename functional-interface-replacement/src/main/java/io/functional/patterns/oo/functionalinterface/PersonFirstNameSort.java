package io.functional.patterns.oo.functionalinterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonFirstNameSort {

	public static void main(String[] args) {
		Person p1 = new Person ("jack", 30);
		Person p2 = new Person ("Peter", 23);
		Person p3 = new Person ("Anabele", 18);
		
		List<Person> people = Arrays.asList(p1, p2, p3);
		Collections.sort(people, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		});
			
		
	}
	
	
}
