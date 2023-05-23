package person.repository.implement;

import person.model.Person;
import person.model.Student;
import person.model.Teacher;
import person.repository.Interrface.IRepository;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonRepository implements IRepository {

    private static ArrayList<Person> data = new ArrayList<>();

    static {
        Person student1 = new Student(1, "Happy", "07-08-1989", true, "C03", 7.3);
        Person student2 = new Student(2, "Sun", "01-03-1993", true, "C03", 7);
        Person student3 = new Student(3, "New", "08-12-2003", true, "C03", 8.3);
        Person teacher1 = new Teacher(4, "Under", "11-01-1998", true, "Java");
        data.add(student1);
        data.add(student2);
        data.add(student3);
        data.add(teacher1);
    }


    @Override
    public ArrayList<Person> getData() {
        return data;
    }

    @Override
    public void addPerson(Person person) {
        data.add(person);
    }

    @Override
    public int searchPerson(int id) {
        Iterator<Person> iterator = data.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                return data.indexOf(person);
            }
        }
        return -1;
    }

    @Override
    public void deletePerson(int index) {
        data.remove(index);
    }
}
