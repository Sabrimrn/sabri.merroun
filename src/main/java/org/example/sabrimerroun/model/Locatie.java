package org.example.sabrimerroun.model;

import jakarta.persistence.*;

@Entity
@Table(name = "locaties")
public class Locatie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naam;

    @Column(nullable = false)
    private String adres;

    @Column(nullable = false)
    private Integer capaciteit;

    // Default constructor
    public Locatie() {}

    // Constructor met parameters
    public Locatie(String naam, String adres, Integer capaciteit) {
        this.naam = naam;
        this.adres = adres;
        this.capaciteit = capaciteit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Integer getCapaciteit() {
        return capaciteit;
    }

    public void setCapaciteit(Integer capaciteit) {
        this.capaciteit = capaciteit;
    }
}
