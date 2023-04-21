package Tests;

import autres.Article;
import autres.ArticleTicket;

public class TestArticleTicket {
    public static void main(String[] args) {
        Article article1 = new Article(123456789, "Article 1", 10.5f, 5, 2);
        Article article2 = new Article(987654321, "Article 2", 20.3f, 3, 1);

        ArticleTicket articleTicket1 = new ArticleTicket(3, article1);
        ArticleTicket articleTicket2 = new ArticleTicket(1, article2);

        System.out.println(articleTicket1);
        System.out.println(articleTicket2);

        System.out.println(articleTicket1.equals(new ArticleTicket(3, article1)));
        System.out.println(articleTicket2.equals(new ArticleTicket(1, article1)));
        System.out.println(articleTicket1.equals(articleTicket2));
    }
}
