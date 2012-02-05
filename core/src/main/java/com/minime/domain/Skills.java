package com.minime.domain;

import java.util.HashSet;
import java.util.Set;

public class Skills {
    private Set<Skill> skills = new HashSet<Skill>();

    public boolean contains(Skill skill) {
        return skills.contains(skill);  //To change body of created methods use File | Settings | File Templates.
    }

    public Skills add(Skill skill) {
        skills.add(skill);
        return this;
    }
}
