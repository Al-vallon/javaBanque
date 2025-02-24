package BO;

import jakarta.persistence.Entity;

@Entity
public class Courant extends Compte {

    private Double decouvert;

    public Courant(Integer id, Double solde, String numero) {
        super(id, solde, numero);
    }

    public Courant() {
    }

    public Double getDecouvert() {
        return null;
    }

    public void setDecouvert(Double decouvert) {
        this.decouvert = decouvert;
    }

    public void SetDecouvert(double v) {
    }
}
