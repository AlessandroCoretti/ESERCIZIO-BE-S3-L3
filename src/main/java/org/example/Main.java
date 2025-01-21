package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class Main 
{
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestioneEventi");
    private static EntityManager em = emf.createEntityManager();
    public static void main( String[] args ) {

        Evento event = new Evento("Colazione al parco", LocalDate.parse("2024-12-12"), "Buoni cornetti", "PUBBLICO", 100);
        save(event);

        em.close();
        emf.close();
    }

    public static void save(Evento e){
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
    }
}
