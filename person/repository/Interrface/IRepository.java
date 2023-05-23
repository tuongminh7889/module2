package person.repository.Interrface;

import person.model.Person;

import java.util.ArrayList;
public interface IRepository {

    ArrayList<Person> getData();

    void addPerson(Person person);

    int searchPerson(int id);

    void deletePerson(int index);
}

