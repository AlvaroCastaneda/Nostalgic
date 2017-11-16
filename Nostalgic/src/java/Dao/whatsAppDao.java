/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import hbm.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.usuarioPojo;

/**
 *
 * @author Martin
 */
public class whatsAppDao {

    Session session;

    public whatsAppDao() {
        session = HibernateUtil.getLocalSession();
    }

    public boolean savePersona(String nombre, String nickName, String correo, String telefono, String contraseña, int listaUsuario) {
        usuarioPojo datosUsuario = new usuarioPojo();

        datosUsuario.setNombre(nombre);
        datosUsuario.setNickName(nickName);
        datosUsuario.setEmail(correo);
        datosUsuario.setTelefono(telefono);
        datosUsuario.setContraseña(contraseña);

        System.out.println("Entre a la funcion");
        try {
            Transaction transaccion = session.beginTransaction();
            session.save(datosUsuario);
            System.out.println("lo logre");
            transaccion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.closeLocalSession();
        }
        return true;
    }
}
