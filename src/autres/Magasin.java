package autres;

import personnes.*;

import java.util.Vector;

public class Magasin {
    private static Magasin instance = null;
    private String nom;
    private String adresse;

    private Vector<Client> listeClients;
    private Vector<Article> listeArticles;
    private Ticket ticketEnCours;

    private Magasin(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;

        /* A AJOUTER !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        1.  Vectreur client
            1.1 Lire le fichier clients et remplir le vecteur
            1.2 Si nouveau client, le rajouter dans le vecteur

        2.  Vecteur acticles
            2.1 Lire le fichier articles et remplir le vecteur
            2.2 Si nouvel article, le rajouter dans le vecteur

        3. Le ticket :
            3.1 Créer un ticket
            3.2 Mettre le ticker sur fichier (Imprimer le ticket)
            3.3 Réinitialiser le ticket
         */
    }

    public static Magasin getInstance(String nom, String adresse) {
        if (instance == null) {
            instance = new Magasin(nom, adresse);
        }
        return instance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Magasin : " + nom + " (" + adresse + ")";
    }
}
