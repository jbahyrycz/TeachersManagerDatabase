package org.example.entities;

import jakarta.persistence.*;
import org.example.backend.TeachersManager;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @Column(name = "max_filling")
    private long maxFilling;
    @OneToMany(mappedBy = "group")
    public void print()
    {
        System.out.println("Name:               " + name
                       + "\nMaxfilling:         " + maxFilling);
    }
    public long getId() {return id;}
    public String getName() {return name;}
    public long getMaxFilling() {return maxFilling;}
    public void setId(long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setMaxFilling(long maxFilling) {this.maxFilling = maxFilling;}
}