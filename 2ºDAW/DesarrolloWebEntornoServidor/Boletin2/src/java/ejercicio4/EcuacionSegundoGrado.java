
package ejercicio4;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import static java.lang.Double.parseDouble;


/**
 *
 * @author vboxuser
 */
@WebServlet(name = "EcuacionSegundoGrado", urlPatterns = {"/EcuacionSegundoGrado"})
public class EcuacionSegundoGrado extends HttpServlet {

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
        
       //controlador
        String numeroA = request.getParameter("numeroA");
        String numeroB = request.getParameter("numeroB");
        String numeroC = request.getParameter("numeroC");
        double numeroAD = 0;
        double numeroBD = 0;
        double numeroCD = 0;
        
        if(numeroA != null){
             numeroAD = Double.parseDouble(numeroA);
             numeroBD = Double.parseDouble(numeroB);
             numeroCD = Double.parseDouble(numeroC);
        }
        //modelo
        ModeloEcuacionSegundoGrado Resultado = new ModeloEcuacionSegundoGrado();
        double x1 =0, x2=0;
        boolean haySoluciones=false;
        if(numeroA != null) {
            double[] resultados = 
                    Resultado.resolver(numeroAD, numeroBD, numeroCD);
            if (resultados.length != 0){//si hay soluciones
                haySoluciones=true;
                x1 = resultados[0];
                x2 = resultados[1];
                
            }
            
            
        }
       
        
        
        //vista
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
              
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ecuación Segundo Grado</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ecuación Segundo Grado</h1>");
            out.println("<form method=\"get\">");
            out.println("x2:<input type=\"number\" name=\"numeroA\" step='0.01' required />");
            out.println("x:<input type=\"number\" name=\"numeroB\" step='0.01' required />");
            out.println("c:<input type=\"number\" name=\"numeroC\"  step='0.01' required />");
            out.println("<input type=\"submit\" value=\"enviar\" />");
            out.println("</form>");
             if(numeroA != null){
                 if(haySoluciones){
                     out.println("<h2>x<sub>1</sub>= " + x1 + "</h2>");
                     out.println("<h2>x<sub>2</sub>= " + x2 + "</h2>");
                 } else{
                     out.println("<h2>No hay soluciones reales</h2>");
                 }
             }
            out.println("<a href='index.html'>Volver</a>");
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
