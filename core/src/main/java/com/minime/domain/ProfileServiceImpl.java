package com.minime.domain;

public class ProfileServiceImpl implements ProfileService {

	public Person get(String username) {
		return new Person(new Name("Aneesh", "Puliyedath", "Udumbath"), new Email("aneeshpu@gmail.com"));
	}

}
