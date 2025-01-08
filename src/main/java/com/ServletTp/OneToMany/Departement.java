package com.ServletTp.OneToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Departement")
public class Departement {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Departement(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<Address>();

    public Departement() {

    }


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void addAddress(Address address) {
        this.addresses.add(address);
    }
}
