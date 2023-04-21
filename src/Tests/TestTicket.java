package Tests;

import autres.*;
import personnes.*;

import java.util.Date;
import java.util.Vector;

public class TestTicket {

    public static void main(String[] args) {
        // Création d'un client
        Client client = new Client("Durand", "Marie", new Date(), 123, 456, "marie.durand@example.com", "12 rue des Lilas, 75010 Paris", 100);

        // Création de quelques articles
        Article article1 = new Article(1, "Pain", 0.95f, 50, 1);
        Article article2 = new Article(2, "Lait", 1.20f, 30, 2);
        Article article3 = new Article(3, "Fromage", 2.50f, 10, 5);

        // Création de quelques articles tickets
        ArticleTicket articleTicket1 = new ArticleTicket(200, article1);
        ArticleTicket articleTicket2 = new ArticleTicket(100, article2);
        ArticleTicket articleTicket3 = new ArticleTicket(3, article3);

        // Ajout des articles tickets à un vector
        Vector<ArticleTicket> articleTickets = new Vector<ArticleTicket>();
        articleTickets.add(articleTicket1);
        articleTickets.add(articleTicket2);
        articleTickets.add(articleTicket3);

        // Création d'un ticket
        Ticket ticket = new Ticket(1, client, articleTickets);

        // Affichage du ticket
        System.out.println(ticket);
    }
}
