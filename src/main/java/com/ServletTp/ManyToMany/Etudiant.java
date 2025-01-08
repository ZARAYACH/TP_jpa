package com.ServletTp.ManyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    @ManyToMany
    @JoinTable(name = "Etudiant_modules", joinColumns = {@JoinColumn(name = "etudiant_id")},
            inverseJoinColumns = {@JoinColumn(name = "module_id")})
    private List<Module> modules = new ArrayList<Module>();

    public Etudiant() {

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
    public void addModule(Module module) {
        modules.add(module);
    }
}
