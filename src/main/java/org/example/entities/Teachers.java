package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teachers {
    @Id
    private long id;
    private String first_name;
    private String last_name;
    private int year_of_birth;
    private double salary;
    private String t_condition;
    public long getId() {return id;}
    public String getFirstName() {return first_name;}
    public String getLastName() {return last_name;}
    public int getYearOfBirth() {return year_of_birth;}
    public double getSalary() {return salary;}
    public String getCondition() {return t_condition;}
    public void setId(long id) {this.id = id;}
    public void setFirstName(String first_name) {this.first_name = first_name;}
    public void setLastName(String last_name) {this.last_name = last_name;}
    public void setYearOfBirth(int year_of_birth) {this.year_of_birth = year_of_birth;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setCondition(String t_condition) {this.t_condition = t_condition;}
}
