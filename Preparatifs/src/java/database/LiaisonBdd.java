/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Minh kiêu
 */
public class LiaisonBdd {
    public static Connection connection=null;
    public static Statement st=null;
    public static ResultSet rs=null;
    
    public static Connection ouvrirConnection(){
        try{
            Class.forName("com.msql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mariage","root","");
            System.out.println("Connexion Ok");
        }catch (SQLException e){
            e.printStackTrace();
        }   
        return connection ;
    }
    public static void fermerConnection(ResultSet rs)
    {
        if(rs!=null)
        {
            try
            {
                rs.close();
            }
            catch(Exception e)
            {
                System.out.println("Erreur lors de la fermeture d'une connexion dans fermerConnexion(ResultSet)");
            }
        }
    }
    
    public static void fermerConnection(Statement stmt)
    {
        if(stmt!=null)
        {
            try
            {
                stmt.close();
            }
            catch(Exception e)
            {
                System.out.println("Erreur lors de la fermeture d'une connexion dans fermerConnexion(Statement)");
            }
        }
    }
    
    public static void fermerConnection(Connection con)
    {
        if(con!=null)
        {
            try
            {
                con.close();
                System.out.println("fermeture Connection OR");
                
            }
            catch(Exception e)
            {
                System.out.println("Erreur lors de la fermeture d'une connexion dans fermerConnexion(Connection");
            }
        }
    }

    
}
