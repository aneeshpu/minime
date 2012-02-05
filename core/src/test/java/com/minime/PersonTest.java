package com.minime;

import com.minime.domain.Email;
import com.minime.domain.Name;
import com.minime.domain.Person;
import com.minime.domain.Skill;
import org.hamcrest.core.IsNot;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class PersonTest {

    @Test
    public void skills() throws Exception {
        Person person = new Person(new Name("first", "second", "last"), new Email("person@domain.com"));
        person.addSkill(new Skill("Java"));
        assertThat(person.hasSkill(new Skill("Java")), is(true));
    }

    @Test
    public void identifyPerson() throws Exception {
        Person person = new Person(new Name("first", "second", "last"), new Email("person@domain.com"));
        Person samePerson = new Person(new Name("first", "second", "last"), new Email("person@domain.com"));
        assertThat(person, is(samePerson));
    }

    @Test
    public void peopleWithDifferentEmailsAreDifferent() throws Exception {
        Person person = new Person(new Name("first", "second", "last"), new Email("person@domain.com"));
        Person differentPerson = new Person(new Name("first", "second", "last"), new Email("differentperson@domain.com"));
        assertThat(person, not(differentPerson));
    }

    @Test
    public void peopleWithDifferentNamesAndSameEmail() throws Exception {
        Person person = new Person(new Name("first", "differentsecond", "last"), new Email("person@domain.com"));
        Person samePerson = new Person(new Name("first", "second", "last"), new Email("person@domain.com"));
        assertThat(person, is(samePerson));
    }
}
