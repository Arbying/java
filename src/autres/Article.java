package autres;

public class Article {
    private long codeBarre;
    private String intitule;
    private float prix;
    private int qu;
    private int points;
    private float totalLigne;

    public Article(long codeBarre, String intitule, float prix, int qu, int points) {
        this.codeBarre = codeBarre;
        this.intitule = intitule;
        this.prix = prix;
        this.qu = qu;
        this.points = points;
        this.totalLigne = prix * (float) qu;
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

    public int getQu() {
        return qu;
    }

    public void setQu(int qu) {
        this.qu = qu;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public  float getTotalLigne(){
        return totalLigne;
    }

    public void setTotalLigne(int qu, float prix){
        this.totalLigne = (float) qu * prix;
    }

    @Override
    public String toString() {
        return "Code barre : " + codeBarre + ", intitulé : " + intitule + ", prix : " + prix +
                ", qu : " + qu + ", points : " + points + ", Total ligne : " + totalLigne;
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
