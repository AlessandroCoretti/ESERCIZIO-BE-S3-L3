package org.example;

import jdk.jfr.Event;

import javax.persistence.EntityManager;

public class EventoDAO {

    private EntityManager em;

    public EventoDAO(EntityManager em){
        this.em = em;
    }
    public void save(Evento e){
        em.getTransaction().begin();//apro collegamento col database
        em.persist(e);//gli dico di salvare e cosa salvare
        em.getTransaction().commit();//eseguo
    }

    public Evento getByID(long id){
        return em.find(Evento.class, id);
    }

    public void delete(Evento e){
        em.getTransaction().begin();//apro collegamento col database
        em.remove(e);//gli dico di salvare e cosa eliminare
        em.getTransaction().commit();//eseguo
    }
}
