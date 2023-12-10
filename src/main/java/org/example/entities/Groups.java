package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Groups {
    @Id
    private long id;
    private String name;
    private String max_filling;
    public long getId() {return id;}
    public String getName() {return name;}
    public String getMaxFilling() {return max_filling;}
    public void setId(long id) {this.id = id;}
    public void setName(String name) {this.name = name;}
    public void setMaxFilling(String max_filling) {this.max_filling = max_filling;}
}