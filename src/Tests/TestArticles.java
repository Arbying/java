package Tests;

import autres.Article;

public class TestArticles {

    public static void main(String[] args) {
        Article article1 = new Article(1234567890123L, "Chaussures", 59.99f, 10, 5);
        Article article2 = new Article(9876543210987L, "T-shirt", 19.99f, 20, 2);

        System.out.println("Article 1 : " + article1.toString());
        System.out.println("Article 2 : " + article2.toString());

        if (article1.equals(article2)) {
            System.out.println("Les articles ont le même code barre");
        } else {
            System.out.println("Les articles n'ont pas le même code barre");
        }

        article1.setPrix(49.99f);
        System.out.println("Le prix de l'article 1 a été modifié : " + article1.toString());
    }
}
