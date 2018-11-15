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
public class Invite {
    private int id;
    private String prenom;
    private String nom;
    private String sexe;
    private int age;
    private int present;

    private TypeInvite unTypeInvite;
    
    
    public Invite() {
        this(0, "", "", "", 0, 0, null);
    }

    public Invite(int id, String prenom, String nom, String sexe, int age, int present, TypeInvite unTypeInvite) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.sexe = sexe;
        this.age = age;
        this.present = present;
        this.unTypeInvite = unTypeInvite;
        
     
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
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the sexe
     */
    public String getSexe() {
        return sexe;
    }

    /**
     * @param sexe the sexe to set
     */
    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the UnTypeInvite
     */
    public TypeInvite getUnTypeInvite() {
        return unTypeInvite;
    }

    /**
     * @param UnTypeInvite the UnTypeInvite to set
     */
    public void setUnTypeInvite(TypeInvite UnTypeInvite) {
        this.unTypeInvite = UnTypeInvite;
    }

    /**
     * @return the present
     */
    public int getPresent() {
        return present;
    }

    /**
     * @param present the present to set
     */
    public void setPresent(int present) {
        this.present = present;
    }

   
    
    
}
