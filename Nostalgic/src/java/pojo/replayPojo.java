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
@Table (name="reply")
public class replayPojo {
    
    
    @Id @GeneratedValue
    @Column (name="idreply")
    private int idreplay;
    
    
    @Column (name="reply")
    private String Reply;
 
    @Column (name="user")
    private int user;
    
    @Column (name="Time")
    private Date Time;
    
    @Column (name="Status")
    private boolean Status;
    
    
    @Column (name="Status_1_Recibido")
    private boolean Status_1_Recibido;
   
    
     @Column (name="Status_2_Recibido")
    private boolean Status_2_Recibido;
    
     @ManyToOne
     @JoinColumn (name="User")
     private usuarioPojo idusuario;
    
    
     @ManyToOne
     @JoinColumn (name="idreplay")
     private conversacionPojo idconversacion;
    
    
}
