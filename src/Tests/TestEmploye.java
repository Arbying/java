package Tests;

import java.util.Date;
import personnes.Employe;

public class TestEmploye {
    public static void main(String[] args) {
        // Création d'un employé
        Employe employe1 = new Employe("Dupont", "Jean", new Date(1980, 3, 15), 12345, new Date(2010, 1, 1), 15.5f);

        // Affichage des informations de l'employé
        System.out.println("Informations de l'employé 1 :");
        System.out.println(employe1.toString());

        // Vérification de l'égalité avec un autre employé ayant les mêmes informations
        Employe employe2 = new Employe("Dupont", "Jean", new Date(1980, 3, 15), 12345, new Date(2010, 1, 1), 15.5f);
        System.out.println("\nComparaison de l'employé 1 avec l'employé 2 :");
        System.out.println("Employé 1 : " + employe1.toString());
        System.out.println("Employé 2 : " + employe2.toString());
        System.out.println("Les deux employés sont " + (employe1.equals(employe2) ? "identiques." : "différents."));

        // Vérification de l'égalité avec un autre employé ayant des informations différentes
        Employe employe3 = new Employe("Durand", "Pierre", new Date(1990, 5, 10), 54321, new Date(2012, 3, 1), 18.75f);
        System.out.println("\nComparaison de l'employé 1 avec l'employé 3 :");
        System.out.println("Employé 1 : " + employe1.toString());
        System.out.println("Employé 3 : " + employe3.toString());
        System.out.println("Les deux employés sont " + (employe1.equals(employe3) ? "identiques." : "différents."));
    }
}
