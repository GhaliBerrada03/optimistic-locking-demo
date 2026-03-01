package com.example.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "utilisateurs")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, length = 100)
    private String nom;

    @Column(name = "prenom", nullable = false, length = 100)
    private String prenom;

    @Column(name = "email", nullable = false, unique = true, length = 150)
    private String email;

    // Constructeur vide obligatoire pour JPA
    protected Utilisateur() {
    }

    public Utilisateur(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    /* =======================
       Getters & Setters
       ======================= */

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = Objects.requireNonNull(nom, "Le nom ne peut pas être null");
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = Objects.requireNonNull(prenom, "Le prénom ne peut pas être null");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Objects.requireNonNull(email, "L'email ne peut pas être null");
    }

    /* =======================
       Méthodes utilitaires
       ======================= */

    @Override
    public String toString() {
        return String.format(
                "Utilisateur[id=%d, nom=%s, prenom=%s, email=%s]",
                id, nom, prenom, email
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur)) return false;
        Utilisateur that = (Utilisateur) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}