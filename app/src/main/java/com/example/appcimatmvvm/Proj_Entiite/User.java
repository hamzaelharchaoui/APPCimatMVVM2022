package com.example.appcimatmvvm.Proj_Entiite;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName= "User_table")
public class User {
    @PrimaryKey(autoGenerate=true)
    private int id;
    private String matricule;
    private String nom_prenom;


    public User( String matricule, String nom_prenom) {
        this.matricule=matricule;
        this.nom_prenom=nom_prenom;

    }

    public void setId(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom_prenom() {
        return nom_prenom;
    }




}