/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Dao.whatsAppDao;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "Registro", urlPatterns = {"/Registro"})
public class Registro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("entrada");
        String nombre=request.getParameter("nombre");
        String nickname=request.getParameter("nick");
        String password=request.getParameter("password");
        String telefono=request.getParameter("telefono");
        String correo=request.getParameter("correo");
        
   whatsAppDao usuario=new whatsAppDao();
   usuario.savePersona(nombre, nickname, correo, telefono, password);
           
    if(nombre!=null && !nombre.isEmpty()
       && nickname!=null && !nickname.isEmpty()
       && password!=null && !password.isEmpty()
       && telefono!=null && !telefono.isEmpty()
       && correo!=null && !correo.isEmpty()){
        
    HttpSession sesion=request.getSession();
    sesion.setAttribute("usuario", usuario);
    response.sendRedirect("chatroom.jsp");
                
            }else{
        response.sendRedirect(".jsp");
    }
        
    }
}
