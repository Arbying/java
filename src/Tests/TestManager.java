package Tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import personnes.Manager;

public class TestManager {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date dateNaissance1 = sdf.parse("01/01/1980");
        Manager manager1 = new Manager("Dupont", "Jean", dateNaissance1, 1234, 500.0f);

        Date dateNaissance2 = sdf.parse("02/02/1985");
        Manager manager2 = new Manager("Durand", "Marie", dateNaissance2, 5678, 1000.0f);

        // Test affichage des Managers
        System.out.println(manager1);
        System.out.println(manager2);

        // Test égalité
        Manager manager3 = new Manager("Dupont", "Jean", dateNaissance1, 1234, 500.0f);
        System.out.println("manager1 et manager3 sont égaux : " + manager1.equals(manager3));
        System.out.println("manager1 et manager2 sont égaux : " + manager1.equals(manager2));
    }
}
