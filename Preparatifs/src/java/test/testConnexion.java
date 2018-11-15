/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import database.LiaisonBdd;
import java.sql.Connection;


/**
 *
 * @author Minh kiêu
 */
public class testConnexion {
    public static void main(String[] args) {
     Connection con = LiaisonBdd.ouvrirConnection();
  //LiaisonBdd.fermerConnection();
}
 
    
}
