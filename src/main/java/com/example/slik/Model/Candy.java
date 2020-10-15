package com.example.slik.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Candy {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Candy_Id;
    String name;
    double weight;

    @ManyToOne
    Candybag candybag;

    public Long getCandy_Id() {
        return Candy_Id;
    }

    public void setCandy_Id(Long candy_Id) {
        Candy_Id = candy_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Candybag getCandybag() {
        return candybag;
    }

    public void setCandybag(Candybag candybag) {
        this.candybag = candybag;
    }
}
