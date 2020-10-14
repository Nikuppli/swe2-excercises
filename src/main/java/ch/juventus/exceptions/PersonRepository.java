package ch.juventus.exceptions;

import ch.juventus.object.Person;

public class PersonRepository {


    public Person findById(int id) throws PersonNotFoundException {
        throw new PersonNotFoundException("Kann die Person nicht finden mit der id " + id);
    }

    public Person addPerson(Person p) {
        throw new IllegalArgumentException("Gibt es nicht");
    }
}

