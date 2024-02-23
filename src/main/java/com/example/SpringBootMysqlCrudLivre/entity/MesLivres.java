package com.example.SpringBootMysqlCrudLivre.entity;

import jakarta.persistence.*;

@Entity
@Table
public class MesLivres {
    @Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public MesLivres(Long id, String title, String auteur, String edition, int nbPage, double prix) {
        this.id = id;
        this.title = title;
        this.auteur = auteur;
        this.edition = edition;
        this.nbPage = nbPage;
        this.prix = prix;
    }

    public MesLivres(){

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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "MesLivres{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                ", edition='" + edition + '\'' +
                ", nbPage=" + nbPage +
                ", prix=" + prix +
                '}';
    }
}
