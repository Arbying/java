package autres;

public class ArticleTicket {
    private int quantite;
    private Article article;

    public ArticleTicket(int quantite, Article article) {
        this.quantite = quantite;
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Article : " + article + ", Quantité : " + quantite;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArticleTicket)) {
            return false;
        }
        ArticleTicket articleTicket = (ArticleTicket) obj;
        return articleTicket.getArticle().equals(this.article) && articleTicket.getQuantite() == this.quantite;
    }
}
