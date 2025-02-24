package BO;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Double montant;
    private String motif;
    private LocalDateTime date;

    public Operation(Integer id, LocalDateTime date, String motif, Double montant) {
        this.id = id;
        this.date = date;
        this.motif = motif;
        this.montant = montant;
    }

    public Operation() {
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", montant=" + montant +
                ", motif='" + motif + '\'' +
                ", date=" + date +
                '}';
    }

    @ManyToOne
    private Compte compte;

    public void setCompte(Courant compteCourant) {
    }

    public void setBeneficiaire(String tata) {
    }
}
