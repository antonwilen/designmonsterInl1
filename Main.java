import task2.Employee;
import task2.Role;

import java.util.*;
public class Main{
  public static void main(String[] args){
    List<Person> persons;// = new ArrayList<>();
    /*
    persons.add(new Person("Bob", "bob@email.com"));
    persons.add(new Person("Ben", "ben@email.com"));
    persons.add(new Person("Pam", "pam@email.com"));
    persons.add(new Person("Eve", "eve@email.com"));
    persons.add(new Person("Guy", "guy@email.com"));
    persons.add(new Person("Lis", "lis@email.com"));
    persons.add(new Person("Ann", "ann@email.com"));
    System.out.println(persons);
    Storage.save(persons);
    */
    //persons=Storage.fetchPersons();

    Role manager = new Role("manager");
    Role engineer = new Role("engineer");

    Employee newEngineer = new Employee("Billy", "IT",engineer);
    System.out.println(newEngineer);

    newEngineer.addRole(manager);
    System.out.println(newEngineer);

    newEngineer.removeRole(engineer);
    System.out.println(newEngineer);
  }
}
