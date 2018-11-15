/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.InviteDAO.requete;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modele.TypeInvite;
/**
 *
 * @author Minh kiêu
 */
public class TypeInviteDAO {
        Connection connection=null;
    static PreparedStatement requete=null;
    static ResultSet rs=null;
    
    public static TypeInvite getTypeInvite(Connection connection, int idTypeInvite) {
       TypeInvite unTypeInvite = new TypeInvite();
       try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("select * from typeinvite WHERE id=?");
            requete.setInt(1, idTypeInvite);
            
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                unTypeInvite.setId(rs.getInt("id"));
                unTypeInvite.setLibelle(rs.getString("libelle"));
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return unTypeInvite;  
    }
    
     public static ArrayList<TypeInvite>  getLesTypesInvites(Connection connection){      
        ArrayList<TypeInvite> lesTypesInvites = new  ArrayList<TypeInvite>();
        try
        {
            //preparation de la requete     
            requete=connection.prepareStatement("select * from typeinvite");
            
            //executer la requete
            rs=requete.executeQuery();
            
            //On hydrate l'objet métier Client avec les résultats de la requête
            while ( rs.next() ) {  
                TypeInvite unTypeInvite = new TypeInvite();
                unTypeInvite.setId(rs.getInt("id"));
                unTypeInvite.setLibelle(rs.getString("libelle"));
                lesTypesInvites.add(unTypeInvite);
            }
        }   
        catch (SQLException e) 
        {
            e.printStackTrace();
            //out.println("Erreur lors de l’établissement de la connexion");
        }
        return lesTypesInvites ;    
    } 
    
}
