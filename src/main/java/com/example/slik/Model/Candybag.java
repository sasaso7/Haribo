package com.example.slik.Model;


import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Candybag {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long Candybag_Id;

    String name;
    double weight;
    double price;


    @OneToMany(mappedBy = "candybag")
    Set<Candy> candies = new HashSet<>();

    public Long getCandybag_Id() {
        return Candybag_Id;
    }

    public void setCandybag_Id(Long candybag_Id) {
        Candybag_Id = candybag_Id;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Set<Candy> getCandies() {
        return candies;
    }

    public void setCandies(Set<Candy> candies) {
        this.candies = candies;
    }

    @ManyToMany
    private Collection<Opinion> opinions;

    public Collection<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(Collection<Opinion> opinions) {
        this.opinions = opinions;
    }
}
