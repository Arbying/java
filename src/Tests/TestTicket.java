package Tests;

import java.util.Vector;

import autres.*;

import personnes.*;

public class TestTicket {
    public static void main(String[] args) {
        // Création de clients
        Client client1 = new Client("Dupont", "Jean", null);
        Client client2 = new Client("Doe", "Jane", "jane.doe@gmail.com");

        // Création d'articles
        Article article1 = new Article(1234567890, "T-shirt", 19.99f, 100, 10);
        Article article2 = new Article(9876543210, "Pantalon", 29.99f, 50, 15);
        Article article3 = new Article(2468101214, "Chaussures", 59.99f, 20, 20);

        // Création d'article tickets
        ArticleTicket articleTicket1 = new ArticleTicket(2, article1);
        ArticleTicket articleTicket2 = new ArticleTicket(1, article2);
        ArticleTicket articleTicket3 = new ArticleTicket(1, article3);

        // Création d'un vecteur d'article tickets
        Vector<ArticleTicket> articleTickets = new Vector<ArticleTicket>();
        articleTickets.add(articleTicket1);
        articleTickets.add(articleTicket2);
        articleTickets.add(articleTicket3);

        // Création de tickets
        Ticket ticket1 = new Ticket(1, client1, articleTickets);
        Ticket ticket2 = new Ticket(2, client2, articleTickets);

        // Tests des variables de la classe Ticket
        System.out.println("Date du ticket 1 : " + ticket1.getDateTicket());
        System.out.println("Numéro du ticket 1 : " + ticket1.getNumTicket());
        System.out.println("Client du ticket 1 : " + ticket1.getClient());
        System.out.println("Article tickets du ticket 1 : " + ticket1.getArticleTickets());
        System.out.println("Sous-total du ticket 1 : " + ticket1.getSousTotal());
        System.out.println("Réduction du ticket 1 : " + ticket1.getReduction());
        System.out.println("Total du ticket 1 : " + ticket1.getTotal());
        System.out.println("Points du ticket 1 : " + ticket1.getPointsTicket());

        System.out.println();

        System.out.println("Date du ticket 2 : " + ticket2.getDateTicket());
        System.out.println("Numéro du ticket 2 : " + ticket2.getNumTicket());
        System.out.println("Client du ticket 2 : " + ticket2.getClient());
        System.out.println("Article tickets du ticket 2 : " + ticket2.getArticleTickets());
        System.out.println("Sous-total du ticket 2 : " + ticket2.getSousTotal());
        System.out.println("Réduction du ticket 2 : " + ticket2.getReduction());
        System.out.println("Total du ticket 2 : " + ticket2.getTotal());
        System.out.println("Points du ticket 2 : " + ticket2.getPointsTicket());
    }
}
