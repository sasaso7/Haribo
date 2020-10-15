package com.example.slik.Model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Opinion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String description;

    @ManyToMany
    private Collection<Candybag> candybags;

}
