package autres;

public class Article {
    private long codeBarre;
    private String intitule;
    private float prix;
    private int stock;
    private int points;

    public Article(long codeBarre, String intitule, float prix, int stock, int points) {
        this.codeBarre = codeBarre;
        this.intitule = intitule;
        this.prix = prix;
        this.stock = stock;
        this.points = points;
    }

    public long getCodeBarre() {
        return codeBarre;
    }

    public void setCodeBarre(long codeBarre) {
        this.codeBarre = codeBarre;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Code barre : " + codeBarre + ", intitulé : " + intitule + ", prix : " + prix +
                ", stock : " + stock + ", points : " + points;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Article)) {
            return false;
        }
        Article article = (Article) obj;
        return article.getCodeBarre() == this.codeBarre;
    }
}
