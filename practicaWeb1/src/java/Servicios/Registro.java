package Servicios;

import Beans.Usuario;
import Transa.Transaccion;
import java.io.IOException;
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
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        String Nombre = request.getParameter("Nombre");
        String Paterno = request.getParameter("Paterno");
        String Materno = request.getParameter("Materno");
        String Telefono = request.getParameter("Telefono");
        String Email = request.getParameter("Email");
                
        Usuario usuario = new Usuario();
        
        usuario.setCorreo(Email);
        usuario.setMaterno(Materno);
        usuario.setPaterno(Paterno);
        usuario.setNombre(Nombre);
        usuario.setTelefono(Telefono);
        
        System.out.println(Nombre + " " + Materno + " " + Paterno + " " + Email + " " + Telefono);
        
        if(Nombre != null && !Nombre.isEmpty() && 
           Paterno != null && !Paterno.isEmpty() &&
           Materno != null && !Materno.isEmpty() &&
           Telefono != null && !Telefono.isEmpty() &&
           Email != null && !Email.isEmpty()
         ){
            
            Transaccion transa = new Transaccion();
            transa.ejecutaTransaccion();
            
            HttpSession sesion = request.getSession();
            response.sendRedirect("home.jsp");
        
        }else response.sendRedirect("error.html"); 
        
        
      //sesion.setAttribute("usuario", usuario);
      //sesion.setAttribute("edad", 90);
        
        
    }

}
