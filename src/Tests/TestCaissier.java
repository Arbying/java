package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import personnes.Caissier;

public class TestCaissier {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Création d'un objet Caissier
        Date dateNaissance1 = dateFormat.parse("25/03/1995");
        Date dateEntreeService1 = dateFormat.parse("01/01/2020");
        Caissier caissier1 = new Caissier("Dupont", "Jean", dateNaissance1, 123456, dateEntreeService1, 10.0f, 1234, 1000.0f);

        // Affichage des informations du caissier
        System.out.println("Caissier 1 :");
        System.out.println("Nom : " + caissier1.getNom());
        System.out.println("Prénom : " + caissier1.getPrenom());
        System.out.println("Date de naissance : " + dateFormat.format(caissier1.getDateNaissance()));
        System.out.println("Numéro intervenant : " + caissier1.getNumIntervenant());
        System.out.println("Date d'entrée en service : " + dateFormat.format(caissier1.getDateEntreeEnService()));
        System.out.println("Salaire horaire : " + caissier1.getSalaireHoraire());
        System.out.println("Mot de passe : " + caissier1.getMotDePasse());
        System.out.println("Total des ventes : " + caissier1.getTotalVentes());

        // Test de la méthode equals
        Date dateNaissance2 = dateFormat.parse("30/06/1985");
        Date dateEntreeService2 = dateFormat.parse("01/01/2021");
        Caissier caissier2 = new Caissier("Martin", "Sophie", dateNaissance2, 654321, dateEntreeService2, 12.5f, 1234, 1500.0f);
        Caissier caissier3 = new Caissier("Martin", "Sophie", dateNaissance2, 654321, dateEntreeService2, 12.5f, 1234, 1500.0f);

        if (caissier2.equals(caissier3)) {
            System.out.println("\nLes caissiers 2 et 3 sont identiques !");
        } else {
            System.out.println("\nLes caissiers 2 et 3 sont différents !");
        }

    }

}
