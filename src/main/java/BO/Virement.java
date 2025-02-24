package BO;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class Virement extends  Operation{

    private String beneficiaire;

    public Virement(Integer id, LocalDateTime date, String motif, Double montant) {
        super(id, date, motif, montant);
    }

    public Virement() {
        super();
    }
}
