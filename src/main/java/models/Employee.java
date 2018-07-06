package models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(){

    }
    public Employee(int id, String name, double salary){

    }

    @Id
    @GeneratedValue
    @Column(name = )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
