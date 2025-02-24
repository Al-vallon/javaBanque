package BO;

import jakarta.persistence.Entity;

@Entity
public class LivretA extends Compte {

    private Double taux;

    public LivretA(Integer id, Double solde, String numero) {
        super(id, solde, numero);
    }

    public LivretA() {

    }

    public Double getTaux() {
        return taux;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
