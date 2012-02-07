package com.minime.domain;

import static org.hamcrest.core.Is.is;

import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NameTest {

	@Test
	public void displays_a_human_readable_string() {
		Name aneeshpu = new Name("Aneesh", "Puliyedath", "Udumbath");
		assertThat(aneeshpu.toString(), is("Aneesh Puliyedath Udumbath"));
	}
}
