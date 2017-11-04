/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 *
 * @author tank3
 */
public class ValidaLogin extends HttpServlet{
        @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
       String  usuario=request.getParameter("usuario");
       String pass=request.getParameter("pass");
       
       if(usuario!=null && !usuario.isEmpty()
               && pass!=null && !pass.isEmpty()){
           if(usuario.equals("usuario@chairo.ong") && pass.equals("marxchefidel")){
               String elNombreDeMiUsuario="Lenin Stailn Putin Mujica Mao";
               
               Transaccion transaccion=new Transaccion();
               transaccion.ejecutaTransaccion();
               
               HttpSession sesion=request.getSession();
               sesion.setAttribute("nombreUsuario", elNombreDeMiUsuario);
               
               response.sendRedirect("recupera.jsp");
           }else{
                response.sendRedirect("fail.html");
           }
       }
       
    }
}
