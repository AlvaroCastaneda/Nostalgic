/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Martin
 */
@Entity
@Table(name="usuario",catalog="")
public class usuarioPojo {
    
    @Id @GeneratedValue
    @Column (name = "idusuario")
    private int idusuario;
    
    @Column (name = "Nombre")
    private String Nombre;
    
     @Column (name = "NickName")
    private String NickName;
       
    @Column (name = "Telefono")
    private String Telefono;
    
    @Column (name = "Email")
    private String Email;
    
    @Column (name = "Contraseña")
    private String Contraseña;
    
   @Column (name = "Lista_Contacto")
    private int Lista_Contacto;
    
    @ManyToOne
    @JoinColumn (name = "lista_Contacto")
    private listaContactoPojo lista_Contacto;
          
  
    
}
