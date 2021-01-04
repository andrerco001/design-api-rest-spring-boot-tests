package ca.andre.springboottest;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import ca.andre.springboot.People;
import ca.andre.springboot.RegistrationOfPeople;
import ca.andre.springboot.exception.PeopleUnnamedException;
import ca.andre.springboot.exception.RegistrationPeopleEmptyException;

public class RegistrationOfPeopleTest {
	
	@Test
	public void mustCreateRegistrationOfPeople() {
		// scenario
		RegistrationOfPeople registratioPeople = new RegistrationOfPeople();
		
		// execution
		
		// verification
		Assertions.assertThat(registratioPeople.getPeople().isEmpty());
	}
	
	@Test
	public void mustAddPeople() {
		
		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();
		people.setName("Paul");
		
		// execution
		registrationPeople.add(people);
		
		// verification
		Assertions.assertThat(registrationPeople.getPeople())
				.isNotEmpty()
				.hasSize(1)
				.contains(people);
	}
	
	@Test(expected = PeopleUnnamedException.class)
	public void mustNotAddPeopleNameEmpty() {
		
		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();
		
		// execution
		
		// verification
		registrationPeople.add(people);
	}
	
	@Test
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
	
	@Test(expected = RegistrationPeopleEmptyException.class)
	public void mustRemoveNonExistentPeople() {
		
		// scenario
		RegistrationOfPeople registrationPeople = new RegistrationOfPeople();
		People people = new People();
		
		// execution
		registrationPeople.remove(people);
		
		// verification
	}
	
	

}
