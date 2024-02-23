package com.example.SpringBootMysqlCrudLivre.entity;


import jakarta.persistence.*;

@Entity
public class Livre {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String title;
    @Column
    private String auteur;
    @Column
    private String edition;
    @Column
    private int nbPage;
    @Column
    private double prix;

    public Livre(Long id, String title, String auteur, String edition, int nbPage, double prix) {
        this.id = id;
        this.title = title;
        this.auteur = auteur;
        this.edition = edition;
        this.nbPage = nbPage;
        this.prix = prix;
    }

    public Livre(String title, String auteur, String edition, int nbPage, double prix) {
        this.title = title;
        this.auteur = auteur;
        this.edition = edition;
        this.nbPage = nbPage;
        this.prix = prix;
    }

    public Livre() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public double getPrix() {
        return this.prix;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", edition='" + edition + '\'' +
                ", nbPage='" + nbPage + '\'' +
                ", Prix=" + this.prix +
                '}';
    }
}
