/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import database.InviteDAO;
import database.TypeInviteDAO;
import formulaires.InviteForm;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modele.Invite;
import modele.TypeInvite;

/**
 *
 * @author Minh kiêu
 */
@WebServlet(name = "ServletInvite", urlPatterns = {"/ServletInvite"})
public class ServletInvite extends HttpServlet {
       
     Connection connection ;
      
        
    @Override
    public void init()
    {     
        ServletContext servletContext=getServletContext();
        connection=(Connection)servletContext.getAttribute("connection");
    }
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletInvite</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletInvite at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = request.getRequestURI();
        
        // Récup et affichage les invites  
          
        if(url.equals("/Preparatifs/ServletInvite/listeInvite"))
        {  
            ArrayList<Invite> lesInvites = InviteDAO.getLesInvites(connection);
            request.setAttribute("pLesInvites", lesInvites);
            getServletContext().getRequestDispatcher("/vues/invite/listeInvite.jsp").forward(request, response);
        }
        if(url.equals("/Preparatifs/ServletInvite/ajouterInvite"))
        {                   
            ArrayList<TypeInvite> lesTypesInvites = TypeInviteDAO.getLesTypesInvites(connection);
            request.setAttribute("pLesTypeInvites", lesTypesInvites);
            
            this.getServletContext().getRequestDispatcher("/vues/invite/inviteAjouter.jsp" ).forward( request, response );
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   
         /* Préparation de l'objet formulaire */
        InviteForm form = new InviteForm();
		
        /* Appel au traitement et à la validation de la requête, et récupération du bean en résultant */
        Invite unInvite = form.ajouterInvite(request, connection);
        
        /* Stockage du formulaire et de l'objet dans l'objet request */
        request.setAttribute( "form", form );
        request.setAttribute( "pInvite", unInvite );
		
        if (form.getErreurs().isEmpty()){
            // Il n'y a pas eu d'erreurs de saisie, donc on renvoie la vue affichant les infos du client 
            InviteDAO.ajouterInvite(connection, unInvite);
            
           this.getServletContext().getRequestDispatcher("/vues/invite/consultInvite.jsp" ).forward( request, response );
        }
        else
        { 
		// il y a des erreurs. On réaffiche le formulaire avec des messages d'erreurs
            ArrayList<TypeInvite> lesTypesInvites = TypeInviteDAO.getLesTypesInvites(connection);
            request.setAttribute("pLesTypesInvites", lesTypesInvites);
            
           this.getServletContext().getRequestDispatcher("/vues/invite/inviteAjouter.jsp" ).forward( request, response );
        }
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
