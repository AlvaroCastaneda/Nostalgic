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
         puenteUsuario.savePersona("Martin", "El martin :V", "a@q.com", "666", "qwerty", 0);
         
         usuarioPojo usuario =new usuarioPojo();
         
         usuario.setNombre("Martin");
         usuario.setNickName("El Martin");
         usuario.setEmail("martin@gmail.com");
         usuario.setTelefono("54583725827385");
         usuario.setContraseña("7hr64hf");
         
         
        
         System.out.println("Estoy aqui");
         //personaProNuevoPablo.setNombre("yahirelbebe");
         //personita.updateById(4, personaProNuevoPablo);
     }
    
    
}
