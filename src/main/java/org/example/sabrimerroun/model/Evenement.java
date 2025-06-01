package org.example.sabrimerroun.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "evenementen")
public class Evenement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime tijdstip;

    @Column(nullable = false)
    private String titel;

    @Column(length = 1000)
    private String omschrijving;

    @Column(nullable = false)
    private String organisatie;

    @Column(nullable = false)
    private String mailContactpersoon;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locatie_id", nullable = false)
    private Locatie locatie;

    // Default constructor
    public Evenement() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getTijdstip() {
        return tijdstip;
    }

    public void setTijdstip(LocalDateTime tijdstip) {
        this.tijdstip = tijdstip;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getOrganisatie() {
        return organisatie;
    }

    public void setOrganisatie(String organisatie) {
        this.organisatie = organisatie;
    }

    public String getMailContactpersoon() {
        return mailContactpersoon;
    }

    public void setMailContactpersoon(String mailContactpersoon) {
        this.mailContactpersoon = mailContactpersoon;
    }

    public Locatie getLocatie() {
        return locatie;
    }

    public void setLocatie(Locatie locatie) {
        this.locatie = locatie;
    }
}
