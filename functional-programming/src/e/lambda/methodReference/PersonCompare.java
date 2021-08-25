package e.lambda.methodReference;

import app.core.Person;

public class PersonCompare {
	
	public int compareByName(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public int compareByBirthdate(Person p1, Person p2) {
		return p1.getBirthdate().compareTo(p2.getBirthdate());
	}

}
