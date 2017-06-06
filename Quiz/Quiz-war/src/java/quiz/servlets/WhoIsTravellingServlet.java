/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import quiz.ejb.TravelDataEJBRemote;
import quiz.entities.Travel;

/**
 *
 * @author ipd
 */
public class WhoIsTravellingServlet extends HttpServlet {

    @EJB
    //interface name
    TravelDataEJBRemote travelService;

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
            try {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet WhoIsTravellingServlet</title>");
                out.println("</head>");
                out.println("<body>");
                /*
                out.println("<h1>Servlet WhoIsTravellingServlet at " + request.getContextPath() + "</h1>");
                out.println("</body>");
                if (request.getMethod().toLowerCase().equals("get")) {
                    out.println("<form method='post'>");

                    out.println("Date<input type='date' name='date' ><br>");
                    out.println("<input type='submit' value='Search' ><br>");
                    out.println("</form >");
                } else {
                    Travel[] travelList = travelService.getAllTravels();
                    for (Travel t : travelList) {

                        out.println(t.getFullName());

                    }
                    out.println("<p>Travelling on   date</p><a href='list'/> Travel List");
                }

                out.println("</html>");
            } catch (Exception e) {
                e.printStackTrace();
                out.println("Excetion ");
            }*/
                out.println("<h1>Search who is Traveling?</h1>");
                out.println("<form method='post'>");
                out.println("Enter Your Date please:<input type='date' name='date'> ");
                out.println(" <input type=\"submit\" value =\"search\"><br>");
                out.println("</form>");

                if (request.getMethod().toLowerCase().equals("post")) {
                    String date = request.getParameter("date");

                }
                out.println("<ul>");

                //    Travel[] travelList = travelService.whoIsTravellingOnDate(date);
                Travel[] travelList = travelService.getAllTravels();

                for (Travel t : travelList) {
                    out.printf("<li>%s</li>\n", t);
                }
                out.println("</ul>");

                out.println("</body>");
                out.println("</html>");
            } catch (Exception e) {
                out.printf("<div>Exception %s:%s</div>", e, e.getMessage());
            }
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
