package task2;

import java.util.ArrayList;
import java.util.List;

public class Employee{
    private String name;
    private String department;
    private List<Role> roles;

    public Employee(String name, String department, Role initialRole) {
        this.name = name;
        this.department = department;
        this.roles = new ArrayList<>(); //Uses arraylist for roles internally
        this.roles.add(initialRole);
    }

    public String name(){ return name; }
    public String department(){ return department; }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", roles=" + roles +
                '}';
    }

    public void addRole(Role roleToAdd){
        this.roles.add(roleToAdd);
    }

    public void removeRole(Role roleToRemove){
        for (Role role:roles
             ) {
            if (role.equals(roleToRemove)){
                roles.remove(role);
            }
        }
    }
}