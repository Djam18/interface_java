/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ernestine
 */
public class Auteur {
        String numeroAuteur,nomAuteur,prenomAuteur,adresseAuteur;
    public Auteur(
            String numeroAuteur, 
            String nomAuteur,
            String prenomAuteur,
            String adresseAuteur 
    )
    {
        this.numeroAuteur = numeroAuteur;
        this.nomAuteur = nomAuteur;
        this.adresseAuteur=adresseAuteur;
        this.prenomAuteur=prenomAuteur;
    }
    
    //getters
    public String numeroAuteur(){
        return this.numeroAuteur;
    }
    public String nomAuteur(){
        return this.nomAuteur;
    }
    public String adresseAuteur(){
        return this.adresseAuteur;
    }
    public String prenomAuteur(){
        return this.prenomAuteur;
    }
}
