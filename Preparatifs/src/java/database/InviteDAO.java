/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.Invite;
import modele.TypeInvite;
/**
 *
 * @author Minh kiêu
 */
public class InviteDAO {
    
    
    Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    /* @author Zakina - 22/06/2017
    /* Méthode permettant de lister toutes les ventes enregistrées en base, triées par date décroissante.
    /* Pour chaque vente, on récupère aussi sa catégorie.
    /* La liste des vente est stockée dans une ArrayList
    */
    public static ArrayList<Invite>  getLesInvites(Connection connection){      
        
        
        ArrayList<Invite> lesInvites = new  ArrayList<Invite>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("SELECT * FROM `invite`");          
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                Invite unInvite = new Invite();
                unInvite.setId(rs.getInt("id"));
                unInvite.setPrenom(rs.getString("prenom"));
                unInvite.setNom(rs.getString("nom"));
                unInvite.setSexe(rs.getString("sexe"));
                unInvite.setAge(rs.getInt("age"));
                unInvite.setPresent(rs.getInt("confirmé"));
                
                
                TypeInvite unTypeInvite = new TypeInvite();
                unTypeInvite.setId(rs.getInt("idTypeInvite"));
                
                unInvite.setUnTypeInvite(unTypeInvite);
                
                lesInvites.add(unInvite);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        return lesInvites ;    
    } 
    
    public static Invite getAge(Connection connection, int age) {
       Invite unInvite = new Invite();
       try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("select * from invite WHERE age=?");
            requete.setInt(1, age);
            
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                unInvite.setAge(rs.getInt("age"));
                
                
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return unInvite;  
    }
   // Méthode permettant d'insérer un client en base à partir de l'objet client passé en paramètre
    // Cette méthode renvoie l'objet client
    public static Invite ajouterInvite(Connection connection, Invite unInvite){      
        int idGenere = -1;
        try
        {
            //preparation de la requete
            // id (clé primaire de la table client) est en auto_increment,donc on ne renseigne pas cette valeur
            // la paramètre RETURN_GENERATED_KEYS est ajouté à la requête afin de pouvoir récupérer l'id généré par la bdd (voir ci-dessous)
            // supprimer ce paramètre en cas de requête sans auto_increment.
            requete=connection.prepareStatement("INSERT INTO INVITE ( prenom, nom, sexe, age)\n" +
                    "VALUES (?,?,?,?)", requete.RETURN_GENERATED_KEYS );
            requete.setString(1, unInvite.getPrenom());
            requete.setString(2, unInvite.getNom());
            requete.setString(3, unInvite.getSexe());
            requete.setInt(4, unInvite.getAge());
            /*requete.setInt(5, unInvite.getUnTypeInvite().getId());
            requete.setInt(6, unInvite.getPresent());*/

           /* Exécution de la requête */
            requete.executeUpdate();
            
             // Récupération de id auto-généré par la bdd dans la table client
            rs = requete.getGeneratedKeys();
            while ( rs.next() ) {
                idGenere = rs.getInt( 1 );
                unInvite.setId(idGenere);
            }
            
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return unInvite ;    
    }
       
}
