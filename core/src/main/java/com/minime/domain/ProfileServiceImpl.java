package com.minime.domain;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.minime.domain.repository.PersonRepository;


@Component
public class ProfileServiceImpl implements ProfileService {
	
	private final PersonRepository personRepository;
	
	private static final Logger LOG = Logger.getLogger(ProfileServiceImpl.class);
	static{
		LOG.setLevel(Level.DEBUG);
	}

	@Autowired
	public ProfileServiceImpl(PersonRepository personRepository){
		this.personRepository = personRepository;
		
	}

	public Person get(String username) {

		Person aneesh = new Person(new Name("Aneesh", "Puliyedath", "Udumbath"), new Email("aneeshpu@gmail.com"));
		
		createAPerson(aneesh);
		return getPersonFromDatabase(aneesh);
	}

	private Person getPersonFromDatabase(Person aneesh) {
		Person foundPerson = personRepository.findOne(aneesh.nodeId);
		if(LOG.isDebugEnabled()){
			LOG.debug(String.format("Found person %s", foundPerson));
		}
		
		return foundPerson;
	}

	private void createAPerson(Person aneesh) {
		if(LOG.isDebugEnabled()){
			LOG.debug(String.format("creating person: %s", aneesh));
		}
		
		personRepository.save(aneesh);
		
		if(LOG.isDebugEnabled()){
			LOG.debug(String.format("Created person %s", aneesh));
		}
	}

}
