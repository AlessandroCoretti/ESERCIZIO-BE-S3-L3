package org.example;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "eventi")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;

    private LocalDate dataevento;

    private String descrizione;

    private String tipoevento;

    private int numeromassimopartecipanti;

    public Evento(String titolo, LocalDate dataevento, String descrizione, String tipoevento, int numeromassimopartecipanti) {
        this.titolo = titolo;
        this.dataevento = dataevento;
        this.descrizione = descrizione;
        this.tipoevento = tipoevento;
        this.numeromassimopartecipanti = numeromassimopartecipanti;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getDataevento() {
        return dataevento;
    }

    public void setDataevento(LocalDate dataevento) {
        this.dataevento = dataevento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getTipoevento() {
        return tipoevento;
    }

    public void setTipoevento(String tipoevento) {
        this.tipoevento = tipoevento;
    }

    public int getNumeromassimopartecipanti() {
        return numeromassimopartecipanti;
    }

    public void setNumeromassimopartecipanti(int numeromassimopartecipanti) {
        this.numeromassimopartecipanti = numeromassimopartecipanti;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
