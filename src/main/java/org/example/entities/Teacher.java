package org.example.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name")
    private String fName;
    @Column(name = "last_name")
    private String lName;
    @Column(name = "year_of_birth")
    private int yOB;
    private double salary;
    @Column(name = "t_condition")
    private String cond;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    public void print()
    {
        System.out.println("Name:               " + fName + " " + lName
                       + "\nYear of birth:      " + yOB
                       + "\nSalary:             " + salary
                       + "\nCondition:          " + cond);
    }
    public long getId() {return id;}
    public String getFName() {return fName;}
    public String getLName() {return lName;}
    public int getYOB() {return yOB;}
    public double getSalary() {return salary;}
    public String getCond() {return cond;}
    public Group getGroup() {return group;}
    public void setId(long id) {this.id = id;}
    public void setFName(String first_name) {this.fName = first_name;}
    public void setLName(String last_name) {this.lName = last_name;}
    public void setYOB(int year_of_birth) {this.yOB = year_of_birth;}
    public void setSalary(double salary) {this.salary = salary;}
    public void setCond(String t_condition) {this.cond = t_condition;}
    public void setGroup(Group group) {this.group = group;}
}
