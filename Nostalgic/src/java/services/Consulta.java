/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tank3
 */
@WebServlet(name = "Consulta", urlPatterns = {"/consulta"})
public class Consulta extends HttpServlet{
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String consulta = request.getParameter("cons");
            
            if (consulta != null && !consulta.isEmpty() && consulta.equals("clicks")) {
                
                ClickDAO clickDAO = new ClickDAO();
                JSONArray jsonResponse = new JSONArray(clickDAO.getClicksByElements());
                
                response.setContentType("application/json");
                out.print(jsonResponse.toString());
                out.close();
                
                this.destroy();
            }
            
            ClickDAO clickDAO = new ClickDAO();
            JSONObject jsonResponse = new JSONObject();
            List<Click> clicks = clickDAO.getAllClicks();
            jsonResponse.put("clicks", clicks);
            
            response.setContentType("application/json");
            
            out.print(jsonResponse.toString());
            out.close();
            
            this.destroy();
        }
    }
    
    
}
