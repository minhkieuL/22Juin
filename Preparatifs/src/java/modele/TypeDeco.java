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
public class TypeDeco {
    private int id;
    private String libelle;

    private ArrayList<Decoration> LesDecorations;
    
    public TypeDeco() {
    }

    public TypeDeco(int id, String libelle) {
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
     * @return the LesDecorations
     */
    public ArrayList<Decoration> getLesDecorations() {
        return LesDecorations;
    }

    /**
     * @param LesDecorations the LesDecorations to set
     */
    public void setLesDecorations(ArrayList<Decoration> LesDecorations) {
        this.LesDecorations = LesDecorations;
    }
    
    public void addUneDecoration(Decoration uneDecoration){
        if (LesDecorations == null){
            LesDecorations = new ArrayList<Decoration>();
        }
        LesDecorations.add(uneDecoration);
    }
}
