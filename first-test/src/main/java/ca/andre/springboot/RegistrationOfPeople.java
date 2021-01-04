package ca.andre.springboot;

import java.util.ArrayList;
import java.util.List;

import ca.andre.springboot.exception.PeopleUnnamedException;
import ca.andre.springboot.exception.RegistrationPeopleEmptyException;

public class RegistrationOfPeople {

	private List<People> people;

	public RegistrationOfPeople() {
		this.people = new ArrayList<>();
	}

	public List<People> getPeople() {
		return this.people;
	}

	public void add(People people) {

		if (people.getName() == null) {
			throw new PeopleUnnamedException();
		} else {
			this.people.add(people);
		}
	}

	public void remove(People people) {

		if (this.people.isEmpty()) {
			throw new RegistrationPeopleEmptyException();
		} else {
			this.people.remove(people);
		}
	}

}
