package com.minime.domain;

import org.codehaus.jackson.annotate.JsonProperty;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.NodeEntity;

@NodeEntity
public class Person {

	@GraphId
	Long nodeId;

	private Skills skills;

	private Name name;
	private Email email;

	private Person() {
	}

	public Person(Name name, Email email) {
		this.name = name;
		this.email = email;
		skills = new Skills();
	}

	public void addSkill(Skill skill) {
		skills.add(skill);
	}

	public Boolean hasSkill(Skill skill) {
		return skills.contains(skill);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Person person = (Person) o;

		if (email != null ? !email.equals(person.email) : person.email != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		return email != null ? email.hashCode() : 0;
	}

	@JsonProperty("name")
	public String toString() {
		if (name != null)
			return name.toString();
		return "No name";
	}

	/*
	 * public String getName(){ return name.toString(); }
	 */

}
