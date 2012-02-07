package com.minime.domain;

public class Email {
    private String email;

    public Email(String email) {

        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email otherEmail = (Email) o;

        return !(email != null ? !email.equals(otherEmail.email) : otherEmail.email != null);

    }

    @Override
    public int hashCode() {
        return email != null ? email.hashCode() : 0;
    }
}
