package BO;

import jakarta.persistence.Entity;

import java.time.LocalDate;

@Entity
public class AssuranceVie extends Compte {
    private Double taux;
    private Integer dateFin;

    public AssuranceVie(Integer id, Double solde, String numero) {
        super(id, solde, numero);
    }

    public AssuranceVie() {

    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }

    public Integer getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate duree) {
        this.dateFin = dateFin;
    }
}

