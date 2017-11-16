/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author edher
 */
@Entity
@Table (name="listaContactosPojo", catalog="")
public class listaContactoPojo {

    @Id @GeneratedValue
    @Column(name="idlista_Contacto")
    private int idlista_Contacto; 
    
    @Column(name="lista_Contacto")
    private String lista_Contacto; 

    
    /**
     * @return the idlista_Contacto
     */
    public int getIdlista_Contacto() {
        return idlista_Contacto;
    }

    /**
     * @param idlista_Contacto the idlista_Contacto to set
     */
    public void setIdlista_Contacto(int idlista_Contacto) {
        this.idlista_Contacto = idlista_Contacto;
    }

    /**
     * @return the lista_Contacto
     */
    public String getLista_Contacto() {
        return lista_Contacto;
    }

    /**
     * @param lista_Contacto the lista_Contacto to set
     */
    public void setLista_Contacto(String lista_Contacto) {
        this.lista_Contacto = lista_Contacto;
    }

    
}
