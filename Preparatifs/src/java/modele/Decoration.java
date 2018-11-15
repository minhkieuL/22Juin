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
public class Decoration {
    private int id;
    private String libelle;
    private String marque;
    private int quantite;

    private TypeDeco UnTypeDeco;
    
    public Decoration() {
    }

    public Decoration(int id, String libelle, String marque, int quantite) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.quantite = quantite;
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
     * @return the marque
     */
    public String getMarque() {
        return marque;
    }

    /**
     * @param marque the marque to set
     */
    public void setMarque(String marque) {
        this.marque = marque;
    }

    /**
     * @return the quantite
     */
    public int getQuantite() {
        return quantite;
    }

    /**
     * @param quantite the quantite to set
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    /**
     * @return the UnTypeDeco
     */
    public TypeDeco getUnTypeDeco() {
        return UnTypeDeco;
    }

    /**
     * @param UnTypeDeco the UnTypeDeco to set
     */
    public void setUnTypeDeco(TypeDeco UnTypeDeco) {
        this.UnTypeDeco = UnTypeDeco;
    }
    
    
    
}
