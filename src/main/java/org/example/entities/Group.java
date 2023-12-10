package org.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "groups")
public class Group {
    @Id
    private long id;
    private String name;
    @Column(name = "max_filling")
    private long maxFilling;
    public long getId() {return id;}
    public String getName() {return name;}
    public long getMaxFilling() {return maxFilling;}
    public void setId(long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setMaxFilling(long maxFilling) {this.maxFilling = maxFilling;}
}