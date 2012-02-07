package com.minime.domain;

import static org.junit.Assert.assertThat;

import static org.hamcrest.core.Is.is;

import org.junit.Test;


public class ProfileServiceImplTest {

	@Test
	public void returns_a_person_if_found() {
		ProfileServiceImpl profileService = new ProfileServiceImpl();
		Person aneeshpu = new Person(new Name("Aneesh", "Puliyedath", "Udumbath"), new Email("aneeshpu@gmail.com"));
		assertThat(profileService.get("aneeshpu"), is(aneeshpu));
	}
}
