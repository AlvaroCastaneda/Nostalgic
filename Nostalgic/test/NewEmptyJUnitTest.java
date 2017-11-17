/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Dao.whatsAppDao;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pojo.usuarioPojo;

/**
 *
 * @author Martin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test

     public void hello() {
         whatsAppDao puenteUsuario =new whatsAppDao();
        // puenteUsuario.savePersona("Eder", "El Eder :V", "e@q.com", "777", "juanito", 0);
         
         //System.out.println(""+puenteUsuario.getUsuarioById(1).getNombre());
         
      //   puenteUsuario.saveConversacion(0, 0,puenteUsuario.getUsuarioById(1)
       //       ,puenteUsuario.getUsuarioById(1));
         
         
       
       
         //puenteUsuario.saveMensaje(0, "hole", 1);
         
         
         System.out.println("Estoy aqui");
         //personaProNuevoPablo.setNombre("yahirelbebe");
         //personita.updateById(4, personaProNuevoPablo);
     }
    
    
}
