/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

/**
 *
 * @author Minh kiêu
 */
public class Evenement {
    private int id;
    private String libelle;
    private String hDebut;
    private String hFin;

    public Evenement() {
    }

    public Evenement(int id, String libelle, String hDebut, String hFin) {
        this.id = id;
        this.libelle = libelle;
        this.hDebut = hDebut;
        this.hFin = hFin;
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
     * @return the hDebut
     */
    public String gethDebut() {
        return hDebut;
    }

    /**
     * @param hDebut the hDebut to set
     */
    public void sethDebut(String hDebut) {
        this.hDebut = hDebut;
    }

    /**
     * @return the hFin
     */
    public String gethFin() {
        return hFin;
    }

    /**
     * @param hFin the hFin to set
     */
    public void sethFin(String hFin) {
        this.hFin = hFin;
    }
    
    
}
