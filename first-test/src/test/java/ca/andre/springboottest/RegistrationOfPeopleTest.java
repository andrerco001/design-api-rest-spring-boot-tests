package ca.andre.springboottest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ca.andre.springboot.People;
import ca.andre.springboot.RegistrationOfPeople;
import ca.andre.springboot.exception.PeopleUnnamedException;
import ca.andre.springboot.exception.RegistrationPeopleEmptyException;

public class RegistrationOfPeopleTest {

	@Test
	@DisplayName("Must create registration of people")
	public void mustCreateRegistrationOfPeople() {
		// scenario
		RegistrationOfPeople registratioPeople = new RegistrationOfPeople();

		// execution

		// verification
		Assertions.assertThat(registratioPeople.getPeople().isEmpty());
	}

	@Test
	@DisplayName("Must add people")
	public void mustAddPeople() {

		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();
		people.setName("Paul");

		// execution
		registrationPeople.add(people);

		// verification
		Assertions.assertThat(registrationPeople.getPeople()).isNotEmpty().hasSize(1).contains(people);
	}

	@Test
	@DisplayName("Must not add people with a empty name")
	public void mustNotAddPeopleNameEmpty() {

		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();

		// execution
		org.junit.jupiter.api.Assertions.assertThrows(PeopleUnnamedException.class,
				() -> registrationPeople.add(people));

		// verification

	}

	@Test
	@DisplayName("Must remove people")
	public void mustRemovePeople() {

		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();
		people.setName("Paul");
		registrationPeople.add(people);

		// execution
		registrationPeople.remove(people);

		// verification
		Assertions.assertThat(registrationPeople.getPeople()).isEmpty();
	}

	@Test
	@DisplayName("Must remove not exist people")
	public void mustRemoveNotExistentPeople() {

		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();

		// execution
		org.junit.jupiter.api.Assertions.assertThrows(RegistrationPeopleEmptyException.class,
				() -> registrationPeople.remove(people));

		// verification
	}

}
