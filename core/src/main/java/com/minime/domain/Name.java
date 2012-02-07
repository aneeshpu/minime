package com.minime.domain;

import org.codehaus.jackson.annotate.JsonProperty;

public class Name {
	
    private String first;
	
    private String middle;
	
    private String last;

    public Name(String first, String middle, String last) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Name name = (Name) o;

        if (first != null ? !first.equals(name.first) : name.first != null) return false;
        if (last != null ? !last.equals(name.last) : name.last != null) return false;
        if (middle != null ? !middle.equals(name.middle) : name.middle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (middle != null ? middle.hashCode() : 0);
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }
    
    public String toString(){
    	return String.format("%s %s %s", first, middle, last);
    }
}
