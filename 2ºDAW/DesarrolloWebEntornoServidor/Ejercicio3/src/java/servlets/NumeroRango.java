/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.Math.random;

/**
 *
 * @author vboxuser
 */
@WebServlet(name = "NumeroRango", urlPatterns = {"/NumeroRango"})
public class NumeroRango extends HttpServlet {

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
        
        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
         
       
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NumeroRango</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NumeroRango</h1>");
            out.println("<form method=\"get\">");
            out.println("numero1:<input type=\"number\" name=\"numero1\" />");
            out.println("numero2:<input type=\"number\" name=\"numero2\" />");
            out.println("<input type=\"submit\" value=\"enviar\" />");
            out.println("</form>");
            int min = Integer.parseInt(numero1);
            int max = Integer.parseInt(numero2);
            int numeroAlt=0;
            if (min >= max) {
                out.println("El numero1 debe ser menor que el numero2");
            } else {
            numeroAlt = (int)Math.floor(Math.random() * (max - min) + min);
             while (numeroAlt < min || numeroAlt > max){
            numeroAlt = (int)Math.floor(Math.random() * (max - min) + min);
                }
            }
            out.println("Te muestro el numero aleatorio en el rango: "+numeroAlt);
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
        processRequest(request, response);
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
        processRequest(request, response);
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
