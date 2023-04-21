package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import personnes.*;

public class TestPersonne {
    public static void main(String[] args) {
        // Création de deux instances de Personne
        Personne p1 = null;
        Personne p2 = null;

        try {
            // Création d'une date de naissance pour les deux personnes
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            String dateNaissanceStr = "20/04/2000";
            java.util.Date dateNaissance = sdf.parse(dateNaissanceStr);

            p1 = new Personne("Dupont", "Jean", dateNaissance);
            p2 = new Personne("Durand", "Marie", dateNaissance);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        // Affichage des instances de Personne
        System.out.println(p1);
        System.out.println(p2);

        // Affichage de la date de naissance au format "JJ/MM/AAAA"
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Date de naissance de p1 : " + sdf.format(p1.getDateNaissance()));
        System.out.println("Date de naissance de p2 : " + sdf.format(p2.getDateNaissance()));

        // Comparaison des instances de Personne
        if (p1.equals(p2)) {
            System.out.println("Les personnes sont identiques.");
        } else {
            System.out.println("Les personnes sont différentes.");
        }
    }
}
