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
        EventoDAO eventoDAO = new EventoDAO(em);
        Evento event = new Evento("Colazione al parco", LocalDate.now(), "Buoni cornetti", TipoEvento.PRIVATO, 100);
       // eventoDAO.save(event);

        Evento getEvent = eventoDAO.getByID(1);
        // System.out.printl(getEvent);

        // eventoDAO.delete(getEvent);



    }


}
