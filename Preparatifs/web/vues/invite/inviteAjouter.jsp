<%-- 
    Document   : inviteAjouter
    Created on : 23 oct. 2018, 15:02:28
    Author     : Minh kiêu
--%>

<%@page import="modele.Invite"%>
<%@page import="modele.TypeInvite"%>
<%@page import="java.util.ArrayList"%>
<%@page import="formulaires.InviteForm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invite Ajouter</title>
    </head>
    <body>
        <h1>Ajout d'un Invité</h1>
        
         <%
                //Client client=(Client)request.getAttribute("client");
                InviteForm form = (InviteForm)request.getAttribute("form");
            %>
        
        <form class="form-inline" action="ajouterInvite" method="POST">
                <label for="prenom">Prenom : </label>
                <input id="prenom" type="text" name="prenom"  size="30" maxlength="30">
                </br>
                
                <label for="nom">Nom : </label>
                <input id="nom"  type="text"  name="nom" size="30" maxlength="30">      
                 </br>
                
                <label for="Sexe">Sexe : </label>
                <input id="sexe"  type="text"  name="sexe" size="30" maxlength="50">
                 </br>
                               
                <label for="age">Age : </label>
                <input id="age"  type="number"  name="age" >
                </br>
                
                
                <%--
                
                <label for="categorie">Categorie : </label>
                <select name="categInvite" >
                    <%
                        ArrayList<TypeInvite> lesTypesInvites = (ArrayList)request.getAttribute("pLesTypesInvites");
                        for (int i=0; i<lesTypesInvites.size();i++){
                            TypeInvite tp = lesTypesInvites.get(i);
                            out.println("<option value='" + tp.getId()+"'>" + tp.getLibelle()+"</option>" );
                        }
                    %>
                 </select></br>         
                
                <label for="Confirme">Confirmé : </label>
                <select name="confirme">
                <%
                        
                        ArrayList<Invite> lesInvites = (ArrayList)request.getAttribute("pLesInvites");
                        for (int i=0; i<lesInvites.size();i++){
                            Invite iv = lesInvites.get(i);
                            if(iv.getPresent()==0){
                                out.println("<option value='" + iv.getId()+"'>"+"Non"+"</option>" );
                            }else{
                                out.println("<option value='" + iv.getId()+"'>"+"Oui"+"</option>" );
                            }
                            
                        }
                    %>
                </select></br>
                
                
                
                <%-- Cases à cocher permettant de choisir les différentes catégories de vente auxquelles le client souhaite s'inscrire 
                <label for="categVente">Categories de vente : </label></br>
                 <%
                        ArrayList<CategVente> lesCategVente = (ArrayList)request.getAttribute("pLesCategVente");
                        for (int i=0; i<lesCategVente.size();i++){
                            CategVente cv = lesCategVente.get(i);
                            out.println("<input type='checkbox' id='cb" + i + "' name='" + cv.getCode() + "'>"); 
                            out.println(cv.getLibelle()); 
                            out.println("</label></br>");
                        }
                    %>
                    </br>
                    --%>
                 
                
            <input type="submit" name="valider" id="valider" value="Valider"/>
            </form>
        
    </body>
</html>