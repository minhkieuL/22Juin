/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;

/**
 *
 * @author Minh kiêu
 */
public class TypeCadeau {
    private int id;
    private String libelle;

    private ArrayList<Cadeau> lesCadeaux ;
    
    public TypeCadeau() {
    }

    public TypeCadeau(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    /**
     * @return the lesCadeaux
     */
    public ArrayList<Cadeau> getLesCadeaux() {
        return lesCadeaux;
    }

    /**
     * @param lesCadeaux the lesCadeaux to set
     */
    public void setLesCadeaux(ArrayList<Cadeau> lesCadeaux) {
        this.lesCadeaux = lesCadeaux;
    }
    
    public void addUnCadeau(Cadeau unCadeau){
        if (lesCadeaux == null){
            lesCadeaux = new ArrayList<Cadeau>();
        }
        lesCadeaux.add(unCadeau);
    }
}
