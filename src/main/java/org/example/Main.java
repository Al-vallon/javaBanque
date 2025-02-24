//package org.example;
//
//import BO.*;
//
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//
//public class Main {
//    public static <Client> void main(String[] args) {
//        System.out.println("Hello world!");
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction go =em.getTransaction();
//        go.begin();
//
//        //banque
//        Banque banque = new Banque();
//        banque.setNom("a banque a toto");
//        em.persist(banque);
//
//        //adresse
//        Adresse adresse = new Adresse();
//        adresse.setNumero("1");
//        adresse.setRue("rue de la paix");
//        adresse.setVille("Paris");
//        adresse.setCodePostal("75000");
//        em.persist(adresse);
//
//        Adresse adresse2 = new Adresse();
//        adresse2.setNumero("666");
//        adresse2.setRue("rue de la noix");
//        adresse2.setVille("Angers");
//        adresse2.setCodePostal("49000");
//        em.persist(adresse2);
//
//        Adresse adresse3 = new Adresse();
//        adresse3.setNumero("42");
//        adresse3.setRue("Avenue de la POO");
//        adresse3.setVille("Nantes");
//        adresse3.setCodePostal("44000");
//        em.persist(adresse3);
//
//        //client
//
//        BO.Client client1 = new BO.Client();
//        client1.setNom("toto");
//        client1.setMotif("virement");
//        em.persist(client1);
//
//        BO.Client client2 = new BO.Client();
//        client2.setNom("tata");
//        client2.setMotif("virement");
//        em.persist(client2);
//
//        BO.Client client3 = new BO.Client();
//        client3.setNom("titi");
//        client3.setMotif("virement");
//        em.persist(client3);
//
//
//        // Compte
//        Courant compteCourant = new Courant();
//        compteCourant.setNumero("CC239");
//        compteCourant.setSolde(234.54);
//        compteCourant.SetDecouvert(100.0);
//        em.persist(compteCourant);
//
//        LivretA compteLivretA = new LivretA();
//        compteLivretA.setTaux(1.0);
//
//        em.persist(compteLivretA);
//
//        AssuranceVie compteAssuranceVie = new AssuranceVie();
//        compteAssuranceVie.setTaux(0.5);
//        compteAssuranceVie.setDateFin(LocalDate.of(2022, 12, 31));
//
//
//        //association
//
//        client1.setComptes(Arrays.asList(compteCourant, livretA));
//        client2.setComptes(Arrays.asList(compteCourant, assuranceVie));
//        em.merge(client1);
//        em.merge(client2);
//
//        // Opérations sur comptes
//        Operation operation1 = new Operation() {};
//        operation1.setDate(new Date());
//        operation1.setMontant(200);
//        operation1.setCompte(compteCourant);
//        em.persist(operation1);
//
//        Virement virement1 = new Virement();
//        virement1.setDate(new Date());
//        virement1.setMontant(500);
//        virement1.setCompte(livretA);
//        virement1.setBeneficiaire("François Durand");
//        em.persist(virement1);
//
//        tx.commit();
//
//        em.close();
//        emf.close();
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
package org.example;

import BO.*;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("banqueJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction go = em.getTransaction();
        go.begin();

        // banque
        Banque banque = new Banque();
        banque.setNom("a banque a toto");
        em.persist(banque);

        // adresse
        Adresse adresse = new Adresse();
        adresse.setNumero("1");
        adresse.setRue("rue de la paix");
        adresse.setVille("Paris");
        adresse.setCodePostal("75000");
        em.persist(adresse);

        Adresse adresse2 = new Adresse();
        adresse2.setNumero("666");
        adresse2.setRue("rue de la noix");
        adresse2.setVille("Angers");
        adresse2.setCodePostal("49000");
        em.persist(adresse2);

        Adresse adresse3 = new Adresse();
        adresse3.setNumero("42");
        adresse3.setRue("Avenue de la POO");
        adresse3.setVille("Nantes");
        adresse3.setCodePostal("44000");
        em.persist(adresse3);

        // client
        Client client1 = new Client();
        client1.setNom("toto");
        client1.setMotif("virement");
        em.persist(client1);

        Client client2 = new Client();
        client2.setNom("tata");
        client2.setMotif("virement");
        em.persist(client2);

        Client client3 = new Client();
        client3.setNom("titi");
        client3.setMotif("virement");
        em.persist(client3);

        // Compte
        Courant compteCourant = new Courant();
        compteCourant.setNumero("CC239");
        compteCourant.setSolde(234.54);
        compteCourant.setDecouvert(100.0);
        em.persist(compteCourant);

        LivretA compteLivretA = new LivretA();
        compteLivretA.setNumero("LA123");
        compteLivretA.setSolde(500.0);
        compteLivretA.setTaux(1.0);
        em.persist(compteLivretA);

        AssuranceVie compteAssuranceVie = new AssuranceVie();
        compteAssuranceVie.setNumero("AV456");
        compteAssuranceVie.setSolde(1000.0);
        compteAssuranceVie.setTaux(0.5);
        compteAssuranceVie.setDateFin(LocalDate.of(2022, 12, 31));
        em.persist(compteAssuranceVie);

        // association
        client1.setComptes(Arrays.asList(compteCourant, compteLivretA));
        client2.setComptes(Arrays.asList(compteCourant, compteAssuranceVie));
        em.merge(client1);
        em.merge(client2);

        // Opérations sur comptes
        Operation operation1 = new Operation();
        operation1.setDate(LocalDateTime.now());
        operation1.setMontant(200.0);
        operation1.setCompte(compteCourant);
        em.persist(operation1);

        Virement virement1 = new Virement();
        virement1.setDate(LocalDateTime.now());
        virement1.setMontant(500.0);
        virement1.setCompte(compteLivretA);
        virement1.setBeneficiaire("tata");
        em.persist(virement1);

        go.commit();
        em.close();
        emf.close();
    }
}