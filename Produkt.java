public class Produkt {
    int id; //identyfikator klienta
    String nazwa; //nazwa produktu
    String kategoria; //kategoria produktu
    double cena; //cena produktu
    int iloscWMagazynie; //dostepna ilosc produktu w magazynie
    public Produkt(int id, int iloscWMagazynie, String nazwa, String kategoria, double cena) {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.iloscWMagazynie = iloscWMagazynie;

    }

}
