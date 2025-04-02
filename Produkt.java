public class Produkt {
    private int id; //identyfikator klienta
    private String nazwa; //nazwa produktu
    private String kategoria; //kategoria produktu
    private double cena; //cena produktu
    private int iloscWMagazynie; //dostepna ilosc produktu w magazynie


    public void wyswietlInformacje(){
        System.out.println(id + " " + nazwa + " " + kategoria + " " + cena + " " + iloscWMagazynie);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int iloscWMagazynie) {
        this.iloscWMagazynie = iloscWMagazynie;
    }
}
