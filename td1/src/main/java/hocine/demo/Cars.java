package hocine.demo;

public class Cars {
    String plaque, marque;
    int prix;
    Boolean rent;
    Date date;

    public Cars(){

        super();
    }


    public Cars(String plaque, String marque, int prix , Boolean rent , Date date) {
        this.plaque = plaque;
        this.marque = marque;
        this.prix = prix;
        this.rent = rent;
        this.date =date;
    }

    public String getPlaque() {
        return plaque;
    }

    public Boolean getRent() {
        return rent;
    }

    public void setRent(Boolean rent) {
        this.rent = rent;
    }

    public void setPlaque(String plaque) {
        this.plaque = plaque;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
