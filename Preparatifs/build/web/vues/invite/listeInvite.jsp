<%-- 
    Document   : listeInvite
    Created on : 11 oct. 2018, 18:09:58
    Author     : Minh kiêu
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modele.Invite"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="../Resources/stylesheet.css"/>
        
        <title>LISTE DES INVITES</title>
    </head>
    <body>
        <h1>LISTE DES INVITES</h1>
        <%
         ArrayList<Invite> lesInvites = (ArrayList)request.getAttribute("pLesInvites");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>prenom</th>
                    <th>nom</th>
                    <th>sexe</th>
                    <th>age</th>  
                    <th>categorie</th>
                    <th>confirmé</th>
                        
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesInvites.size();i++)
                    {
                        
                        Invite unInvite = lesInvites.get(i);
                        out.println("<tr><td>");
                        out.println(unInvite.getId());
                        out.println("</a></td>");

                        out.println("<td>");
                        out.println(unInvite.getPrenom());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unInvite.getNom());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unInvite.getSexe());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unInvite.getAge()+" ans");
                        out.println("</td>");
                        
                        if(unInvite.getUnTypeInvite().getId()==1){
                            out.println("<td>");
                            out.println("<p>complet</p>");
                            out.println("</td>");
                        }else{
                            out.println("<td>");
                            out.println("<p>incomplet</p>");
                            out.println("</td>");
                        
                        }
                        
                         if(unInvite.getPresent()==0){
                            out.println("<td>");
                            out.println("<p>non</p>");
                            out.println("</td>");
                        }else{
                            out.println("<td>");
                            out.println("<p>oui</p>");
                            out.println("</td>");
                        
                        }
                     
                        
                               
                    }
                    %>
                </tr>
                <p><a href='/Preparatifs/index.htm'>Accueil</a> </li> </br></p>
                <br>
                <p><a href='/Preparatifs/ServletInvite/ajouterInvite'>Ajouter</a> </li> </br></p>
            </tbody>
        </table>
    </body>
</html>
