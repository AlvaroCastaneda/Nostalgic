<<<<<<< HEAD
=======

>>>>>>> back-end
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbm;

<<<<<<< HEAD
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
=======
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
>>>>>>> back-end

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
<<<<<<< HEAD
 * @author tank3
=======
 * @author Tank3man
>>>>>>> back-end
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
<<<<<<< HEAD
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
=======
    private static final ThreadLocal localSession;
    
    static {
        try {
            //utlilizamos la variable sessionFactory para poder guardar en ella todas 
            //las configuraciones que iremos haciendo 
            // tambien para crear modificar actualizar nuestra base de datos
            //iniciar sesion en la base de datos
            //en pocas palabras solo inicializamos el servidor 
            
           Configuration config = new Configuration();
            config.configure("hibernate.cfg.xml");
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().
            applySettings(config.getProperties());
            sessionFactory = config.buildSessionFactory(builder.build());
>>>>>>> back-end
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
<<<<<<< HEAD
=======
        // nos ayuda a crear hilos para cada cosa que vayamos a hacer.
        localSession = new ThreadLocal();
>>>>>>> back-end
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
<<<<<<< HEAD
=======
    //iniciar una seccion entre el codigo y la base de datos
     public static Session getLocalSession() {
        Session session = (Session) localSession.get();
        if (session == null) {
            session = sessionFactory.openSession();
            localSession.set(session);
            System.out.println("\nsesion iniciada");
        }
        return session;
    }
     //cerrar sesion entre el codigo y la base de datos
     public static void closeLocalSession() {
        Session session = (Session) localSession.get();
        if (session != null) session.close();
        localSession.set(null);
        System.out.println("sesion cerrada\n");
    }
>>>>>>> back-end
}
