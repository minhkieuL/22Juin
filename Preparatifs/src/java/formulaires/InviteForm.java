/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulaires;

import database.InviteDAO;
import database.TypeInviteDAO;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import modele.Invite;
import modele.TypeInvite;

/**
 *
 * @author Minh kiêu
 */
public class InviteForm {
        
    private String resultat;
    private Map<String, String> erreurs      = new HashMap<String, String>();

    public String getResultat() {
        return resultat;
    }

    public void setResultat(String resultat) {
        this.resultat = resultat;
    }

    public Map<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(Map<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    //méthode de validation du champ de saisie nom
    private void validationNom( String nom ) throws Exception {
        if ( nom != null && nom.length() < 3 ) {
        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
        }
    }

    private void setErreur( String champ, String message ) {
    erreurs.put(champ, message );
    }    
    
   /* private static String getDataForm( HttpServletRequest request, String nomChamp ) {
        String valeur = request.getParameter(nomChamp);
        if ( valeur == null || valeur.trim().length() == 0 ) {
            return null;
        } else {
            return valeur.trim();
        }   
    }*/
    
    
    
   
    public Invite ajouterInvite( HttpServletRequest request, Connection connection ) {
      
        Invite unInvite  = new Invite();
        TypeInvite unTypeInvite = new TypeInvite();
         
        
        String prenom = (String)request.getParameter("prenom");
        String nom = (String)request.getParameter("nom" );
        String sexe = (String)request.getParameter("sexe" );
        int age = Integer.valueOf(request.getParameter("age"));
       /* int idTypeInvite = Integer.parseInt(request.getParameter("typeInvite" ));
        int present = Integer.parseInt(request.getParameter("confirmé" ));*/
        
       
 
       
        try {
             validationNom( nom );
        } catch ( Exception e ) {
            setErreur( "nom", e.getMessage() );
        }
        unInvite.setNom(nom);

        if ( erreurs.isEmpty() ) {
            resultat = "Succès de l'ajout.";
        } else {
            resultat = "Échec de l'ajout.";
        }
         
      
        unInvite.setPrenom(prenom);
        unInvite.setSexe(sexe);
        unInvite.setAge(age);
        /*unInvite.setPresent(present);
        unTypeInvite.setId(idTypeInvite);
        unInvite.setUnTypeInvite(unTypeInvite);*/
        
       
        return unInvite ;
    }
    
    
}
