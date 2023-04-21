package autres;

import java.util.Date;
import java.util.Vector;
import personnes.*;

public class Ticket implements Bravo {
    private Date dateTicket;
    private int numTicket;
    private Client client;
    private Vector<ArticleTicket> articleTickets;
    private int sousTotal;
    private int reduction;
    private float total;
    private int pointsTicket;

    public Ticket(int numTicket, Client client, Vector<ArticleTicket> articleTickets) {
        this.dateTicket = new Date();
        this.numTicket = numTicket;
        this.client = client;
        this.articleTickets = articleTickets;
        calculSousTotal();
        calculReduction();
        calculTotal();
        calculPointsTicket();
    }

    public Date getDateTicket() {
        return dateTicket;
    }

    public int getNumTicket() {
        return numTicket;
    }

    public Client getClient() {
        return client;
    }

    public Vector<ArticleTicket> getArticleTickets() {
        return articleTickets;
    }

    public int getSousTotal() {
        return sousTotal;
    }

    public int getReduction() {
        return reduction;
    }

    public float getTotal() {
        return total;
    }

    public int getPointsTicket() {
        return pointsTicket;
    }

    public void calculSousTotal() {
        for (ArticleTicket articleTicket : articleTickets) {
            sousTotal += articleTicket.getQuantite() * articleTicket.getArticle().getPrix();
        }
    }

    public void calculReduction() {
        if (sousTotal >= 250) {
            reduction = (int) (sousTotal * 0.1);
        }
    }

    public void calculTotal() {
        total = sousTotal - reduction;
    }

    public void calculPointsTicket() {
        // Calcul du nombre de points générés par les articles achetés
        int pointsArticles = 0;
        for (ArticleTicket articleTicket : articleTickets) {
            pointsArticles += articleTicket.getQuantite() * articleTicket.getArticle().getPoints();
        }

        // Calcul du nombre total de points du ticket
        pointsTicket = (int) total + pointsArticles;
    }

    @Override
    public String toString() {
        String str = "Ticket n°" + numTicket + "\n";
        str += "Date : " + dateTicket + "\n\n";
        str += "Articles : \n";
        for (ArticleTicket articleTicket : articleTickets) {
            str += "\t" + articleTicket + "\n";
        }
        str += "\n";
        if (client != null) {
            str += "Client : " + client + "\n";
        }
        str += "Sous-total : " + sousTotal + "€\n";
        if (reduction > 0) {
            str += "Réduction : " + reduction + "€\n";
        }
        str += "Total : " + total + "€\n";
        str += "Points gagnés : " + pointsTicket + "\n";
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ticket)) {
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return ticket.getNumTicket() == this.numTicket;
    }
}
