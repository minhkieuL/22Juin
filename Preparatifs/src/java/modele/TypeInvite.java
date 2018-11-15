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
public class TypeInvite {
    private int id;
    private String libelle;
    
    private ArrayList<Invite> lesInvites;

    public TypeInvite() {
    }

    public TypeInvite(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public TypeInvite(int id) {
        this.id = id;
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
     * @return the lesInvites
     */
    public ArrayList<Invite> getLesInvites() {
        return lesInvites;
    }

    /**
     * @param lesInvites the lesInvites to set
     */
    public void setLesInvites(ArrayList<Invite> lesInvites) {
        this.lesInvites = lesInvites;
    }
    
    public void addUnInvite(Invite unInvite){
        if(lesInvites ==null){
            lesInvites = new ArrayList<Invite>();     
       }
        lesInvites.add(unInvite);
    }
    
}
